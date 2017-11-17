// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base User Assign License Request.
 */
public class BaseUserAssignLicenseRequest extends BaseRequest implements IBaseUserAssignLicenseRequest {
    protected final UserAssignLicenseBody body;

    /**
     * The request for this UserAssignLicense
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseUserAssignLicenseRequest(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, User.class);
        body = new UserAssignLicenseBody();
    }

    public void post(final ICallback<User> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public User post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IUserAssignLicenseRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (UserAssignLicenseRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IUserAssignLicenseRequest top(final int value) {
        getQueryOptions().add(new QueryOption("$top", value+""));
        return (UserAssignLicenseRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IUserAssignLicenseRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (UserAssignLicenseRequest)this;
    }

}