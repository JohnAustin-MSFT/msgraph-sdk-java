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
 * The interface for the Base Workbook Chart Point Request.
 */
public interface IBaseWorkbookChartPointRequest extends IHttpRequest {

    /**
     * Gets the WorkbookChartPoint from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookChartPoint> callback);

    /**
     * Gets the WorkbookChartPoint from the service
     * @return The WorkbookChartPoint from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookChartPoint get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookChartPoint with a source
     * @param sourceWorkbookChartPoint The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final WorkbookChartPoint sourceWorkbookChartPoint, final ICallback<WorkbookChartPoint> callback);

    /**
     * Patches this WorkbookChartPoint with a source
     * @param sourceWorkbookChartPoint The source object with updates
     * @return The updated WorkbookChartPoint
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookChartPoint patch(final WorkbookChartPoint sourceWorkbookChartPoint) throws ClientException;

    /**
     * Posts a WorkbookChartPoint with a new object
     * @param newWorkbookChartPoint The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final WorkbookChartPoint newWorkbookChartPoint, final ICallback<WorkbookChartPoint> callback);

    /**
     * Posts a WorkbookChartPoint with a new object
     * @param newWorkbookChartPoint The new object to create
     * @return The created WorkbookChartPoint
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookChartPoint post(final WorkbookChartPoint newWorkbookChartPoint) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseWorkbookChartPointRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseWorkbookChartPointRequest expand(final String value);

}
