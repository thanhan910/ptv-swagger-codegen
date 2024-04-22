<?php
/**
 * V3DeparturesBroadParametersTest
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * PTV Timetable API - Version 3
 *
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.
 *
 * OpenAPI spec version: v3
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.39
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Please update the test case below to test the model.
 */

namespace Swagger\Client;

/**
 * V3DeparturesBroadParametersTest Class Doc Comment
 *
 * @category    Class
 * @description V3DeparturesBroadParameters
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class V3DeparturesBroadParametersTest extends \PHPUnit_Framework_TestCase
{

    /**
     * Setup before running any test case
     */
    public static function setUpBeforeClass()
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp()
    {
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown()
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass()
    {
    }

    /**
     * Test "V3DeparturesBroadParameters"
     */
    public function testV3DeparturesBroadParameters()
    {
    }

    /**
     * Test attribute "platform_numbers"
     */
    public function testPropertyPlatformNumbers()
    {
    }

    /**
     * Test attribute "direction_id"
     */
    public function testPropertyDirectionId()
    {
    }

    /**
     * Test attribute "gtfs"
     */
    public function testPropertyGtfs()
    {
    }

    /**
     * Test attribute "date_utc"
     */
    public function testPropertyDateUtc()
    {
    }

    /**
     * Test attribute "max_results"
     */
    public function testPropertyMaxResults()
    {
    }

    /**
     * Test attribute "include_cancelled"
     */
    public function testPropertyIncludeCancelled()
    {
    }

    /**
     * Test attribute "look_backwards"
     */
    public function testPropertyLookBackwards()
    {
    }

    /**
     * Test attribute "expand"
     */
    public function testPropertyExpand()
    {
    }

    /**
     * Test attribute "include_geopath"
     */
    public function testPropertyIncludeGeopath()
    {
    }
}
