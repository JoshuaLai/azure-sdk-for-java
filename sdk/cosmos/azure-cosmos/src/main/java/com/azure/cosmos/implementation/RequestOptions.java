// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation;

import com.azure.core.http.HttpHeaders;
import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.models.IndexingDirective;
import com.azure.cosmos.models.PartitionKey;
import com.azure.cosmos.models.ThroughputProperties;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Encapsulates options that can be specified for a request issued to the Azure Cosmos DB database service.
 */
public class RequestOptions {
    private HttpHeaders customOptions;
    private List<String> preTriggerInclude;
    private List<String> postTriggerInclude;
    private IndexingDirective indexingDirective;
    private ConsistencyLevel consistencyLevel;
    private String sessionToken;
    private Integer resourceTokenExpirySeconds;
    private String offerType;
    private String ifMatchETag;
    private String ifNoneMatchETag;
    private Integer offerThroughput;
    private PartitionKey partitionkey;
    private String partitionKeyRangeId;
    private boolean scriptLoggingEnabled;
    private boolean populateQuotaInfo;
    private Map<String, Object> properties;
    private ThroughputProperties throughputProperties;

    /**
     * Gets the triggers to be invoked before the operation.
     *
     * @return the triggers to be invoked before the operation.
     */
    public List<String> getPreTriggerInclude() {
        return this.preTriggerInclude;
    }

    /**
     * Sets the triggers to be invoked before the operation.
     *
     * @param preTriggerInclude the triggers to be invoked before the operation.
     */
    public void setPreTriggerInclude(List<String> preTriggerInclude) {
        this.preTriggerInclude = preTriggerInclude;
    }

    /**
     * Gets the triggers to be invoked after the operation.
     *
     * @return the triggers to be invoked after the operation.
     */
    public List<String> getPostTriggerInclude() {
        return this.postTriggerInclude;
    }

    /**
     * Sets the triggers to be invoked after the operation.
     *
     * @param postTriggerInclude the triggers to be invoked after the operation.
     */
    public void setPostTriggerInclude(List<String> postTriggerInclude) {
        this.postTriggerInclude = postTriggerInclude;
    }

    /**
     * Gets the If-Match (ETag) associated with the request in the Azure Cosmos DB service.
     *
     * @return tthe ifMatchETag associated with the request.
     */
    public String getIfMatchETag() {
        return this.ifMatchETag;
    }

    /**
     * Sets the If-Match (ETag) associated with the request in the Azure Cosmos DB service.
     *
     * @param ifMatchETag the ifMatchETag associated with the request.
     */
    public void setIfMatchETag(String ifMatchETag) {
        this.ifMatchETag = ifMatchETag;
    }

    /**
     * Gets the If-None-Match (ETag) associated with the request in the Azure Cosmos DB service.
     *
     * @return the ifNoneMatchETag associated with the request.
     */
    public String getIfNoneMatchETag() {
        return this.ifNoneMatchETag;
    }

    /**
     * Sets the If-None-Match (ETag) associated with the request in the Azure Cosmos DB service.
     *
     * @param ifNoneMatchETag the ifNoneMatchETag associated with the request.
     */
    public void setIfNoneMatchETag(String ifNoneMatchETag) {
        this.ifNoneMatchETag = ifNoneMatchETag;
    }

    /**
     * Gets the indexing directive (index, do not index etc).
     *
     * @return the indexing directive.
     */
    public IndexingDirective getIndexingDirective() {
        return this.indexingDirective;
    }

    /**
     * Sets the indexing directive (index, do not index etc).
     *
     * @param indexingDirective the indexing directive.
     */
    public void setIndexingDirective(IndexingDirective indexingDirective) {
        this.indexingDirective = indexingDirective;
    }

    /**
     * Gets the consistency level required for the request.
     *
     * @return the consistency level.
     */
    public ConsistencyLevel getConsistencyLevel() {
        return this.consistencyLevel;
    }

    /**
     * Sets the consistency level required for the request.
     *
     * @param consistencyLevel the consistency level.
     */
    public void setConsistencyLevel(ConsistencyLevel consistencyLevel) {
        this.consistencyLevel = consistencyLevel;
    }

    /**
     * Gets the token for use with session consistency.
     *
     * @return the session token.
     */
    public String getSessionToken() {
        return this.sessionToken;
    }

    /**
     * Sets the token for use with session consistency.
     *
     * @param sessionToken the session token.
     */
    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    /**
     * Gets the expiry time for resource token. Used when creating, updating, reading permission.
     *
     * @return the resource token expiry seconds.
     */
    public Integer getResourceTokenExpirySeconds() {
        return this.resourceTokenExpirySeconds;
    }

    /**
     * Sets the expiry time for resource token. Used when creating, updating, reading permission.
     *
     * @param resourceTokenExpirySeconds the resource token expiry seconds.
     */
    public void setResourceTokenExpirySeconds(Integer resourceTokenExpirySeconds) {
        this.resourceTokenExpirySeconds = resourceTokenExpirySeconds;
    }

    /**
     * Gets the offer type when creating a document collection.
     *
     * @return the offer type.
     */
    public String getOfferType() {
        return this.offerType;
    }

    /**
     * Sets the offer type when creating a document collection.
     *
     * @param offerType the offer type.
     */
    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    /**
     * Gets the throughput in the form of Request Units per second when creating a document collection.
     *
     * @return the throughput value.
     */
    public Integer getOfferThroughput() {
        return this.offerThroughput;
    }

    /**
     * Sets the throughput in the form of Request Units per second when creating a document collection.
     *
     * @param offerThroughput the throughput value.
     */
    public void setOfferThroughput(Integer offerThroughput) {
        this.offerThroughput = offerThroughput;
    }

    public void setThroughputProperties(ThroughputProperties throughputProperties) {
        this.throughputProperties = throughputProperties;
    }

    public ThroughputProperties getThroughputProperties() {
        return this.throughputProperties;
    }

    /**
     * Gets the partition key used to identify the current request's target partition.
     *
     * @return the partition key value.
     */
    public PartitionKey getPartitionKey() {
        return this.partitionkey;
    }

    /**
     * Sets the partition key used to identify the current request's target partition.
     *
     * @param partitionkey the partition key value.
     */
    public void setPartitionKey(PartitionKey partitionkey) {
        this.partitionkey = partitionkey;
    }

    /**
     * Internal usage only: Gets the partition key range id used to identify the current request's target partition.
     *
     * @return the partition key range id value.
     */
    String getPartitionKeyRangeId() {
        return this.partitionKeyRangeId;
    }

    /**
     * Internal usage only: Sets the partition key range id used to identify the current request's target partition.
     *
     * @param partitionKeyRangeId the partition key range id value.
     */
    protected void setPartitionKeyRengeId(String partitionKeyRangeId) {
        this.partitionKeyRangeId = partitionKeyRangeId;
    }

    /**
     * Gets whether Javascript stored procedure logging is enabled for the current request in the Azure Cosmos DB database
     * service or not.
     *
     * @return true if Javascript stored procedure logging is enabled
     */
    public boolean isScriptLoggingEnabled() {
        return scriptLoggingEnabled;
    }

    /**
     * Sets whether Javascript stored procedure logging is enabled for the current request in the Azure Cosmos DB database
     * service or not.
     *
     * @param scriptLoggingEnabled true if stored procedure Javascript logging is enabled
     */
    public void setScriptLoggingEnabled(boolean scriptLoggingEnabled) {
        this.scriptLoggingEnabled = scriptLoggingEnabled;
    }

    /**
     * Gets the PopulateQuotaInfo setting for document collection read requests in the Azure Cosmos DB database service.
     * PopulateQuotaInfo is used to enable/disable getting document collection quota related stats for document
     * collection read requests.
     *
     * @return true if PopulateQuotaInfo is enabled
     */
    public boolean isPopulateQuotaInfo() {
        return populateQuotaInfo;
    }

    /**
     * Sets the PopulateQuotaInfo setting for document collection read requests in the Azure Cosmos DB database service.
     * PopulateQuotaInfo is used to enable/disable getting document collection quota related stats for document
     * collection read requests.
     *
     * @param populateQuotaInfo a boolean value indicating whether PopulateQuotaInfo is enabled or not
     */
    public void setPopulateQuotaInfo(boolean populateQuotaInfo) {
        this.populateQuotaInfo = populateQuotaInfo;
    }

    /**
     * Sets the custom request option value by key
     *
     * @param name  a string representing the custom option's name
     * @param value a STRING representing the custom option's value
     */
    public void setHeader(String name, String value) {
        if (this.customOptions == null) {
            this.customOptions = new HttpHeaders();
        }
        this.customOptions.put(name, value);
    }

    /**
     * Gets the custom request options
     *
     * @return Map of custom request options
     */
    public HttpHeaders getHeaders() {
        return this.customOptions;
    }
    /**
     * Gets the properties
     *
     * @return Map of request options properties
     */
    public Map<String, Object> getProperties() {
        return properties;
    }

    /**
     * Sets the properties used to identify the request token.
     *
     * @param properties the properties.
     */
    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

}
