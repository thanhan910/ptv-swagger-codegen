/* 
 * PTV Timetable API - Version 3
 *
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * OpenAPI spec version: v3
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using IO.Swagger.Api;
using IO.Swagger.Model;
using IO.Swagger.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing V3StopModel
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class V3StopModelTests
    {
        // TODO uncomment below to declare an instance variable for V3StopModel
        //private V3StopModel instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of V3StopModel
            //instance = new V3StopModel();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of V3StopModel
        /// </summary>
        [Test]
        public void V3StopModelInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" V3StopModel
            //Assert.IsInstanceOfType<V3StopModel> (instance, "variable 'instance' is a V3StopModel");
        }


        /// <summary>
        /// Test the property 'StopDistance'
        /// </summary>
        [Test]
        public void StopDistanceTest()
        {
            // TODO unit test for the property 'StopDistance'
        }
        /// <summary>
        /// Test the property 'StopSuburb'
        /// </summary>
        [Test]
        public void StopSuburbTest()
        {
            // TODO unit test for the property 'StopSuburb'
        }
        /// <summary>
        /// Test the property 'StopName'
        /// </summary>
        [Test]
        public void StopNameTest()
        {
            // TODO unit test for the property 'StopName'
        }
        /// <summary>
        /// Test the property 'StopId'
        /// </summary>
        [Test]
        public void StopIdTest()
        {
            // TODO unit test for the property 'StopId'
        }
        /// <summary>
        /// Test the property 'RouteType'
        /// </summary>
        [Test]
        public void RouteTypeTest()
        {
            // TODO unit test for the property 'RouteType'
        }
        /// <summary>
        /// Test the property 'StopLatitude'
        /// </summary>
        [Test]
        public void StopLatitudeTest()
        {
            // TODO unit test for the property 'StopLatitude'
        }
        /// <summary>
        /// Test the property 'StopLongitude'
        /// </summary>
        [Test]
        public void StopLongitudeTest()
        {
            // TODO unit test for the property 'StopLongitude'
        }
        /// <summary>
        /// Test the property 'StopLandmark'
        /// </summary>
        [Test]
        public void StopLandmarkTest()
        {
            // TODO unit test for the property 'StopLandmark'
        }
        /// <summary>
        /// Test the property 'StopSequence'
        /// </summary>
        [Test]
        public void StopSequenceTest()
        {
            // TODO unit test for the property 'StopSequence'
        }

    }

}
