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


class V3StopOnRoute(object):
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
        'stop_suburb': 'str',
        'route_type': 'int',
        'stop_latitude': 'float',
        'stop_longitude': 'float',
        'stop_sequence': 'int',
        'stop_ticket': 'V3StopTicket',
        'stop_id': 'int',
        'stop_name': 'str',
        'stop_landmark': 'str'
    }

    attribute_map = {
        'disruption_ids': 'disruption_ids',
        'stop_suburb': 'stop_suburb',
        'route_type': 'route_type',
        'stop_latitude': 'stop_latitude',
        'stop_longitude': 'stop_longitude',
        'stop_sequence': 'stop_sequence',
        'stop_ticket': 'stop_ticket',
        'stop_id': 'stop_id',
        'stop_name': 'stop_name',
        'stop_landmark': 'stop_landmark'
    }

    def __init__(self, disruption_ids=None, stop_suburb=None, route_type=None, stop_latitude=None, stop_longitude=None, stop_sequence=None, stop_ticket=None, stop_id=None, stop_name=None, stop_landmark=None, _configuration=None):  # noqa: E501
        """V3StopOnRoute - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._disruption_ids = None
        self._stop_suburb = None
        self._route_type = None
        self._stop_latitude = None
        self._stop_longitude = None
        self._stop_sequence = None
        self._stop_ticket = None
        self._stop_id = None
        self._stop_name = None
        self._stop_landmark = None
        self.discriminator = None

        if disruption_ids is not None:
            self.disruption_ids = disruption_ids
        if stop_suburb is not None:
            self.stop_suburb = stop_suburb
        if route_type is not None:
            self.route_type = route_type
        if stop_latitude is not None:
            self.stop_latitude = stop_latitude
        if stop_longitude is not None:
            self.stop_longitude = stop_longitude
        if stop_sequence is not None:
            self.stop_sequence = stop_sequence
        if stop_ticket is not None:
            self.stop_ticket = stop_ticket
        if stop_id is not None:
            self.stop_id = stop_id
        if stop_name is not None:
            self.stop_name = stop_name
        if stop_landmark is not None:
            self.stop_landmark = stop_landmark

    @property
    def disruption_ids(self):
        """Gets the disruption_ids of this V3StopOnRoute.  # noqa: E501

        Disruption information identifier(s)  # noqa: E501

        :return: The disruption_ids of this V3StopOnRoute.  # noqa: E501
        :rtype: list[int]
        """
        return self._disruption_ids

    @disruption_ids.setter
    def disruption_ids(self, disruption_ids):
        """Sets the disruption_ids of this V3StopOnRoute.

        Disruption information identifier(s)  # noqa: E501

        :param disruption_ids: The disruption_ids of this V3StopOnRoute.  # noqa: E501
        :type: list[int]
        """

        self._disruption_ids = disruption_ids

    @property
    def stop_suburb(self):
        """Gets the stop_suburb of this V3StopOnRoute.  # noqa: E501

        suburb of stop  # noqa: E501

        :return: The stop_suburb of this V3StopOnRoute.  # noqa: E501
        :rtype: str
        """
        return self._stop_suburb

    @stop_suburb.setter
    def stop_suburb(self, stop_suburb):
        """Sets the stop_suburb of this V3StopOnRoute.

        suburb of stop  # noqa: E501

        :param stop_suburb: The stop_suburb of this V3StopOnRoute.  # noqa: E501
        :type: str
        """

        self._stop_suburb = stop_suburb

    @property
    def route_type(self):
        """Gets the route_type of this V3StopOnRoute.  # noqa: E501

        Transport mode identifier  # noqa: E501

        :return: The route_type of this V3StopOnRoute.  # noqa: E501
        :rtype: int
        """
        return self._route_type

    @route_type.setter
    def route_type(self, route_type):
        """Sets the route_type of this V3StopOnRoute.

        Transport mode identifier  # noqa: E501

        :param route_type: The route_type of this V3StopOnRoute.  # noqa: E501
        :type: int
        """

        self._route_type = route_type

    @property
    def stop_latitude(self):
        """Gets the stop_latitude of this V3StopOnRoute.  # noqa: E501

        Geographic coordinate of latitude at stop  # noqa: E501

        :return: The stop_latitude of this V3StopOnRoute.  # noqa: E501
        :rtype: float
        """
        return self._stop_latitude

    @stop_latitude.setter
    def stop_latitude(self, stop_latitude):
        """Sets the stop_latitude of this V3StopOnRoute.

        Geographic coordinate of latitude at stop  # noqa: E501

        :param stop_latitude: The stop_latitude of this V3StopOnRoute.  # noqa: E501
        :type: float
        """

        self._stop_latitude = stop_latitude

    @property
    def stop_longitude(self):
        """Gets the stop_longitude of this V3StopOnRoute.  # noqa: E501

        Geographic coordinate of longitude at stop  # noqa: E501

        :return: The stop_longitude of this V3StopOnRoute.  # noqa: E501
        :rtype: float
        """
        return self._stop_longitude

    @stop_longitude.setter
    def stop_longitude(self, stop_longitude):
        """Sets the stop_longitude of this V3StopOnRoute.

        Geographic coordinate of longitude at stop  # noqa: E501

        :param stop_longitude: The stop_longitude of this V3StopOnRoute.  # noqa: E501
        :type: float
        """

        self._stop_longitude = stop_longitude

    @property
    def stop_sequence(self):
        """Gets the stop_sequence of this V3StopOnRoute.  # noqa: E501

        Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.  # noqa: E501

        :return: The stop_sequence of this V3StopOnRoute.  # noqa: E501
        :rtype: int
        """
        return self._stop_sequence

    @stop_sequence.setter
    def stop_sequence(self, stop_sequence):
        """Sets the stop_sequence of this V3StopOnRoute.

        Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.  # noqa: E501

        :param stop_sequence: The stop_sequence of this V3StopOnRoute.  # noqa: E501
        :type: int
        """

        self._stop_sequence = stop_sequence

    @property
    def stop_ticket(self):
        """Gets the stop_ticket of this V3StopOnRoute.  # noqa: E501

        Stop ticket information  # noqa: E501

        :return: The stop_ticket of this V3StopOnRoute.  # noqa: E501
        :rtype: V3StopTicket
        """
        return self._stop_ticket

    @stop_ticket.setter
    def stop_ticket(self, stop_ticket):
        """Sets the stop_ticket of this V3StopOnRoute.

        Stop ticket information  # noqa: E501

        :param stop_ticket: The stop_ticket of this V3StopOnRoute.  # noqa: E501
        :type: V3StopTicket
        """

        self._stop_ticket = stop_ticket

    @property
    def stop_id(self):
        """Gets the stop_id of this V3StopOnRoute.  # noqa: E501

        Stop identifier  # noqa: E501

        :return: The stop_id of this V3StopOnRoute.  # noqa: E501
        :rtype: int
        """
        return self._stop_id

    @stop_id.setter
    def stop_id(self, stop_id):
        """Sets the stop_id of this V3StopOnRoute.

        Stop identifier  # noqa: E501

        :param stop_id: The stop_id of this V3StopOnRoute.  # noqa: E501
        :type: int
        """

        self._stop_id = stop_id

    @property
    def stop_name(self):
        """Gets the stop_name of this V3StopOnRoute.  # noqa: E501

        Name of stop  # noqa: E501

        :return: The stop_name of this V3StopOnRoute.  # noqa: E501
        :rtype: str
        """
        return self._stop_name

    @stop_name.setter
    def stop_name(self, stop_name):
        """Sets the stop_name of this V3StopOnRoute.

        Name of stop  # noqa: E501

        :param stop_name: The stop_name of this V3StopOnRoute.  # noqa: E501
        :type: str
        """

        self._stop_name = stop_name

    @property
    def stop_landmark(self):
        """Gets the stop_landmark of this V3StopOnRoute.  # noqa: E501

        Landmark in proximity of stop  # noqa: E501

        :return: The stop_landmark of this V3StopOnRoute.  # noqa: E501
        :rtype: str
        """
        return self._stop_landmark

    @stop_landmark.setter
    def stop_landmark(self, stop_landmark):
        """Sets the stop_landmark of this V3StopOnRoute.

        Landmark in proximity of stop  # noqa: E501

        :param stop_landmark: The stop_landmark of this V3StopOnRoute.  # noqa: E501
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
        if issubclass(V3StopOnRoute, dict):
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
        if not isinstance(other, V3StopOnRoute):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, V3StopOnRoute):
            return True

        return self.to_dict() != other.to_dict()