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
import {V3DisruptionModesResponse} from '../model/V3DisruptionModesResponse';
import {V3DisruptionResponse} from '../model/V3DisruptionResponse';
import {V3DisruptionsResponse} from '../model/V3DisruptionsResponse';
import {V3ErrorResponse} from '../model/V3ErrorResponse';

/**
* Disruptions service.
* @module api/DisruptionsApi
* @version v3
*/
export class DisruptionsApi {

    /**
    * Constructs a new DisruptionsApi. 
    * @alias module:api/DisruptionsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the disruptionsGetAllDisruptions operation.
     * @callback moduleapi/DisruptionsApi~disruptionsGetAllDisruptionsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/V3DisruptionsResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * View all disruptions for all route types
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/Number>} opts.routeTypes Filter by route_type; values returned via RouteTypes API
     * @param {Array.<module:model/Number>} opts.disruptionModes Filter by disruption_mode; values returned via v3/disruptions/modes API
     * @param {module:model/String} opts.disruptionStatus Filter by status of disruption
     * @param {String} opts.token Please ignore
     * @param {String} opts.devid Your developer id
     * @param {String} opts.signature Authentication signature for request
     * @param {module:api/DisruptionsApi~disruptionsGetAllDisruptionsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    disruptionsGetAllDisruptions(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        
      };
      let queryParams = {
        'route_types': this.apiClient.buildCollectionParam(opts['routeTypes'], 'multi'),'disruption_modes': this.apiClient.buildCollectionParam(opts['disruptionModes'], 'multi'),'disruption_status': opts['disruptionStatus'],'token': opts['token'],'devid': opts['devid'],'signature': opts['signature']
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json', 'text/json', 'text/html'];
      let returnType = V3DisruptionsResponse;

      return this.apiClient.callApi(
        '/v3/disruptions', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the disruptionsGetDisruptionById operation.
     * @callback moduleapi/DisruptionsApi~disruptionsGetDisruptionByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/V3DisruptionResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * View a specific disruption
     * @param {Number} disruptionId Identifier of disruption; values returned by Disruptions API - /v3/disruptions OR /v3/disruptions/route/{route_id}
     * @param {Object} opts Optional parameters
     * @param {String} opts.token Please ignore
     * @param {String} opts.devid Your developer id
     * @param {String} opts.signature Authentication signature for request
     * @param {module:api/DisruptionsApi~disruptionsGetDisruptionByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    disruptionsGetDisruptionById(disruptionId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'disruptionId' is set
      if (disruptionId === undefined || disruptionId === null) {
        throw new Error("Missing the required parameter 'disruptionId' when calling disruptionsGetDisruptionById");
      }

      let pathParams = {
        'disruption_id': disruptionId
      };
      let queryParams = {
        'token': opts['token'],'devid': opts['devid'],'signature': opts['signature']
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json', 'text/json', 'text/html'];
      let returnType = V3DisruptionResponse;

      return this.apiClient.callApi(
        '/v3/disruptions/{disruption_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the disruptionsGetDisruptionModes operation.
     * @callback moduleapi/DisruptionsApi~disruptionsGetDisruptionModesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/V3DisruptionModesResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get all disruption modes
     * @param {Object} opts Optional parameters
     * @param {String} opts.token Please ignore
     * @param {String} opts.devid Your developer id
     * @param {String} opts.signature Authentication signature for request
     * @param {module:api/DisruptionsApi~disruptionsGetDisruptionModesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    disruptionsGetDisruptionModes(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
        
      };
      let queryParams = {
        'token': opts['token'],'devid': opts['devid'],'signature': opts['signature']
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json', 'text/json', 'text/html'];
      let returnType = V3DisruptionModesResponse;

      return this.apiClient.callApi(
        '/v3/disruptions/modes', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the disruptionsGetDisruptionsByRoute operation.
     * @callback moduleapi/DisruptionsApi~disruptionsGetDisruptionsByRouteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/V3DisruptionsResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * View all disruptions for a particular route
     * @param {Number} routeId Identifier of route; values returned by Routes API - v3/routes
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.disruptionStatus Filter by status of disruption
     * @param {String} opts.token Please ignore
     * @param {String} opts.devid Your developer id
     * @param {String} opts.signature Authentication signature for request
     * @param {module:api/DisruptionsApi~disruptionsGetDisruptionsByRouteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    disruptionsGetDisruptionsByRoute(routeId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'routeId' is set
      if (routeId === undefined || routeId === null) {
        throw new Error("Missing the required parameter 'routeId' when calling disruptionsGetDisruptionsByRoute");
      }

      let pathParams = {
        'route_id': routeId
      };
      let queryParams = {
        'disruption_status': opts['disruptionStatus'],'token': opts['token'],'devid': opts['devid'],'signature': opts['signature']
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json', 'text/json', 'text/html'];
      let returnType = V3DisruptionsResponse;

      return this.apiClient.callApi(
        '/v3/disruptions/route/{route_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the disruptionsGetDisruptionsByRouteAndStop operation.
     * @callback moduleapi/DisruptionsApi~disruptionsGetDisruptionsByRouteAndStopCallback
     * @param {String} error Error message, if any.
     * @param {module:model/V3DisruptionsResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * View all disruptions for a particular route and stop
     * @param {Number} routeId Identifier of route; values returned by Routes API - v3/routes
     * @param {Number} stopId Identifier of stop; values returned by Stops API - v3/stops
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.disruptionStatus Filter by status of disruption
     * @param {String} opts.token Please ignore
     * @param {String} opts.devid Your developer id
     * @param {String} opts.signature Authentication signature for request
     * @param {module:api/DisruptionsApi~disruptionsGetDisruptionsByRouteAndStopCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    disruptionsGetDisruptionsByRouteAndStop(routeId, stopId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'routeId' is set
      if (routeId === undefined || routeId === null) {
        throw new Error("Missing the required parameter 'routeId' when calling disruptionsGetDisruptionsByRouteAndStop");
      }
      // verify the required parameter 'stopId' is set
      if (stopId === undefined || stopId === null) {
        throw new Error("Missing the required parameter 'stopId' when calling disruptionsGetDisruptionsByRouteAndStop");
      }

      let pathParams = {
        'route_id': routeId,'stop_id': stopId
      };
      let queryParams = {
        'disruption_status': opts['disruptionStatus'],'token': opts['token'],'devid': opts['devid'],'signature': opts['signature']
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json', 'text/json', 'text/html'];
      let returnType = V3DisruptionsResponse;

      return this.apiClient.callApi(
        '/v3/disruptions/route/{route_id}/stop/{stop_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the disruptionsGetDisruptionsByStop operation.
     * @callback moduleapi/DisruptionsApi~disruptionsGetDisruptionsByStopCallback
     * @param {String} error Error message, if any.
     * @param {module:model/V3DisruptionsResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * View all disruptions for a particular stop
     * @param {Number} stopId Identifier of stop; values returned by Stops API - v3/stops
     * @param {Object} opts Optional parameters
     * @param {module:model/String} opts.disruptionStatus Filter by status of disruption
     * @param {String} opts.token Please ignore
     * @param {String} opts.devid Your developer id
     * @param {String} opts.signature Authentication signature for request
     * @param {module:api/DisruptionsApi~disruptionsGetDisruptionsByStopCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    disruptionsGetDisruptionsByStop(stopId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'stopId' is set
      if (stopId === undefined || stopId === null) {
        throw new Error("Missing the required parameter 'stopId' when calling disruptionsGetDisruptionsByStop");
      }

      let pathParams = {
        'stop_id': stopId
      };
      let queryParams = {
        'disruption_status': opts['disruptionStatus'],'token': opts['token'],'devid': opts['devid'],'signature': opts['signature']
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json', 'text/json', 'text/html'];
      let returnType = V3DisruptionsResponse;

      return this.apiClient.callApi(
        '/v3/disruptions/stop/{stop_id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}