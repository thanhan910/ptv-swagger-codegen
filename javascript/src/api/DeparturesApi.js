/*
 * PTV Timetable API - Version 3
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * OpenAPI spec version: v3
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.52
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from "../ApiClient";
import {V3DeparturesResponse} from '../model/V3DeparturesResponse';
import {V3ErrorResponse} from '../model/V3ErrorResponse';

/**
* Departures service.
* @module api/DeparturesApi
* @version v3
*/
export class DeparturesApi {

    /**
    * Constructs a new DeparturesApi. 
    * @alias module:api/DeparturesApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the departuresGetForStop operation.
     * @callback moduleapi/DeparturesApi~departuresGetForStopCallback
     * @param {String} error Error message, if any.
     * @param {module:model/V3DeparturesResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * View departures for all routes from a stop
     * @param {module:model/Number} routeType Number identifying transport mode; values returned via RouteTypes API
     * @param {Number} stopId Identifier of stop; values returned by Stops API
     * @param {Object} opts Optional parameters
     * @param {Array.<Number>} opts.platformNumbers Filter by platform number at stop
     * @param {Number} opts.directionId Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
     * @param {Boolean} opts.gtfs Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data
     * @param {Date} opts.dateUtc Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time)
     * @param {Number} opts.maxResults Maximum number of results returned
     * @param {Boolean} opts.includeCancelled Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only
     * @param {Boolean} opts.lookBackwards Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0.
     * @param {Array.<module:model/String>} opts.expand List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
     * @param {Boolean} opts.includeGeopath Indicates if the route geopath should be returned
     * @param {String} opts.token Please ignore
     * @param {String} opts.devid Your developer id
     * @param {String} opts.signature Authentication signature for request
     * @param {module:api/DeparturesApi~departuresGetForStopCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    departuresGetForStop(routeType, stopId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'routeType' is set
      if (routeType === undefined || routeType === null) {
        throw new Error("Missing the required parameter 'routeType' when calling departuresGetForStop");
      }
      // verify the required parameter 'stopId' is set
      if (stopId === undefined || stopId === null) {
        throw new Error("Missing the required parameter 'stopId' when calling departuresGetForStop");
      }

      let pathParams = {
        'route_type': routeType,'stop_id': stopId
      };
      let queryParams = {
        'platform_numbers': this.apiClient.buildCollectionParam(opts['platformNumbers'], 'multi'),'direction_id': opts['directionId'],'gtfs': opts['gtfs'],'date_utc': opts['dateUtc'],'max_results': opts['maxResults'],'include_cancelled': opts['includeCancelled'],'look_backwards': opts['lookBackwards'],'expand': this.apiClient.buildCollectionParam(opts['expand'], 'multi'),'include_geopath': opts['includeGeopath'],'token': opts['token'],'devid': opts['devid'],'signature': opts['signature']
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json', 'text/json', 'text/html'];
      let returnType = V3DeparturesResponse;

      return this.apiClient.callApi(
        '/v3/departures/route_type/{route_type}/stop/{stop_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the departuresGetForStopAndRoute operation.
     * @callback moduleapi/DeparturesApi~departuresGetForStopAndRouteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/V3DeparturesResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * View departures for a specific route from a stop
     * @param {module:model/Number} routeType Number identifying transport mode; values returned via RouteTypes API
     * @param {Number} stopId Identifier of stop; values returned by Stops API
     * @param {String} routeId Identifier of route; values returned by Routes API - v3/routes
     * @param {Object} opts Optional parameters
     * @param {Number} opts.directionId Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
     * @param {Boolean} opts.gtfs Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data
     * @param {Date} opts.dateUtc Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time)
     * @param {Number} opts.maxResults Maximum number of results returned
     * @param {Boolean} opts.includeCancelled Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only
     * @param {Boolean} opts.lookBackwards Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0.
     * @param {Array.<module:model/String>} opts.expand List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
     * @param {Boolean} opts.includeGeopath Indicates if the route geopath should be returned
     * @param {String} opts.token Please ignore
     * @param {String} opts.devid Your developer id
     * @param {String} opts.signature Authentication signature for request
     * @param {module:api/DeparturesApi~departuresGetForStopAndRouteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    departuresGetForStopAndRoute(routeType, stopId, routeId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'routeType' is set
      if (routeType === undefined || routeType === null) {
        throw new Error("Missing the required parameter 'routeType' when calling departuresGetForStopAndRoute");
      }
      // verify the required parameter 'stopId' is set
      if (stopId === undefined || stopId === null) {
        throw new Error("Missing the required parameter 'stopId' when calling departuresGetForStopAndRoute");
      }
      // verify the required parameter 'routeId' is set
      if (routeId === undefined || routeId === null) {
        throw new Error("Missing the required parameter 'routeId' when calling departuresGetForStopAndRoute");
      }

      let pathParams = {
        'route_type': routeType,'stop_id': stopId,'route_id': routeId
      };
      let queryParams = {
        'direction_id': opts['directionId'],'gtfs': opts['gtfs'],'date_utc': opts['dateUtc'],'max_results': opts['maxResults'],'include_cancelled': opts['includeCancelled'],'look_backwards': opts['lookBackwards'],'expand': this.apiClient.buildCollectionParam(opts['expand'], 'multi'),'include_geopath': opts['includeGeopath'],'token': opts['token'],'devid': opts['devid'],'signature': opts['signature']
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json', 'text/json', 'text/html'];
      let returnType = V3DeparturesResponse;

      return this.apiClient.callApi(
        '/v3/departures/route_type/{route_type}/stop/{stop_id}/route/{route_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}