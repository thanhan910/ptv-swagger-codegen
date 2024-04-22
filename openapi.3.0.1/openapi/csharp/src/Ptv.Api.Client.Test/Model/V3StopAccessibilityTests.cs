/*
 * PTV Timetable API - Version 3
 *
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * The version of the OpenAPI document: v3
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using Xunit;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Ptv.Api.Client.Model;
using Ptv.Api.Client.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace Ptv.Api.Client.Test.Model
{
    /// <summary>
    ///  Class for testing V3StopAccessibility
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class V3StopAccessibilityTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for V3StopAccessibility
        //private V3StopAccessibility instance;

        public V3StopAccessibilityTests()
        {
            // TODO uncomment below to create an instance of V3StopAccessibility
            //instance = new V3StopAccessibility();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of V3StopAccessibility
        /// </summary>
        [Fact]
        public void V3StopAccessibilityInstanceTest()
        {
            // TODO uncomment below to test "IsType" V3StopAccessibility
            //Assert.IsType<V3StopAccessibility>(instance);
        }

        /// <summary>
        /// Test the property 'Lighting'
        /// </summary>
        [Fact]
        public void LightingTest()
        {
            // TODO unit test for the property 'Lighting'
        }

        /// <summary>
        /// Test the property 'PlatformNumber'
        /// </summary>
        [Fact]
        public void PlatformNumberTest()
        {
            // TODO unit test for the property 'PlatformNumber'
        }

        /// <summary>
        /// Test the property 'AudioCustomerInformation'
        /// </summary>
        [Fact]
        public void AudioCustomerInformationTest()
        {
            // TODO unit test for the property 'AudioCustomerInformation'
        }

        /// <summary>
        /// Test the property 'Escalator'
        /// </summary>
        [Fact]
        public void EscalatorTest()
        {
            // TODO unit test for the property 'Escalator'
        }

        /// <summary>
        /// Test the property 'HearingLoop'
        /// </summary>
        [Fact]
        public void HearingLoopTest()
        {
            // TODO unit test for the property 'HearingLoop'
        }

        /// <summary>
        /// Test the property 'Lift'
        /// </summary>
        [Fact]
        public void LiftTest()
        {
            // TODO unit test for the property 'Lift'
        }

        /// <summary>
        /// Test the property 'Stairs'
        /// </summary>
        [Fact]
        public void StairsTest()
        {
            // TODO unit test for the property 'Stairs'
        }

        /// <summary>
        /// Test the property 'StopAccessible'
        /// </summary>
        [Fact]
        public void StopAccessibleTest()
        {
            // TODO unit test for the property 'StopAccessible'
        }

        /// <summary>
        /// Test the property 'TactileGroundSurfaceIndicator'
        /// </summary>
        [Fact]
        public void TactileGroundSurfaceIndicatorTest()
        {
            // TODO unit test for the property 'TactileGroundSurfaceIndicator'
        }

        /// <summary>
        /// Test the property 'WaitingRoom'
        /// </summary>
        [Fact]
        public void WaitingRoomTest()
        {
            // TODO unit test for the property 'WaitingRoom'
        }

        /// <summary>
        /// Test the property 'Wheelchair'
        /// </summary>
        [Fact]
        public void WheelchairTest()
        {
            // TODO unit test for the property 'Wheelchair'
        }
    }
}
