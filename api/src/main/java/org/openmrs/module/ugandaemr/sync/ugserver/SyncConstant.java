/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.ugandaemr.sync.ugserver;

public class SyncConstant {

    public static final String HTTP_PROTOCOL = "http://";
    public static final String HTTPS_PROTOCOL = "https://";

    public  static final String SERVER_IP ="ugandaemrsync.serverIP";
    public  static final String HEALTH_CENTER_UUID ="32aa4e18-3e92-429b-b3af-ccb2c77e9b6a";
    public  static final String HEALTH_CENTER_NAME="aijar.healthCenterName";
    public  static final String HEALTH_CENTER_SYNC_ID="ugandaemrsync.healthCenterSyncId";
    public  static final String HEALTH_CENTER_LOCATION_NAME="ugandaemrsync.healthCenterLocation";


    public  static final String SERVER_IP_PLACE_HOLDER ="192.168.1.8";
    public  static final String HEALTH_CENTER_UUID_PLACE_HOLDER ="This will be filled when a request is made to the server for an Id";
    public  static final String HEALTH_CENTER_SYNC_ID_PLACE_HOLDER="This will be filled when a connection is created to server";
    public  static final String HEALTH_CENTER_LOCATION_NAME_PLACE_HOLDER="Type in the District Where This H.C is located";

    public  static final int CONNECTION_SUCCESS=200;
    public  static final int CONNECTION_FAILES=404;
    public static final String XML_CONTENT_TYPE="application/xml";

    /**
     * Request Types of to the server
     */
    public  static final String FACILITY_ID_REQUEST_TYPE="Facility Id";
    public  static final String SYNC_RECORD_REQUEST_TYPE="Sync Record";
    }