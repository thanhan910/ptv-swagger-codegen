# V3Outlet


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**outlet_slid_spid** | **str** | The SLID / SPID | [optional] 
**outlet_name** | **str** | The location name of the outlet | [optional] 
**outlet_business** | **str** | The business name of the outlet | [optional] 
**outlet_latitude** | **float** | Geographic coordinate of latitude at outlet | [optional] 
**outlet_longitude** | **float** | Geographic coordinate of longitude at outlet | [optional] 
**outlet_suburb** | **str** | The city/municipality the outlet is in | [optional] 
**outlet_postcode** | **int** | The postcode for the outlet | [optional] 
**outlet_business_hour_mon** | **str** | The business hours on Monday | [optional] 
**outlet_business_hour_tue** | **str** | The business hours on Tuesday | [optional] 
**outlet_business_hour_wed** | **str** | The business hours on Wednesday | [optional] 
**outlet_business_hour_thur** | **str** | The business hours on Thursday | [optional] 
**outlet_business_hour_fri** | **str** | The business hours on Friday | [optional] 
**outlet_business_hour_sat** | **str** | The business hours on Saturday | [optional] 
**outlet_business_hour_sun** | **str** | The business hours on Sunday | [optional] 
**outlet_notes** | **str** | Any additional notes for the outlet such as &#39;Buy pre-loaded myki cards only&#39;. May be null/empty. | [optional] 

## Example

```python
from ptv_api_client.models.v3_outlet import V3Outlet

# TODO update the JSON string below
json = "{}"
# create an instance of V3Outlet from a JSON string
v3_outlet_instance = V3Outlet.from_json(json)
# print the JSON string representation of the object
print(V3Outlet.to_json())

# convert the object into a dict
v3_outlet_dict = v3_outlet_instance.to_dict()
# create an instance of V3Outlet from a dict
v3_outlet_from_dict = V3Outlet.from_dict(v3_outlet_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


