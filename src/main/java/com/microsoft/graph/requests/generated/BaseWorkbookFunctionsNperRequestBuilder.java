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
 * The class for the Base Workbook Functions Nper Request Builder.
 */
public class BaseWorkbookFunctionsNperRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNper
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param rate the rate
     * @param pmt the pmt
     * @param pv the pv
     * @param fv the fv
     * @param type the type
     */
    public BaseWorkbookFunctionsNperRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement pmt, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement fv, final com.google.gson.JsonElement type) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("rate", rate);
        bodyParams.put("pmt", pmt);
        bodyParams.put("pv", pv);
        bodyParams.put("fv", fv);
        bodyParams.put("type", type);
    }

    /**
     * Creates the IWorkbookFunctionsNperRequest
     *
     * @return the IWorkbookFunctionsNperRequest instance
     */
    public IWorkbookFunctionsNperRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsNperRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNperRequest instance
     */
    public IWorkbookFunctionsNperRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsNperRequest request = new WorkbookFunctionsNperRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("rate")) {
            request.body.rate = getParameter("rate");
        }

        if (hasParameter("pmt")) {
            request.body.pmt = getParameter("pmt");
        }

        if (hasParameter("pv")) {
            request.body.pv = getParameter("pv");
        }

        if (hasParameter("fv")) {
            request.body.fv = getParameter("fv");
        }

        if (hasParameter("type")) {
            request.body.type = getParameter("type");
        }

        return request;
    }
}
