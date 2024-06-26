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


class V3StopAccessibility(object):
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
        'lighting': 'bool',
        'platform_number': 'int',
        'audio_customer_information': 'bool',
        'escalator': 'bool',
        'hearing_loop': 'bool',
        'lift': 'bool',
        'stairs': 'bool',
        'stop_accessible': 'bool',
        'tactile_ground_surface_indicator': 'bool',
        'waiting_room': 'bool',
        'wheelchair': 'V3StopAccessibilityWheelchair'
    }

    attribute_map = {
        'lighting': 'lighting',
        'platform_number': 'platform_number',
        'audio_customer_information': 'audio_customer_information',
        'escalator': 'escalator',
        'hearing_loop': 'hearing_loop',
        'lift': 'lift',
        'stairs': 'stairs',
        'stop_accessible': 'stop_accessible',
        'tactile_ground_surface_indicator': 'tactile_ground_surface_indicator',
        'waiting_room': 'waiting_room',
        'wheelchair': 'wheelchair'
    }

    def __init__(self, lighting=None, platform_number=None, audio_customer_information=None, escalator=None, hearing_loop=None, lift=None, stairs=None, stop_accessible=None, tactile_ground_surface_indicator=None, waiting_room=None, wheelchair=None, _configuration=None):  # noqa: E501
        """V3StopAccessibility - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._lighting = None
        self._platform_number = None
        self._audio_customer_information = None
        self._escalator = None
        self._hearing_loop = None
        self._lift = None
        self._stairs = None
        self._stop_accessible = None
        self._tactile_ground_surface_indicator = None
        self._waiting_room = None
        self._wheelchair = None
        self.discriminator = None

        if lighting is not None:
            self.lighting = lighting
        if platform_number is not None:
            self.platform_number = platform_number
        if audio_customer_information is not None:
            self.audio_customer_information = audio_customer_information
        if escalator is not None:
            self.escalator = escalator
        if hearing_loop is not None:
            self.hearing_loop = hearing_loop
        if lift is not None:
            self.lift = lift
        if stairs is not None:
            self.stairs = stairs
        if stop_accessible is not None:
            self.stop_accessible = stop_accessible
        if tactile_ground_surface_indicator is not None:
            self.tactile_ground_surface_indicator = tactile_ground_surface_indicator
        if waiting_room is not None:
            self.waiting_room = waiting_room
        if wheelchair is not None:
            self.wheelchair = wheelchair

    @property
    def lighting(self):
        """Gets the lighting of this V3StopAccessibility.  # noqa: E501

        Indicates if there is lighting at the stop  # noqa: E501

        :return: The lighting of this V3StopAccessibility.  # noqa: E501
        :rtype: bool
        """
        return self._lighting

    @lighting.setter
    def lighting(self, lighting):
        """Sets the lighting of this V3StopAccessibility.

        Indicates if there is lighting at the stop  # noqa: E501

        :param lighting: The lighting of this V3StopAccessibility.  # noqa: E501
        :type: bool
        """

        self._lighting = lighting

    @property
    def platform_number(self):
        """Gets the platform_number of this V3StopAccessibility.  # noqa: E501

        Indicates the platform number for xivic information (Platform 0 indicates general stop facilities)  # noqa: E501

        :return: The platform_number of this V3StopAccessibility.  # noqa: E501
        :rtype: int
        """
        return self._platform_number

    @platform_number.setter
    def platform_number(self, platform_number):
        """Sets the platform_number of this V3StopAccessibility.

        Indicates the platform number for xivic information (Platform 0 indicates general stop facilities)  # noqa: E501

        :param platform_number: The platform_number of this V3StopAccessibility.  # noqa: E501
        :type: int
        """

        self._platform_number = platform_number

    @property
    def audio_customer_information(self):
        """Gets the audio_customer_information of this V3StopAccessibility.  # noqa: E501

        Indicates if there is at least one audio customer information at the stop/platform  # noqa: E501

        :return: The audio_customer_information of this V3StopAccessibility.  # noqa: E501
        :rtype: bool
        """
        return self._audio_customer_information

    @audio_customer_information.setter
    def audio_customer_information(self, audio_customer_information):
        """Sets the audio_customer_information of this V3StopAccessibility.

        Indicates if there is at least one audio customer information at the stop/platform  # noqa: E501

        :param audio_customer_information: The audio_customer_information of this V3StopAccessibility.  # noqa: E501
        :type: bool
        """

        self._audio_customer_information = audio_customer_information

    @property
    def escalator(self):
        """Gets the escalator of this V3StopAccessibility.  # noqa: E501

        Indicates if there is at least one accessible escalator at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)  # noqa: E501

        :return: The escalator of this V3StopAccessibility.  # noqa: E501
        :rtype: bool
        """
        return self._escalator

    @escalator.setter
    def escalator(self, escalator):
        """Sets the escalator of this V3StopAccessibility.

        Indicates if there is at least one accessible escalator at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)  # noqa: E501

        :param escalator: The escalator of this V3StopAccessibility.  # noqa: E501
        :type: bool
        """

        self._escalator = escalator

    @property
    def hearing_loop(self):
        """Gets the hearing_loop of this V3StopAccessibility.  # noqa: E501

        Indicates if there is a hearing loop facility at the stop/platform  # noqa: E501

        :return: The hearing_loop of this V3StopAccessibility.  # noqa: E501
        :rtype: bool
        """
        return self._hearing_loop

    @hearing_loop.setter
    def hearing_loop(self, hearing_loop):
        """Sets the hearing_loop of this V3StopAccessibility.

        Indicates if there is a hearing loop facility at the stop/platform  # noqa: E501

        :param hearing_loop: The hearing_loop of this V3StopAccessibility.  # noqa: E501
        :type: bool
        """

        self._hearing_loop = hearing_loop

    @property
    def lift(self):
        """Gets the lift of this V3StopAccessibility.  # noqa: E501

        Indicates if there is an elevator at the stop/platform  # noqa: E501

        :return: The lift of this V3StopAccessibility.  # noqa: E501
        :rtype: bool
        """
        return self._lift

    @lift.setter
    def lift(self, lift):
        """Sets the lift of this V3StopAccessibility.

        Indicates if there is an elevator at the stop/platform  # noqa: E501

        :param lift: The lift of this V3StopAccessibility.  # noqa: E501
        :type: bool
        """

        self._lift = lift

    @property
    def stairs(self):
        """Gets the stairs of this V3StopAccessibility.  # noqa: E501

        Indicates if there are stairs available in the stop  # noqa: E501

        :return: The stairs of this V3StopAccessibility.  # noqa: E501
        :rtype: bool
        """
        return self._stairs

    @stairs.setter
    def stairs(self, stairs):
        """Sets the stairs of this V3StopAccessibility.

        Indicates if there are stairs available in the stop  # noqa: E501

        :param stairs: The stairs of this V3StopAccessibility.  # noqa: E501
        :type: bool
        """

        self._stairs = stairs

    @property
    def stop_accessible(self):
        """Gets the stop_accessible of this V3StopAccessibility.  # noqa: E501

        Indicates if the stop is accessible  # noqa: E501

        :return: The stop_accessible of this V3StopAccessibility.  # noqa: E501
        :rtype: bool
        """
        return self._stop_accessible

    @stop_accessible.setter
    def stop_accessible(self, stop_accessible):
        """Sets the stop_accessible of this V3StopAccessibility.

        Indicates if the stop is accessible  # noqa: E501

        :param stop_accessible: The stop_accessible of this V3StopAccessibility.  # noqa: E501
        :type: bool
        """

        self._stop_accessible = stop_accessible

    @property
    def tactile_ground_surface_indicator(self):
        """Gets the tactile_ground_surface_indicator of this V3StopAccessibility.  # noqa: E501

        Indicates if there are tactile tiles (also known as tactile ground surface indicators, or TGSIs) at the stop  # noqa: E501

        :return: The tactile_ground_surface_indicator of this V3StopAccessibility.  # noqa: E501
        :rtype: bool
        """
        return self._tactile_ground_surface_indicator

    @tactile_ground_surface_indicator.setter
    def tactile_ground_surface_indicator(self, tactile_ground_surface_indicator):
        """Sets the tactile_ground_surface_indicator of this V3StopAccessibility.

        Indicates if there are tactile tiles (also known as tactile ground surface indicators, or TGSIs) at the stop  # noqa: E501

        :param tactile_ground_surface_indicator: The tactile_ground_surface_indicator of this V3StopAccessibility.  # noqa: E501
        :type: bool
        """

        self._tactile_ground_surface_indicator = tactile_ground_surface_indicator

    @property
    def waiting_room(self):
        """Gets the waiting_room of this V3StopAccessibility.  # noqa: E501

        Indicates if there is a general waiting area at the stop  # noqa: E501

        :return: The waiting_room of this V3StopAccessibility.  # noqa: E501
        :rtype: bool
        """
        return self._waiting_room

    @waiting_room.setter
    def waiting_room(self, waiting_room):
        """Sets the waiting_room of this V3StopAccessibility.

        Indicates if there is a general waiting area at the stop  # noqa: E501

        :param waiting_room: The waiting_room of this V3StopAccessibility.  # noqa: E501
        :type: bool
        """

        self._waiting_room = waiting_room

    @property
    def wheelchair(self):
        """Gets the wheelchair of this V3StopAccessibility.  # noqa: E501

        Facilities relating to the accessibility of the stop by wheelchair  # noqa: E501

        :return: The wheelchair of this V3StopAccessibility.  # noqa: E501
        :rtype: V3StopAccessibilityWheelchair
        """
        return self._wheelchair

    @wheelchair.setter
    def wheelchair(self, wheelchair):
        """Sets the wheelchair of this V3StopAccessibility.

        Facilities relating to the accessibility of the stop by wheelchair  # noqa: E501

        :param wheelchair: The wheelchair of this V3StopAccessibility.  # noqa: E501
        :type: V3StopAccessibilityWheelchair
        """

        self._wheelchair = wheelchair

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
        if issubclass(V3StopAccessibility, dict):
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
        if not isinstance(other, V3StopAccessibility):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, V3StopAccessibility):
            return True

        return self.to_dict() != other.to_dict()
