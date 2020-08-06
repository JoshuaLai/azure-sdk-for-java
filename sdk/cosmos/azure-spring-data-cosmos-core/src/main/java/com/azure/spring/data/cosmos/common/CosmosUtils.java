// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.data.cosmos.common;

import com.azure.cosmos.CosmosDiagnostics;
import com.azure.cosmos.models.FeedResponse;
import com.azure.cosmos.models.PartitionKey;
import com.azure.spring.data.cosmos.core.ResponseDiagnostics;
import com.azure.spring.data.cosmos.core.ResponseDiagnosticsProcessor;
import com.azure.spring.data.cosmos.exception.IllegalQueryException;
import com.azure.spring.data.cosmos.repository.support.CosmosEntityInformation;
import com.fasterxml.jackson.databind.JsonNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

/**
 * Util class to fill and process response diagnostics
 */
public class CosmosUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(CosmosUtils.class);

    /**
     * Generate ResponseDiagnostics with cosmos and feed response diagnostics
     *
     * @param <T> type of cosmosResponse
     * @param responseDiagnosticsProcessor collect Response Diagnostics from API responses and then set in {@link
     * ResponseDiagnostics} object.
     * @param cosmosDiagnostics response from cosmos
     * @param feedResponse response from feed
     */
    public static <T> void fillAndProcessResponseDiagnostics(
        ResponseDiagnosticsProcessor responseDiagnosticsProcessor,
        CosmosDiagnostics cosmosDiagnostics, FeedResponse<T> feedResponse) {
        if (responseDiagnosticsProcessor == null) {
            return;
        }
        ResponseDiagnostics.CosmosResponseStatistics cosmosResponseStatistics = null;
        if (feedResponse != null) {
            cosmosResponseStatistics = new ResponseDiagnostics.CosmosResponseStatistics(feedResponse);
        }
        if (cosmosDiagnostics == null && cosmosResponseStatistics == null) {
            LOGGER.debug("Empty response diagnostics");
            return;
        }
        final ResponseDiagnostics responseDiagnostics =
            new ResponseDiagnostics(cosmosDiagnostics, cosmosResponseStatistics);

        //  Process response diagnostics
        responseDiagnosticsProcessor.processResponseDiagnostics(responseDiagnostics);
    }

    /**
     * ID value should be string value, real id type will be String, Integer, Long,
     * all of these must be converted to String type.
     * @param idValue id value to find
     * @throws IllegalArgumentException thrown if id value fail the validation.
     * @throws IllegalQueryException thrown if id value fail the validation.
     * @return String id value
     */
    public static String getStringIDValue(Object idValue) {
        Assert.notNull(idValue, "id should not be null");
        if (idValue instanceof String) {
            Assert.hasText(idValue.toString(), "id should not be empty or only whitespaces.");
            return (String) idValue;
        } else if (idValue instanceof Integer) {
            return Integer.toString((Integer) idValue);
        } else if (idValue instanceof Long) {
            return Long.toString((Long) idValue);
        } else {
            throw new IllegalQueryException("Type of id field must be String or Integer or Long");
        }
    }

    /**
     * Creates partition key from json node by converting the jsonNode type to appropriate Java type.
     * @param jsonNode jsonNode domain object
     * @param entityInfo entityInfo for the domainType
     * @return cosmos partitionKey object
     */
    public static PartitionKey createPartitionKey(JsonNode jsonNode, CosmosEntityInformation<?, ?> entityInfo) {
        String partitionKeyName = entityInfo.getPartitionKeyFieldName();
        if (partitionKeyName == null) {
            return PartitionKey.NONE;
        }
        return new PartitionKey(getValue(jsonNode.get(partitionKeyName)));
    }

    private static Object getValue(JsonNode value) {
        if (value.isValueNode()) {
            switch (value.getNodeType()) {
                case BOOLEAN:
                    return value.asBoolean();
                case NUMBER:
                    if (value.isInt()) {
                        return value.asInt();
                    } else if (value.isLong()) {
                        return value.asLong();
                    } else if (value.isDouble()) {
                        return value.asDouble();
                    } else {
                        return value;
                    }
                case STRING:
                    return value.asText();
                default:
                    return value;
            }
        }
        return value;
    }
}