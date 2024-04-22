/* tslint:disable */
/* eslint-disable */
/**
 * PTV Timetable API - Version 3
 * The PTV Timetable API provides direct access to Public Transport Victoria\'s public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * The version of the OpenAPI document: v3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { V3Disruptions } from './V3Disruptions';
import {
    V3DisruptionsFromJSON,
    V3DisruptionsFromJSONTyped,
    V3DisruptionsToJSON,
} from './V3Disruptions';
import type { V3Status } from './V3Status';
import {
    V3StatusFromJSON,
    V3StatusFromJSONTyped,
    V3StatusToJSON,
} from './V3Status';

/**
 * 
 * @export
 * @interface V3DisruptionsResponse
 */
export interface V3DisruptionsResponse {
    /**
     * 
     * @type {V3Disruptions}
     * @memberof V3DisruptionsResponse
     */
    disruptions?: V3Disruptions;
    /**
     * 
     * @type {V3Status}
     * @memberof V3DisruptionsResponse
     */
    status?: V3Status;
}

/**
 * Check if a given object implements the V3DisruptionsResponse interface.
 */
export function instanceOfV3DisruptionsResponse(value: object): boolean {
    return true;
}

export function V3DisruptionsResponseFromJSON(json: any): V3DisruptionsResponse {
    return V3DisruptionsResponseFromJSONTyped(json, false);
}

export function V3DisruptionsResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): V3DisruptionsResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'disruptions': json['disruptions'] == null ? undefined : V3DisruptionsFromJSON(json['disruptions']),
        'status': json['status'] == null ? undefined : V3StatusFromJSON(json['status']),
    };
}

export function V3DisruptionsResponseToJSON(value?: V3DisruptionsResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'disruptions': V3DisruptionsToJSON(value['disruptions']),
        'status': V3StatusToJSON(value['status']),
    };
}
