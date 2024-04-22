/*
 * PTV Timetable API - Version 3
 *
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * The version of the OpenAPI document: v3
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Ptv.Api.Client.Client;
using Ptv.Api.Client.Api;
// uncomment below to import models
//using Ptv.Api.Client.Model;

namespace Ptv.Api.Client.Test.Api
{
    /// <summary>
    ///  Class for testing DisruptionsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class DisruptionsApiTests : IDisposable
    {
        private DisruptionsApi instance;

        public DisruptionsApiTests()
        {
            instance = new DisruptionsApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of DisruptionsApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' DisruptionsApi
            //Assert.IsType<DisruptionsApi>(instance);
        }

        /// <summary>
        /// Test DisruptionsGetAllDisruptions
        /// </summary>
        [Fact]
        public void DisruptionsGetAllDisruptionsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //List<int>? routeTypes = null;
            //List<int>? disruptionModes = null;
            //string? disruptionStatus = null;
            //string? token = null;
            //string? devid = null;
            //string? signature = null;
            //var response = instance.DisruptionsGetAllDisruptions(routeTypes, disruptionModes, disruptionStatus, token, devid, signature);
            //Assert.IsType<V3DisruptionsResponse>(response);
        }

        /// <summary>
        /// Test DisruptionsGetDisruptionById
        /// </summary>
        [Fact]
        public void DisruptionsGetDisruptionByIdTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long disruptionId = null;
            //string? token = null;
            //string? devid = null;
            //string? signature = null;
            //var response = instance.DisruptionsGetDisruptionById(disruptionId, token, devid, signature);
            //Assert.IsType<V3DisruptionResponse>(response);
        }

        /// <summary>
        /// Test DisruptionsGetDisruptionModes
        /// </summary>
        [Fact]
        public void DisruptionsGetDisruptionModesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string? token = null;
            //string? devid = null;
            //string? signature = null;
            //var response = instance.DisruptionsGetDisruptionModes(token, devid, signature);
            //Assert.IsType<V3DisruptionModesResponse>(response);
        }

        /// <summary>
        /// Test DisruptionsGetDisruptionsByRoute
        /// </summary>
        [Fact]
        public void DisruptionsGetDisruptionsByRouteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int routeId = null;
            //string? disruptionStatus = null;
            //string? token = null;
            //string? devid = null;
            //string? signature = null;
            //var response = instance.DisruptionsGetDisruptionsByRoute(routeId, disruptionStatus, token, devid, signature);
            //Assert.IsType<V3DisruptionsResponse>(response);
        }

        /// <summary>
        /// Test DisruptionsGetDisruptionsByRouteAndStop
        /// </summary>
        [Fact]
        public void DisruptionsGetDisruptionsByRouteAndStopTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int routeId = null;
            //int stopId = null;
            //string? disruptionStatus = null;
            //string? token = null;
            //string? devid = null;
            //string? signature = null;
            //var response = instance.DisruptionsGetDisruptionsByRouteAndStop(routeId, stopId, disruptionStatus, token, devid, signature);
            //Assert.IsType<V3DisruptionsResponse>(response);
        }

        /// <summary>
        /// Test DisruptionsGetDisruptionsByStop
        /// </summary>
        [Fact]
        public void DisruptionsGetDisruptionsByStopTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int stopId = null;
            //string? disruptionStatus = null;
            //string? token = null;
            //string? devid = null;
            //string? signature = null;
            //var response = instance.DisruptionsGetDisruptionsByStop(stopId, disruptionStatus, token, devid, signature);
            //Assert.IsType<V3DisruptionsResponse>(response);
        }
    }
}
