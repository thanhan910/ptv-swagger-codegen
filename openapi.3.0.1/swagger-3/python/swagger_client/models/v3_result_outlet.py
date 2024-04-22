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

class V3ResultOutlet(object):
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
        'outlet_distance': 'float',
        'outlet_slid_spid': 'str',
        'outlet_name': 'str',
        'outlet_business': 'str',
        'outlet_latitude': 'float',
        'outlet_longitude': 'float',
        'outlet_suburb': 'str',
        'outlet_postcode': 'int',
        'outlet_business_hour_mon': 'str',
        'outlet_business_hour_tue': 'str',
        'outlet_business_hour_wed': 'str',
        'outlet_business_hour_thur': 'str',
        'outlet_business_hour_fri': 'str',
        'outlet_business_hour_sat': 'str',
        'outlet_business_hour_sun': 'str',
        'outlet_notes': 'str'
    }

    attribute_map = {
        'outlet_distance': 'outlet_distance',
        'outlet_slid_spid': 'outlet_slid_spid',
        'outlet_name': 'outlet_name',
        'outlet_business': 'outlet_business',
        'outlet_latitude': 'outlet_latitude',
        'outlet_longitude': 'outlet_longitude',
        'outlet_suburb': 'outlet_suburb',
        'outlet_postcode': 'outlet_postcode',
        'outlet_business_hour_mon': 'outlet_business_hour_mon',
        'outlet_business_hour_tue': 'outlet_business_hour_tue',
        'outlet_business_hour_wed': 'outlet_business_hour_wed',
        'outlet_business_hour_thur': 'outlet_business_hour_thur',
        'outlet_business_hour_fri': 'outlet_business_hour_fri',
        'outlet_business_hour_sat': 'outlet_business_hour_sat',
        'outlet_business_hour_sun': 'outlet_business_hour_sun',
        'outlet_notes': 'outlet_notes'
    }

    def __init__(self, outlet_distance=None, outlet_slid_spid=None, outlet_name=None, outlet_business=None, outlet_latitude=None, outlet_longitude=None, outlet_suburb=None, outlet_postcode=None, outlet_business_hour_mon=None, outlet_business_hour_tue=None, outlet_business_hour_wed=None, outlet_business_hour_thur=None, outlet_business_hour_fri=None, outlet_business_hour_sat=None, outlet_business_hour_sun=None, outlet_notes=None):  # noqa: E501
        """V3ResultOutlet - a model defined in Swagger"""  # noqa: E501
        self._outlet_distance = None
        self._outlet_slid_spid = None
        self._outlet_name = None
        self._outlet_business = None
        self._outlet_latitude = None
        self._outlet_longitude = None
        self._outlet_suburb = None
        self._outlet_postcode = None
        self._outlet_business_hour_mon = None
        self._outlet_business_hour_tue = None
        self._outlet_business_hour_wed = None
        self._outlet_business_hour_thur = None
        self._outlet_business_hour_fri = None
        self._outlet_business_hour_sat = None
        self._outlet_business_hour_sun = None
        self._outlet_notes = None
        self.discriminator = None
        if outlet_distance is not None:
            self.outlet_distance = outlet_distance
        if outlet_slid_spid is not None:
            self.outlet_slid_spid = outlet_slid_spid
        if outlet_name is not None:
            self.outlet_name = outlet_name
        if outlet_business is not None:
            self.outlet_business = outlet_business
        if outlet_latitude is not None:
            self.outlet_latitude = outlet_latitude
        if outlet_longitude is not None:
            self.outlet_longitude = outlet_longitude
        if outlet_suburb is not None:
            self.outlet_suburb = outlet_suburb
        if outlet_postcode is not None:
            self.outlet_postcode = outlet_postcode
        if outlet_business_hour_mon is not None:
            self.outlet_business_hour_mon = outlet_business_hour_mon
        if outlet_business_hour_tue is not None:
            self.outlet_business_hour_tue = outlet_business_hour_tue
        if outlet_business_hour_wed is not None:
            self.outlet_business_hour_wed = outlet_business_hour_wed
        if outlet_business_hour_thur is not None:
            self.outlet_business_hour_thur = outlet_business_hour_thur
        if outlet_business_hour_fri is not None:
            self.outlet_business_hour_fri = outlet_business_hour_fri
        if outlet_business_hour_sat is not None:
            self.outlet_business_hour_sat = outlet_business_hour_sat
        if outlet_business_hour_sun is not None:
            self.outlet_business_hour_sun = outlet_business_hour_sun
        if outlet_notes is not None:
            self.outlet_notes = outlet_notes

    @property
    def outlet_distance(self):
        """Gets the outlet_distance of this V3ResultOutlet.  # noqa: E501

        Distance of outlet from input location (in metres); returns 0 if no location is input  # noqa: E501

        :return: The outlet_distance of this V3ResultOutlet.  # noqa: E501
        :rtype: float
        """
        return self._outlet_distance

    @outlet_distance.setter
    def outlet_distance(self, outlet_distance):
        """Sets the outlet_distance of this V3ResultOutlet.

        Distance of outlet from input location (in metres); returns 0 if no location is input  # noqa: E501

        :param outlet_distance: The outlet_distance of this V3ResultOutlet.  # noqa: E501
        :type: float
        """

        self._outlet_distance = outlet_distance

    @property
    def outlet_slid_spid(self):
        """Gets the outlet_slid_spid of this V3ResultOutlet.  # noqa: E501

        The SLID / SPID  # noqa: E501

        :return: The outlet_slid_spid of this V3ResultOutlet.  # noqa: E501
        :rtype: str
        """
        return self._outlet_slid_spid

    @outlet_slid_spid.setter
    def outlet_slid_spid(self, outlet_slid_spid):
        """Sets the outlet_slid_spid of this V3ResultOutlet.

        The SLID / SPID  # noqa: E501

        :param outlet_slid_spid: The outlet_slid_spid of this V3ResultOutlet.  # noqa: E501
        :type: str
        """

        self._outlet_slid_spid = outlet_slid_spid

    @property
    def outlet_name(self):
        """Gets the outlet_name of this V3ResultOutlet.  # noqa: E501

        The location name of the outlet  # noqa: E501

        :return: The outlet_name of this V3ResultOutlet.  # noqa: E501
        :rtype: str
        """
        return self._outlet_name

    @outlet_name.setter
    def outlet_name(self, outlet_name):
        """Sets the outlet_name of this V3ResultOutlet.

        The location name of the outlet  # noqa: E501

        :param outlet_name: The outlet_name of this V3ResultOutlet.  # noqa: E501
        :type: str
        """

        self._outlet_name = outlet_name

    @property
    def outlet_business(self):
        """Gets the outlet_business of this V3ResultOutlet.  # noqa: E501

        The business name of the outlet  # noqa: E501

        :return: The outlet_business of this V3ResultOutlet.  # noqa: E501
        :rtype: str
        """
        return self._outlet_business

    @outlet_business.setter
    def outlet_business(self, outlet_business):
        """Sets the outlet_business of this V3ResultOutlet.

        The business name of the outlet  # noqa: E501

        :param outlet_business: The outlet_business of this V3ResultOutlet.  # noqa: E501
        :type: str
        """

        self._outlet_business = outlet_business

    @property
    def outlet_latitude(self):
        """Gets the outlet_latitude of this V3ResultOutlet.  # noqa: E501

        Geographic coordinate of latitude at outlet  # noqa: E501

        :return: The outlet_latitude of this V3ResultOutlet.  # noqa: E501
        :rtype: float
        """
        return self._outlet_latitude

    @outlet_latitude.setter
    def outlet_latitude(self, outlet_latitude):
        """Sets the outlet_latitude of this V3ResultOutlet.

        Geographic coordinate of latitude at outlet  # noqa: E501

        :param outlet_latitude: The outlet_latitude of this V3ResultOutlet.  # noqa: E501
        :type: float
        """

        self._outlet_latitude = outlet_latitude

    @property
    def outlet_longitude(self):
        """Gets the outlet_longitude of this V3ResultOutlet.  # noqa: E501

        Geographic coordinate of longitude at outlet  # noqa: E501

        :return: The outlet_longitude of this V3ResultOutlet.  # noqa: E501
        :rtype: float
        """
        return self._outlet_longitude

    @outlet_longitude.setter
    def outlet_longitude(self, outlet_longitude):
        """Sets the outlet_longitude of this V3ResultOutlet.

        Geographic coordinate of longitude at outlet  # noqa: E501

        :param outlet_longitude: The outlet_longitude of this V3ResultOutlet.  # noqa: E501
        :type: float
        """

        self._outlet_longitude = outlet_longitude

    @property
    def outlet_suburb(self):
        """Gets the outlet_suburb of this V3ResultOutlet.  # noqa: E501

        The city/municipality the outlet is in  # noqa: E501

        :return: The outlet_suburb of this V3ResultOutlet.  # noqa: E501
        :rtype: str
        """
        return self._outlet_suburb

    @outlet_suburb.setter
    def outlet_suburb(self, outlet_suburb):
        """Sets the outlet_suburb of this V3ResultOutlet.

        The city/municipality the outlet is in  # noqa: E501

        :param outlet_suburb: The outlet_suburb of this V3ResultOutlet.  # noqa: E501
        :type: str
        """

        self._outlet_suburb = outlet_suburb

    @property
    def outlet_postcode(self):
        """Gets the outlet_postcode of this V3ResultOutlet.  # noqa: E501

        The postcode for the outlet  # noqa: E501

        :return: The outlet_postcode of this V3ResultOutlet.  # noqa: E501
        :rtype: int
        """
        return self._outlet_postcode

    @outlet_postcode.setter
    def outlet_postcode(self, outlet_postcode):
        """Sets the outlet_postcode of this V3ResultOutlet.

        The postcode for the outlet  # noqa: E501

        :param outlet_postcode: The outlet_postcode of this V3ResultOutlet.  # noqa: E501
        :type: int
        """

        self._outlet_postcode = outlet_postcode

    @property
    def outlet_business_hour_mon(self):
        """Gets the outlet_business_hour_mon of this V3ResultOutlet.  # noqa: E501

        The business hours on Monday  # noqa: E501

        :return: The outlet_business_hour_mon of this V3ResultOutlet.  # noqa: E501
        :rtype: str
        """
        return self._outlet_business_hour_mon

    @outlet_business_hour_mon.setter
    def outlet_business_hour_mon(self, outlet_business_hour_mon):
        """Sets the outlet_business_hour_mon of this V3ResultOutlet.

        The business hours on Monday  # noqa: E501

        :param outlet_business_hour_mon: The outlet_business_hour_mon of this V3ResultOutlet.  # noqa: E501
        :type: str
        """

        self._outlet_business_hour_mon = outlet_business_hour_mon

    @property
    def outlet_business_hour_tue(self):
        """Gets the outlet_business_hour_tue of this V3ResultOutlet.  # noqa: E501

        The business hours on Tuesday  # noqa: E501

        :return: The outlet_business_hour_tue of this V3ResultOutlet.  # noqa: E501
        :rtype: str
        """
        return self._outlet_business_hour_tue

    @outlet_business_hour_tue.setter
    def outlet_business_hour_tue(self, outlet_business_hour_tue):
        """Sets the outlet_business_hour_tue of this V3ResultOutlet.

        The business hours on Tuesday  # noqa: E501

        :param outlet_business_hour_tue: The outlet_business_hour_tue of this V3ResultOutlet.  # noqa: E501
        :type: str
        """

        self._outlet_business_hour_tue = outlet_business_hour_tue

    @property
    def outlet_business_hour_wed(self):
        """Gets the outlet_business_hour_wed of this V3ResultOutlet.  # noqa: E501

        The business hours on Wednesday  # noqa: E501

        :return: The outlet_business_hour_wed of this V3ResultOutlet.  # noqa: E501
        :rtype: str
        """
        return self._outlet_business_hour_wed

    @outlet_business_hour_wed.setter
    def outlet_business_hour_wed(self, outlet_business_hour_wed):
        """Sets the outlet_business_hour_wed of this V3ResultOutlet.

        The business hours on Wednesday  # noqa: E501

        :param outlet_business_hour_wed: The outlet_business_hour_wed of this V3ResultOutlet.  # noqa: E501
        :type: str
        """

        self._outlet_business_hour_wed = outlet_business_hour_wed

    @property
    def outlet_business_hour_thur(self):
        """Gets the outlet_business_hour_thur of this V3ResultOutlet.  # noqa: E501

        The business hours on Thursday  # noqa: E501

        :return: The outlet_business_hour_thur of this V3ResultOutlet.  # noqa: E501
        :rtype: str
        """
        return self._outlet_business_hour_thur

    @outlet_business_hour_thur.setter
    def outlet_business_hour_thur(self, outlet_business_hour_thur):
        """Sets the outlet_business_hour_thur of this V3ResultOutlet.

        The business hours on Thursday  # noqa: E501

        :param outlet_business_hour_thur: The outlet_business_hour_thur of this V3ResultOutlet.  # noqa: E501
        :type: str
        """

        self._outlet_business_hour_thur = outlet_business_hour_thur

    @property
    def outlet_business_hour_fri(self):
        """Gets the outlet_business_hour_fri of this V3ResultOutlet.  # noqa: E501

        The business hours on Friday  # noqa: E501

        :return: The outlet_business_hour_fri of this V3ResultOutlet.  # noqa: E501
        :rtype: str
        """
        return self._outlet_business_hour_fri

    @outlet_business_hour_fri.setter
    def outlet_business_hour_fri(self, outlet_business_hour_fri):
        """Sets the outlet_business_hour_fri of this V3ResultOutlet.

        The business hours on Friday  # noqa: E501

        :param outlet_business_hour_fri: The outlet_business_hour_fri of this V3ResultOutlet.  # noqa: E501
        :type: str
        """

        self._outlet_business_hour_fri = outlet_business_hour_fri

    @property
    def outlet_business_hour_sat(self):
        """Gets the outlet_business_hour_sat of this V3ResultOutlet.  # noqa: E501

        The business hours on Saturday  # noqa: E501

        :return: The outlet_business_hour_sat of this V3ResultOutlet.  # noqa: E501
        :rtype: str
        """
        return self._outlet_business_hour_sat

    @outlet_business_hour_sat.setter
    def outlet_business_hour_sat(self, outlet_business_hour_sat):
        """Sets the outlet_business_hour_sat of this V3ResultOutlet.

        The business hours on Saturday  # noqa: E501

        :param outlet_business_hour_sat: The outlet_business_hour_sat of this V3ResultOutlet.  # noqa: E501
        :type: str
        """

        self._outlet_business_hour_sat = outlet_business_hour_sat

    @property
    def outlet_business_hour_sun(self):
        """Gets the outlet_business_hour_sun of this V3ResultOutlet.  # noqa: E501

        The business hours on Sunday  # noqa: E501

        :return: The outlet_business_hour_sun of this V3ResultOutlet.  # noqa: E501
        :rtype: str
        """
        return self._outlet_business_hour_sun

    @outlet_business_hour_sun.setter
    def outlet_business_hour_sun(self, outlet_business_hour_sun):
        """Sets the outlet_business_hour_sun of this V3ResultOutlet.

        The business hours on Sunday  # noqa: E501

        :param outlet_business_hour_sun: The outlet_business_hour_sun of this V3ResultOutlet.  # noqa: E501
        :type: str
        """

        self._outlet_business_hour_sun = outlet_business_hour_sun

    @property
    def outlet_notes(self):
        """Gets the outlet_notes of this V3ResultOutlet.  # noqa: E501

        Any additional notes for the outlet such as 'Buy pre-loaded myki cards only'. May be null/empty.  # noqa: E501

        :return: The outlet_notes of this V3ResultOutlet.  # noqa: E501
        :rtype: str
        """
        return self._outlet_notes

    @outlet_notes.setter
    def outlet_notes(self, outlet_notes):
        """Sets the outlet_notes of this V3ResultOutlet.

        Any additional notes for the outlet such as 'Buy pre-loaded myki cards only'. May be null/empty.  # noqa: E501

        :param outlet_notes: The outlet_notes of this V3ResultOutlet.  # noqa: E501
        :type: str
        """

        self._outlet_notes = outlet_notes

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
        if issubclass(V3ResultOutlet, dict):
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
        if not isinstance(other, V3ResultOutlet):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
