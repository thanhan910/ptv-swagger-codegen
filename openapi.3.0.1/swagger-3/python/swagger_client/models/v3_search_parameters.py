# coding: utf-8

"""
    PTV Timetable API - Version 3

    The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.    # noqa: E501

    OpenAPI spec version: v3
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class V3SearchParameters(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'route_types': 'list[int]',
        'latitude': 'float',
        'longitude': 'float',
        'max_distance': 'float',
        'include_addresses': 'bool',
        'include_outlets': 'bool',
        'match_stop_by_suburb': 'bool',
        'match_route_by_suburb': 'bool',
        'match_stop_by_gtfs_stop_id': 'bool'
    }

    attribute_map = {
        'route_types': 'route_types',
        'latitude': 'latitude',
        'longitude': 'longitude',
        'max_distance': 'max_distance',
        'include_addresses': 'include_addresses',
        'include_outlets': 'include_outlets',
        'match_stop_by_suburb': 'match_stop_by_suburb',
        'match_route_by_suburb': 'match_route_by_suburb',
        'match_stop_by_gtfs_stop_id': 'match_stop_by_gtfs_stop_id'
    }

    def __init__(self, route_types=None, latitude=None, longitude=None, max_distance=None, include_addresses=None, include_outlets=None, match_stop_by_suburb=None, match_route_by_suburb=None, match_stop_by_gtfs_stop_id=None):  # noqa: E501
        """V3SearchParameters - a model defined in Swagger"""  # noqa: E501
        self._route_types = None
        self._latitude = None
        self._longitude = None
        self._max_distance = None
        self._include_addresses = None
        self._include_outlets = None
        self._match_stop_by_suburb = None
        self._match_route_by_suburb = None
        self._match_stop_by_gtfs_stop_id = None
        self.discriminator = None
        if route_types is not None:
            self.route_types = route_types
        if latitude is not None:
            self.latitude = latitude
        if longitude is not None:
            self.longitude = longitude
        if max_distance is not None:
            self.max_distance = max_distance
        if include_addresses is not None:
            self.include_addresses = include_addresses
        if include_outlets is not None:
            self.include_outlets = include_outlets
        if match_stop_by_suburb is not None:
            self.match_stop_by_suburb = match_stop_by_suburb
        if match_route_by_suburb is not None:
            self.match_route_by_suburb = match_route_by_suburb
        if match_stop_by_gtfs_stop_id is not None:
            self.match_stop_by_gtfs_stop_id = match_stop_by_gtfs_stop_id

    @property
    def route_types(self):
        """Gets the route_types of this V3SearchParameters.  # noqa: E501

        Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)  # noqa: E501

        :return: The route_types of this V3SearchParameters.  # noqa: E501
        :rtype: list[int]
        """
        return self._route_types

    @route_types.setter
    def route_types(self, route_types):
        """Sets the route_types of this V3SearchParameters.

        Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)  # noqa: E501

        :param route_types: The route_types of this V3SearchParameters.  # noqa: E501
        :type: list[int]
        """
        allowed_values = [0, 1, 2, 3, 4]  # noqa: E501
        if not set(route_types).issubset(set(allowed_values)):
            raise ValueError(
                "Invalid values for `route_types` [{0}], must be a subset of [{1}]"  # noqa: E501
                .format(", ".join(map(str, set(route_types) - set(allowed_values))),  # noqa: E501
                        ", ".join(map(str, allowed_values)))
            )

        self._route_types = route_types

    @property
    def latitude(self):
        """Gets the latitude of this V3SearchParameters.  # noqa: E501

        Filter by geographic coordinate of latitude  # noqa: E501

        :return: The latitude of this V3SearchParameters.  # noqa: E501
        :rtype: float
        """
        return self._latitude

    @latitude.setter
    def latitude(self, latitude):
        """Sets the latitude of this V3SearchParameters.

        Filter by geographic coordinate of latitude  # noqa: E501

        :param latitude: The latitude of this V3SearchParameters.  # noqa: E501
        :type: float
        """

        self._latitude = latitude

    @property
    def longitude(self):
        """Gets the longitude of this V3SearchParameters.  # noqa: E501

        Filter by geographic coordinate of longitude  # noqa: E501

        :return: The longitude of this V3SearchParameters.  # noqa: E501
        :rtype: float
        """
        return self._longitude

    @longitude.setter
    def longitude(self, longitude):
        """Sets the longitude of this V3SearchParameters.

        Filter by geographic coordinate of longitude  # noqa: E501

        :param longitude: The longitude of this V3SearchParameters.  # noqa: E501
        :type: float
        """

        self._longitude = longitude

    @property
    def max_distance(self):
        """Gets the max_distance of this V3SearchParameters.  # noqa: E501

        Filter by maximum distance (in metres) from location specified via latitude and longitude parameters  # noqa: E501

        :return: The max_distance of this V3SearchParameters.  # noqa: E501
        :rtype: float
        """
        return self._max_distance

    @max_distance.setter
    def max_distance(self, max_distance):
        """Sets the max_distance of this V3SearchParameters.

        Filter by maximum distance (in metres) from location specified via latitude and longitude parameters  # noqa: E501

        :param max_distance: The max_distance of this V3SearchParameters.  # noqa: E501
        :type: float
        """

        self._max_distance = max_distance

    @property
    def include_addresses(self):
        """Gets the include_addresses of this V3SearchParameters.  # noqa: E501

        Placeholder for future development; currently unavailable  # noqa: E501

        :return: The include_addresses of this V3SearchParameters.  # noqa: E501
        :rtype: bool
        """
        return self._include_addresses

    @include_addresses.setter
    def include_addresses(self, include_addresses):
        """Sets the include_addresses of this V3SearchParameters.

        Placeholder for future development; currently unavailable  # noqa: E501

        :param include_addresses: The include_addresses of this V3SearchParameters.  # noqa: E501
        :type: bool
        """

        self._include_addresses = include_addresses

    @property
    def include_outlets(self):
        """Gets the include_outlets of this V3SearchParameters.  # noqa: E501

        Indicates if outlets will be returned in response (default = true)  # noqa: E501

        :return: The include_outlets of this V3SearchParameters.  # noqa: E501
        :rtype: bool
        """
        return self._include_outlets

    @include_outlets.setter
    def include_outlets(self, include_outlets):
        """Sets the include_outlets of this V3SearchParameters.

        Indicates if outlets will be returned in response (default = true)  # noqa: E501

        :param include_outlets: The include_outlets of this V3SearchParameters.  # noqa: E501
        :type: bool
        """

        self._include_outlets = include_outlets

    @property
    def match_stop_by_suburb(self):
        """Gets the match_stop_by_suburb of this V3SearchParameters.  # noqa: E501

        Indicates whether to find stops by suburbs in the search term (default = true)  # noqa: E501

        :return: The match_stop_by_suburb of this V3SearchParameters.  # noqa: E501
        :rtype: bool
        """
        return self._match_stop_by_suburb

    @match_stop_by_suburb.setter
    def match_stop_by_suburb(self, match_stop_by_suburb):
        """Sets the match_stop_by_suburb of this V3SearchParameters.

        Indicates whether to find stops by suburbs in the search term (default = true)  # noqa: E501

        :param match_stop_by_suburb: The match_stop_by_suburb of this V3SearchParameters.  # noqa: E501
        :type: bool
        """

        self._match_stop_by_suburb = match_stop_by_suburb

    @property
    def match_route_by_suburb(self):
        """Gets the match_route_by_suburb of this V3SearchParameters.  # noqa: E501

        Indicates whether to find routes by suburbs in the search term (default = true)  # noqa: E501

        :return: The match_route_by_suburb of this V3SearchParameters.  # noqa: E501
        :rtype: bool
        """
        return self._match_route_by_suburb

    @match_route_by_suburb.setter
    def match_route_by_suburb(self, match_route_by_suburb):
        """Sets the match_route_by_suburb of this V3SearchParameters.

        Indicates whether to find routes by suburbs in the search term (default = true)  # noqa: E501

        :param match_route_by_suburb: The match_route_by_suburb of this V3SearchParameters.  # noqa: E501
        :type: bool
        """

        self._match_route_by_suburb = match_route_by_suburb

    @property
    def match_stop_by_gtfs_stop_id(self):
        """Gets the match_stop_by_gtfs_stop_id of this V3SearchParameters.  # noqa: E501

        Indicates whether to search for stops according to a metlink stop ID (default = false)  # noqa: E501

        :return: The match_stop_by_gtfs_stop_id of this V3SearchParameters.  # noqa: E501
        :rtype: bool
        """
        return self._match_stop_by_gtfs_stop_id

    @match_stop_by_gtfs_stop_id.setter
    def match_stop_by_gtfs_stop_id(self, match_stop_by_gtfs_stop_id):
        """Sets the match_stop_by_gtfs_stop_id of this V3SearchParameters.

        Indicates whether to search for stops according to a metlink stop ID (default = false)  # noqa: E501

        :param match_stop_by_gtfs_stop_id: The match_stop_by_gtfs_stop_id of this V3SearchParameters.  # noqa: E501
        :type: bool
        """

        self._match_stop_by_gtfs_stop_id = match_stop_by_gtfs_stop_id

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(V3SearchParameters, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, V3SearchParameters):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other