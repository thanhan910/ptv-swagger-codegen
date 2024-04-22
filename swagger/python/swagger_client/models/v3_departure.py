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


class V3Departure(object):
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
        'stop_id': 'int',
        'route_id': 'int',
        'run_id': 'int',
        'run_ref': 'str',
        'direction_id': 'int',
        'disruption_ids': 'list[int]',
        'scheduled_departure_utc': 'datetime',
        'estimated_departure_utc': 'datetime',
        'at_platform': 'bool',
        'platform_number': 'str',
        'flags': 'str',
        'departure_sequence': 'int'
    }

    attribute_map = {
        'stop_id': 'stop_id',
        'route_id': 'route_id',
        'run_id': 'run_id',
        'run_ref': 'run_ref',
        'direction_id': 'direction_id',
        'disruption_ids': 'disruption_ids',
        'scheduled_departure_utc': 'scheduled_departure_utc',
        'estimated_departure_utc': 'estimated_departure_utc',
        'at_platform': 'at_platform',
        'platform_number': 'platform_number',
        'flags': 'flags',
        'departure_sequence': 'departure_sequence'
    }

    def __init__(self, stop_id=None, route_id=None, run_id=None, run_ref=None, direction_id=None, disruption_ids=None, scheduled_departure_utc=None, estimated_departure_utc=None, at_platform=None, platform_number=None, flags=None, departure_sequence=None, _configuration=None):  # noqa: E501
        """V3Departure - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._stop_id = None
        self._route_id = None
        self._run_id = None
        self._run_ref = None
        self._direction_id = None
        self._disruption_ids = None
        self._scheduled_departure_utc = None
        self._estimated_departure_utc = None
        self._at_platform = None
        self._platform_number = None
        self._flags = None
        self._departure_sequence = None
        self.discriminator = None

        if stop_id is not None:
            self.stop_id = stop_id
        if route_id is not None:
            self.route_id = route_id
        if run_id is not None:
            self.run_id = run_id
        if run_ref is not None:
            self.run_ref = run_ref
        if direction_id is not None:
            self.direction_id = direction_id
        if disruption_ids is not None:
            self.disruption_ids = disruption_ids
        if scheduled_departure_utc is not None:
            self.scheduled_departure_utc = scheduled_departure_utc
        if estimated_departure_utc is not None:
            self.estimated_departure_utc = estimated_departure_utc
        if at_platform is not None:
            self.at_platform = at_platform
        if platform_number is not None:
            self.platform_number = platform_number
        if flags is not None:
            self.flags = flags
        if departure_sequence is not None:
            self.departure_sequence = departure_sequence

    @property
    def stop_id(self):
        """Gets the stop_id of this V3Departure.  # noqa: E501

        Stop identifier  # noqa: E501

        :return: The stop_id of this V3Departure.  # noqa: E501
        :rtype: int
        """
        return self._stop_id

    @stop_id.setter
    def stop_id(self, stop_id):
        """Sets the stop_id of this V3Departure.

        Stop identifier  # noqa: E501

        :param stop_id: The stop_id of this V3Departure.  # noqa: E501
        :type: int
        """

        self._stop_id = stop_id

    @property
    def route_id(self):
        """Gets the route_id of this V3Departure.  # noqa: E501

        Route identifier  # noqa: E501

        :return: The route_id of this V3Departure.  # noqa: E501
        :rtype: int
        """
        return self._route_id

    @route_id.setter
    def route_id(self, route_id):
        """Sets the route_id of this V3Departure.

        Route identifier  # noqa: E501

        :param route_id: The route_id of this V3Departure.  # noqa: E501
        :type: int
        """

        self._route_id = route_id

    @property
    def run_id(self):
        """Gets the run_id of this V3Departure.  # noqa: E501

        Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric  # noqa: E501

        :return: The run_id of this V3Departure.  # noqa: E501
        :rtype: int
        """
        return self._run_id

    @run_id.setter
    def run_id(self, run_id):
        """Sets the run_id of this V3Departure.

        Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric  # noqa: E501

        :param run_id: The run_id of this V3Departure.  # noqa: E501
        :type: int
        """

        self._run_id = run_id

    @property
    def run_ref(self):
        """Gets the run_ref of this V3Departure.  # noqa: E501

        Alphanumeric trip/service run identifier  # noqa: E501

        :return: The run_ref of this V3Departure.  # noqa: E501
        :rtype: str
        """
        return self._run_ref

    @run_ref.setter
    def run_ref(self, run_ref):
        """Sets the run_ref of this V3Departure.

        Alphanumeric trip/service run identifier  # noqa: E501

        :param run_ref: The run_ref of this V3Departure.  # noqa: E501
        :type: str
        """

        self._run_ref = run_ref

    @property
    def direction_id(self):
        """Gets the direction_id of this V3Departure.  # noqa: E501

        Direction of travel identifier  # noqa: E501

        :return: The direction_id of this V3Departure.  # noqa: E501
        :rtype: int
        """
        return self._direction_id

    @direction_id.setter
    def direction_id(self, direction_id):
        """Sets the direction_id of this V3Departure.

        Direction of travel identifier  # noqa: E501

        :param direction_id: The direction_id of this V3Departure.  # noqa: E501
        :type: int
        """

        self._direction_id = direction_id

    @property
    def disruption_ids(self):
        """Gets the disruption_ids of this V3Departure.  # noqa: E501

        Disruption information identifier(s)  # noqa: E501

        :return: The disruption_ids of this V3Departure.  # noqa: E501
        :rtype: list[int]
        """
        return self._disruption_ids

    @disruption_ids.setter
    def disruption_ids(self, disruption_ids):
        """Sets the disruption_ids of this V3Departure.

        Disruption information identifier(s)  # noqa: E501

        :param disruption_ids: The disruption_ids of this V3Departure.  # noqa: E501
        :type: list[int]
        """

        self._disruption_ids = disruption_ids

    @property
    def scheduled_departure_utc(self):
        """Gets the scheduled_departure_utc of this V3Departure.  # noqa: E501

        Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format  # noqa: E501

        :return: The scheduled_departure_utc of this V3Departure.  # noqa: E501
        :rtype: datetime
        """
        return self._scheduled_departure_utc

    @scheduled_departure_utc.setter
    def scheduled_departure_utc(self, scheduled_departure_utc):
        """Sets the scheduled_departure_utc of this V3Departure.

        Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format  # noqa: E501

        :param scheduled_departure_utc: The scheduled_departure_utc of this V3Departure.  # noqa: E501
        :type: datetime
        """

        self._scheduled_departure_utc = scheduled_departure_utc

    @property
    def estimated_departure_utc(self):
        """Gets the estimated_departure_utc of this V3Departure.  # noqa: E501

        Real-time estimate of departure time and date in ISO 8601 UTC format  # noqa: E501

        :return: The estimated_departure_utc of this V3Departure.  # noqa: E501
        :rtype: datetime
        """
        return self._estimated_departure_utc

    @estimated_departure_utc.setter
    def estimated_departure_utc(self, estimated_departure_utc):
        """Sets the estimated_departure_utc of this V3Departure.

        Real-time estimate of departure time and date in ISO 8601 UTC format  # noqa: E501

        :param estimated_departure_utc: The estimated_departure_utc of this V3Departure.  # noqa: E501
        :type: datetime
        """

        self._estimated_departure_utc = estimated_departure_utc

    @property
    def at_platform(self):
        """Gets the at_platform of this V3Departure.  # noqa: E501

        Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes  # noqa: E501

        :return: The at_platform of this V3Departure.  # noqa: E501
        :rtype: bool
        """
        return self._at_platform

    @at_platform.setter
    def at_platform(self, at_platform):
        """Sets the at_platform of this V3Departure.

        Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes  # noqa: E501

        :param at_platform: The at_platform of this V3Departure.  # noqa: E501
        :type: bool
        """

        self._at_platform = at_platform

    @property
    def platform_number(self):
        """Gets the platform_number of this V3Departure.  # noqa: E501

        Platform number at stop (metropolitan train only; returns null for other modes)  # noqa: E501

        :return: The platform_number of this V3Departure.  # noqa: E501
        :rtype: str
        """
        return self._platform_number

    @platform_number.setter
    def platform_number(self, platform_number):
        """Sets the platform_number of this V3Departure.

        Platform number at stop (metropolitan train only; returns null for other modes)  # noqa: E501

        :param platform_number: The platform_number of this V3Departure.  # noqa: E501
        :type: str
        """

        self._platform_number = platform_number

    @property
    def flags(self):
        """Gets the flags of this V3Departure.  # noqa: E501

        Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag)  # noqa: E501

        :return: The flags of this V3Departure.  # noqa: E501
        :rtype: str
        """
        return self._flags

    @flags.setter
    def flags(self, flags):
        """Sets the flags of this V3Departure.

        Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag)  # noqa: E501

        :param flags: The flags of this V3Departure.  # noqa: E501
        :type: str
        """

        self._flags = flags

    @property
    def departure_sequence(self):
        """Gets the departure_sequence of this V3Departure.  # noqa: E501

        Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4  # noqa: E501

        :return: The departure_sequence of this V3Departure.  # noqa: E501
        :rtype: int
        """
        return self._departure_sequence

    @departure_sequence.setter
    def departure_sequence(self, departure_sequence):
        """Sets the departure_sequence of this V3Departure.

        Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4  # noqa: E501

        :param departure_sequence: The departure_sequence of this V3Departure.  # noqa: E501
        :type: int
        """

        self._departure_sequence = departure_sequence

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
        if issubclass(V3Departure, dict):
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
        if not isinstance(other, V3Departure):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, V3Departure):
            return True

        return self.to_dict() != other.to_dict()
