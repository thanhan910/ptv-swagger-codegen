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
    ///  Class for testing V3VehicleDescriptor
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class V3VehicleDescriptorTests
    {
        // TODO uncomment below to declare an instance variable for V3VehicleDescriptor
        //private V3VehicleDescriptor instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of V3VehicleDescriptor
            //instance = new V3VehicleDescriptor();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of V3VehicleDescriptor
        /// </summary>
        [Test]
        public void V3VehicleDescriptorInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" V3VehicleDescriptor
            //Assert.IsInstanceOfType<V3VehicleDescriptor> (instance, "variable 'instance' is a V3VehicleDescriptor");
        }


        /// <summary>
        /// Test the property 'Operator'
        /// </summary>
        [Test]
        public void OperatorTest()
        {
            // TODO unit test for the property 'Operator'
        }
        /// <summary>
        /// Test the property 'Id'
        /// </summary>
        [Test]
        public void IdTest()
        {
            // TODO unit test for the property 'Id'
        }
        /// <summary>
        /// Test the property 'LowFloor'
        /// </summary>
        [Test]
        public void LowFloorTest()
        {
            // TODO unit test for the property 'LowFloor'
        }
        /// <summary>
        /// Test the property 'AirConditioned'
        /// </summary>
        [Test]
        public void AirConditionedTest()
        {
            // TODO unit test for the property 'AirConditioned'
        }
        /// <summary>
        /// Test the property 'Description'
        /// </summary>
        [Test]
        public void DescriptionTest()
        {
            // TODO unit test for the property 'Description'
        }
        /// <summary>
        /// Test the property 'Supplier'
        /// </summary>
        [Test]
        public void SupplierTest()
        {
            // TODO unit test for the property 'Supplier'
        }
        /// <summary>
        /// Test the property 'Length'
        /// </summary>
        [Test]
        public void LengthTest()
        {
            // TODO unit test for the property 'Length'
        }

    }

}
