# PTV Timetable API - Version 3
#
# The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
#
# OpenAPI spec version: v3
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' V3RouteWithStatus Class
#'
#' @field route_service_status 
#' @field route_type 
#' @field route_id 
#' @field route_name 
#' @field route_number 
#' @field route_gtfs_id 
#' @field geopath 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
V3RouteWithStatus <- R6::R6Class(
  'V3RouteWithStatus',
  public = list(
    `route_service_status` = NULL,
    `route_type` = NULL,
    `route_id` = NULL,
    `route_name` = NULL,
    `route_number` = NULL,
    `route_gtfs_id` = NULL,
    `geopath` = NULL,
    initialize = function(`route_service_status`, `route_type`, `route_id`, `route_name`, `route_number`, `route_gtfs_id`, `geopath`){
      if (!missing(`route_service_status`)) {
        stopifnot(R6::is.R6(`route_service_status`))
        self$`route_service_status` <- `route_service_status`
      }
      if (!missing(`route_type`)) {
        stopifnot(is.numeric(`route_type`), length(`route_type`) == 1)
        self$`route_type` <- `route_type`
      }
      if (!missing(`route_id`)) {
        stopifnot(is.numeric(`route_id`), length(`route_id`) == 1)
        self$`route_id` <- `route_id`
      }
      if (!missing(`route_name`)) {
        stopifnot(is.character(`route_name`), length(`route_name`) == 1)
        self$`route_name` <- `route_name`
      }
      if (!missing(`route_number`)) {
        stopifnot(is.character(`route_number`), length(`route_number`) == 1)
        self$`route_number` <- `route_number`
      }
      if (!missing(`route_gtfs_id`)) {
        stopifnot(is.character(`route_gtfs_id`), length(`route_gtfs_id`) == 1)
        self$`route_gtfs_id` <- `route_gtfs_id`
      }
      if (!missing(`geopath`)) {
        stopifnot(is.list(`geopath`), length(`geopath`) != 0)
        lapply(`geopath`, function(x) stopifnot(R6::is.R6(x)))
        self$`geopath` <- `geopath`
      }
    },
    toJSON = function() {
      V3RouteWithStatusObject <- list()
      if (!is.null(self$`route_service_status`)) {
        V3RouteWithStatusObject[['route_service_status']] <- self$`route_service_status`$toJSON()
      }
      if (!is.null(self$`route_type`)) {
        V3RouteWithStatusObject[['route_type']] <- self$`route_type`
      }
      if (!is.null(self$`route_id`)) {
        V3RouteWithStatusObject[['route_id']] <- self$`route_id`
      }
      if (!is.null(self$`route_name`)) {
        V3RouteWithStatusObject[['route_name']] <- self$`route_name`
      }
      if (!is.null(self$`route_number`)) {
        V3RouteWithStatusObject[['route_number']] <- self$`route_number`
      }
      if (!is.null(self$`route_gtfs_id`)) {
        V3RouteWithStatusObject[['route_gtfs_id']] <- self$`route_gtfs_id`
      }
      if (!is.null(self$`geopath`)) {
        V3RouteWithStatusObject[['geopath']] <- lapply(self$`geopath`, function(x) x$toJSON())
      }

      V3RouteWithStatusObject
    },
    fromJSON = function(V3RouteWithStatusJson) {
      V3RouteWithStatusObject <- jsonlite::fromJSON(V3RouteWithStatusJson)
      if (!is.null(V3RouteWithStatusObject$`route_service_status`)) {
        route_service_statusObject <- V3RouteServiceStatus$new()
        route_service_statusObject$fromJSON(jsonlite::toJSON(V3RouteWithStatusObject$route_service_status, auto_unbox = TRUE))
        self$`route_service_status` <- route_service_statusObject
      }
      if (!is.null(V3RouteWithStatusObject$`route_type`)) {
        self$`route_type` <- V3RouteWithStatusObject$`route_type`
      }
      if (!is.null(V3RouteWithStatusObject$`route_id`)) {
        self$`route_id` <- V3RouteWithStatusObject$`route_id`
      }
      if (!is.null(V3RouteWithStatusObject$`route_name`)) {
        self$`route_name` <- V3RouteWithStatusObject$`route_name`
      }
      if (!is.null(V3RouteWithStatusObject$`route_number`)) {
        self$`route_number` <- V3RouteWithStatusObject$`route_number`
      }
      if (!is.null(V3RouteWithStatusObject$`route_gtfs_id`)) {
        self$`route_gtfs_id` <- V3RouteWithStatusObject$`route_gtfs_id`
      }
      if (!is.null(V3RouteWithStatusObject$`geopath`)) {
        self$`geopath` <- lapply(V3RouteWithStatusObject$`geopath`, function(x) {
          geopathObject <- TODO_OBJECT_MAPPING$new()
          geopathObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          geopathObject
        })
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "route_service_status": %s,
           "route_type": %d,
           "route_id": %d,
           "route_name": %s,
           "route_number": %s,
           "route_gtfs_id": %s,
           "geopath": [%s]
        }',
        self$`route_service_status`$toJSON(),
        self$`route_type`,
        self$`route_id`,
        self$`route_name`,
        self$`route_number`,
        self$`route_gtfs_id`,
        lapply(self$`geopath`, function(x) paste(x$toJSON(), sep=","))
      )
    },
    fromJSONString = function(V3RouteWithStatusJson) {
      V3RouteWithStatusObject <- jsonlite::fromJSON(V3RouteWithStatusJson)
      V3RouteServiceStatusObject <- V3RouteServiceStatus$new()
      self$`route_service_status` <- V3RouteServiceStatusObject$fromJSON(jsonlite::toJSON(V3RouteWithStatusObject$route_service_status, auto_unbox = TRUE))
      self$`route_type` <- V3RouteWithStatusObject$`route_type`
      self$`route_id` <- V3RouteWithStatusObject$`route_id`
      self$`route_name` <- V3RouteWithStatusObject$`route_name`
      self$`route_number` <- V3RouteWithStatusObject$`route_number`
      self$`route_gtfs_id` <- V3RouteWithStatusObject$`route_gtfs_id`
      self$`geopath` <- lapply(V3RouteWithStatusObject$`geopath`, function(x) TODO_OBJECT_MAPPING$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)