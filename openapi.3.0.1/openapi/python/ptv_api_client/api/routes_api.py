# coding: utf-8

"""
    PTV Timetable API - Version 3

    The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  

    The version of the OpenAPI document: v3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501

import warnings
from pydantic import validate_call, Field, StrictFloat, StrictStr, StrictInt
from typing import Any, Dict, List, Optional, Tuple, Union
from typing_extensions import Annotated

from datetime import datetime
from pydantic import Field, StrictBool, StrictInt, StrictStr, field_validator
from typing import List, Optional
from typing_extensions import Annotated
from ptv_api_client.models.v3_route_response import V3RouteResponse

from ptv_api_client.api_client import ApiClient, RequestSerialized
from ptv_api_client.api_response import ApiResponse
from ptv_api_client.rest import RESTResponseType


class RoutesApi:
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None) -> None:
        if api_client is None:
            api_client = ApiClient.get_default()
        self.api_client = api_client


    @validate_call
    def routes_one_or_more_routes(
        self,
        route_types: Annotated[Optional[List[StrictInt]], Field(description="Filter by route_type; values returned via RouteTypes API")] = None,
        route_name: Annotated[Optional[StrictStr], Field(description="Filter by name  of route (accepts partial route name matches)")] = None,
        token: Annotated[Optional[StrictStr], Field(description="Please ignore")] = None,
        devid: Annotated[Optional[StrictStr], Field(description="Your developer id")] = None,
        signature: Annotated[Optional[StrictStr], Field(description="Authentication signature for request")] = None,
        _request_timeout: Union[
            None,
            Annotated[StrictFloat, Field(gt=0)],
            Tuple[
                Annotated[StrictFloat, Field(gt=0)],
                Annotated[StrictFloat, Field(gt=0)]
            ]
        ] = None,
        _request_auth: Optional[Dict[StrictStr, Any]] = None,
        _content_type: Optional[StrictStr] = None,
        _headers: Optional[Dict[StrictStr, Any]] = None,
        _host_index: Annotated[StrictInt, Field(ge=0, le=0)] = 0,
    ) -> V3RouteResponse:
        """View route names and numbers for all routes


        :param route_types: Filter by route_type; values returned via RouteTypes API
        :type route_types: List[int]
        :param route_name: Filter by name  of route (accepts partial route name matches)
        :type route_name: str
        :param token: Please ignore
        :type token: str
        :param devid: Your developer id
        :type devid: str
        :param signature: Authentication signature for request
        :type signature: str
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :type _request_timeout: int, tuple(int, int), optional
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the
                              authentication in the spec for a single request.
        :type _request_auth: dict, optional
        :param _content_type: force content-type for the request.
        :type _content_type: str, Optional
        :param _headers: set to override the headers for a single
                         request; this effectively ignores the headers
                         in the spec for a single request.
        :type _headers: dict, optional
        :param _host_index: set to override the host_index for a single
                            request; this effectively ignores the host_index
                            in the spec for a single request.
        :type _host_index: int, optional
        :return: Returns the result object.
        """ # noqa: E501

        _param = self._routes_one_or_more_routes_serialize(
            route_types=route_types,
            route_name=route_name,
            token=token,
            devid=devid,
            signature=signature,
            _request_auth=_request_auth,
            _content_type=_content_type,
            _headers=_headers,
            _host_index=_host_index
        )

        _response_types_map: Dict[str, Optional[str]] = {
            '200': "V3RouteResponse",
            '400': "V3ErrorResponse",
            '403': "V3ErrorResponse",
        }
        response_data = self.api_client.call_api(
            *_param,
            _request_timeout=_request_timeout
        )
        response_data.read()
        return self.api_client.response_deserialize(
            response_data=response_data,
            response_types_map=_response_types_map,
        ).data


    @validate_call
    def routes_one_or_more_routes_with_http_info(
        self,
        route_types: Annotated[Optional[List[StrictInt]], Field(description="Filter by route_type; values returned via RouteTypes API")] = None,
        route_name: Annotated[Optional[StrictStr], Field(description="Filter by name  of route (accepts partial route name matches)")] = None,
        token: Annotated[Optional[StrictStr], Field(description="Please ignore")] = None,
        devid: Annotated[Optional[StrictStr], Field(description="Your developer id")] = None,
        signature: Annotated[Optional[StrictStr], Field(description="Authentication signature for request")] = None,
        _request_timeout: Union[
            None,
            Annotated[StrictFloat, Field(gt=0)],
            Tuple[
                Annotated[StrictFloat, Field(gt=0)],
                Annotated[StrictFloat, Field(gt=0)]
            ]
        ] = None,
        _request_auth: Optional[Dict[StrictStr, Any]] = None,
        _content_type: Optional[StrictStr] = None,
        _headers: Optional[Dict[StrictStr, Any]] = None,
        _host_index: Annotated[StrictInt, Field(ge=0, le=0)] = 0,
    ) -> ApiResponse[V3RouteResponse]:
        """View route names and numbers for all routes


        :param route_types: Filter by route_type; values returned via RouteTypes API
        :type route_types: List[int]
        :param route_name: Filter by name  of route (accepts partial route name matches)
        :type route_name: str
        :param token: Please ignore
        :type token: str
        :param devid: Your developer id
        :type devid: str
        :param signature: Authentication signature for request
        :type signature: str
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :type _request_timeout: int, tuple(int, int), optional
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the
                              authentication in the spec for a single request.
        :type _request_auth: dict, optional
        :param _content_type: force content-type for the request.
        :type _content_type: str, Optional
        :param _headers: set to override the headers for a single
                         request; this effectively ignores the headers
                         in the spec for a single request.
        :type _headers: dict, optional
        :param _host_index: set to override the host_index for a single
                            request; this effectively ignores the host_index
                            in the spec for a single request.
        :type _host_index: int, optional
        :return: Returns the result object.
        """ # noqa: E501

        _param = self._routes_one_or_more_routes_serialize(
            route_types=route_types,
            route_name=route_name,
            token=token,
            devid=devid,
            signature=signature,
            _request_auth=_request_auth,
            _content_type=_content_type,
            _headers=_headers,
            _host_index=_host_index
        )

        _response_types_map: Dict[str, Optional[str]] = {
            '200': "V3RouteResponse",
            '400': "V3ErrorResponse",
            '403': "V3ErrorResponse",
        }
        response_data = self.api_client.call_api(
            *_param,
            _request_timeout=_request_timeout
        )
        response_data.read()
        return self.api_client.response_deserialize(
            response_data=response_data,
            response_types_map=_response_types_map,
        )


    @validate_call
    def routes_one_or_more_routes_without_preload_content(
        self,
        route_types: Annotated[Optional[List[StrictInt]], Field(description="Filter by route_type; values returned via RouteTypes API")] = None,
        route_name: Annotated[Optional[StrictStr], Field(description="Filter by name  of route (accepts partial route name matches)")] = None,
        token: Annotated[Optional[StrictStr], Field(description="Please ignore")] = None,
        devid: Annotated[Optional[StrictStr], Field(description="Your developer id")] = None,
        signature: Annotated[Optional[StrictStr], Field(description="Authentication signature for request")] = None,
        _request_timeout: Union[
            None,
            Annotated[StrictFloat, Field(gt=0)],
            Tuple[
                Annotated[StrictFloat, Field(gt=0)],
                Annotated[StrictFloat, Field(gt=0)]
            ]
        ] = None,
        _request_auth: Optional[Dict[StrictStr, Any]] = None,
        _content_type: Optional[StrictStr] = None,
        _headers: Optional[Dict[StrictStr, Any]] = None,
        _host_index: Annotated[StrictInt, Field(ge=0, le=0)] = 0,
    ) -> RESTResponseType:
        """View route names and numbers for all routes


        :param route_types: Filter by route_type; values returned via RouteTypes API
        :type route_types: List[int]
        :param route_name: Filter by name  of route (accepts partial route name matches)
        :type route_name: str
        :param token: Please ignore
        :type token: str
        :param devid: Your developer id
        :type devid: str
        :param signature: Authentication signature for request
        :type signature: str
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :type _request_timeout: int, tuple(int, int), optional
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the
                              authentication in the spec for a single request.
        :type _request_auth: dict, optional
        :param _content_type: force content-type for the request.
        :type _content_type: str, Optional
        :param _headers: set to override the headers for a single
                         request; this effectively ignores the headers
                         in the spec for a single request.
        :type _headers: dict, optional
        :param _host_index: set to override the host_index for a single
                            request; this effectively ignores the host_index
                            in the spec for a single request.
        :type _host_index: int, optional
        :return: Returns the result object.
        """ # noqa: E501

        _param = self._routes_one_or_more_routes_serialize(
            route_types=route_types,
            route_name=route_name,
            token=token,
            devid=devid,
            signature=signature,
            _request_auth=_request_auth,
            _content_type=_content_type,
            _headers=_headers,
            _host_index=_host_index
        )

        _response_types_map: Dict[str, Optional[str]] = {
            '200': "V3RouteResponse",
            '400': "V3ErrorResponse",
            '403': "V3ErrorResponse",
        }
        response_data = self.api_client.call_api(
            *_param,
            _request_timeout=_request_timeout
        )
        return response_data.response


    def _routes_one_or_more_routes_serialize(
        self,
        route_types,
        route_name,
        token,
        devid,
        signature,
        _request_auth,
        _content_type,
        _headers,
        _host_index,
    ) -> RequestSerialized:

        _host = None

        _collection_formats: Dict[str, str] = {
            'route_types': 'multi',
        }

        _path_params: Dict[str, str] = {}
        _query_params: List[Tuple[str, str]] = []
        _header_params: Dict[str, Optional[str]] = _headers or {}
        _form_params: List[Tuple[str, str]] = []
        _files: Dict[str, Union[str, bytes]] = {}
        _body_params: Optional[bytes] = None

        # process the path parameters
        # process the query parameters
        if route_types is not None:
            
            _query_params.append(('route_types', route_types))
            
        if route_name is not None:
            
            _query_params.append(('route_name', route_name))
            
        if token is not None:
            
            _query_params.append(('token', token))
            
        if devid is not None:
            
            _query_params.append(('devid', devid))
            
        if signature is not None:
            
            _query_params.append(('signature', signature))
            
        # process the header parameters
        # process the form parameters
        # process the body parameter


        # set the HTTP header `Accept`
        _header_params['Accept'] = self.api_client.select_header_accept(
            [
                'application/json', 
                'text/json', 
                'text/html'
            ]
        )


        # authentication setting
        _auth_settings: List[str] = [
        ]

        return self.api_client.param_serialize(
            method='GET',
            resource_path='/v3/routes',
            path_params=_path_params,
            query_params=_query_params,
            header_params=_header_params,
            body=_body_params,
            post_params=_form_params,
            files=_files,
            auth_settings=_auth_settings,
            collection_formats=_collection_formats,
            _host=_host,
            _request_auth=_request_auth
        )




    @validate_call
    def routes_route_from_id(
        self,
        route_id: Annotated[StrictInt, Field(description="Identifier of route; values returned by Departures, Directions and Disruptions APIs")],
        include_geopath: Annotated[Optional[StrictBool], Field(description="Indicates kif geopath data will be returned (default = false)")] = None,
        geopath_utc: Annotated[Optional[datetime], Field(description="Filter geopaths by date (ISO 8601 UTC format) (default = current date)")] = None,
        token: Annotated[Optional[StrictStr], Field(description="Please ignore")] = None,
        devid: Annotated[Optional[StrictStr], Field(description="Your developer id")] = None,
        signature: Annotated[Optional[StrictStr], Field(description="Authentication signature for request")] = None,
        _request_timeout: Union[
            None,
            Annotated[StrictFloat, Field(gt=0)],
            Tuple[
                Annotated[StrictFloat, Field(gt=0)],
                Annotated[StrictFloat, Field(gt=0)]
            ]
        ] = None,
        _request_auth: Optional[Dict[StrictStr, Any]] = None,
        _content_type: Optional[StrictStr] = None,
        _headers: Optional[Dict[StrictStr, Any]] = None,
        _host_index: Annotated[StrictInt, Field(ge=0, le=0)] = 0,
    ) -> V3RouteResponse:
        """View route name and number for specific route ID


        :param route_id: Identifier of route; values returned by Departures, Directions and Disruptions APIs (required)
        :type route_id: int
        :param include_geopath: Indicates kif geopath data will be returned (default = false)
        :type include_geopath: bool
        :param geopath_utc: Filter geopaths by date (ISO 8601 UTC format) (default = current date)
        :type geopath_utc: datetime
        :param token: Please ignore
        :type token: str
        :param devid: Your developer id
        :type devid: str
        :param signature: Authentication signature for request
        :type signature: str
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :type _request_timeout: int, tuple(int, int), optional
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the
                              authentication in the spec for a single request.
        :type _request_auth: dict, optional
        :param _content_type: force content-type for the request.
        :type _content_type: str, Optional
        :param _headers: set to override the headers for a single
                         request; this effectively ignores the headers
                         in the spec for a single request.
        :type _headers: dict, optional
        :param _host_index: set to override the host_index for a single
                            request; this effectively ignores the host_index
                            in the spec for a single request.
        :type _host_index: int, optional
        :return: Returns the result object.
        """ # noqa: E501

        _param = self._routes_route_from_id_serialize(
            route_id=route_id,
            include_geopath=include_geopath,
            geopath_utc=geopath_utc,
            token=token,
            devid=devid,
            signature=signature,
            _request_auth=_request_auth,
            _content_type=_content_type,
            _headers=_headers,
            _host_index=_host_index
        )

        _response_types_map: Dict[str, Optional[str]] = {
            '200': "V3RouteResponse",
            '400': "V3ErrorResponse",
            '403': "V3ErrorResponse",
        }
        response_data = self.api_client.call_api(
            *_param,
            _request_timeout=_request_timeout
        )
        response_data.read()
        return self.api_client.response_deserialize(
            response_data=response_data,
            response_types_map=_response_types_map,
        ).data


    @validate_call
    def routes_route_from_id_with_http_info(
        self,
        route_id: Annotated[StrictInt, Field(description="Identifier of route; values returned by Departures, Directions and Disruptions APIs")],
        include_geopath: Annotated[Optional[StrictBool], Field(description="Indicates kif geopath data will be returned (default = false)")] = None,
        geopath_utc: Annotated[Optional[datetime], Field(description="Filter geopaths by date (ISO 8601 UTC format) (default = current date)")] = None,
        token: Annotated[Optional[StrictStr], Field(description="Please ignore")] = None,
        devid: Annotated[Optional[StrictStr], Field(description="Your developer id")] = None,
        signature: Annotated[Optional[StrictStr], Field(description="Authentication signature for request")] = None,
        _request_timeout: Union[
            None,
            Annotated[StrictFloat, Field(gt=0)],
            Tuple[
                Annotated[StrictFloat, Field(gt=0)],
                Annotated[StrictFloat, Field(gt=0)]
            ]
        ] = None,
        _request_auth: Optional[Dict[StrictStr, Any]] = None,
        _content_type: Optional[StrictStr] = None,
        _headers: Optional[Dict[StrictStr, Any]] = None,
        _host_index: Annotated[StrictInt, Field(ge=0, le=0)] = 0,
    ) -> ApiResponse[V3RouteResponse]:
        """View route name and number for specific route ID


        :param route_id: Identifier of route; values returned by Departures, Directions and Disruptions APIs (required)
        :type route_id: int
        :param include_geopath: Indicates kif geopath data will be returned (default = false)
        :type include_geopath: bool
        :param geopath_utc: Filter geopaths by date (ISO 8601 UTC format) (default = current date)
        :type geopath_utc: datetime
        :param token: Please ignore
        :type token: str
        :param devid: Your developer id
        :type devid: str
        :param signature: Authentication signature for request
        :type signature: str
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :type _request_timeout: int, tuple(int, int), optional
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the
                              authentication in the spec for a single request.
        :type _request_auth: dict, optional
        :param _content_type: force content-type for the request.
        :type _content_type: str, Optional
        :param _headers: set to override the headers for a single
                         request; this effectively ignores the headers
                         in the spec for a single request.
        :type _headers: dict, optional
        :param _host_index: set to override the host_index for a single
                            request; this effectively ignores the host_index
                            in the spec for a single request.
        :type _host_index: int, optional
        :return: Returns the result object.
        """ # noqa: E501

        _param = self._routes_route_from_id_serialize(
            route_id=route_id,
            include_geopath=include_geopath,
            geopath_utc=geopath_utc,
            token=token,
            devid=devid,
            signature=signature,
            _request_auth=_request_auth,
            _content_type=_content_type,
            _headers=_headers,
            _host_index=_host_index
        )

        _response_types_map: Dict[str, Optional[str]] = {
            '200': "V3RouteResponse",
            '400': "V3ErrorResponse",
            '403': "V3ErrorResponse",
        }
        response_data = self.api_client.call_api(
            *_param,
            _request_timeout=_request_timeout
        )
        response_data.read()
        return self.api_client.response_deserialize(
            response_data=response_data,
            response_types_map=_response_types_map,
        )


    @validate_call
    def routes_route_from_id_without_preload_content(
        self,
        route_id: Annotated[StrictInt, Field(description="Identifier of route; values returned by Departures, Directions and Disruptions APIs")],
        include_geopath: Annotated[Optional[StrictBool], Field(description="Indicates kif geopath data will be returned (default = false)")] = None,
        geopath_utc: Annotated[Optional[datetime], Field(description="Filter geopaths by date (ISO 8601 UTC format) (default = current date)")] = None,
        token: Annotated[Optional[StrictStr], Field(description="Please ignore")] = None,
        devid: Annotated[Optional[StrictStr], Field(description="Your developer id")] = None,
        signature: Annotated[Optional[StrictStr], Field(description="Authentication signature for request")] = None,
        _request_timeout: Union[
            None,
            Annotated[StrictFloat, Field(gt=0)],
            Tuple[
                Annotated[StrictFloat, Field(gt=0)],
                Annotated[StrictFloat, Field(gt=0)]
            ]
        ] = None,
        _request_auth: Optional[Dict[StrictStr, Any]] = None,
        _content_type: Optional[StrictStr] = None,
        _headers: Optional[Dict[StrictStr, Any]] = None,
        _host_index: Annotated[StrictInt, Field(ge=0, le=0)] = 0,
    ) -> RESTResponseType:
        """View route name and number for specific route ID


        :param route_id: Identifier of route; values returned by Departures, Directions and Disruptions APIs (required)
        :type route_id: int
        :param include_geopath: Indicates kif geopath data will be returned (default = false)
        :type include_geopath: bool
        :param geopath_utc: Filter geopaths by date (ISO 8601 UTC format) (default = current date)
        :type geopath_utc: datetime
        :param token: Please ignore
        :type token: str
        :param devid: Your developer id
        :type devid: str
        :param signature: Authentication signature for request
        :type signature: str
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :type _request_timeout: int, tuple(int, int), optional
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the
                              authentication in the spec for a single request.
        :type _request_auth: dict, optional
        :param _content_type: force content-type for the request.
        :type _content_type: str, Optional
        :param _headers: set to override the headers for a single
                         request; this effectively ignores the headers
                         in the spec for a single request.
        :type _headers: dict, optional
        :param _host_index: set to override the host_index for a single
                            request; this effectively ignores the host_index
                            in the spec for a single request.
        :type _host_index: int, optional
        :return: Returns the result object.
        """ # noqa: E501

        _param = self._routes_route_from_id_serialize(
            route_id=route_id,
            include_geopath=include_geopath,
            geopath_utc=geopath_utc,
            token=token,
            devid=devid,
            signature=signature,
            _request_auth=_request_auth,
            _content_type=_content_type,
            _headers=_headers,
            _host_index=_host_index
        )

        _response_types_map: Dict[str, Optional[str]] = {
            '200': "V3RouteResponse",
            '400': "V3ErrorResponse",
            '403': "V3ErrorResponse",
        }
        response_data = self.api_client.call_api(
            *_param,
            _request_timeout=_request_timeout
        )
        return response_data.response


    def _routes_route_from_id_serialize(
        self,
        route_id,
        include_geopath,
        geopath_utc,
        token,
        devid,
        signature,
        _request_auth,
        _content_type,
        _headers,
        _host_index,
    ) -> RequestSerialized:

        _host = None

        _collection_formats: Dict[str, str] = {
        }

        _path_params: Dict[str, str] = {}
        _query_params: List[Tuple[str, str]] = []
        _header_params: Dict[str, Optional[str]] = _headers or {}
        _form_params: List[Tuple[str, str]] = []
        _files: Dict[str, Union[str, bytes]] = {}
        _body_params: Optional[bytes] = None

        # process the path parameters
        if route_id is not None:
            _path_params['route_id'] = route_id
        # process the query parameters
        if include_geopath is not None:
            
            _query_params.append(('include_geopath', include_geopath))
            
        if geopath_utc is not None:
            if isinstance(geopath_utc, datetime):
                _query_params.append(
                    (
                        'geopath_utc',
                        geopath_utc.strftime(
                            self.api_client.configuration.datetime_format
                        )
                    )
                )
            else:
                _query_params.append(('geopath_utc', geopath_utc))
            
        if token is not None:
            
            _query_params.append(('token', token))
            
        if devid is not None:
            
            _query_params.append(('devid', devid))
            
        if signature is not None:
            
            _query_params.append(('signature', signature))
            
        # process the header parameters
        # process the form parameters
        # process the body parameter


        # set the HTTP header `Accept`
        _header_params['Accept'] = self.api_client.select_header_accept(
            [
                'application/json', 
                'text/json', 
                'text/html'
            ]
        )


        # authentication setting
        _auth_settings: List[str] = [
        ]

        return self.api_client.param_serialize(
            method='GET',
            resource_path='/v3/routes/{route_id}',
            path_params=_path_params,
            query_params=_query_params,
            header_params=_header_params,
            body=_body_params,
            post_params=_form_params,
            files=_files,
            auth_settings=_auth_settings,
            collection_formats=_collection_formats,
            _host=_host,
            _request_auth=_request_auth
        )


