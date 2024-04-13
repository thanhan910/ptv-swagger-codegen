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

/**
 * The V3SiriLineRef model module.
 * @module model/V3SiriLineRef
 * @version v3
 */
export class V3SiriLineRef {
  /**
   * Constructs a new <code>V3SiriLineRef</code>.
   * @alias module:model/V3SiriLineRef
   * @class
   * @param lineRef {String} Siri LineRef
   */
  constructor(lineRef) {
    this.lineRef = lineRef;
  }

  /**
   * Constructs a <code>V3SiriLineRef</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/V3SiriLineRef} obj Optional instance to populate.
   * @return {module:model/V3SiriLineRef} The populated <code>V3SiriLineRef</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new V3SiriLineRef();
      if (data.hasOwnProperty('line_ref'))
        obj.lineRef = ApiClient.convertToType(data['line_ref'], 'String');
      if (data.hasOwnProperty('direction_ref'))
        obj.directionRef = ApiClient.convertToType(data['direction_ref'], 'Number');
    }
    return obj;
  }
}

/**
 * Siri LineRef
 * @member {String} lineRef
 */
V3SiriLineRef.prototype.lineRef = undefined;

/**
 * Allowed values for the <code>directionRef</code> property.
 * @enum {Number}
 * @readonly
 */
V3SiriLineRef.DirectionRefEnum = {
  /**
   * value: 1
   * @const
   */
  _1: 1,

  /**
   * value: 2
   * @const
   */
  _2: 2,

  /**
   * value: 5
   * @const
   */
  _5: 5,

  /**
   * value: 10
   * @const
   */
  _10: 10,

  /**
   * value: 16
   * @const
   */
  _16: 16,

  /**
   * value: 32
   * @const
   */
  _32: 32,

  /**
   * value: 65
   * @const
   */
  _65: 65,

  /**
   * value: 130
   * @const
   */
  _130: 130
};
/**
 * Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)
 * @member {module:model/V3SiriLineRef.DirectionRefEnum} directionRef
 */
V3SiriLineRef.prototype.directionRef = undefined;
