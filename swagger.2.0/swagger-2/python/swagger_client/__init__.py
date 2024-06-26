# coding: utf-8

# flake8: noqa

"""
    PTV Timetable API - Version 3

    The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.    # noqa: E501

    OpenAPI spec version: v3
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

# import apis into sdk package
from swagger_client.api.departures_api import DeparturesApi
from swagger_client.api.directions_api import DirectionsApi
from swagger_client.api.disruptions_api import DisruptionsApi
from swagger_client.api.fare_estimate_api import FareEstimateApi
from swagger_client.api.outlets_api import OutletsApi
from swagger_client.api.patterns_api import PatternsApi
from swagger_client.api.route_types_api import RouteTypesApi
from swagger_client.api.routes_api import RoutesApi
from swagger_client.api.runs_api import RunsApi
from swagger_client.api.search_api import SearchApi
from swagger_client.api.stops_api import StopsApi

# import ApiClient
from swagger_client.api_client import ApiClient
from swagger_client.configuration import Configuration
# import models into sdk package
from swagger_client.models.v3_bulk_departures_request import V3BulkDeparturesRequest
from swagger_client.models.v3_bulk_departures_response import V3BulkDeparturesResponse
from swagger_client.models.v3_bulk_departures_route_direction_response import V3BulkDeparturesRouteDirectionResponse
from swagger_client.models.v3_bulk_departures_stop_response import V3BulkDeparturesStopResponse
from swagger_client.models.v3_bulk_departures_update_response import V3BulkDeparturesUpdateResponse
from swagger_client.models.v3_departure import V3Departure
from swagger_client.models.v3_departures_broad_parameters import V3DeparturesBroadParameters
from swagger_client.models.v3_departures_response import V3DeparturesResponse
from swagger_client.models.v3_departures_specific_parameters import V3DeparturesSpecificParameters
from swagger_client.models.v3_direction import V3Direction
from swagger_client.models.v3_direction_with_description import V3DirectionWithDescription
from swagger_client.models.v3_directions_response import V3DirectionsResponse
from swagger_client.models.v3_disruption import V3Disruption
from swagger_client.models.v3_disruption_direction import V3DisruptionDirection
from swagger_client.models.v3_disruption_mode import V3DisruptionMode
from swagger_client.models.v3_disruption_modes_response import V3DisruptionModesResponse
from swagger_client.models.v3_disruption_response import V3DisruptionResponse
from swagger_client.models.v3_disruption_route import V3DisruptionRoute
from swagger_client.models.v3_disruption_stop import V3DisruptionStop
from swagger_client.models.v3_disruptions import V3Disruptions
from swagger_client.models.v3_disruptions_response import V3DisruptionsResponse
from swagger_client.models.v3_dynamo_db_timetable import V3DynamoDbTimetable
from swagger_client.models.v3_dynamo_db_timetables_reponse import V3DynamoDbTimetablesReponse
from swagger_client.models.v3_error_response import V3ErrorResponse
from swagger_client.models.v3_fare_estimate_response import V3FareEstimateResponse
from swagger_client.models.v3_fare_estimate_result import V3FareEstimateResult
from swagger_client.models.v3_fare_estimate_result_status import V3FareEstimateResultStatus
from swagger_client.models.v3_generate_diva_mapping_response import V3GenerateDivaMappingResponse
from swagger_client.models.v3_outlet import V3Outlet
from swagger_client.models.v3_outlet_geolocation import V3OutletGeolocation
from swagger_client.models.v3_outlet_geolocation_parameters import V3OutletGeolocationParameters
from swagger_client.models.v3_outlet_geolocation_response import V3OutletGeolocationResponse
from swagger_client.models.v3_outlet_parameters import V3OutletParameters
from swagger_client.models.v3_outlet_response import V3OutletResponse
from swagger_client.models.v3_passenger_fare import V3PassengerFare
from swagger_client.models.v3_pattern_departure import V3PatternDeparture
from swagger_client.models.v3_result_outlet import V3ResultOutlet
from swagger_client.models.v3_result_route import V3ResultRoute
from swagger_client.models.v3_result_stop import V3ResultStop
from swagger_client.models.v3_route_departures_specific_parameters import V3RouteDeparturesSpecificParameters
from swagger_client.models.v3_route_response import V3RouteResponse
from swagger_client.models.v3_route_service_status import V3RouteServiceStatus
from swagger_client.models.v3_route_type import V3RouteType
from swagger_client.models.v3_route_types_response import V3RouteTypesResponse
from swagger_client.models.v3_route_with_status import V3RouteWithStatus
from swagger_client.models.v3_run import V3Run
from swagger_client.models.v3_run_response import V3RunResponse
from swagger_client.models.v3_runs_response import V3RunsResponse
from swagger_client.models.v3_search_parameters import V3SearchParameters
from swagger_client.models.v3_search_result import V3SearchResult
from swagger_client.models.v3_siri_direction_refs_dictionary import V3SiriDirectionRefsDictionary
from swagger_client.models.v3_siri_downstream_subscription import V3SiriDownstreamSubscription
from swagger_client.models.v3_siri_downstream_subscription_delete_request import V3SiriDownstreamSubscriptionDeleteRequest
from swagger_client.models.v3_siri_downstream_subscription_response import V3SiriDownstreamSubscriptionResponse
from swagger_client.models.v3_siri_downstream_subscription_topic import V3SiriDownstreamSubscriptionTopic
from swagger_client.models.v3_siri_estimated_timetable_subscription_request import V3SiriEstimatedTimetableSubscriptionRequest
from swagger_client.models.v3_siri_line_ref import V3SiriLineRef
from swagger_client.models.v3_siri_line_ref_direction_ref_stop_point_ref import V3SiriLineRefDirectionRefStopPointRef
from swagger_client.models.v3_siri_line_ref_direction_refs_dictionary import V3SiriLineRefDirectionRefsDictionary
from swagger_client.models.v3_siri_line_ref_mappings_response import V3SiriLineRefMappingsResponse
from swagger_client.models.v3_siri_line_refs_request import V3SiriLineRefsRequest
from swagger_client.models.v3_siri_production_timetable_subscription_request import V3SiriProductionTimetableSubscriptionRequest
from swagger_client.models.v3_siri_reference_data_detail import V3SiriReferenceDataDetail
from swagger_client.models.v3_siri_reference_data_mappings_response import V3SiriReferenceDataMappingsResponse
from swagger_client.models.v3_siri_reference_data_request import V3SiriReferenceDataRequest
from swagger_client.models.v3_siri_stops_refs_dictionary import V3SiriStopsRefsDictionary
from swagger_client.models.v3_siri_subscription_topic import V3SiriSubscriptionTopic
from swagger_client.models.v3_status import V3Status
from swagger_client.models.v3_stop_accessibility import V3StopAccessibility
from swagger_client.models.v3_stop_accessibility_wheelchair import V3StopAccessibilityWheelchair
from swagger_client.models.v3_stop_amenity_details import V3StopAmenityDetails
from swagger_client.models.v3_stop_basic import V3StopBasic
from swagger_client.models.v3_stop_departure_request import V3StopDepartureRequest
from swagger_client.models.v3_stop_departure_request_route_direction import V3StopDepartureRequestRouteDirection
from swagger_client.models.v3_stop_details import V3StopDetails
from swagger_client.models.v3_stop_geosearch import V3StopGeosearch
from swagger_client.models.v3_stop_gps import V3StopGps
from swagger_client.models.v3_stop_location import V3StopLocation
from swagger_client.models.v3_stop_model import V3StopModel
from swagger_client.models.v3_stop_on_route import V3StopOnRoute
from swagger_client.models.v3_stop_point import V3StopPoint
from swagger_client.models.v3_stop_response import V3StopResponse
from swagger_client.models.v3_stop_staffing import V3StopStaffing
from swagger_client.models.v3_stop_ticket import V3StopTicket
from swagger_client.models.v3_stopping_pattern import V3StoppingPattern
from swagger_client.models.v3_stopping_pattern_stop import V3StoppingPatternStop
from swagger_client.models.v3_stops_by_distance_response import V3StopsByDistanceResponse
from swagger_client.models.v3_stops_on_route_response import V3StopsOnRouteResponse
from swagger_client.models.v3_vehicle_descriptor import V3VehicleDescriptor
from swagger_client.models.v3_vehicle_position import V3VehiclePosition
from swagger_client.models.v3_void import V3Void
from swagger_client.models.v3_zone_info import V3ZoneInfo
