# PTV Timetable API - Version 3
#
# The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
#
# OpenAPI spec version: v3
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' V3SiriLineRefsRequest Class
#'
#' @field line_refs 
#' @field mapping_version 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
V3SiriLineRefsRequest <- R6::R6Class(
  'V3SiriLineRefsRequest',
  public = list(
    `line_refs` = NULL,
    `mapping_version` = NULL,
    initialize = function(`line_refs`, `mapping_version`){
      if (!missing(`line_refs`)) {
        stopifnot(is.list(`line_refs`), length(`line_refs`) != 0)
        lapply(`line_refs`, function(x) stopifnot(R6::is.R6(x)))
        self$`line_refs` <- `line_refs`
      }
      if (!missing(`mapping_version`)) {
        stopifnot(is.character(`mapping_version`), length(`mapping_version`) == 1)
        self$`mapping_version` <- `mapping_version`
      }
    },
    toJSON = function() {
      V3SiriLineRefsRequestObject <- list()
      if (!is.null(self$`line_refs`)) {
        V3SiriLineRefsRequestObject[['line_refs']] <- lapply(self$`line_refs`, function(x) x$toJSON())
      }
      if (!is.null(self$`mapping_version`)) {
        V3SiriLineRefsRequestObject[['mapping_version']] <- self$`mapping_version`
      }

      V3SiriLineRefsRequestObject
    },
    fromJSON = function(V3SiriLineRefsRequestJson) {
      V3SiriLineRefsRequestObject <- jsonlite::fromJSON(V3SiriLineRefsRequestJson)
      if (!is.null(V3SiriLineRefsRequestObject$`line_refs`)) {
        self$`line_refs` <- lapply(V3SiriLineRefsRequestObject$`line_refs`, function(x) {
          line_refsObject <- V3SiriLineRef$new()
          line_refsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          line_refsObject
        })
      }
      if (!is.null(V3SiriLineRefsRequestObject$`mapping_version`)) {
        self$`mapping_version` <- V3SiriLineRefsRequestObject$`mapping_version`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "line_refs": [%s],
           "mapping_version": %s
        }',
        lapply(self$`line_refs`, function(x) paste(x$toJSON(), sep=",")),
        self$`mapping_version`
      )
    },
    fromJSONString = function(V3SiriLineRefsRequestJson) {
      V3SiriLineRefsRequestObject <- jsonlite::fromJSON(V3SiriLineRefsRequestJson)
      self$`line_refs` <- lapply(V3SiriLineRefsRequestObject$`line_refs`, function(x) V3SiriLineRef$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`mapping_version` <- V3SiriLineRefsRequestObject$`mapping_version`
    }
  )
)