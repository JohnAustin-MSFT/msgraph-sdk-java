// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Onenote Operation Request.
 */
public class BaseOnenoteOperationRequest extends BaseRequest implements IBaseOnenoteOperationRequest {

    /**
     * The request for the OnenoteOperation
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseOnenoteOperationRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the OnenoteOperation from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<OnenoteOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OnenoteOperation from the service
     * @return The OnenoteOperation from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public OnenoteOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this OnenoteOperation with a source
     * @param sourceOnenoteOperation The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final OnenoteOperation sourceOnenoteOperation, final ICallback<OnenoteOperation> callback) {
        send(HttpMethod.PATCH, callback, sourceOnenoteOperation);
    }

    /**
     * Patches this OnenoteOperation with a source
     * @param sourceOnenoteOperation The source object with updates
     * @return The updated OnenoteOperation
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public OnenoteOperation patch(final OnenoteOperation sourceOnenoteOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceOnenoteOperation);
    }

    /**
     * Creates a OnenoteOperation with a new object
     * @param newOnenoteOperation The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final OnenoteOperation newOnenoteOperation, final ICallback<OnenoteOperation> callback) {
        send(HttpMethod.POST, callback, newOnenoteOperation);
    }

    /**
     * Creates a OnenoteOperation with a new object
     * @param newOnenoteOperation The new object to create
     * @return The created OnenoteOperation
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public OnenoteOperation post(final OnenoteOperation newOnenoteOperation) throws ClientException {
        return send(HttpMethod.POST, newOnenoteOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IOnenoteOperationRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (OnenoteOperationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IOnenoteOperationRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (OnenoteOperationRequest)this;
     }

}
