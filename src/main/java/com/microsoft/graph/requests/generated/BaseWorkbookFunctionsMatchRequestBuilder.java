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
 * The class for the Base Workbook Functions Match Request Builder.
 */
public class BaseWorkbookFunctionsMatchRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsMatch
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param lookupValue the lookupValue
     * @param lookupArray the lookupArray
     * @param matchType the matchType
     */
    public BaseWorkbookFunctionsMatchRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement lookupValue, final com.google.gson.JsonElement lookupArray, final com.google.gson.JsonElement matchType) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("lookupValue", lookupValue);
        bodyParams.put("lookupArray", lookupArray);
        bodyParams.put("matchType", matchType);
    }

    /**
     * Creates the IWorkbookFunctionsMatchRequest
     *
     * @return the IWorkbookFunctionsMatchRequest instance
     */
    public IWorkbookFunctionsMatchRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsMatchRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsMatchRequest instance
     */
    public IWorkbookFunctionsMatchRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsMatchRequest request = new WorkbookFunctionsMatchRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("lookupValue")) {
            request.body.lookupValue = getParameter("lookupValue");
        }

        if (hasParameter("lookupArray")) {
            request.body.lookupArray = getParameter("lookupArray");
        }

        if (hasParameter("matchType")) {
            request.body.matchType = getParameter("matchType");
        }

        return request;
    }
}
