// @formatter:off
/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* Licensed under the MIT license. See License.txt in the project root.
* ---------------------------------------------------------
*
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.teamfoundation.distributedtask.webapi;

import java.util.HashMap;

/** 
 */
public class SendJobResponse {

    private JobEventsConfig events;
    private HashMap<String, String> variables;

    public JobEventsConfig getEvents() {
        return events;
    }

    public void setEvents(final JobEventsConfig events) {
        this.events = events;
    }

    public HashMap<String, String> getVariables() {
        return variables;
    }

    public void setVariables(final HashMap<String, String> variables) {
        this.variables = variables;
    }
}
