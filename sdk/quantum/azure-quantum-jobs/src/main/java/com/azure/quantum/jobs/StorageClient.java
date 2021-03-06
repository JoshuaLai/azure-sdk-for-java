// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.quantum.jobs;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.quantum.jobs.implementation.StoragesImpl;
import com.azure.quantum.jobs.models.BlobDetails;
import com.azure.quantum.jobs.models.RestErrorException;
import com.azure.quantum.jobs.models.SasUriResponse;

/** Initializes a new instance of the synchronous QuantumClient type. */
@ServiceClient(builder = QuantumClientBuilder.class)
public final class StorageClient {
    private final StoragesImpl serviceClient;

    /**
     * Initializes an instance of Storages client.
     *
     * @param serviceClient the service client implementation.
     */
    StorageClient(StoragesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Gets a URL with SAS token for a container/blob in the storage account associated with the workspace. The SAS URL
     * can be used to upload job input and/or download job output.
     *
     * @param blobDetails The details (name and container) of the blob to store or download data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL with SAS token for a container/blob in the storage account associated with the workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SasUriResponse sasUri(BlobDetails blobDetails) {
        return this.serviceClient.sasUri(blobDetails);
    }
}
