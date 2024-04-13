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
package io.swagger.client.apis

import io.swagger.client.models.V3ErrorResponse
import io.swagger.client.models.V3StoppingPattern

import io.swagger.client.infrastructure.*

class PatternsApi(basePath: kotlin.String = "https://timetableapi.ptv.vic.gov.au/") : ApiClient(basePath) {

    /**
     * View the stopping pattern for a specific trip/service run
     * 
     * @param runRef The run_ref is the identifier of a run as returned by the departures/_* and runs/_* endpoints. WARNING, run_id is deprecated. Use run_ref instead. 
     * @param routeType Number identifying transport mode; values returned via RouteTypes API 
     * @param expand List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor and None. Default is Disruption. Run must be expanded to receive VehiclePosition and VehicleDescriptor information. 
     * @param stopId Filter by stop_id; values returned by Stops API (optional)
     * @param dateUtc Filter by the date and time of the request (ISO 8601 UTC format) (optional)
     * @param includeSkippedStops Include any skipped stops in a stopping pattern. Defaults to false. (optional)
     * @param includeGeopath Indicates if geopath data will be returned (default &#x3D; false) (optional)
     * @param token Please ignore (optional)
     * @param devid Your developer id (optional)
     * @param signature Authentication signature for request (optional)
     * @return V3StoppingPattern
     */
    @Suppress("UNCHECKED_CAST")
    fun patternsGetPatternByRun(runRef: kotlin.String, routeType: kotlin.Int, expand: kotlin.Array<kotlin.String>, stopId: kotlin.Int? = null, dateUtc: java.time.LocalDateTime? = null, includeSkippedStops: kotlin.Boolean? = null, includeGeopath: kotlin.Boolean? = null, token: kotlin.String? = null, devid: kotlin.String? = null, signature: kotlin.String? = null): V3StoppingPattern {
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>().apply {
            put("expand", toMultiValue(expand.toList(), "multi"))
            if (stopId != null) {
                put("stop_id", listOf(stopId.toString()))
            }
            if (dateUtc != null) {
                put("date_utc", listOf(parseDateToQueryString(dateUtc)))
            }
            if (includeSkippedStops != null) {
                put("include_skipped_stops", listOf(includeSkippedStops.toString()))
            }
            if (includeGeopath != null) {
                put("include_geopath", listOf(includeGeopath.toString()))
            }
            if (token != null) {
                put("token", listOf(token.toString()))
            }
            if (devid != null) {
                put("devid", listOf(devid.toString()))
            }
            if (signature != null) {
                put("signature", listOf(signature.toString()))
            }
        }
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/v3/pattern/run/{run_ref}/route_type/{route_type}".replace("{" + "run_ref" + "}", "$runRef").replace("{" + "route_type" + "}", "$routeType"), query = localVariableQuery
        )
        val response = request<V3StoppingPattern>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as V3StoppingPattern
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}