# PTV Timetable API - Version 3
#
# The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
#
# OpenAPI spec version: v3
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' V3StopsByDistanceResponse Class
#'
#' @field stops 
#' @field disruptions 
#' @field status 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
V3StopsByDistanceResponse <- R6::R6Class(
  'V3StopsByDistanceResponse',
  public = list(
    `stops` = NULL,
    `disruptions` = NULL,
    `status` = NULL,
    initialize = function(`stops`, `disruptions`, `status`){
      if (!missing(`stops`)) {
        stopifnot(is.list(`stops`), length(`stops`) != 0)
        lapply(`stops`, function(x) stopifnot(R6::is.R6(x)))
        self$`stops` <- `stops`
      }
      if (!missing(`disruptions`)) {
        stopifnot(R6::is.R6(`disruptions`))
        self$`disruptions` <- `disruptions`
      }
      if (!missing(`status`)) {
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
    },
    toJSON = function() {
      V3StopsByDistanceResponseObject <- list()
      if (!is.null(self$`stops`)) {
        V3StopsByDistanceResponseObject[['stops']] <- lapply(self$`stops`, function(x) x$toJSON())
      }
      if (!is.null(self$`disruptions`)) {
        V3StopsByDistanceResponseObject[['disruptions']] <- self$`disruptions`$toJSON()
      }
      if (!is.null(self$`status`)) {
        V3StopsByDistanceResponseObject[['status']] <- self$`status`$toJSON()
      }

      V3StopsByDistanceResponseObject
    },
    fromJSON = function(V3StopsByDistanceResponseJson) {
      V3StopsByDistanceResponseObject <- jsonlite::fromJSON(V3StopsByDistanceResponseJson)
      if (!is.null(V3StopsByDistanceResponseObject$`stops`)) {
        self$`stops` <- lapply(V3StopsByDistanceResponseObject$`stops`, function(x) {
          stopsObject <- V3StopGeosearch$new()
          stopsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          stopsObject
        })
      }
      if (!is.null(V3StopsByDistanceResponseObject$`disruptions`)) {
        disruptionsObject <- V3Disruption$new()
        disruptionsObject$fromJSON(jsonlite::toJSON(V3StopsByDistanceResponseObject$disruptions, auto_unbox = TRUE))
        self$`disruptions` <- disruptionsObject
      }
      if (!is.null(V3StopsByDistanceResponseObject$`status`)) {
        statusObject <- V3Status$new()
        statusObject$fromJSON(jsonlite::toJSON(V3StopsByDistanceResponseObject$status, auto_unbox = TRUE))
        self$`status` <- statusObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "stops": [%s],
           "disruptions": %s,
           "status": %s
        }',
        lapply(self$`stops`, function(x) paste(x$toJSON(), sep=",")),
        self$`disruptions`$toJSON(),
        self$`status`$toJSON()
      )
    },
    fromJSONString = function(V3StopsByDistanceResponseJson) {
      V3StopsByDistanceResponseObject <- jsonlite::fromJSON(V3StopsByDistanceResponseJson)
      self$`stops` <- lapply(V3StopsByDistanceResponseObject$`stops`, function(x) V3StopGeosearch$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      V3DisruptionObject <- V3Disruption$new()
      self$`disruptions` <- V3DisruptionObject$fromJSON(jsonlite::toJSON(V3StopsByDistanceResponseObject$disruptions, auto_unbox = TRUE))
      V3StatusObject <- V3Status$new()
      self$`status` <- V3StatusObject$fromJSON(jsonlite::toJSON(V3StopsByDistanceResponseObject$status, auto_unbox = TRUE))
    }
  )
)