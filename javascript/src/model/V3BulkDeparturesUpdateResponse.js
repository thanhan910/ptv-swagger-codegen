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
import {ApiClient} from '../ApiClient';
import {V3BulkDeparturesRouteDirectionResponse} from './V3BulkDeparturesRouteDirectionResponse';
import {V3Departure} from './V3Departure';

/**
 * The V3BulkDeparturesUpdateResponse model module.
 * @module model/V3BulkDeparturesUpdateResponse
 * @version v3
 */
export class V3BulkDeparturesUpdateResponse {
  /**
   * Constructs a new <code>V3BulkDeparturesUpdateResponse</code>.
   * @alias module:model/V3BulkDeparturesUpdateResponse
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>V3BulkDeparturesUpdateResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/V3BulkDeparturesUpdateResponse} obj Optional instance to populate.
   * @return {module:model/V3BulkDeparturesUpdateResponse} The populated <code>V3BulkDeparturesUpdateResponse</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new V3BulkDeparturesUpdateResponse();
      if (data.hasOwnProperty('departures'))
        obj.departures = ApiClient.convertToType(data['departures'], [V3Departure]);
      if (data.hasOwnProperty('route_type'))
        obj.routeType = ApiClient.convertToType(data['route_type'], 'Number');
      if (data.hasOwnProperty('stop_id'))
        obj.stopId = ApiClient.convertToType(data['stop_id'], 'Number');
      if (data.hasOwnProperty('requested_route_direction'))
        obj.requestedRouteDirection = V3BulkDeparturesRouteDirectionResponse.constructFromObject(data['requested_route_direction']);
      if (data.hasOwnProperty('route_direction_status'))
        obj.routeDirectionStatus = ApiClient.convertToType(data['route_direction_status'], 'Number');
      if (data.hasOwnProperty('route_direction'))
        obj.routeDirection = V3BulkDeparturesRouteDirectionResponse.constructFromObject(data['route_direction']);
    }
    return obj;
  }
}

/**
 * Timetabled and real-time service departures
 * @member {Array.<module:model/V3Departure>} departures
 */
V3BulkDeparturesUpdateResponse.prototype.departures = undefined;

/**
 * Transport mode identifier
 * @member {Number} routeType
 */
V3BulkDeparturesUpdateResponse.prototype.routeType = undefined;

/**
 * Stop identifier
 * @member {Number} stopId
 */
V3BulkDeparturesUpdateResponse.prototype.stopId = undefined;

/**
 * @member {module:model/V3BulkDeparturesRouteDirectionResponse} requestedRouteDirection
 */
V3BulkDeparturesUpdateResponse.prototype.requestedRouteDirection = undefined;

/**
 * Allowed values for the <code>routeDirectionStatus</code> property.
 * @enum {Number}
 * @readonly
 */
V3BulkDeparturesUpdateResponse.RouteDirectionStatusEnum = {
  /**
   * value: 0
   * @const
   */
  _0: 0,

  /**
   * value: 1
   * @const
   */
  _1: 1
};
/**
 * The status of the route direction (changed | unchanged).  If changed, requests should change the requested_route_direction for the route_direction supplied.
 * @member {module:model/V3BulkDeparturesUpdateResponse.RouteDirectionStatusEnum} routeDirectionStatus
 */
V3BulkDeparturesUpdateResponse.prototype.routeDirectionStatus = undefined;

/**
 * @member {module:model/V3BulkDeparturesRouteDirectionResponse} routeDirection
 */
V3BulkDeparturesUpdateResponse.prototype.routeDirection = undefined;
