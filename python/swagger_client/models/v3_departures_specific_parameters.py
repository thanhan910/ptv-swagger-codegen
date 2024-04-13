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

class V3DeparturesSpecificParameters(object):
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
        'direction_id': 'int',
        'gtfs': 'bool',
        'date_utc': 'datetime',
        'max_results': 'int',
        'include_cancelled': 'bool',
        'look_backwards': 'bool',
        'expand': 'list[str]',
        'include_geopath': 'bool'
    }

    attribute_map = {
        'direction_id': 'direction_id',
        'gtfs': 'gtfs',
        'date_utc': 'date_utc',
        'max_results': 'max_results',
        'include_cancelled': 'include_cancelled',
        'look_backwards': 'look_backwards',
        'expand': 'expand',
        'include_geopath': 'include_geopath'
    }

    def __init__(self, direction_id=None, gtfs=None, date_utc=None, max_results=None, include_cancelled=None, look_backwards=None, expand=None, include_geopath=None):  # noqa: E501
        """V3DeparturesSpecificParameters - a model defined in Swagger"""  # noqa: E501
        self._direction_id = None
        self._gtfs = None
        self._date_utc = None
        self._max_results = None
        self._include_cancelled = None
        self._look_backwards = None
        self._expand = None
        self._include_geopath = None
        self.discriminator = None
        if direction_id is not None:
            self.direction_id = direction_id
        if gtfs is not None:
            self.gtfs = gtfs
        if date_utc is not None:
            self.date_utc = date_utc
        if max_results is not None:
            self.max_results = max_results
        if include_cancelled is not None:
            self.include_cancelled = include_cancelled
        if look_backwards is not None:
            self.look_backwards = look_backwards
        if expand is not None:
            self.expand = expand
        if include_geopath is not None:
            self.include_geopath = include_geopath

    @property
    def direction_id(self):
        """Gets the direction_id of this V3DeparturesSpecificParameters.  # noqa: E501

        Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}  # noqa: E501

        :return: The direction_id of this V3DeparturesSpecificParameters.  # noqa: E501
        :rtype: int
        """
        return self._direction_id

    @direction_id.setter
    def direction_id(self, direction_id):
        """Sets the direction_id of this V3DeparturesSpecificParameters.

        Filter by identifier of direction of travel; values returned by Directions API - /v3/directions/route/{route_id}  # noqa: E501

        :param direction_id: The direction_id of this V3DeparturesSpecificParameters.  # noqa: E501
        :type: int
        """

        self._direction_id = direction_id

    @property
    def gtfs(self):
        """Gets the gtfs of this V3DeparturesSpecificParameters.  # noqa: E501

        Indicates that stop_id parameter will accept \"GTFS stop_id\" data  # noqa: E501

        :return: The gtfs of this V3DeparturesSpecificParameters.  # noqa: E501
        :rtype: bool
        """
        return self._gtfs

    @gtfs.setter
    def gtfs(self, gtfs):
        """Sets the gtfs of this V3DeparturesSpecificParameters.

        Indicates that stop_id parameter will accept \"GTFS stop_id\" data  # noqa: E501

        :param gtfs: The gtfs of this V3DeparturesSpecificParameters.  # noqa: E501
        :type: bool
        """

        self._gtfs = gtfs

    @property
    def date_utc(self):
        """Gets the date_utc of this V3DeparturesSpecificParameters.  # noqa: E501

        Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)  # noqa: E501

        :return: The date_utc of this V3DeparturesSpecificParameters.  # noqa: E501
        :rtype: datetime
        """
        return self._date_utc

    @date_utc.setter
    def date_utc(self, date_utc):
        """Sets the date_utc of this V3DeparturesSpecificParameters.

        Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)  # noqa: E501

        :param date_utc: The date_utc of this V3DeparturesSpecificParameters.  # noqa: E501
        :type: datetime
        """

        self._date_utc = date_utc

    @property
    def max_results(self):
        """Gets the max_results of this V3DeparturesSpecificParameters.  # noqa: E501

        Maximum number of results returned  # noqa: E501

        :return: The max_results of this V3DeparturesSpecificParameters.  # noqa: E501
        :rtype: int
        """
        return self._max_results

    @max_results.setter
    def max_results(self, max_results):
        """Sets the max_results of this V3DeparturesSpecificParameters.

        Maximum number of results returned  # noqa: E501

        :param max_results: The max_results of this V3DeparturesSpecificParameters.  # noqa: E501
        :type: int
        """

        self._max_results = max_results

    @property
    def include_cancelled(self):
        """Gets the include_cancelled of this V3DeparturesSpecificParameters.  # noqa: E501

        Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only  # noqa: E501

        :return: The include_cancelled of this V3DeparturesSpecificParameters.  # noqa: E501
        :rtype: bool
        """
        return self._include_cancelled

    @include_cancelled.setter
    def include_cancelled(self, include_cancelled):
        """Sets the include_cancelled of this V3DeparturesSpecificParameters.

        Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only  # noqa: E501

        :param include_cancelled: The include_cancelled of this V3DeparturesSpecificParameters.  # noqa: E501
        :type: bool
        """

        self._include_cancelled = include_cancelled

    @property
    def look_backwards(self):
        """Gets the look_backwards of this V3DeparturesSpecificParameters.  # noqa: E501

        Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.  # noqa: E501

        :return: The look_backwards of this V3DeparturesSpecificParameters.  # noqa: E501
        :rtype: bool
        """
        return self._look_backwards

    @look_backwards.setter
    def look_backwards(self, look_backwards):
        """Sets the look_backwards of this V3DeparturesSpecificParameters.

        Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.  # noqa: E501

        :param look_backwards: The look_backwards of this V3DeparturesSpecificParameters.  # noqa: E501
        :type: bool
        """

        self._look_backwards = look_backwards

    @property
    def expand(self):
        """Gets the expand of this V3DeparturesSpecificParameters.  # noqa: E501

        List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.  # noqa: E501

        :return: The expand of this V3DeparturesSpecificParameters.  # noqa: E501
        :rtype: list[str]
        """
        return self._expand

    @expand.setter
    def expand(self, expand):
        """Sets the expand of this V3DeparturesSpecificParameters.

        List of objects to be returned in full (i.e. expanded) - options include: All, Stop, Route, Run, Direction, Disruption, VehiclePosition, VehicleDescriptor or None.  Run must be expanded to receive VehiclePosition and VehicleDescriptor information.  # noqa: E501

        :param expand: The expand of this V3DeparturesSpecificParameters.  # noqa: E501
        :type: list[str]
        """
        allowed_values = ["All", "Stop", "Route", "Run", "Direction", "Disruption", "VehicleDescriptor", "VehiclePosition", "None"]  # noqa: E501
        if not set(expand).issubset(set(allowed_values)):
            raise ValueError(
                "Invalid values for `expand` [{0}], must be a subset of [{1}]"  # noqa: E501
                .format(", ".join(map(str, set(expand) - set(allowed_values))),  # noqa: E501
                        ", ".join(map(str, allowed_values)))
            )

        self._expand = expand

    @property
    def include_geopath(self):
        """Gets the include_geopath of this V3DeparturesSpecificParameters.  # noqa: E501

        Indicates if the route geopath should be returned  # noqa: E501

        :return: The include_geopath of this V3DeparturesSpecificParameters.  # noqa: E501
        :rtype: bool
        """
        return self._include_geopath

    @include_geopath.setter
    def include_geopath(self, include_geopath):
        """Sets the include_geopath of this V3DeparturesSpecificParameters.

        Indicates if the route geopath should be returned  # noqa: E501

        :param include_geopath: The include_geopath of this V3DeparturesSpecificParameters.  # noqa: E501
        :type: bool
        """

        self._include_geopath = include_geopath

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
        if issubclass(V3DeparturesSpecificParameters, dict):
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
        if not isinstance(other, V3DeparturesSpecificParameters):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other