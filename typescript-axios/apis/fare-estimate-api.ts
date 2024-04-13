/* tslint:disable */
/* eslint-disable */
/**
 * PTV Timetable API - Version 3
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

import globalAxios, { AxiosResponse, AxiosInstance, AxiosRequestConfig } from 'axios';
import { Configuration } from '../configuration';
// Some imports not used depending on template conditions
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
import { V3ErrorResponse } from '../models';
import { V3FareEstimateResponse } from '../models';
/**
 * FareEstimateApi - axios parameter creator
 * @export
 */
export const FareEstimateApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Estimate a fare by zone
         * @param {number} minZone Minimum Zone travelled through ie. 1
         * @param {number} maxZone Maximum Zone travelled through id. 6
         * @param {Date} [journeyTouchOnUtc] JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).
         * @param {Date} [journeyTouchOffUtc] JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).
         * @param {boolean} [isJourneyInFreeTramZone] 
         * @param {Array<number>} [travelledRouteTypes] 
         * @param {string} [token] Please ignore
         * @param {string} [devid] Your developer id
         * @param {string} [signature] Authentication signature for request
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        fareEstimateGetFareEstimateByZone: async (minZone: number, maxZone: number, journeyTouchOnUtc?: Date, journeyTouchOffUtc?: Date, isJourneyInFreeTramZone?: boolean, travelledRouteTypes?: Array<number>, token?: string, devid?: string, signature?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'minZone' is not null or undefined
            if (minZone === null || minZone === undefined) {
                throw new RequiredError('minZone','Required parameter minZone was null or undefined when calling fareEstimateGetFareEstimateByZone.');
            }
            // verify required parameter 'maxZone' is not null or undefined
            if (maxZone === null || maxZone === undefined) {
                throw new RequiredError('maxZone','Required parameter maxZone was null or undefined when calling fareEstimateGetFareEstimateByZone.');
            }
            const localVarPath = `/v3/fare_estimate/min_zone/{minZone}/max_zone/{maxZone}`
                .replace(`{${"minZone"}}`, encodeURIComponent(String(minZone)))
                .replace(`{${"maxZone"}}`, encodeURIComponent(String(maxZone)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, 'https://example.com');
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions :AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (journeyTouchOnUtc !== undefined) {
                localVarQueryParameter['journey_touch_on_utc'] = (journeyTouchOnUtc as any instanceof Date) ?
                    (journeyTouchOnUtc as any).toISOString() :
                    journeyTouchOnUtc;
            }

            if (journeyTouchOffUtc !== undefined) {
                localVarQueryParameter['journey_touch_off_utc'] = (journeyTouchOffUtc as any instanceof Date) ?
                    (journeyTouchOffUtc as any).toISOString() :
                    journeyTouchOffUtc;
            }

            if (isJourneyInFreeTramZone !== undefined) {
                localVarQueryParameter['is_journey_in_free_tram_zone'] = isJourneyInFreeTramZone;
            }

            if (travelledRouteTypes) {
                localVarQueryParameter['travelled_route_types'] = travelledRouteTypes;
            }

            if (token !== undefined) {
                localVarQueryParameter['token'] = token;
            }

            if (devid !== undefined) {
                localVarQueryParameter['devid'] = devid;
            }

            if (signature !== undefined) {
                localVarQueryParameter['signature'] = signature;
            }

            const query = new URLSearchParams(localVarUrlObj.search);
            for (const key in localVarQueryParameter) {
                query.set(key, localVarQueryParameter[key]);
            }
            for (const key in options.params) {
                query.set(key, options.params[key]);
            }
            localVarUrlObj.search = (new URLSearchParams(query)).toString();
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: localVarUrlObj.pathname + localVarUrlObj.search + localVarUrlObj.hash,
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * FareEstimateApi - functional programming interface
 * @export
 */
export const FareEstimateApiFp = function(configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Estimate a fare by zone
         * @param {number} minZone Minimum Zone travelled through ie. 1
         * @param {number} maxZone Maximum Zone travelled through id. 6
         * @param {Date} [journeyTouchOnUtc] JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).
         * @param {Date} [journeyTouchOffUtc] JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).
         * @param {boolean} [isJourneyInFreeTramZone] 
         * @param {Array<number>} [travelledRouteTypes] 
         * @param {string} [token] Please ignore
         * @param {string} [devid] Your developer id
         * @param {string} [signature] Authentication signature for request
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async fareEstimateGetFareEstimateByZone(minZone: number, maxZone: number, journeyTouchOnUtc?: Date, journeyTouchOffUtc?: Date, isJourneyInFreeTramZone?: boolean, travelledRouteTypes?: Array<number>, token?: string, devid?: string, signature?: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => Promise<AxiosResponse<V3FareEstimateResponse>>> {
            const localVarAxiosArgs = await FareEstimateApiAxiosParamCreator(configuration).fareEstimateGetFareEstimateByZone(minZone, maxZone, journeyTouchOnUtc, journeyTouchOffUtc, isJourneyInFreeTramZone, travelledRouteTypes, token, devid, signature, options);
            return (axios: AxiosInstance = globalAxios, basePath: string = BASE_PATH) => {
                const axiosRequestArgs :AxiosRequestConfig = {...localVarAxiosArgs.options, url: basePath + localVarAxiosArgs.url};
                return axios.request(axiosRequestArgs);
            };
        },
    }
};

/**
 * FareEstimateApi - factory interface
 * @export
 */
export const FareEstimateApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    return {
        /**
         * 
         * @summary Estimate a fare by zone
         * @param {number} minZone Minimum Zone travelled through ie. 1
         * @param {number} maxZone Maximum Zone travelled through id. 6
         * @param {Date} [journeyTouchOnUtc] JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).
         * @param {Date} [journeyTouchOffUtc] JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).
         * @param {boolean} [isJourneyInFreeTramZone] 
         * @param {Array<number>} [travelledRouteTypes] 
         * @param {string} [token] Please ignore
         * @param {string} [devid] Your developer id
         * @param {string} [signature] Authentication signature for request
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async fareEstimateGetFareEstimateByZone(minZone: number, maxZone: number, journeyTouchOnUtc?: Date, journeyTouchOffUtc?: Date, isJourneyInFreeTramZone?: boolean, travelledRouteTypes?: Array<number>, token?: string, devid?: string, signature?: string, options?: AxiosRequestConfig): Promise<AxiosResponse<V3FareEstimateResponse>> {
            return FareEstimateApiFp(configuration).fareEstimateGetFareEstimateByZone(minZone, maxZone, journeyTouchOnUtc, journeyTouchOffUtc, isJourneyInFreeTramZone, travelledRouteTypes, token, devid, signature, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * FareEstimateApi - object-oriented interface
 * @export
 * @class FareEstimateApi
 * @extends {BaseAPI}
 */
export class FareEstimateApi extends BaseAPI {
    /**
     * 
     * @summary Estimate a fare by zone
     * @param {number} minZone Minimum Zone travelled through ie. 1
     * @param {number} maxZone Maximum Zone travelled through id. 6
     * @param {Date} [journeyTouchOnUtc] JourneyTouchOnUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).
     * @param {Date} [journeyTouchOffUtc] JourneyTouchOffUtc in format yyyy-M-d h:m (e.g 2016-5-31 16:53).
     * @param {boolean} [isJourneyInFreeTramZone] 
     * @param {Array<number>} [travelledRouteTypes] 
     * @param {string} [token] Please ignore
     * @param {string} [devid] Your developer id
     * @param {string} [signature] Authentication signature for request
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof FareEstimateApi
     */
    public async fareEstimateGetFareEstimateByZone(minZone: number, maxZone: number, journeyTouchOnUtc?: Date, journeyTouchOffUtc?: Date, isJourneyInFreeTramZone?: boolean, travelledRouteTypes?: Array<number>, token?: string, devid?: string, signature?: string, options?: AxiosRequestConfig) : Promise<AxiosResponse<V3FareEstimateResponse>> {
        return FareEstimateApiFp(this.configuration).fareEstimateGetFareEstimateByZone(minZone, maxZone, journeyTouchOnUtc, journeyTouchOffUtc, isJourneyInFreeTramZone, travelledRouteTypes, token, devid, signature, options).then((request) => request(this.axios, this.basePath));
    }
}