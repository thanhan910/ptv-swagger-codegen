# PTV Timetable API - Version 3
#
# The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
#
# OpenAPI spec version: v3
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' V3ResultStop Class
#'
#' @field stop_distance 
#' @field stop_suburb 
#' @field route_type 
#' @field routes 
#' @field stop_latitude 
#' @field stop_longitude 
#' @field stop_sequence 
#' @field stop_id 
#' @field stop_name 
#' @field stop_landmark 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
V3ResultStop <- R6::R6Class(
  'V3ResultStop',
  public = list(
    `stop_distance` = NULL,
    `stop_suburb` = NULL,
    `route_type` = NULL,
    `routes` = NULL,
    `stop_latitude` = NULL,
    `stop_longitude` = NULL,
    `stop_sequence` = NULL,
    `stop_id` = NULL,
    `stop_name` = NULL,
    `stop_landmark` = NULL,
    initialize = function(`stop_distance`, `stop_suburb`, `route_type`, `routes`, `stop_latitude`, `stop_longitude`, `stop_sequence`, `stop_id`, `stop_name`, `stop_landmark`){
      if (!missing(`stop_distance`)) {
        stopifnot(is.numeric(`stop_distance`), length(`stop_distance`) == 1)
        self$`stop_distance` <- `stop_distance`
      }
      if (!missing(`stop_suburb`)) {
        stopifnot(is.character(`stop_suburb`), length(`stop_suburb`) == 1)
        self$`stop_suburb` <- `stop_suburb`
      }
      if (!missing(`route_type`)) {
        stopifnot(is.numeric(`route_type`), length(`route_type`) == 1)
        self$`route_type` <- `route_type`
      }
      if (!missing(`routes`)) {
        stopifnot(is.list(`routes`), length(`routes`) != 0)
        lapply(`routes`, function(x) stopifnot(R6::is.R6(x)))
        self$`routes` <- `routes`
      }
      if (!missing(`stop_latitude`)) {
        stopifnot(is.numeric(`stop_latitude`), length(`stop_latitude`) == 1)
        self$`stop_latitude` <- `stop_latitude`
      }
      if (!missing(`stop_longitude`)) {
        stopifnot(is.numeric(`stop_longitude`), length(`stop_longitude`) == 1)
        self$`stop_longitude` <- `stop_longitude`
      }
      if (!missing(`stop_sequence`)) {
        stopifnot(is.numeric(`stop_sequence`), length(`stop_sequence`) == 1)
        self$`stop_sequence` <- `stop_sequence`
      }
      if (!missing(`stop_id`)) {
        stopifnot(is.numeric(`stop_id`), length(`stop_id`) == 1)
        self$`stop_id` <- `stop_id`
      }
      if (!missing(`stop_name`)) {
        stopifnot(is.character(`stop_name`), length(`stop_name`) == 1)
        self$`stop_name` <- `stop_name`
      }
      if (!missing(`stop_landmark`)) {
        stopifnot(is.character(`stop_landmark`), length(`stop_landmark`) == 1)
        self$`stop_landmark` <- `stop_landmark`
      }
    },
    toJSON = function() {
      V3ResultStopObject <- list()
      if (!is.null(self$`stop_distance`)) {
        V3ResultStopObject[['stop_distance']] <- self$`stop_distance`
      }
      if (!is.null(self$`stop_suburb`)) {
        V3ResultStopObject[['stop_suburb']] <- self$`stop_suburb`
      }
      if (!is.null(self$`route_type`)) {
        V3ResultStopObject[['route_type']] <- self$`route_type`
      }
      if (!is.null(self$`routes`)) {
        V3ResultStopObject[['routes']] <- lapply(self$`routes`, function(x) x$toJSON())
      }
      if (!is.null(self$`stop_latitude`)) {
        V3ResultStopObject[['stop_latitude']] <- self$`stop_latitude`
      }
      if (!is.null(self$`stop_longitude`)) {
        V3ResultStopObject[['stop_longitude']] <- self$`stop_longitude`
      }
      if (!is.null(self$`stop_sequence`)) {
        V3ResultStopObject[['stop_sequence']] <- self$`stop_sequence`
      }
      if (!is.null(self$`stop_id`)) {
        V3ResultStopObject[['stop_id']] <- self$`stop_id`
      }
      if (!is.null(self$`stop_name`)) {
        V3ResultStopObject[['stop_name']] <- self$`stop_name`
      }
      if (!is.null(self$`stop_landmark`)) {
        V3ResultStopObject[['stop_landmark']] <- self$`stop_landmark`
      }

      V3ResultStopObject
    },
    fromJSON = function(V3ResultStopJson) {
      V3ResultStopObject <- jsonlite::fromJSON(V3ResultStopJson)
      if (!is.null(V3ResultStopObject$`stop_distance`)) {
        self$`stop_distance` <- V3ResultStopObject$`stop_distance`
      }
      if (!is.null(V3ResultStopObject$`stop_suburb`)) {
        self$`stop_suburb` <- V3ResultStopObject$`stop_suburb`
      }
      if (!is.null(V3ResultStopObject$`route_type`)) {
        self$`route_type` <- V3ResultStopObject$`route_type`
      }
      if (!is.null(V3ResultStopObject$`routes`)) {
        self$`routes` <- lapply(V3ResultStopObject$`routes`, function(x) {
          routesObject <- V3ResultRoute$new()
          routesObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          routesObject
        })
      }
      if (!is.null(V3ResultStopObject$`stop_latitude`)) {
        self$`stop_latitude` <- V3ResultStopObject$`stop_latitude`
      }
      if (!is.null(V3ResultStopObject$`stop_longitude`)) {
        self$`stop_longitude` <- V3ResultStopObject$`stop_longitude`
      }
      if (!is.null(V3ResultStopObject$`stop_sequence`)) {
        self$`stop_sequence` <- V3ResultStopObject$`stop_sequence`
      }
      if (!is.null(V3ResultStopObject$`stop_id`)) {
        self$`stop_id` <- V3ResultStopObject$`stop_id`
      }
      if (!is.null(V3ResultStopObject$`stop_name`)) {
        self$`stop_name` <- V3ResultStopObject$`stop_name`
      }
      if (!is.null(V3ResultStopObject$`stop_landmark`)) {
        self$`stop_landmark` <- V3ResultStopObject$`stop_landmark`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "stop_distance": %d,
           "stop_suburb": %s,
           "route_type": %d,
           "routes": [%s],
           "stop_latitude": %d,
           "stop_longitude": %d,
           "stop_sequence": %d,
           "stop_id": %d,
           "stop_name": %s,
           "stop_landmark": %s
        }',
        self$`stop_distance`,
        self$`stop_suburb`,
        self$`route_type`,
        lapply(self$`routes`, function(x) paste(x$toJSON(), sep=",")),
        self$`stop_latitude`,
        self$`stop_longitude`,
        self$`stop_sequence`,
        self$`stop_id`,
        self$`stop_name`,
        self$`stop_landmark`
      )
    },
    fromJSONString = function(V3ResultStopJson) {
      V3ResultStopObject <- jsonlite::fromJSON(V3ResultStopJson)
      self$`stop_distance` <- V3ResultStopObject$`stop_distance`
      self$`stop_suburb` <- V3ResultStopObject$`stop_suburb`
      self$`route_type` <- V3ResultStopObject$`route_type`
      self$`routes` <- lapply(V3ResultStopObject$`routes`, function(x) V3ResultRoute$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`stop_latitude` <- V3ResultStopObject$`stop_latitude`
      self$`stop_longitude` <- V3ResultStopObject$`stop_longitude`
      self$`stop_sequence` <- V3ResultStopObject$`stop_sequence`
      self$`stop_id` <- V3ResultStopObject$`stop_id`
      self$`stop_name` <- V3ResultStopObject$`stop_name`
      self$`stop_landmark` <- V3ResultStopObject$`stop_landmark`
    }
  )
)