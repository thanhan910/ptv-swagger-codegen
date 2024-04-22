# coding: utf-8

"""
    PTV Timetable API - Version 3

    The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  

    The version of the OpenAPI document: v3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ptv_api_client.models.v3_search_result import V3SearchResult

class TestV3SearchResult(unittest.TestCase):
    """V3SearchResult unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> V3SearchResult:
        """Test V3SearchResult
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `V3SearchResult`
        """
        model = V3SearchResult()
        if include_optional:
            return V3SearchResult(
                stops = [
                    ptv_api_client.models.v3/result_stop.V3.ResultStop(
                        stop_distance = 1.337, 
                        stop_suburb = '', 
                        route_type = 56, 
                        routes = [
                            ptv_api_client.models.v3/result_route.V3.ResultRoute(
                                route_name = '', 
                                route_number = '', 
                                route_type = 56, 
                                route_id = 56, 
                                route_gtfs_id = '', 
                                route_service_status = ptv_api_client.models.v3/route_service_status.V3.RouteServiceStatus(
                                    description = '', 
                                    timestamp = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), ), )
                            ], 
                        stop_latitude = 1.337, 
                        stop_longitude = 1.337, 
                        stop_sequence = 56, 
                        stop_id = 56, 
                        stop_name = '', 
                        stop_landmark = '', )
                    ],
                routes = [
                    ptv_api_client.models.v3/result_route.V3.ResultRoute(
                        route_name = '', 
                        route_number = '', 
                        route_type = 56, 
                        route_id = 56, 
                        route_gtfs_id = '', 
                        route_service_status = ptv_api_client.models.v3/route_service_status.V3.RouteServiceStatus(
                            description = '', 
                            timestamp = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), ), )
                    ],
                outlets = [
                    ptv_api_client.models.v3/result_outlet.V3.ResultOutlet(
                        outlet_distance = 1.337, 
                        outlet_slid_spid = '', 
                        outlet_name = '', 
                        outlet_business = '', 
                        outlet_latitude = 1.337, 
                        outlet_longitude = 1.337, 
                        outlet_suburb = '', 
                        outlet_postcode = 56, 
                        outlet_business_hour_mon = '', 
                        outlet_business_hour_tue = '', 
                        outlet_business_hour_wed = '', 
                        outlet_business_hour_thur = '', 
                        outlet_business_hour_fri = '', 
                        outlet_business_hour_sat = '', 
                        outlet_business_hour_sun = '', 
                        outlet_notes = '', )
                    ],
                status = ptv_api_client.models.v3/status.V3.Status(
                    version = '', 
                    health = 0, )
            )
        else:
            return V3SearchResult(
        )
        """

    def testV3SearchResult(self):
        """Test V3SearchResult"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
