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

class V3BulkDeparturesUpdateResponse(object):
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
        'departures': 'list[V3Departure]',
        'route_type': 'int',
        'stop_id': 'int',
        'requested_route_direction': 'V3BulkDeparturesRouteDirectionResponse',
        'route_direction_status': 'int',
        'route_direction': 'V3BulkDeparturesRouteDirectionResponse'
    }

    attribute_map = {
        'departures': 'departures',
        'route_type': 'route_type',
        'stop_id': 'stop_id',
        'requested_route_direction': 'requested_route_direction',
        'route_direction_status': 'route_direction_status',
        'route_direction': 'route_direction'
    }

    def __init__(self, departures=None, route_type=None, stop_id=None, requested_route_direction=None, route_direction_status=None, route_direction=None):  # noqa: E501
        """V3BulkDeparturesUpdateResponse - a model defined in Swagger"""  # noqa: E501
        self._departures = None
        self._route_type = None
        self._stop_id = None
        self._requested_route_direction = None
        self._route_direction_status = None
        self._route_direction = None
        self.discriminator = None
        if departures is not None:
            self.departures = departures
        if route_type is not None:
            self.route_type = route_type
        if stop_id is not None:
            self.stop_id = stop_id
        if requested_route_direction is not None:
            self.requested_route_direction = requested_route_direction
        if route_direction_status is not None:
            self.route_direction_status = route_direction_status
        if route_direction is not None:
            self.route_direction = route_direction

    @property
    def departures(self):
        """Gets the departures of this V3BulkDeparturesUpdateResponse.  # noqa: E501

        Timetabled and real-time service departures  # noqa: E501

        :return: The departures of this V3BulkDeparturesUpdateResponse.  # noqa: E501
        :rtype: list[V3Departure]
        """
        return self._departures

    @departures.setter
    def departures(self, departures):
        """Sets the departures of this V3BulkDeparturesUpdateResponse.

        Timetabled and real-time service departures  # noqa: E501

        :param departures: The departures of this V3BulkDeparturesUpdateResponse.  # noqa: E501
        :type: list[V3Departure]
        """

        self._departures = departures

    @property
    def route_type(self):
        """Gets the route_type of this V3BulkDeparturesUpdateResponse.  # noqa: E501

        Transport mode identifier  # noqa: E501

        :return: The route_type of this V3BulkDeparturesUpdateResponse.  # noqa: E501
        :rtype: int
        """
        return self._route_type

    @route_type.setter
    def route_type(self, route_type):
        """Sets the route_type of this V3BulkDeparturesUpdateResponse.

        Transport mode identifier  # noqa: E501

        :param route_type: The route_type of this V3BulkDeparturesUpdateResponse.  # noqa: E501
        :type: int
        """

        self._route_type = route_type

    @property
    def stop_id(self):
        """Gets the stop_id of this V3BulkDeparturesUpdateResponse.  # noqa: E501

        Stop identifier  # noqa: E501

        :return: The stop_id of this V3BulkDeparturesUpdateResponse.  # noqa: E501
        :rtype: int
        """
        return self._stop_id

    @stop_id.setter
    def stop_id(self, stop_id):
        """Sets the stop_id of this V3BulkDeparturesUpdateResponse.

        Stop identifier  # noqa: E501

        :param stop_id: The stop_id of this V3BulkDeparturesUpdateResponse.  # noqa: E501
        :type: int
        """

        self._stop_id = stop_id

    @property
    def requested_route_direction(self):
        """Gets the requested_route_direction of this V3BulkDeparturesUpdateResponse.  # noqa: E501


        :return: The requested_route_direction of this V3BulkDeparturesUpdateResponse.  # noqa: E501
        :rtype: V3BulkDeparturesRouteDirectionResponse
        """
        return self._requested_route_direction

    @requested_route_direction.setter
    def requested_route_direction(self, requested_route_direction):
        """Sets the requested_route_direction of this V3BulkDeparturesUpdateResponse.


        :param requested_route_direction: The requested_route_direction of this V3BulkDeparturesUpdateResponse.  # noqa: E501
        :type: V3BulkDeparturesRouteDirectionResponse
        """

        self._requested_route_direction = requested_route_direction

    @property
    def route_direction_status(self):
        """Gets the route_direction_status of this V3BulkDeparturesUpdateResponse.  # noqa: E501

        The status of the route direction (changed | unchanged).  If changed, requests should change the requested_route_direction for the route_direction supplied.  # noqa: E501

        :return: The route_direction_status of this V3BulkDeparturesUpdateResponse.  # noqa: E501
        :rtype: int
        """
        return self._route_direction_status

    @route_direction_status.setter
    def route_direction_status(self, route_direction_status):
        """Sets the route_direction_status of this V3BulkDeparturesUpdateResponse.

        The status of the route direction (changed | unchanged).  If changed, requests should change the requested_route_direction for the route_direction supplied.  # noqa: E501

        :param route_direction_status: The route_direction_status of this V3BulkDeparturesUpdateResponse.  # noqa: E501
        :type: int
        """
        allowed_values = [0, 1]  # noqa: E501
        if route_direction_status not in allowed_values:
            raise ValueError(
                "Invalid value for `route_direction_status` ({0}), must be one of {1}"  # noqa: E501
                .format(route_direction_status, allowed_values)
            )

        self._route_direction_status = route_direction_status

    @property
    def route_direction(self):
        """Gets the route_direction of this V3BulkDeparturesUpdateResponse.  # noqa: E501


        :return: The route_direction of this V3BulkDeparturesUpdateResponse.  # noqa: E501
        :rtype: V3BulkDeparturesRouteDirectionResponse
        """
        return self._route_direction

    @route_direction.setter
    def route_direction(self, route_direction):
        """Sets the route_direction of this V3BulkDeparturesUpdateResponse.


        :param route_direction: The route_direction of this V3BulkDeparturesUpdateResponse.  # noqa: E501
        :type: V3BulkDeparturesRouteDirectionResponse
        """

        self._route_direction = route_direction

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
        if issubclass(V3BulkDeparturesUpdateResponse, dict):
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
        if not isinstance(other, V3BulkDeparturesUpdateResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other