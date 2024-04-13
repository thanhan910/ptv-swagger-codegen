# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server.models.v3_route_service_status import V3RouteServiceStatus  # noqa: F401,E501
from swagger_server import util


class V3ResultRoute(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, route_name: str=None, route_number: str=None, route_type: int=None, route_id: int=None, route_gtfs_id: str=None, route_service_status: V3RouteServiceStatus=None):  # noqa: E501
        """V3ResultRoute - a model defined in Swagger

        :param route_name: The route_name of this V3ResultRoute.  # noqa: E501
        :type route_name: str
        :param route_number: The route_number of this V3ResultRoute.  # noqa: E501
        :type route_number: str
        :param route_type: The route_type of this V3ResultRoute.  # noqa: E501
        :type route_type: int
        :param route_id: The route_id of this V3ResultRoute.  # noqa: E501
        :type route_id: int
        :param route_gtfs_id: The route_gtfs_id of this V3ResultRoute.  # noqa: E501
        :type route_gtfs_id: str
        :param route_service_status: The route_service_status of this V3ResultRoute.  # noqa: E501
        :type route_service_status: V3RouteServiceStatus
        """
        self.swagger_types = {
            'route_name': str,
            'route_number': str,
            'route_type': int,
            'route_id': int,
            'route_gtfs_id': str,
            'route_service_status': V3RouteServiceStatus
        }

        self.attribute_map = {
            'route_name': 'route_name',
            'route_number': 'route_number',
            'route_type': 'route_type',
            'route_id': 'route_id',
            'route_gtfs_id': 'route_gtfs_id',
            'route_service_status': 'route_service_status'
        }
        self._route_name = route_name
        self._route_number = route_number
        self._route_type = route_type
        self._route_id = route_id
        self._route_gtfs_id = route_gtfs_id
        self._route_service_status = route_service_status

    @classmethod
    def from_dict(cls, dikt) -> 'V3ResultRoute':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The V3.ResultRoute of this V3ResultRoute.  # noqa: E501
        :rtype: V3ResultRoute
        """
        return util.deserialize_model(dikt, cls)

    @property
    def route_name(self) -> str:
        """Gets the route_name of this V3ResultRoute.

        Name of route  # noqa: E501

        :return: The route_name of this V3ResultRoute.
        :rtype: str
        """
        return self._route_name

    @route_name.setter
    def route_name(self, route_name: str):
        """Sets the route_name of this V3ResultRoute.

        Name of route  # noqa: E501

        :param route_name: The route_name of this V3ResultRoute.
        :type route_name: str
        """

        self._route_name = route_name

    @property
    def route_number(self) -> str:
        """Gets the route_number of this V3ResultRoute.

        Route number presented to public (nb. not route_id)  # noqa: E501

        :return: The route_number of this V3ResultRoute.
        :rtype: str
        """
        return self._route_number

    @route_number.setter
    def route_number(self, route_number: str):
        """Sets the route_number of this V3ResultRoute.

        Route number presented to public (nb. not route_id)  # noqa: E501

        :param route_number: The route_number of this V3ResultRoute.
        :type route_number: str
        """

        self._route_number = route_number

    @property
    def route_type(self) -> int:
        """Gets the route_type of this V3ResultRoute.

        Transport mode identifier  # noqa: E501

        :return: The route_type of this V3ResultRoute.
        :rtype: int
        """
        return self._route_type

    @route_type.setter
    def route_type(self, route_type: int):
        """Sets the route_type of this V3ResultRoute.

        Transport mode identifier  # noqa: E501

        :param route_type: The route_type of this V3ResultRoute.
        :type route_type: int
        """

        self._route_type = route_type

    @property
    def route_id(self) -> int:
        """Gets the route_id of this V3ResultRoute.

        Route identifier  # noqa: E501

        :return: The route_id of this V3ResultRoute.
        :rtype: int
        """
        return self._route_id

    @route_id.setter
    def route_id(self, route_id: int):
        """Sets the route_id of this V3ResultRoute.

        Route identifier  # noqa: E501

        :param route_id: The route_id of this V3ResultRoute.
        :type route_id: int
        """

        self._route_id = route_id

    @property
    def route_gtfs_id(self) -> str:
        """Gets the route_gtfs_id of this V3ResultRoute.

        GTFS Identifer of the route  # noqa: E501

        :return: The route_gtfs_id of this V3ResultRoute.
        :rtype: str
        """
        return self._route_gtfs_id

    @route_gtfs_id.setter
    def route_gtfs_id(self, route_gtfs_id: str):
        """Sets the route_gtfs_id of this V3ResultRoute.

        GTFS Identifer of the route  # noqa: E501

        :param route_gtfs_id: The route_gtfs_id of this V3ResultRoute.
        :type route_gtfs_id: str
        """

        self._route_gtfs_id = route_gtfs_id

    @property
    def route_service_status(self) -> V3RouteServiceStatus:
        """Gets the route_service_status of this V3ResultRoute.


        :return: The route_service_status of this V3ResultRoute.
        :rtype: V3RouteServiceStatus
        """
        return self._route_service_status

    @route_service_status.setter
    def route_service_status(self, route_service_status: V3RouteServiceStatus):
        """Sets the route_service_status of this V3ResultRoute.


        :param route_service_status: The route_service_status of this V3ResultRoute.
        :type route_service_status: V3RouteServiceStatus
        """

        self._route_service_status = route_service_status