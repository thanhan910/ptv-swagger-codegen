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
import type { V3SiriSubscriptionTopic } from './V3SiriSubscriptionTopic';
import {
    V3SiriSubscriptionTopicFromJSON,
    V3SiriSubscriptionTopicFromJSONTyped,
    V3SiriSubscriptionTopicToJSON,
} from './V3SiriSubscriptionTopic';

/**
 * 
 * @export
 * @interface V3SiriProductionTimetableSubscriptionRequest
 */
export interface V3SiriProductionTimetableSubscriptionRequest {
    /**
     * Siri Start Time of the Validity Period
     * @type {Date}
     * @memberof V3SiriProductionTimetableSubscriptionRequest
     */
    startTime: Date;
    /**
     * Siri End Time of the Validity Period
     * @type {Date}
     * @memberof V3SiriProductionTimetableSubscriptionRequest
     */
    endTime: Date;
    /**
     * Siri Subscriber Ref
     * @type {string}
     * @memberof V3SiriProductionTimetableSubscriptionRequest
     */
    subscriberRef: string;
    /**
     * Siri Subscription Ref - Unique to a Subscriber Ref
     * @type {string}
     * @memberof V3SiriProductionTimetableSubscriptionRequest
     */
    subscriptionRef: string;
    /**
     * Siri Message Format 'xml' or 'json'
     * @type {number}
     * @memberof V3SiriProductionTimetableSubscriptionRequest
     */
    siriFormat: V3SiriProductionTimetableSubscriptionRequestSiriFormatEnum;
    /**
     * Siri Message Version '1.3' or '2.0'
     * @type {string}
     * @memberof V3SiriProductionTimetableSubscriptionRequest
     */
    siriVersion: string;
    /**
     * Siri Consumer Address - Baseline and Updates will be sent to this address
     * @type {string}
     * @memberof V3SiriProductionTimetableSubscriptionRequest
     */
    consumerAddress: string;
    /**
     * Siri Initial Termination Time - Expiry of the subscription
     * @type {Date}
     * @memberof V3SiriProductionTimetableSubscriptionRequest
     */
    initialTerminationTime: Date;
    /**
     * 
     * @type {Array<V3SiriSubscriptionTopic>}
     * @memberof V3SiriProductionTimetableSubscriptionRequest
     */
    topics: Array<V3SiriSubscriptionTopic>;
}


/**
 * @export
 */
export const V3SiriProductionTimetableSubscriptionRequestSiriFormatEnum = {
    NUMBER_0: 0,
    NUMBER_1: 1
} as const;
export type V3SiriProductionTimetableSubscriptionRequestSiriFormatEnum = typeof V3SiriProductionTimetableSubscriptionRequestSiriFormatEnum[keyof typeof V3SiriProductionTimetableSubscriptionRequestSiriFormatEnum];


/**
 * Check if a given object implements the V3SiriProductionTimetableSubscriptionRequest interface.
 */
export function instanceOfV3SiriProductionTimetableSubscriptionRequest(value: object): boolean {
    if (!('startTime' in value)) return false;
    if (!('endTime' in value)) return false;
    if (!('subscriberRef' in value)) return false;
    if (!('subscriptionRef' in value)) return false;
    if (!('siriFormat' in value)) return false;
    if (!('siriVersion' in value)) return false;
    if (!('consumerAddress' in value)) return false;
    if (!('initialTerminationTime' in value)) return false;
    if (!('topics' in value)) return false;
    return true;
}

export function V3SiriProductionTimetableSubscriptionRequestFromJSON(json: any): V3SiriProductionTimetableSubscriptionRequest {
    return V3SiriProductionTimetableSubscriptionRequestFromJSONTyped(json, false);
}

export function V3SiriProductionTimetableSubscriptionRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): V3SiriProductionTimetableSubscriptionRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'startTime': (new Date(json['start_time'])),
        'endTime': (new Date(json['end_time'])),
        'subscriberRef': json['subscriber_ref'],
        'subscriptionRef': json['subscription_ref'],
        'siriFormat': json['siri_format'],
        'siriVersion': json['siri_version'],
        'consumerAddress': json['consumer_address'],
        'initialTerminationTime': (new Date(json['initial_termination_time'])),
        'topics': ((json['topics'] as Array<any>).map(V3SiriSubscriptionTopicFromJSON)),
    };
}

export function V3SiriProductionTimetableSubscriptionRequestToJSON(value?: V3SiriProductionTimetableSubscriptionRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'start_time': ((value['startTime']).toISOString()),
        'end_time': ((value['endTime']).toISOString()),
        'subscriber_ref': value['subscriberRef'],
        'subscription_ref': value['subscriptionRef'],
        'siri_format': value['siriFormat'],
        'siri_version': value['siriVersion'],
        'consumer_address': value['consumerAddress'],
        'initial_termination_time': ((value['initialTerminationTime']).toISOString()),
        'topics': ((value['topics'] as Array<any>).map(V3SiriSubscriptionTopicToJSON)),
    };
}

