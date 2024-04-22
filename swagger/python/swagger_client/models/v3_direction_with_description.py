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


class V3DirectionWithDescription(object):
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
        'route_direction_description': 'str',
        'direction_id': 'int',
        'direction_name': 'str',
        'route_id': 'int',
        'route_type': 'int'
    }

    attribute_map = {
        'route_direction_description': 'route_direction_description',
        'direction_id': 'direction_id',
        'direction_name': 'direction_name',
        'route_id': 'route_id',
        'route_type': 'route_type'
    }

    def __init__(self, route_direction_description=None, direction_id=None, direction_name=None, route_id=None, route_type=None, _configuration=None):  # noqa: E501
        """V3DirectionWithDescription - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._route_direction_description = None
        self._direction_id = None
        self._direction_name = None
        self._route_id = None
        self._route_type = None
        self.discriminator = None

        if route_direction_description is not None:
            self.route_direction_description = route_direction_description
        if direction_id is not None:
            self.direction_id = direction_id
        if direction_name is not None:
            self.direction_name = direction_name
        if route_id is not None:
            self.route_id = route_id
        if route_type is not None:
            self.route_type = route_type

    @property
    def route_direction_description(self):
        """Gets the route_direction_description of this V3DirectionWithDescription.  # noqa: E501


        :return: The route_direction_description of this V3DirectionWithDescription.  # noqa: E501
        :rtype: str
        """
        return self._route_direction_description

    @route_direction_description.setter
    def route_direction_description(self, route_direction_description):
        """Sets the route_direction_description of this V3DirectionWithDescription.


        :param route_direction_description: The route_direction_description of this V3DirectionWithDescription.  # noqa: E501
        :type: str
        """

        self._route_direction_description = route_direction_description

    @property
    def direction_id(self):
        """Gets the direction_id of this V3DirectionWithDescription.  # noqa: E501

        Direction of travel identifier  # noqa: E501

        :return: The direction_id of this V3DirectionWithDescription.  # noqa: E501
        :rtype: int
        """
        return self._direction_id

    @direction_id.setter
    def direction_id(self, direction_id):
        """Sets the direction_id of this V3DirectionWithDescription.

        Direction of travel identifier  # noqa: E501

        :param direction_id: The direction_id of this V3DirectionWithDescription.  # noqa: E501
        :type: int
        """

        self._direction_id = direction_id

    @property
    def direction_name(self):
        """Gets the direction_name of this V3DirectionWithDescription.  # noqa: E501

        Name of direction of travel  # noqa: E501

        :return: The direction_name of this V3DirectionWithDescription.  # noqa: E501
        :rtype: str
        """
        return self._direction_name

    @direction_name.setter
    def direction_name(self, direction_name):
        """Sets the direction_name of this V3DirectionWithDescription.

        Name of direction of travel  # noqa: E501

        :param direction_name: The direction_name of this V3DirectionWithDescription.  # noqa: E501
        :type: str
        """

        self._direction_name = direction_name

    @property
    def route_id(self):
        """Gets the route_id of this V3DirectionWithDescription.  # noqa: E501

        Route identifier  # noqa: E501

        :return: The route_id of this V3DirectionWithDescription.  # noqa: E501
        :rtype: int
        """
        return self._route_id

    @route_id.setter
    def route_id(self, route_id):
        """Sets the route_id of this V3DirectionWithDescription.

        Route identifier  # noqa: E501

        :param route_id: The route_id of this V3DirectionWithDescription.  # noqa: E501
        :type: int
        """

        self._route_id = route_id

    @property
    def route_type(self):
        """Gets the route_type of this V3DirectionWithDescription.  # noqa: E501

        Transport mode identifier  # noqa: E501

        :return: The route_type of this V3DirectionWithDescription.  # noqa: E501
        :rtype: int
        """
        return self._route_type

    @route_type.setter
    def route_type(self, route_type):
        """Sets the route_type of this V3DirectionWithDescription.

        Transport mode identifier  # noqa: E501

        :param route_type: The route_type of this V3DirectionWithDescription.  # noqa: E501
        :type: int
        """

        self._route_type = route_type

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
        if issubclass(V3DirectionWithDescription, dict):
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
        if not isinstance(other, V3DirectionWithDescription):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, V3DirectionWithDescription):
            return True

        return self.to_dict() != other.to_dict()
