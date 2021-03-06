// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Full view of networking configuration for an ASE. */
@JsonFlatten
@Fluent
public class AseV3NetworkingConfigurationInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AseV3NetworkingConfigurationInner.class);

    /*
     * The windowsOutboundIpAddresses property.
     */
    @JsonProperty(value = "properties.windowsOutboundIpAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> windowsOutboundIpAddresses;

    /*
     * The linuxOutboundIpAddresses property.
     */
    @JsonProperty(value = "properties.linuxOutboundIpAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> linuxOutboundIpAddresses;

    /*
     * Property to enable and disable new private endpoint connection creation
     * on ASE
     */
    @JsonProperty(value = "properties.allowNewPrivateEndpointConnections")
    private Boolean allowNewPrivateEndpointConnections;

    /**
     * Get the windowsOutboundIpAddresses property: The windowsOutboundIpAddresses property.
     *
     * @return the windowsOutboundIpAddresses value.
     */
    public List<String> windowsOutboundIpAddresses() {
        return this.windowsOutboundIpAddresses;
    }

    /**
     * Get the linuxOutboundIpAddresses property: The linuxOutboundIpAddresses property.
     *
     * @return the linuxOutboundIpAddresses value.
     */
    public List<String> linuxOutboundIpAddresses() {
        return this.linuxOutboundIpAddresses;
    }

    /**
     * Get the allowNewPrivateEndpointConnections property: Property to enable and disable new private endpoint
     * connection creation on ASE.
     *
     * @return the allowNewPrivateEndpointConnections value.
     */
    public Boolean allowNewPrivateEndpointConnections() {
        return this.allowNewPrivateEndpointConnections;
    }

    /**
     * Set the allowNewPrivateEndpointConnections property: Property to enable and disable new private endpoint
     * connection creation on ASE.
     *
     * @param allowNewPrivateEndpointConnections the allowNewPrivateEndpointConnections value to set.
     * @return the AseV3NetworkingConfigurationInner object itself.
     */
    public AseV3NetworkingConfigurationInner withAllowNewPrivateEndpointConnections(
        Boolean allowNewPrivateEndpointConnections) {
        this.allowNewPrivateEndpointConnections = allowNewPrivateEndpointConnections;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AseV3NetworkingConfigurationInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
