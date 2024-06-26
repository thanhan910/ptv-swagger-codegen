# V3Departure

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stop_id** | **int** | Stop identifier | [optional] 
**route_id** | **int** | Route identifier | [optional] 
**run_id** | **int** | Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric | [optional] 
**run_ref** | **str** | Alphanumeric trip/service run identifier | [optional] 
**direction_id** | **int** | Direction of travel identifier | [optional] 
**disruption_ids** | **list[int]** | Disruption information identifier(s) | [optional] 
**scheduled_departure_utc** | **datetime** | Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format | [optional] 
**estimated_departure_utc** | **datetime** | Real-time estimate of departure time and date in ISO 8601 UTC format | [optional] 
**at_platform** | **bool** | Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes | [optional] 
**platform_number** | **str** | Platform number at stop (metropolitan train only; returns null for other modes) | [optional] 
**flags** | **str** | Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag) | [optional] 
**departure_sequence** | **int** | Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4 | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

