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
import {V3ErrorResponse} from '../model/V3ErrorResponse';
import {V3StopResponse} from '../model/V3StopResponse';
import {V3StopsByDistanceResponse} from '../model/V3StopsByDistanceResponse';
import {V3StopsOnRouteResponse} from '../model/V3StopsOnRouteResponse';

/**
* Stops service.
* @module api/StopsApi
* @version v3
*/
export class StopsApi {

    /**
    * Constructs a new StopsApi. 
    * @alias module:api/StopsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the stopsStopDetails operation.
     * @callback moduleapi/StopsApi~stopsStopDetailsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/V3StopResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * View facilities at a specific stop (Metro and V/Line stations only)
     * @param {Number} stopId Identifier of stop; values returned by Stops API
     * @param {module:model/Number} routeType Number identifying transport mode; values returned via RouteTypes API
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.stopLocation Indicates if stop location information will be returned (default &#x3D; false)
     * @param {Boolean} opts.stopAmenities Indicates if stop amenity information will be returned (default &#x3D; false)
     * @param {Boolean} opts.stopAccessibility Indicates if stop accessibility information will be returned (default &#x3D; false)
     * @param {Boolean} opts.stopContact Indicates if stop contact information will be returned (default &#x3D; false)
     * @param {Boolean} opts.stopTicket Indicates if stop ticket information will be returned (default &#x3D; false)
     * @param {Boolean} opts.gtfs Incdicates whether the stop_id is a GTFS ID or not
     * @param {Boolean} opts.stopStaffing Indicates if stop staffing information will be returned (default &#x3D; false)
     * @param {Boolean} opts.stopDisruptions Indicates if stop disruption information will be returned (default &#x3D; false)
     * @param {String} opts.token Please ignore
     * @param {String} opts.devid Your developer id
     * @param {String} opts.signature Authentication signature for request
     * @param {module:api/StopsApi~stopsStopDetailsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    stopsStopDetails(stopId, routeType, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'stopId' is set
      if (stopId === undefined || stopId === null) {
        throw new Error("Missing the required parameter 'stopId' when calling stopsStopDetails");
      }
      // verify the required parameter 'routeType' is set
      if (routeType === undefined || routeType === null) {
        throw new Error("Missing the required parameter 'routeType' when calling stopsStopDetails");
      }

      let pathParams = {
        'stop_id': stopId,'route_type': routeType
      };
      let queryParams = {
        'stop_location': opts['stopLocation'],'stop_amenities': opts['stopAmenities'],'stop_accessibility': opts['stopAccessibility'],'stop_contact': opts['stopContact'],'stop_ticket': opts['stopTicket'],'gtfs': opts['gtfs'],'stop_staffing': opts['stopStaffing'],'stop_disruptions': opts['stopDisruptions'],'token': opts['token'],'devid': opts['devid'],'signature': opts['signature']
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json', 'text/json', 'text/html'];
      let returnType = V3StopResponse;

      return this.apiClient.callApi(
        '/v3/stops/{stop_id}/route_type/{route_type}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the stopsStopsByGeolocation operation.
     * @callback moduleapi/StopsApi~stopsStopsByGeolocationCallback
     * @param {String} error Error message, if any.
     * @param {module:model/V3StopsByDistanceResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * View all stops near a specific location
     * @param {Number} latitude Geographic coordinate of latitude
     * @param {Number} longitude Geographic coordinate of longitude
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/Number>} opts.routeTypes Filter by route_type; values returned via RouteTypes API
     * @param {Number} opts.maxResults Maximum number of results returned (default &#x3D; 30)
     * @param {Number} opts.maxDistance Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300)
     * @param {Boolean} opts.stopDisruptions Indicates if stop disruption information will be returned (default &#x3D; false)
     * @param {String} opts.token Please ignore
     * @param {String} opts.devid Your developer id
     * @param {String} opts.signature Authentication signature for request
     * @param {module:api/StopsApi~stopsStopsByGeolocationCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    stopsStopsByGeolocation(latitude, longitude, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'latitude' is set
      if (latitude === undefined || latitude === null) {
        throw new Error("Missing the required parameter 'latitude' when calling stopsStopsByGeolocation");
      }
      // verify the required parameter 'longitude' is set
      if (longitude === undefined || longitude === null) {
        throw new Error("Missing the required parameter 'longitude' when calling stopsStopsByGeolocation");
      }

      let pathParams = {
        'latitude': latitude,'longitude': longitude
      };
      let queryParams = {
        'route_types': this.apiClient.buildCollectionParam(opts['routeTypes'], 'multi'),'max_results': opts['maxResults'],'max_distance': opts['maxDistance'],'stop_disruptions': opts['stopDisruptions'],'token': opts['token'],'devid': opts['devid'],'signature': opts['signature']
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json', 'text/json', 'text/html'];
      let returnType = V3StopsByDistanceResponse;

      return this.apiClient.callApi(
        '/v3/stops/location/{latitude},{longitude}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the stopsStopsForRoute operation.
     * @callback moduleapi/StopsApi~stopsStopsForRouteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/V3StopsOnRouteResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * View all stops on a specific route
     * @param {Number} routeId Identifier of route; values returned by Routes API - v3/routes
     * @param {module:model/Number} routeType Number identifying transport mode; values returned via RouteTypes API
     * @param {Object} opts Optional parameters
     * @param {Number} opts.directionId An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response.
     * @param {Boolean} opts.stopDisruptions Indicates if stop disruption information will be returned (default &#x3D; false)
     * @param {Boolean} opts.includeGeopath Indicates if geopath data will be returned (default &#x3D; false)
     * @param {Date} opts.geopathUtc Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date)
     * @param {String} opts.token Please ignore
     * @param {String} opts.devid Your developer id
     * @param {String} opts.signature Authentication signature for request
     * @param {module:api/StopsApi~stopsStopsForRouteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    stopsStopsForRoute(routeId, routeType, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'routeId' is set
      if (routeId === undefined || routeId === null) {
        throw new Error("Missing the required parameter 'routeId' when calling stopsStopsForRoute");
      }
      // verify the required parameter 'routeType' is set
      if (routeType === undefined || routeType === null) {
        throw new Error("Missing the required parameter 'routeType' when calling stopsStopsForRoute");
      }

      let pathParams = {
        'route_id': routeId,'route_type': routeType
      };
      let queryParams = {
        'direction_id': opts['directionId'],'stop_disruptions': opts['stopDisruptions'],'include_geopath': opts['includeGeopath'],'geopath_utc': opts['geopathUtc'],'token': opts['token'],'devid': opts['devid'],'signature': opts['signature']
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json', 'text/json', 'text/html'];
      let returnType = V3StopsOnRouteResponse;

      return this.apiClient.callApi(
        '/v3/stops/route/{route_id}/route_type/{route_type}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}