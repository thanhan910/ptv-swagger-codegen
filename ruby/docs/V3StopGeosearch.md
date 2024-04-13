# SwaggerClient::V3StopGeosearch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disruption_ids** | **Array&lt;Integer&gt;** | Disruption information identifier(s) | [optional] 
**stop_distance** | **Float** | Distance of stop from input location (in metres); returns 0 if no location is input | [optional] 
**stop_suburb** | **String** | suburb of stop | [optional] 
**stop_name** | **String** | Name of stop | [optional] 
**stop_id** | **Integer** | Stop identifier | [optional] 
**route_type** | **Integer** | Transport mode identifier | [optional] 
**routes** | **Array&lt;Object&gt;** | List of routes travelling through the stop | [optional] 
**stop_latitude** | **Float** | Geographic coordinate of latitude at stop | [optional] 
**stop_longitude** | **Float** | Geographic coordinate of longitude at stop | [optional] 
**stop_landmark** | **String** | Landmark in proximity of stop | [optional] 
**stop_sequence** | **Integer** | Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id. | [optional] 
