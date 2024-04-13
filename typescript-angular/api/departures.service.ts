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
 *//* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent }                           from '@angular/common/http';
import { CustomHttpUrlEncodingCodec }                        from '../encoder';

import { Observable }                                        from 'rxjs';

import { V3DeparturesResponse } from '../model/v3DeparturesResponse';
import { V3ErrorResponse } from '../model/v3ErrorResponse';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';


@Injectable()
export class DeparturesService {

    protected basePath = 'https://timetableapi.ptv.vic.gov.au/';
    public defaultHeaders = new HttpHeaders();
    public configuration = new Configuration();

    constructor(protected httpClient: HttpClient, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: Configuration) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
            this.basePath = basePath || configuration.basePath || this.basePath;
        }
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        for (const consume of consumes) {
            if (form === consume) {
                return true;
            }
        }
        return false;
    }


    /**
     * View departures for all routes from a stop
     * 
     * @param routeType Number identifying transport mode; values returned via RouteTypes API
     * @param stopId Identifier of stop; values returned by Stops API
     * @param platformNumbers Filter by platform number at stop
     * @param directionId Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
     * @param gtfs Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data
     * @param dateUtc Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time)
     * @param maxResults Maximum number of results returned
     * @param includeCancelled Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only
     * @param lookBackwards Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0.
     * @param expand List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
     * @param includeGeopath Indicates if the route geopath should be returned
     * @param token Please ignore
     * @param devid Your developer id
     * @param signature Authentication signature for request
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public departuresGetForStop(routeType: number, stopId: number, platformNumbers?: Array<number>, directionId?: number, gtfs?: boolean, dateUtc?: Date, maxResults?: number, includeCancelled?: boolean, lookBackwards?: boolean, expand?: Array<string>, includeGeopath?: boolean, token?: string, devid?: string, signature?: string, observe?: 'body', reportProgress?: boolean): Observable<V3DeparturesResponse>;
    public departuresGetForStop(routeType: number, stopId: number, platformNumbers?: Array<number>, directionId?: number, gtfs?: boolean, dateUtc?: Date, maxResults?: number, includeCancelled?: boolean, lookBackwards?: boolean, expand?: Array<string>, includeGeopath?: boolean, token?: string, devid?: string, signature?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<V3DeparturesResponse>>;
    public departuresGetForStop(routeType: number, stopId: number, platformNumbers?: Array<number>, directionId?: number, gtfs?: boolean, dateUtc?: Date, maxResults?: number, includeCancelled?: boolean, lookBackwards?: boolean, expand?: Array<string>, includeGeopath?: boolean, token?: string, devid?: string, signature?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<V3DeparturesResponse>>;
    public departuresGetForStop(routeType: number, stopId: number, platformNumbers?: Array<number>, directionId?: number, gtfs?: boolean, dateUtc?: Date, maxResults?: number, includeCancelled?: boolean, lookBackwards?: boolean, expand?: Array<string>, includeGeopath?: boolean, token?: string, devid?: string, signature?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (routeType === null || routeType === undefined) {
            throw new Error('Required parameter routeType was null or undefined when calling departuresGetForStop.');
        }

        if (stopId === null || stopId === undefined) {
            throw new Error('Required parameter stopId was null or undefined when calling departuresGetForStop.');
        }













        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (platformNumbers) {
            platformNumbers.forEach((element) => {
                queryParameters = queryParameters.append('platform_numbers', <any>element);
            })
        }
        if (directionId !== undefined && directionId !== null) {
            queryParameters = queryParameters.set('direction_id', <any>directionId);
        }
        if (gtfs !== undefined && gtfs !== null) {
            queryParameters = queryParameters.set('gtfs', <any>gtfs);
        }
        if (dateUtc !== undefined && dateUtc !== null) {
            queryParameters = queryParameters.set('date_utc', <any>dateUtc.toISOString());
        }
        if (maxResults !== undefined && maxResults !== null) {
            queryParameters = queryParameters.set('max_results', <any>maxResults);
        }
        if (includeCancelled !== undefined && includeCancelled !== null) {
            queryParameters = queryParameters.set('include_cancelled', <any>includeCancelled);
        }
        if (lookBackwards !== undefined && lookBackwards !== null) {
            queryParameters = queryParameters.set('look_backwards', <any>lookBackwards);
        }
        if (expand) {
            expand.forEach((element) => {
                queryParameters = queryParameters.append('expand', <any>element);
            })
        }
        if (includeGeopath !== undefined && includeGeopath !== null) {
            queryParameters = queryParameters.set('include_geopath', <any>includeGeopath);
        }
        if (token !== undefined && token !== null) {
            queryParameters = queryParameters.set('token', <any>token);
        }
        if (devid !== undefined && devid !== null) {
            queryParameters = queryParameters.set('devid', <any>devid);
        }
        if (signature !== undefined && signature !== null) {
            queryParameters = queryParameters.set('signature', <any>signature);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json',
            'text/json',
            'text/html'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<V3DeparturesResponse>('get',`${this.basePath}/v3/departures/route_type/${encodeURIComponent(String(routeType))}/stop/${encodeURIComponent(String(stopId))}`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * View departures for a specific route from a stop
     * 
     * @param routeType Number identifying transport mode; values returned via RouteTypes API
     * @param stopId Identifier of stop; values returned by Stops API
     * @param routeId Identifier of route; values returned by Routes API - v3/routes
     * @param directionId Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}
     * @param gtfs Indicates that stop_id parameter will accept \&quot;GTFS stop_id\&quot; data
     * @param dateUtc Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time)
     * @param maxResults Maximum number of results returned
     * @param includeCancelled Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only
     * @param lookBackwards Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0.
     * @param expand List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.
     * @param includeGeopath Indicates if the route geopath should be returned
     * @param token Please ignore
     * @param devid Your developer id
     * @param signature Authentication signature for request
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public departuresGetForStopAndRoute(routeType: number, stopId: number, routeId: string, directionId?: number, gtfs?: boolean, dateUtc?: Date, maxResults?: number, includeCancelled?: boolean, lookBackwards?: boolean, expand?: Array<string>, includeGeopath?: boolean, token?: string, devid?: string, signature?: string, observe?: 'body', reportProgress?: boolean): Observable<V3DeparturesResponse>;
    public departuresGetForStopAndRoute(routeType: number, stopId: number, routeId: string, directionId?: number, gtfs?: boolean, dateUtc?: Date, maxResults?: number, includeCancelled?: boolean, lookBackwards?: boolean, expand?: Array<string>, includeGeopath?: boolean, token?: string, devid?: string, signature?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<V3DeparturesResponse>>;
    public departuresGetForStopAndRoute(routeType: number, stopId: number, routeId: string, directionId?: number, gtfs?: boolean, dateUtc?: Date, maxResults?: number, includeCancelled?: boolean, lookBackwards?: boolean, expand?: Array<string>, includeGeopath?: boolean, token?: string, devid?: string, signature?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<V3DeparturesResponse>>;
    public departuresGetForStopAndRoute(routeType: number, stopId: number, routeId: string, directionId?: number, gtfs?: boolean, dateUtc?: Date, maxResults?: number, includeCancelled?: boolean, lookBackwards?: boolean, expand?: Array<string>, includeGeopath?: boolean, token?: string, devid?: string, signature?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        if (routeType === null || routeType === undefined) {
            throw new Error('Required parameter routeType was null or undefined when calling departuresGetForStopAndRoute.');
        }

        if (stopId === null || stopId === undefined) {
            throw new Error('Required parameter stopId was null or undefined when calling departuresGetForStopAndRoute.');
        }

        if (routeId === null || routeId === undefined) {
            throw new Error('Required parameter routeId was null or undefined when calling departuresGetForStopAndRoute.');
        }












        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (directionId !== undefined && directionId !== null) {
            queryParameters = queryParameters.set('direction_id', <any>directionId);
        }
        if (gtfs !== undefined && gtfs !== null) {
            queryParameters = queryParameters.set('gtfs', <any>gtfs);
        }
        if (dateUtc !== undefined && dateUtc !== null) {
            queryParameters = queryParameters.set('date_utc', <any>dateUtc.toISOString());
        }
        if (maxResults !== undefined && maxResults !== null) {
            queryParameters = queryParameters.set('max_results', <any>maxResults);
        }
        if (includeCancelled !== undefined && includeCancelled !== null) {
            queryParameters = queryParameters.set('include_cancelled', <any>includeCancelled);
        }
        if (lookBackwards !== undefined && lookBackwards !== null) {
            queryParameters = queryParameters.set('look_backwards', <any>lookBackwards);
        }
        if (expand) {
            expand.forEach((element) => {
                queryParameters = queryParameters.append('expand', <any>element);
            })
        }
        if (includeGeopath !== undefined && includeGeopath !== null) {
            queryParameters = queryParameters.set('include_geopath', <any>includeGeopath);
        }
        if (token !== undefined && token !== null) {
            queryParameters = queryParameters.set('token', <any>token);
        }
        if (devid !== undefined && devid !== null) {
            queryParameters = queryParameters.set('devid', <any>devid);
        }
        if (signature !== undefined && signature !== null) {
            queryParameters = queryParameters.set('signature', <any>signature);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json',
            'text/json',
            'text/html'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.request<V3DeparturesResponse>('get',`${this.basePath}/v3/departures/route_type/${encodeURIComponent(String(routeType))}/stop/${encodeURIComponent(String(stopId))}/route/${encodeURIComponent(String(routeId))}`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}