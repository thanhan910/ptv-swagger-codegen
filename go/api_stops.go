
/*
 * PTV Timetable API - Version 3
 *
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * API version: v3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

import (
	"context"
	"io/ioutil"
	"net/http"
	"net/url"
	"strings"
	"fmt"
	"github.com/antihax/optional"
)

// Linger please
var (
	_ context.Context
)

type StopsApiService service
/*
StopsApiService View facilities at a specific stop (Metro and V/Line stations only)
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param stopId Identifier of stop; values returned by Stops API
 * @param routeType Number identifying transport mode; values returned via RouteTypes API
 * @param optional nil or *StopsApiStopsStopDetailsOpts - Optional Parameters:
     * @param "StopLocation" (optional.Bool) -  Indicates if stop location information will be returned (default &#x3D; false)
     * @param "StopAmenities" (optional.Bool) -  Indicates if stop amenity information will be returned (default &#x3D; false)
     * @param "StopAccessibility" (optional.Bool) -  Indicates if stop accessibility information will be returned (default &#x3D; false)
     * @param "StopContact" (optional.Bool) -  Indicates if stop contact information will be returned (default &#x3D; false)
     * @param "StopTicket" (optional.Bool) -  Indicates if stop ticket information will be returned (default &#x3D; false)
     * @param "Gtfs" (optional.Bool) -  Incdicates whether the stop_id is a GTFS ID or not
     * @param "StopStaffing" (optional.Bool) -  Indicates if stop staffing information will be returned (default &#x3D; false)
     * @param "StopDisruptions" (optional.Bool) -  Indicates if stop disruption information will be returned (default &#x3D; false)
     * @param "Token" (optional.String) -  Please ignore
     * @param "Devid" (optional.String) -  Your developer id
     * @param "Signature" (optional.String) -  Authentication signature for request
@return V3StopResponse
*/

type StopsApiStopsStopDetailsOpts struct {
    StopLocation optional.Bool
    StopAmenities optional.Bool
    StopAccessibility optional.Bool
    StopContact optional.Bool
    StopTicket optional.Bool
    Gtfs optional.Bool
    StopStaffing optional.Bool
    StopDisruptions optional.Bool
    Token optional.String
    Devid optional.String
    Signature optional.String
}

func (a *StopsApiService) StopsStopDetails(ctx context.Context, stopId int32, routeType int32, localVarOptionals *StopsApiStopsStopDetailsOpts) (V3StopResponse, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue V3StopResponse
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/v3/stops/{stop_id}/route_type/{route_type}"
	localVarPath = strings.Replace(localVarPath, "{"+"stop_id"+"}", fmt.Sprintf("%v", stopId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"route_type"+"}", fmt.Sprintf("%v", routeType), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.StopLocation.IsSet() {
		localVarQueryParams.Add("stop_location", parameterToString(localVarOptionals.StopLocation.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StopAmenities.IsSet() {
		localVarQueryParams.Add("stop_amenities", parameterToString(localVarOptionals.StopAmenities.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StopAccessibility.IsSet() {
		localVarQueryParams.Add("stop_accessibility", parameterToString(localVarOptionals.StopAccessibility.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StopContact.IsSet() {
		localVarQueryParams.Add("stop_contact", parameterToString(localVarOptionals.StopContact.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StopTicket.IsSet() {
		localVarQueryParams.Add("stop_ticket", parameterToString(localVarOptionals.StopTicket.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Gtfs.IsSet() {
		localVarQueryParams.Add("gtfs", parameterToString(localVarOptionals.Gtfs.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StopStaffing.IsSet() {
		localVarQueryParams.Add("stop_staffing", parameterToString(localVarOptionals.StopStaffing.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StopDisruptions.IsSet() {
		localVarQueryParams.Add("stop_disruptions", parameterToString(localVarOptionals.StopDisruptions.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Token.IsSet() {
		localVarQueryParams.Add("token", parameterToString(localVarOptionals.Token.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Devid.IsSet() {
		localVarQueryParams.Add("devid", parameterToString(localVarOptionals.Devid.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Signature.IsSet() {
		localVarQueryParams.Add("signature", parameterToString(localVarOptionals.Signature.Value(), ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{"application/json", "text/json", "text/html"}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	if localVarHttpResponse.StatusCode < 300 {
		// If we succeed, return the data, otherwise pass on to decode error.
		err = a.client.decode(&localVarReturnValue, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
		if err == nil { 
			return localVarReturnValue, localVarHttpResponse, err
		}
	}

	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		if localVarHttpResponse.StatusCode == 200 {
			var v V3StopResponse
			err = a.client.decode(&v, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
				if err != nil {
					newErr.error = err.Error()
					return localVarReturnValue, localVarHttpResponse, newErr
				}
				newErr.model = v
				return localVarReturnValue, localVarHttpResponse, newErr
		}
		if localVarHttpResponse.StatusCode == 400 {
			var v V3ErrorResponse
			err = a.client.decode(&v, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
				if err != nil {
					newErr.error = err.Error()
					return localVarReturnValue, localVarHttpResponse, newErr
				}
				newErr.model = v
				return localVarReturnValue, localVarHttpResponse, newErr
		}
		if localVarHttpResponse.StatusCode == 403 {
			var v V3ErrorResponse
			err = a.client.decode(&v, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
				if err != nil {
					newErr.error = err.Error()
					return localVarReturnValue, localVarHttpResponse, newErr
				}
				newErr.model = v
				return localVarReturnValue, localVarHttpResponse, newErr
		}
		return localVarReturnValue, localVarHttpResponse, newErr
	}

	return localVarReturnValue, localVarHttpResponse, nil
}
/*
StopsApiService View all stops near a specific location
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param latitude Geographic coordinate of latitude
 * @param longitude Geographic coordinate of longitude
 * @param optional nil or *StopsApiStopsStopsByGeolocationOpts - Optional Parameters:
     * @param "RouteTypes" (optional.Interface of []int32) -  Filter by route_type; values returned via RouteTypes API
     * @param "MaxResults" (optional.Int32) -  Maximum number of results returned (default &#x3D; 30)
     * @param "MaxDistance" (optional.Float64) -  Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300)
     * @param "StopDisruptions" (optional.Bool) -  Indicates if stop disruption information will be returned (default &#x3D; false)
     * @param "Token" (optional.String) -  Please ignore
     * @param "Devid" (optional.String) -  Your developer id
     * @param "Signature" (optional.String) -  Authentication signature for request
@return V3StopsByDistanceResponse
*/

type StopsApiStopsStopsByGeolocationOpts struct {
    RouteTypes optional.Interface
    MaxResults optional.Int32
    MaxDistance optional.Float64
    StopDisruptions optional.Bool
    Token optional.String
    Devid optional.String
    Signature optional.String
}

func (a *StopsApiService) StopsStopsByGeolocation(ctx context.Context, latitude float32, longitude float32, localVarOptionals *StopsApiStopsStopsByGeolocationOpts) (V3StopsByDistanceResponse, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue V3StopsByDistanceResponse
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/v3/stops/location/{latitude},{longitude}"
	localVarPath = strings.Replace(localVarPath, "{"+"latitude"+"}", fmt.Sprintf("%v", latitude), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"longitude"+"}", fmt.Sprintf("%v", longitude), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.RouteTypes.IsSet() {
		localVarQueryParams.Add("route_types", parameterToString(localVarOptionals.RouteTypes.Value(), "multi"))
	}
	if localVarOptionals != nil && localVarOptionals.MaxResults.IsSet() {
		localVarQueryParams.Add("max_results", parameterToString(localVarOptionals.MaxResults.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.MaxDistance.IsSet() {
		localVarQueryParams.Add("max_distance", parameterToString(localVarOptionals.MaxDistance.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StopDisruptions.IsSet() {
		localVarQueryParams.Add("stop_disruptions", parameterToString(localVarOptionals.StopDisruptions.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Token.IsSet() {
		localVarQueryParams.Add("token", parameterToString(localVarOptionals.Token.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Devid.IsSet() {
		localVarQueryParams.Add("devid", parameterToString(localVarOptionals.Devid.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Signature.IsSet() {
		localVarQueryParams.Add("signature", parameterToString(localVarOptionals.Signature.Value(), ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{"application/json", "text/json", "text/html"}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	if localVarHttpResponse.StatusCode < 300 {
		// If we succeed, return the data, otherwise pass on to decode error.
		err = a.client.decode(&localVarReturnValue, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
		if err == nil { 
			return localVarReturnValue, localVarHttpResponse, err
		}
	}

	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		if localVarHttpResponse.StatusCode == 200 {
			var v V3StopsByDistanceResponse
			err = a.client.decode(&v, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
				if err != nil {
					newErr.error = err.Error()
					return localVarReturnValue, localVarHttpResponse, newErr
				}
				newErr.model = v
				return localVarReturnValue, localVarHttpResponse, newErr
		}
		if localVarHttpResponse.StatusCode == 400 {
			var v V3ErrorResponse
			err = a.client.decode(&v, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
				if err != nil {
					newErr.error = err.Error()
					return localVarReturnValue, localVarHttpResponse, newErr
				}
				newErr.model = v
				return localVarReturnValue, localVarHttpResponse, newErr
		}
		if localVarHttpResponse.StatusCode == 403 {
			var v V3ErrorResponse
			err = a.client.decode(&v, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
				if err != nil {
					newErr.error = err.Error()
					return localVarReturnValue, localVarHttpResponse, newErr
				}
				newErr.model = v
				return localVarReturnValue, localVarHttpResponse, newErr
		}
		return localVarReturnValue, localVarHttpResponse, newErr
	}

	return localVarReturnValue, localVarHttpResponse, nil
}
/*
StopsApiService View all stops on a specific route
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param routeId Identifier of route; values returned by Routes API - v3/routes
 * @param routeType Number identifying transport mode; values returned via RouteTypes API
 * @param optional nil or *StopsApiStopsStopsForRouteOpts - Optional Parameters:
     * @param "DirectionId" (optional.Int32) -  An optional direction; values returned by Directions API. When this is set, stop sequence information is returned in the response.
     * @param "StopDisruptions" (optional.Bool) -  Indicates if stop disruption information will be returned (default &#x3D; false)
     * @param "IncludeGeopath" (optional.Bool) -  Indicates if geopath data will be returned (default &#x3D; false)
     * @param "GeopathUtc" (optional.Time) -  Filter geopaths by date (ISO 8601 UTC format) (default &#x3D; current date)
     * @param "Token" (optional.String) -  Please ignore
     * @param "Devid" (optional.String) -  Your developer id
     * @param "Signature" (optional.String) -  Authentication signature for request
@return V3StopsOnRouteResponse
*/

type StopsApiStopsStopsForRouteOpts struct {
    DirectionId optional.Int32
    StopDisruptions optional.Bool
    IncludeGeopath optional.Bool
    GeopathUtc optional.Time
    Token optional.String
    Devid optional.String
    Signature optional.String
}

func (a *StopsApiService) StopsStopsForRoute(ctx context.Context, routeId int32, routeType int32, localVarOptionals *StopsApiStopsStopsForRouteOpts) (V3StopsOnRouteResponse, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue V3StopsOnRouteResponse
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/v3/stops/route/{route_id}/route_type/{route_type}"
	localVarPath = strings.Replace(localVarPath, "{"+"route_id"+"}", fmt.Sprintf("%v", routeId), -1)
	localVarPath = strings.Replace(localVarPath, "{"+"route_type"+"}", fmt.Sprintf("%v", routeType), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.DirectionId.IsSet() {
		localVarQueryParams.Add("direction_id", parameterToString(localVarOptionals.DirectionId.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.StopDisruptions.IsSet() {
		localVarQueryParams.Add("stop_disruptions", parameterToString(localVarOptionals.StopDisruptions.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.IncludeGeopath.IsSet() {
		localVarQueryParams.Add("include_geopath", parameterToString(localVarOptionals.IncludeGeopath.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.GeopathUtc.IsSet() {
		localVarQueryParams.Add("geopath_utc", parameterToString(localVarOptionals.GeopathUtc.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Token.IsSet() {
		localVarQueryParams.Add("token", parameterToString(localVarOptionals.Token.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Devid.IsSet() {
		localVarQueryParams.Add("devid", parameterToString(localVarOptionals.Devid.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Signature.IsSet() {
		localVarQueryParams.Add("signature", parameterToString(localVarOptionals.Signature.Value(), ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{"application/json", "text/json", "text/html"}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	if localVarHttpResponse.StatusCode < 300 {
		// If we succeed, return the data, otherwise pass on to decode error.
		err = a.client.decode(&localVarReturnValue, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
		if err == nil { 
			return localVarReturnValue, localVarHttpResponse, err
		}
	}

	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		if localVarHttpResponse.StatusCode == 200 {
			var v V3StopsOnRouteResponse
			err = a.client.decode(&v, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
				if err != nil {
					newErr.error = err.Error()
					return localVarReturnValue, localVarHttpResponse, newErr
				}
				newErr.model = v
				return localVarReturnValue, localVarHttpResponse, newErr
		}
		if localVarHttpResponse.StatusCode == 400 {
			var v V3ErrorResponse
			err = a.client.decode(&v, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
				if err != nil {
					newErr.error = err.Error()
					return localVarReturnValue, localVarHttpResponse, newErr
				}
				newErr.model = v
				return localVarReturnValue, localVarHttpResponse, newErr
		}
		if localVarHttpResponse.StatusCode == 403 {
			var v V3ErrorResponse
			err = a.client.decode(&v, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
				if err != nil {
					newErr.error = err.Error()
					return localVarReturnValue, localVarHttpResponse, newErr
				}
				newErr.model = v
				return localVarReturnValue, localVarHttpResponse, newErr
		}
		return localVarReturnValue, localVarHttpResponse, newErr
	}

	return localVarReturnValue, localVarHttpResponse, nil
}