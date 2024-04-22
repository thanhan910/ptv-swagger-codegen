/*
 * PTV Timetable API - Version 3
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * The version of the OpenAPI document: v3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.V3SiriDownstreamSubscriptionTopic;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for V3SiriDownstreamSubscription
 */
public class V3SiriDownstreamSubscriptionTest {
    private final V3SiriDownstreamSubscription model = new V3SiriDownstreamSubscription();

    /**
     * Model tests for V3SiriDownstreamSubscription
     */
    @Test
    public void testV3SiriDownstreamSubscription() {
        // TODO: test V3SiriDownstreamSubscription
    }

    /**
     * Test the property 'subscriberRef'
     */
    @Test
    public void subscriberRefTest() {
        // TODO: test subscriberRef
    }

    /**
     * Test the property 'subscriptionRef'
     */
    @Test
    public void subscriptionRefTest() {
        // TODO: test subscriptionRef
    }

    /**
     * Test the property 'messageType'
     */
    @Test
    public void messageTypeTest() {
        // TODO: test messageType
    }

    /**
     * Test the property 'siriFormat'
     */
    @Test
    public void siriFormatTest() {
        // TODO: test siriFormat
    }

    /**
     * Test the property 'siriVersion'
     */
    @Test
    public void siriVersionTest() {
        // TODO: test siriVersion
    }

    /**
     * Test the property 'consumerAddress'
     */
    @Test
    public void consumerAddressTest() {
        // TODO: test consumerAddress
    }

    /**
     * Test the property 'initialTerminationTime'
     */
    @Test
    public void initialTerminationTimeTest() {
        // TODO: test initialTerminationTime
    }

    /**
     * Test the property 'validityPeriodStart'
     */
    @Test
    public void validityPeriodStartTest() {
        // TODO: test validityPeriodStart
    }

    /**
     * Test the property 'validityPeriodEnd'
     */
    @Test
    public void validityPeriodEndTest() {
        // TODO: test validityPeriodEnd
    }

    /**
     * Test the property 'previewInterval'
     */
    @Test
    public void previewIntervalTest() {
        // TODO: test previewInterval
    }

    /**
     * Test the property 'topics'
     */
    @Test
    public void topicsTest() {
        // TODO: test topics
    }

}