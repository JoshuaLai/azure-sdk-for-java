/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.digitaltwins.v2020_03_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for EndpointProvisioningState.
 */
public final class EndpointProvisioningState extends ExpandableStringEnum<EndpointProvisioningState> {
    /** Static value Provisioning for EndpointProvisioningState. */
    public static final EndpointProvisioningState PROVISIONING = fromString("Provisioning");

    /** Static value Deleting for EndpointProvisioningState. */
    public static final EndpointProvisioningState DELETING = fromString("Deleting");

    /** Static value Succeeded for EndpointProvisioningState. */
    public static final EndpointProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for EndpointProvisioningState. */
    public static final EndpointProvisioningState FAILED = fromString("Failed");

    /** Static value Canceled for EndpointProvisioningState. */
    public static final EndpointProvisioningState CANCELED = fromString("Canceled");

    /**
     * Creates or finds a EndpointProvisioningState from its string representation.
     * @param name a name to look for
     * @return the corresponding EndpointProvisioningState
     */
    @JsonCreator
    public static EndpointProvisioningState fromString(String name) {
        return fromString(name, EndpointProvisioningState.class);
    }

    /**
     * @return known EndpointProvisioningState values
     */
    public static Collection<EndpointProvisioningState> values() {
        return values(EndpointProvisioningState.class);
    }
}