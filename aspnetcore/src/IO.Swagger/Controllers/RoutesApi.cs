/*
 * PTV Timetable API - Version 3
 *
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * OpenAPI spec version: v3
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.Collections.Generic;
using Microsoft.AspNetCore.Mvc;
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using System.ComponentModel.DataAnnotations;
using IO.Swagger.Attributes;

using Microsoft.AspNetCore.Authorization;
using IO.Swagger.Models;

namespace IO.Swagger.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class RoutesApiController : ControllerBase
    { 
        /// <summary>
        /// View route names and numbers for all routes
        /// </summary>
        /// <param name="routeTypes">Filter by route_type; values returned via RouteTypes API</param>
        /// <param name="routeName">Filter by name  of route (accepts partial route name matches)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <response code="200">Route names and numbers for all routes of all route types.</response>
        /// <response code="400">Invalid Request</response>
        /// <response code="403">Access Denied</response>
        [HttpGet]
        [Route("//v3/routes")]
        [ValidateModelState]
        [SwaggerOperation("RoutesOneOrMoreRoutes")]
        [SwaggerResponse(statusCode: 200, type: typeof(V3RouteResponse), description: "Route names and numbers for all routes of all route types.")]
        [SwaggerResponse(statusCode: 400, type: typeof(V3ErrorResponse), description: "Invalid Request")]
        [SwaggerResponse(statusCode: 403, type: typeof(V3ErrorResponse), description: "Access Denied")]
        public virtual IActionResult RoutesOneOrMoreRoutes([FromQuery]List<int?> routeTypes, [FromQuery]string routeName, [FromQuery]string token, [FromQuery]string devid, [FromQuery]string signature)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(V3RouteResponse));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(V3ErrorResponse));

            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(V3ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\r\n  \"route\" : {\r\n    \"route_service_status\" : {\r\n      \"description\" : \"description\",\r\n      \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\r\n    },\r\n    \"route_id\" : 6,\r\n    \"route_name\" : \"route_name\",\r\n    \"route_type\" : 0,\r\n    \"route_number\" : \"route_number\",\r\n    \"route_gtfs_id\" : \"route_gtfs_id\",\r\n    \"geopath\" : [ { }, { } ]\r\n  },\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<V3RouteResponse>(exampleJson)
                        : default(V3RouteResponse);            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// View route name and number for specific route ID
        /// </summary>
        /// <param name="routeId">Identifier of route; values returned by Departures, Directions and Disruptions APIs</param>
        /// <param name="includeGeopath">Indicates kif geopath data will be returned (default &#x3D; false)</param>
        /// <param name="geopathUtc">Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date)</param>
        /// <param name="token">Please ignore</param>
        /// <param name="devid">Your developer id</param>
        /// <param name="signature">Authentication signature for request</param>
        /// <response code="200">The route name and number for the specified route ID.</response>
        /// <response code="400">Invalid Request</response>
        /// <response code="403">Access Denied</response>
        [HttpGet]
        [Route("//v3/routes/{route_id}")]
        [ValidateModelState]
        [SwaggerOperation("RoutesRouteFromId")]
        [SwaggerResponse(statusCode: 200, type: typeof(V3RouteResponse), description: "The route name and number for the specified route ID.")]
        [SwaggerResponse(statusCode: 400, type: typeof(V3ErrorResponse), description: "Invalid Request")]
        [SwaggerResponse(statusCode: 403, type: typeof(V3ErrorResponse), description: "Access Denied")]
        public virtual IActionResult RoutesRouteFromId([FromRoute][Required]int? routeId, [FromQuery]bool? includeGeopath, [FromQuery]DateTime? geopathUtc, [FromQuery]string token, [FromQuery]string devid, [FromQuery]string signature)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(V3RouteResponse));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(V3ErrorResponse));

            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(V3ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\r\n  \"route\" : {\r\n    \"route_service_status\" : {\r\n      \"description\" : \"description\",\r\n      \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\r\n    },\r\n    \"route_id\" : 6,\r\n    \"route_name\" : \"route_name\",\r\n    \"route_type\" : 0,\r\n    \"route_number\" : \"route_number\",\r\n    \"route_gtfs_id\" : \"route_gtfs_id\",\r\n    \"geopath\" : [ { }, { } ]\r\n  },\r\n  \"status\" : {\r\n    \"health\" : 6,\r\n    \"version\" : \"version\"\r\n  }\r\n}";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<V3RouteResponse>(exampleJson)
                        : default(V3RouteResponse);            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}