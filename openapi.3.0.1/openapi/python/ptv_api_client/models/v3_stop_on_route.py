# coding: utf-8

"""
    PTV Timetable API - Version 3

    The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  

    The version of the OpenAPI document: v3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictFloat, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional, Union
from ptv_api_client.models.v3_stop_ticket import V3StopTicket
from typing import Optional, Set
from typing_extensions import Self

class V3StopOnRoute(BaseModel):
    """
    V3StopOnRoute
    """ # noqa: E501
    disruption_ids: Optional[List[StrictInt]] = Field(default=None, description="Disruption information identifier(s)")
    stop_suburb: Optional[StrictStr] = Field(default=None, description="suburb of stop")
    route_type: Optional[StrictInt] = Field(default=None, description="Transport mode identifier")
    stop_latitude: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Geographic coordinate of latitude at stop")
    stop_longitude: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Geographic coordinate of longitude at stop")
    stop_sequence: Optional[StrictInt] = Field(default=None, description="Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.")
    stop_ticket: Optional[V3StopTicket] = None
    stop_id: Optional[StrictInt] = Field(default=None, description="Stop identifier")
    stop_name: Optional[StrictStr] = Field(default=None, description="Name of stop")
    stop_landmark: Optional[StrictStr] = Field(default=None, description="Landmark in proximity of stop")
    __properties: ClassVar[List[str]] = ["disruption_ids", "stop_suburb", "route_type", "stop_latitude", "stop_longitude", "stop_sequence", "stop_ticket", "stop_id", "stop_name", "stop_landmark"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of V3StopOnRoute from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of stop_ticket
        if self.stop_ticket:
            _dict['stop_ticket'] = self.stop_ticket.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of V3StopOnRoute from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "disruption_ids": obj.get("disruption_ids"),
            "stop_suburb": obj.get("stop_suburb"),
            "route_type": obj.get("route_type"),
            "stop_latitude": obj.get("stop_latitude"),
            "stop_longitude": obj.get("stop_longitude"),
            "stop_sequence": obj.get("stop_sequence"),
            "stop_ticket": V3StopTicket.from_dict(obj["stop_ticket"]) if obj.get("stop_ticket") is not None else None,
            "stop_id": obj.get("stop_id"),
            "stop_name": obj.get("stop_name"),
            "stop_landmark": obj.get("stop_landmark")
        })
        return _obj


