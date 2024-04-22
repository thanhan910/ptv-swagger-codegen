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

from swagger_client.configuration import Configuration


class V3StopDetails(object):
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
        'disruption_ids': 'list[int]',
        'station_type': 'str',
        'station_description': 'str',
        'route_type': 'int',
        'stop_location': 'V3StopLocation',
        'stop_amenities': 'V3StopAmenityDetails',
        'stop_accessibility': 'V3StopAccessibility',
        'stop_staffing': 'V3StopStaffing',
        'routes': 'list[object]',
        'stop_id': 'int',
        'stop_name': 'str',
        'stop_landmark': 'str'
    }

    attribute_map = {
        'disruption_ids': 'disruption_ids',
        'station_type': 'station_type',
        'station_description': 'station_description',
        'route_type': 'route_type',
        'stop_location': 'stop_location',
        'stop_amenities': 'stop_amenities',
        'stop_accessibility': 'stop_accessibility',
        'stop_staffing': 'stop_staffing',
        'routes': 'routes',
        'stop_id': 'stop_id',
        'stop_name': 'stop_name',
        'stop_landmark': 'stop_landmark'
    }

    def __init__(self, disruption_ids=None, station_type=None, station_description=None, route_type=None, stop_location=None, stop_amenities=None, stop_accessibility=None, stop_staffing=None, routes=None, stop_id=None, stop_name=None, stop_landmark=None, _configuration=None):  # noqa: E501
        """V3StopDetails - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._disruption_ids = None
        self._station_type = None
        self._station_description = None
        self._route_type = None
        self._stop_location = None
        self._stop_amenities = None
        self._stop_accessibility = None
        self._stop_staffing = None
        self._routes = None
        self._stop_id = None
        self._stop_name = None
        self._stop_landmark = None
        self.discriminator = None

        if disruption_ids is not None:
            self.disruption_ids = disruption_ids
        if station_type is not None:
            self.station_type = station_type
        if station_description is not None:
            self.station_description = station_description
        if route_type is not None:
            self.route_type = route_type
        if stop_location is not None:
            self.stop_location = stop_location
        if stop_amenities is not None:
            self.stop_amenities = stop_amenities
        if stop_accessibility is not None:
            self.stop_accessibility = stop_accessibility
        if stop_staffing is not None:
            self.stop_staffing = stop_staffing
        if routes is not None:
            self.routes = routes
        if stop_id is not None:
            self.stop_id = stop_id
        if stop_name is not None:
            self.stop_name = stop_name
        if stop_landmark is not None:
            self.stop_landmark = stop_landmark

    @property
    def disruption_ids(self):
        """Gets the disruption_ids of this V3StopDetails.  # noqa: E501

        Disruption information identifier(s)  # noqa: E501

        :return: The disruption_ids of this V3StopDetails.  # noqa: E501
        :rtype: list[int]
        """
        return self._disruption_ids

    @disruption_ids.setter
    def disruption_ids(self, disruption_ids):
        """Sets the disruption_ids of this V3StopDetails.

        Disruption information identifier(s)  # noqa: E501

        :param disruption_ids: The disruption_ids of this V3StopDetails.  # noqa: E501
        :type: list[int]
        """

        self._disruption_ids = disruption_ids

    @property
    def station_type(self):
        """Gets the station_type of this V3StopDetails.  # noqa: E501

        Type of metropolitan train station (i.e. \"Premium\", \"Host\" or \"Unstaffed\" station); returns null for V/Line train  # noqa: E501

        :return: The station_type of this V3StopDetails.  # noqa: E501
        :rtype: str
        """
        return self._station_type

    @station_type.setter
    def station_type(self, station_type):
        """Sets the station_type of this V3StopDetails.

        Type of metropolitan train station (i.e. \"Premium\", \"Host\" or \"Unstaffed\" station); returns null for V/Line train  # noqa: E501

        :param station_type: The station_type of this V3StopDetails.  # noqa: E501
        :type: str
        """

        self._station_type = station_type

    @property
    def station_description(self):
        """Gets the station_description of this V3StopDetails.  # noqa: E501

        The definition applicable to the station_type; returns null for V/Line train  # noqa: E501

        :return: The station_description of this V3StopDetails.  # noqa: E501
        :rtype: str
        """
        return self._station_description

    @station_description.setter
    def station_description(self, station_description):
        """Sets the station_description of this V3StopDetails.

        The definition applicable to the station_type; returns null for V/Line train  # noqa: E501

        :param station_description: The station_description of this V3StopDetails.  # noqa: E501
        :type: str
        """

        self._station_description = station_description

    @property
    def route_type(self):
        """Gets the route_type of this V3StopDetails.  # noqa: E501

        Transport mode identifier  # noqa: E501

        :return: The route_type of this V3StopDetails.  # noqa: E501
        :rtype: int
        """
        return self._route_type

    @route_type.setter
    def route_type(self, route_type):
        """Sets the route_type of this V3StopDetails.

        Transport mode identifier  # noqa: E501

        :param route_type: The route_type of this V3StopDetails.  # noqa: E501
        :type: int
        """

        self._route_type = route_type

    @property
    def stop_location(self):
        """Gets the stop_location of this V3StopDetails.  # noqa: E501

        Location details of the stop  # noqa: E501

        :return: The stop_location of this V3StopDetails.  # noqa: E501
        :rtype: V3StopLocation
        """
        return self._stop_location

    @stop_location.setter
    def stop_location(self, stop_location):
        """Sets the stop_location of this V3StopDetails.

        Location details of the stop  # noqa: E501

        :param stop_location: The stop_location of this V3StopDetails.  # noqa: E501
        :type: V3StopLocation
        """

        self._stop_location = stop_location

    @property
    def stop_amenities(self):
        """Gets the stop_amenities of this V3StopDetails.  # noqa: E501

        Amenity and facility details at the stop  # noqa: E501

        :return: The stop_amenities of this V3StopDetails.  # noqa: E501
        :rtype: V3StopAmenityDetails
        """
        return self._stop_amenities

    @stop_amenities.setter
    def stop_amenities(self, stop_amenities):
        """Sets the stop_amenities of this V3StopDetails.

        Amenity and facility details at the stop  # noqa: E501

        :param stop_amenities: The stop_amenities of this V3StopDetails.  # noqa: E501
        :type: V3StopAmenityDetails
        """

        self._stop_amenities = stop_amenities

    @property
    def stop_accessibility(self):
        """Gets the stop_accessibility of this V3StopDetails.  # noqa: E501

        Facilities relating to the accessibility of the stop  # noqa: E501

        :return: The stop_accessibility of this V3StopDetails.  # noqa: E501
        :rtype: V3StopAccessibility
        """
        return self._stop_accessibility

    @stop_accessibility.setter
    def stop_accessibility(self, stop_accessibility):
        """Sets the stop_accessibility of this V3StopDetails.

        Facilities relating to the accessibility of the stop  # noqa: E501

        :param stop_accessibility: The stop_accessibility of this V3StopDetails.  # noqa: E501
        :type: V3StopAccessibility
        """

        self._stop_accessibility = stop_accessibility

    @property
    def stop_staffing(self):
        """Gets the stop_staffing of this V3StopDetails.  # noqa: E501

        Staffing details for the stop  # noqa: E501

        :return: The stop_staffing of this V3StopDetails.  # noqa: E501
        :rtype: V3StopStaffing
        """
        return self._stop_staffing

    @stop_staffing.setter
    def stop_staffing(self, stop_staffing):
        """Sets the stop_staffing of this V3StopDetails.

        Staffing details for the stop  # noqa: E501

        :param stop_staffing: The stop_staffing of this V3StopDetails.  # noqa: E501
        :type: V3StopStaffing
        """

        self._stop_staffing = stop_staffing

    @property
    def routes(self):
        """Gets the routes of this V3StopDetails.  # noqa: E501

        Routes travelling through the stop  # noqa: E501

        :return: The routes of this V3StopDetails.  # noqa: E501
        :rtype: list[object]
        """
        return self._routes

    @routes.setter
    def routes(self, routes):
        """Sets the routes of this V3StopDetails.

        Routes travelling through the stop  # noqa: E501

        :param routes: The routes of this V3StopDetails.  # noqa: E501
        :type: list[object]
        """

        self._routes = routes

    @property
    def stop_id(self):
        """Gets the stop_id of this V3StopDetails.  # noqa: E501

        Stop identifier  # noqa: E501

        :return: The stop_id of this V3StopDetails.  # noqa: E501
        :rtype: int
        """
        return self._stop_id

    @stop_id.setter
    def stop_id(self, stop_id):
        """Sets the stop_id of this V3StopDetails.

        Stop identifier  # noqa: E501

        :param stop_id: The stop_id of this V3StopDetails.  # noqa: E501
        :type: int
        """

        self._stop_id = stop_id

    @property
    def stop_name(self):
        """Gets the stop_name of this V3StopDetails.  # noqa: E501

        Name of stop  # noqa: E501

        :return: The stop_name of this V3StopDetails.  # noqa: E501
        :rtype: str
        """
        return self._stop_name

    @stop_name.setter
    def stop_name(self, stop_name):
        """Sets the stop_name of this V3StopDetails.

        Name of stop  # noqa: E501

        :param stop_name: The stop_name of this V3StopDetails.  # noqa: E501
        :type: str
        """

        self._stop_name = stop_name

    @property
    def stop_landmark(self):
        """Gets the stop_landmark of this V3StopDetails.  # noqa: E501

        Landmark in proximity of stop  # noqa: E501

        :return: The stop_landmark of this V3StopDetails.  # noqa: E501
        :rtype: str
        """
        return self._stop_landmark

    @stop_landmark.setter
    def stop_landmark(self, stop_landmark):
        """Sets the stop_landmark of this V3StopDetails.

        Landmark in proximity of stop  # noqa: E501

        :param stop_landmark: The stop_landmark of this V3StopDetails.  # noqa: E501
        :type: str
        """

        self._stop_landmark = stop_landmark

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
        if issubclass(V3StopDetails, dict):
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
        if not isinstance(other, V3StopDetails):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, V3StopDetails):
            return True

        return self.to_dict() != other.to_dict()
