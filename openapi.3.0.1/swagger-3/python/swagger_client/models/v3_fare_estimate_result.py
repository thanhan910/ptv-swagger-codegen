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

class V3FareEstimateResult(object):
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
        'is_early_bird': 'bool',
        'is_journey_in_free_tram_zone': 'bool',
        'is_this_weekend_journey': 'bool',
        'zone_info': 'V3ZoneInfo',
        'passenger_fares': 'list[V3PassengerFare]'
    }

    attribute_map = {
        'is_early_bird': 'IsEarlyBird',
        'is_journey_in_free_tram_zone': 'IsJourneyInFreeTramZone',
        'is_this_weekend_journey': 'IsThisWeekendJourney',
        'zone_info': 'ZoneInfo',
        'passenger_fares': 'PassengerFares'
    }

    def __init__(self, is_early_bird=None, is_journey_in_free_tram_zone=None, is_this_weekend_journey=None, zone_info=None, passenger_fares=None):  # noqa: E501
        """V3FareEstimateResult - a model defined in Swagger"""  # noqa: E501
        self._is_early_bird = None
        self._is_journey_in_free_tram_zone = None
        self._is_this_weekend_journey = None
        self._zone_info = None
        self._passenger_fares = None
        self.discriminator = None
        if is_early_bird is not None:
            self.is_early_bird = is_early_bird
        if is_journey_in_free_tram_zone is not None:
            self.is_journey_in_free_tram_zone = is_journey_in_free_tram_zone
        if is_this_weekend_journey is not None:
            self.is_this_weekend_journey = is_this_weekend_journey
        if zone_info is not None:
            self.zone_info = zone_info
        if passenger_fares is not None:
            self.passenger_fares = passenger_fares

    @property
    def is_early_bird(self):
        """Gets the is_early_bird of this V3FareEstimateResult.  # noqa: E501


        :return: The is_early_bird of this V3FareEstimateResult.  # noqa: E501
        :rtype: bool
        """
        return self._is_early_bird

    @is_early_bird.setter
    def is_early_bird(self, is_early_bird):
        """Sets the is_early_bird of this V3FareEstimateResult.


        :param is_early_bird: The is_early_bird of this V3FareEstimateResult.  # noqa: E501
        :type: bool
        """

        self._is_early_bird = is_early_bird

    @property
    def is_journey_in_free_tram_zone(self):
        """Gets the is_journey_in_free_tram_zone of this V3FareEstimateResult.  # noqa: E501


        :return: The is_journey_in_free_tram_zone of this V3FareEstimateResult.  # noqa: E501
        :rtype: bool
        """
        return self._is_journey_in_free_tram_zone

    @is_journey_in_free_tram_zone.setter
    def is_journey_in_free_tram_zone(self, is_journey_in_free_tram_zone):
        """Sets the is_journey_in_free_tram_zone of this V3FareEstimateResult.


        :param is_journey_in_free_tram_zone: The is_journey_in_free_tram_zone of this V3FareEstimateResult.  # noqa: E501
        :type: bool
        """

        self._is_journey_in_free_tram_zone = is_journey_in_free_tram_zone

    @property
    def is_this_weekend_journey(self):
        """Gets the is_this_weekend_journey of this V3FareEstimateResult.  # noqa: E501


        :return: The is_this_weekend_journey of this V3FareEstimateResult.  # noqa: E501
        :rtype: bool
        """
        return self._is_this_weekend_journey

    @is_this_weekend_journey.setter
    def is_this_weekend_journey(self, is_this_weekend_journey):
        """Sets the is_this_weekend_journey of this V3FareEstimateResult.


        :param is_this_weekend_journey: The is_this_weekend_journey of this V3FareEstimateResult.  # noqa: E501
        :type: bool
        """

        self._is_this_weekend_journey = is_this_weekend_journey

    @property
    def zone_info(self):
        """Gets the zone_info of this V3FareEstimateResult.  # noqa: E501


        :return: The zone_info of this V3FareEstimateResult.  # noqa: E501
        :rtype: V3ZoneInfo
        """
        return self._zone_info

    @zone_info.setter
    def zone_info(self, zone_info):
        """Sets the zone_info of this V3FareEstimateResult.


        :param zone_info: The zone_info of this V3FareEstimateResult.  # noqa: E501
        :type: V3ZoneInfo
        """

        self._zone_info = zone_info

    @property
    def passenger_fares(self):
        """Gets the passenger_fares of this V3FareEstimateResult.  # noqa: E501


        :return: The passenger_fares of this V3FareEstimateResult.  # noqa: E501
        :rtype: list[V3PassengerFare]
        """
        return self._passenger_fares

    @passenger_fares.setter
    def passenger_fares(self, passenger_fares):
        """Sets the passenger_fares of this V3FareEstimateResult.


        :param passenger_fares: The passenger_fares of this V3FareEstimateResult.  # noqa: E501
        :type: list[V3PassengerFare]
        """

        self._passenger_fares = passenger_fares

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
        if issubclass(V3FareEstimateResult, dict):
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
        if not isinstance(other, V3FareEstimateResult):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
