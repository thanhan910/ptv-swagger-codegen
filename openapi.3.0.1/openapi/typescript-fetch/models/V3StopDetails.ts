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
import type { V3StopAccessibility } from './V3StopAccessibility';
import {
    V3StopAccessibilityFromJSON,
    V3StopAccessibilityFromJSONTyped,
    V3StopAccessibilityToJSON,
} from './V3StopAccessibility';
import type { V3StopAmenityDetails } from './V3StopAmenityDetails';
import {
    V3StopAmenityDetailsFromJSON,
    V3StopAmenityDetailsFromJSONTyped,
    V3StopAmenityDetailsToJSON,
} from './V3StopAmenityDetails';
import type { V3StopLocation } from './V3StopLocation';
import {
    V3StopLocationFromJSON,
    V3StopLocationFromJSONTyped,
    V3StopLocationToJSON,
} from './V3StopLocation';
import type { V3StopStaffing } from './V3StopStaffing';
import {
    V3StopStaffingFromJSON,
    V3StopStaffingFromJSONTyped,
    V3StopStaffingToJSON,
} from './V3StopStaffing';

/**
 * 
 * @export
 * @interface V3StopDetails
 */
export interface V3StopDetails {
    /**
     * Disruption information identifier(s)
     * @type {Array<number>}
     * @memberof V3StopDetails
     */
    disruptionIds?: Array<number>;
    /**
     * Type of metropolitan train station (i.e. "Premium", "Host" or "Unstaffed" station); returns null for V/Line train
     * @type {string}
     * @memberof V3StopDetails
     */
    stationType?: string;
    /**
     * The definition applicable to the station_type; returns null for V/Line train
     * @type {string}
     * @memberof V3StopDetails
     */
    stationDescription?: string;
    /**
     * Transport mode identifier
     * @type {number}
     * @memberof V3StopDetails
     */
    routeType?: number;
    /**
     * 
     * @type {V3StopLocation}
     * @memberof V3StopDetails
     */
    stopLocation?: V3StopLocation;
    /**
     * 
     * @type {V3StopAmenityDetails}
     * @memberof V3StopDetails
     */
    stopAmenities?: V3StopAmenityDetails;
    /**
     * 
     * @type {V3StopAccessibility}
     * @memberof V3StopDetails
     */
    stopAccessibility?: V3StopAccessibility;
    /**
     * 
     * @type {V3StopStaffing}
     * @memberof V3StopDetails
     */
    stopStaffing?: V3StopStaffing;
    /**
     * Routes travelling through the stop
     * @type {Array<object>}
     * @memberof V3StopDetails
     */
    routes?: Array<object>;
    /**
     * Stop identifier
     * @type {number}
     * @memberof V3StopDetails
     */
    stopId?: number;
    /**
     * Name of stop
     * @type {string}
     * @memberof V3StopDetails
     */
    stopName?: string;
    /**
     * Landmark in proximity of stop
     * @type {string}
     * @memberof V3StopDetails
     */
    stopLandmark?: string;
}

/**
 * Check if a given object implements the V3StopDetails interface.
 */
export function instanceOfV3StopDetails(value: object): boolean {
    return true;
}

export function V3StopDetailsFromJSON(json: any): V3StopDetails {
    return V3StopDetailsFromJSONTyped(json, false);
}

export function V3StopDetailsFromJSONTyped(json: any, ignoreDiscriminator: boolean): V3StopDetails {
    if (json == null) {
        return json;
    }
    return {
        
        'disruptionIds': json['disruption_ids'] == null ? undefined : json['disruption_ids'],
        'stationType': json['station_type'] == null ? undefined : json['station_type'],
        'stationDescription': json['station_description'] == null ? undefined : json['station_description'],
        'routeType': json['route_type'] == null ? undefined : json['route_type'],
        'stopLocation': json['stop_location'] == null ? undefined : V3StopLocationFromJSON(json['stop_location']),
        'stopAmenities': json['stop_amenities'] == null ? undefined : V3StopAmenityDetailsFromJSON(json['stop_amenities']),
        'stopAccessibility': json['stop_accessibility'] == null ? undefined : V3StopAccessibilityFromJSON(json['stop_accessibility']),
        'stopStaffing': json['stop_staffing'] == null ? undefined : V3StopStaffingFromJSON(json['stop_staffing']),
        'routes': json['routes'] == null ? undefined : json['routes'],
        'stopId': json['stop_id'] == null ? undefined : json['stop_id'],
        'stopName': json['stop_name'] == null ? undefined : json['stop_name'],
        'stopLandmark': json['stop_landmark'] == null ? undefined : json['stop_landmark'],
    };
}

export function V3StopDetailsToJSON(value?: V3StopDetails | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'disruption_ids': value['disruptionIds'],
        'station_type': value['stationType'],
        'station_description': value['stationDescription'],
        'route_type': value['routeType'],
        'stop_location': V3StopLocationToJSON(value['stopLocation']),
        'stop_amenities': V3StopAmenityDetailsToJSON(value['stopAmenities']),
        'stop_accessibility': V3StopAccessibilityToJSON(value['stopAccessibility']),
        'stop_staffing': V3StopStaffingToJSON(value['stopStaffing']),
        'routes': value['routes'],
        'stop_id': value['stopId'],
        'stop_name': value['stopName'],
        'stop_landmark': value['stopLandmark'],
    };
}

