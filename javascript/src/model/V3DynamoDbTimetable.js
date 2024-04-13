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
 * The V3DynamoDbTimetable model module.
 * @module model/V3DynamoDbTimetable
 * @version v3
 */
export class V3DynamoDbTimetable {
  /**
   * Constructs a new <code>V3DynamoDbTimetable</code>.
   * @alias module:model/V3DynamoDbTimetable
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>V3DynamoDbTimetable</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/V3DynamoDbTimetable} obj Optional instance to populate.
   * @return {module:model/V3DynamoDbTimetable} The populated <code>V3DynamoDbTimetable</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new V3DynamoDbTimetable();
      if (data.hasOwnProperty('table_name'))
        obj.tableName = ApiClient.convertToType(data['table_name'], 'String');
      if (data.hasOwnProperty('parser_version'))
        obj.parserVersion = ApiClient.convertToType(data['parser_version'], 'Number');
      if (data.hasOwnProperty('parser_mapping_version'))
        obj.parserMappingVersion = ApiClient.convertToType(data['parser_mapping_version'], 'String');
      if (data.hasOwnProperty('pt_version'))
        obj.ptVersion = ApiClient.convertToType(data['pt_version'], 'Number');
      if (data.hasOwnProperty('pt_mapping_version'))
        obj.ptMappingVersion = ApiClient.convertToType(data['pt_mapping_version'], 'String');
      if (data.hasOwnProperty('transport_type'))
        obj.transportType = ApiClient.convertToType(data['transport_type'], 'Number');
      if (data.hasOwnProperty('applicable_local_date'))
        obj.applicableLocalDate = ApiClient.convertToType(data['applicable_local_date'], 'String');
      if (data.hasOwnProperty('exists'))
        obj.exists = ApiClient.convertToType(data['exists'], 'Boolean');
    }
    return obj;
  }
}

/**
 * Name of corresponding table in DynamoDB.
 * @member {String} tableName
 */
V3DynamoDbTimetable.prototype.tableName = undefined;

/**
 * Parser verison
 * @member {Number} parserVersion
 */
V3DynamoDbTimetable.prototype.parserVersion = undefined;

/**
 * Diva Mapping Version used to load Parser into DynamoDB
 * @member {String} parserMappingVersion
 */
V3DynamoDbTimetable.prototype.parserMappingVersion = undefined;

/**
 * PT version
 * @member {Number} ptVersion
 */
V3DynamoDbTimetable.prototype.ptVersion = undefined;

/**
 * Diva Mapping Version used to load PT into DynamoDB
 * @member {String} ptMappingVersion
 */
V3DynamoDbTimetable.prototype.ptMappingVersion = undefined;

/**
 * Allowed values for the <code>transportType</code> property.
 * @enum {Number}
 * @readonly
 */
V3DynamoDbTimetable.TransportTypeEnum = {
  /**
   * value: 0
   * @const
   */
  _0: 0,

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
   * value: 3
   * @const
   */
  _3: 3,

  /**
   * value: 4
   * @const
   */
  _4: 4
};
/**
 * A.k.a. Transport Mode (e.g. Train, Tram, Bus, V/Line, Nightrider)
 * @member {module:model/V3DynamoDbTimetable.TransportTypeEnum} transportType
 */
V3DynamoDbTimetable.prototype.transportType = undefined;

/**
 * Formated date string of applicable date
 * @member {String} applicableLocalDate
 */
V3DynamoDbTimetable.prototype.applicableLocalDate = undefined;

/**
 * True if the named table has been created in DynamoDB (i.e. at least one departure record has been loaded),  or false if there are no records for this date and transport type.
 * @member {Boolean} exists
 */
V3DynamoDbTimetable.prototype.exists = undefined;
