# V3Disruptions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**general** | [**List[V3Disruption]**](V3Disruption.md) | Subset of disruption information applicable to multiple route_types | [optional] 
**metro_train** | [**List[V3Disruption]**](V3Disruption.md) | Subset of disruption information applicable to metropolitan train | [optional] 
**metro_tram** | [**List[V3Disruption]**](V3Disruption.md) | Subset of disruption information applicable to metropolitan tram | [optional] 
**metro_bus** | [**List[V3Disruption]**](V3Disruption.md) | Subset of disruption information applicable to metropolitan bus | [optional] 
**regional_train** | [**List[V3Disruption]**](V3Disruption.md) | Subset of disruption information applicable to V/Line train | [optional] 
**regional_coach** | [**List[V3Disruption]**](V3Disruption.md) | Subset of disruption information applicable to V/Line coach | [optional] 
**regional_bus** | [**List[V3Disruption]**](V3Disruption.md) | Subset of disruption information applicable to regional bus | [optional] 
**school_bus** | [**List[V3Disruption]**](V3Disruption.md) | Subset of disruption information applicable to school bus | [optional] 
**telebus** | [**List[V3Disruption]**](V3Disruption.md) | Subset of disruption information applicable to telebus services | [optional] 
**night_bus** | [**List[V3Disruption]**](V3Disruption.md) | Subset of disruption information applicable to night bus | [optional] 
**ferry** | [**List[V3Disruption]**](V3Disruption.md) | Subset of disruption information applicable to ferry | [optional] 
**interstate_train** | [**List[V3Disruption]**](V3Disruption.md) | Subset of disruption information applicable to interstate train | [optional] 
**skybus** | [**List[V3Disruption]**](V3Disruption.md) | Subset of disruption information applicable to skybus | [optional] 
**taxi** | [**List[V3Disruption]**](V3Disruption.md) | Subset of disruption information applicable to taxi | [optional] 

## Example

```python
from ptv_api_client.models.v3_disruptions import V3Disruptions

# TODO update the JSON string below
json = "{}"
# create an instance of V3Disruptions from a JSON string
v3_disruptions_instance = V3Disruptions.from_json(json)
# print the JSON string representation of the object
print(V3Disruptions.to_json())

# convert the object into a dict
v3_disruptions_dict = v3_disruptions_instance.to_dict()
# create an instance of V3Disruptions from a dict
v3_disruptions_from_dict = V3Disruptions.from_dict(v3_disruptions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


