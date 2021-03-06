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
 * The interface for the Base Message Request.
 */
public interface IBaseMessageRequest extends IHttpRequest {

    /**
     * Gets the Message from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Message> callback);

    /**
     * Gets the Message from the service
     *
     * @return the Message from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Message get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Message with a source
     *
     * @param sourceMessage the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Message sourceMessage, final ICallback<Message> callback);

    /**
     * Patches this Message with a source
     *
     * @param sourceMessage the source object with updates
     * @return the updated Message
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Message patch(final Message sourceMessage) throws ClientException;

    /**
     * Posts a Message with a new object
     *
     * @param newMessage the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Message newMessage, final ICallback<Message> callback);

    /**
     * Posts a Message with a new object
     *
     * @param newMessage the new object to create
     * @return the created Message
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Message post(final Message newMessage) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseMessageRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseMessageRequest expand(final String value);

}

