# PTV Timetable API - Version 3
#
# The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
#
# OpenAPI spec version: v3
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' V3BulkDeparturesUpdateResponse Class
#'
#' @field departures 
#' @field route_type 
#' @field stop_id 
#' @field requested_route_direction 
#' @field route_direction_status 
#' @field route_direction 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
V3BulkDeparturesUpdateResponse <- R6::R6Class(
  'V3BulkDeparturesUpdateResponse',
  public = list(
    `departures` = NULL,
    `route_type` = NULL,
    `stop_id` = NULL,
    `requested_route_direction` = NULL,
    `route_direction_status` = NULL,
    `route_direction` = NULL,
    initialize = function(`departures`, `route_type`, `stop_id`, `requested_route_direction`, `route_direction_status`, `route_direction`){
      if (!missing(`departures`)) {
        stopifnot(is.list(`departures`), length(`departures`) != 0)
        lapply(`departures`, function(x) stopifnot(R6::is.R6(x)))
        self$`departures` <- `departures`
      }
      if (!missing(`route_type`)) {
        stopifnot(is.numeric(`route_type`), length(`route_type`) == 1)
        self$`route_type` <- `route_type`
      }
      if (!missing(`stop_id`)) {
        stopifnot(is.numeric(`stop_id`), length(`stop_id`) == 1)
        self$`stop_id` <- `stop_id`
      }
      if (!missing(`requested_route_direction`)) {
        stopifnot(R6::is.R6(`requested_route_direction`))
        self$`requested_route_direction` <- `requested_route_direction`
      }
      if (!missing(`route_direction_status`)) {
        stopifnot(is.numeric(`route_direction_status`), length(`route_direction_status`) == 1)
        self$`route_direction_status` <- `route_direction_status`
      }
      if (!missing(`route_direction`)) {
        stopifnot(R6::is.R6(`route_direction`))
        self$`route_direction` <- `route_direction`
      }
    },
    toJSON = function() {
      V3BulkDeparturesUpdateResponseObject <- list()
      if (!is.null(self$`departures`)) {
        V3BulkDeparturesUpdateResponseObject[['departures']] <- lapply(self$`departures`, function(x) x$toJSON())
      }
      if (!is.null(self$`route_type`)) {
        V3BulkDeparturesUpdateResponseObject[['route_type']] <- self$`route_type`
      }
      if (!is.null(self$`stop_id`)) {
        V3BulkDeparturesUpdateResponseObject[['stop_id']] <- self$`stop_id`
      }
      if (!is.null(self$`requested_route_direction`)) {
        V3BulkDeparturesUpdateResponseObject[['requested_route_direction']] <- self$`requested_route_direction`$toJSON()
      }
      if (!is.null(self$`route_direction_status`)) {
        V3BulkDeparturesUpdateResponseObject[['route_direction_status']] <- self$`route_direction_status`
      }
      if (!is.null(self$`route_direction`)) {
        V3BulkDeparturesUpdateResponseObject[['route_direction']] <- self$`route_direction`$toJSON()
      }

      V3BulkDeparturesUpdateResponseObject
    },
    fromJSON = function(V3BulkDeparturesUpdateResponseJson) {
      V3BulkDeparturesUpdateResponseObject <- jsonlite::fromJSON(V3BulkDeparturesUpdateResponseJson)
      if (!is.null(V3BulkDeparturesUpdateResponseObject$`departures`)) {
        self$`departures` <- lapply(V3BulkDeparturesUpdateResponseObject$`departures`, function(x) {
          departuresObject <- V3Departure$new()
          departuresObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          departuresObject
        })
      }
      if (!is.null(V3BulkDeparturesUpdateResponseObject$`route_type`)) {
        self$`route_type` <- V3BulkDeparturesUpdateResponseObject$`route_type`
      }
      if (!is.null(V3BulkDeparturesUpdateResponseObject$`stop_id`)) {
        self$`stop_id` <- V3BulkDeparturesUpdateResponseObject$`stop_id`
      }
      if (!is.null(V3BulkDeparturesUpdateResponseObject$`requested_route_direction`)) {
        requested_route_directionObject <- V3BulkDeparturesRouteDirectionResponse$new()
        requested_route_directionObject$fromJSON(jsonlite::toJSON(V3BulkDeparturesUpdateResponseObject$requested_route_direction, auto_unbox = TRUE))
        self$`requested_route_direction` <- requested_route_directionObject
      }
      if (!is.null(V3BulkDeparturesUpdateResponseObject$`route_direction_status`)) {
        self$`route_direction_status` <- V3BulkDeparturesUpdateResponseObject$`route_direction_status`
      }
      if (!is.null(V3BulkDeparturesUpdateResponseObject$`route_direction`)) {
        route_directionObject <- V3BulkDeparturesRouteDirectionResponse$new()
        route_directionObject$fromJSON(jsonlite::toJSON(V3BulkDeparturesUpdateResponseObject$route_direction, auto_unbox = TRUE))
        self$`route_direction` <- route_directionObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "departures": [%s],
           "route_type": %d,
           "stop_id": %d,
           "requested_route_direction": %s,
           "route_direction_status": %d,
           "route_direction": %s
        }',
        lapply(self$`departures`, function(x) paste(x$toJSON(), sep=",")),
        self$`route_type`,
        self$`stop_id`,
        self$`requested_route_direction`$toJSON(),
        self$`route_direction_status`,
        self$`route_direction`$toJSON()
      )
    },
    fromJSONString = function(V3BulkDeparturesUpdateResponseJson) {
      V3BulkDeparturesUpdateResponseObject <- jsonlite::fromJSON(V3BulkDeparturesUpdateResponseJson)
      self$`departures` <- lapply(V3BulkDeparturesUpdateResponseObject$`departures`, function(x) V3Departure$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`route_type` <- V3BulkDeparturesUpdateResponseObject$`route_type`
      self$`stop_id` <- V3BulkDeparturesUpdateResponseObject$`stop_id`
      V3BulkDeparturesRouteDirectionResponseObject <- V3BulkDeparturesRouteDirectionResponse$new()
      self$`requested_route_direction` <- V3BulkDeparturesRouteDirectionResponseObject$fromJSON(jsonlite::toJSON(V3BulkDeparturesUpdateResponseObject$requested_route_direction, auto_unbox = TRUE))
      self$`route_direction_status` <- V3BulkDeparturesUpdateResponseObject$`route_direction_status`
      V3BulkDeparturesRouteDirectionResponseObject <- V3BulkDeparturesRouteDirectionResponse$new()
      self$`route_direction` <- V3BulkDeparturesRouteDirectionResponseObject$fromJSON(jsonlite::toJSON(V3BulkDeparturesUpdateResponseObject$route_direction, auto_unbox = TRUE))
    }
  )
)