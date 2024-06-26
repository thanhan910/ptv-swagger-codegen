<?php
/**
 * V3StopDetails
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * PTV Timetable API - Version 3
 *
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.
 *
 * The version of the OpenAPI document: v3
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.5.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * V3StopDetails Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class V3StopDetails implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'V3.StopDetails';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'disruption_ids' => 'int[]',
        'station_type' => 'string',
        'station_description' => 'string',
        'route_type' => 'int',
        'stop_location' => '\OpenAPI\Client\Model\V3StopLocation',
        'stop_amenities' => '\OpenAPI\Client\Model\V3StopAmenityDetails',
        'stop_accessibility' => '\OpenAPI\Client\Model\V3StopAccessibility',
        'stop_staffing' => '\OpenAPI\Client\Model\V3StopStaffing',
        'routes' => 'object[]',
        'stop_id' => 'int',
        'stop_name' => 'string',
        'stop_landmark' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'disruption_ids' => 'int64',
        'station_type' => null,
        'station_description' => null,
        'route_type' => 'int32',
        'stop_location' => null,
        'stop_amenities' => null,
        'stop_accessibility' => null,
        'stop_staffing' => null,
        'routes' => null,
        'stop_id' => 'int32',
        'stop_name' => null,
        'stop_landmark' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'disruption_ids' => false,
        'station_type' => false,
        'station_description' => false,
        'route_type' => false,
        'stop_location' => false,
        'stop_amenities' => false,
        'stop_accessibility' => false,
        'stop_staffing' => false,
        'routes' => false,
        'stop_id' => false,
        'stop_name' => false,
        'stop_landmark' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var boolean[]
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return boolean[]
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param boolean[] $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'disruption_ids' => 'disruption_ids',
        'station_type' => 'station_type',
        'station_description' => 'station_description',
        'route_type' => 'route_type',
        'stop_location' => 'stop_location',
        'stop_amenities' => 'stop_amenities',
        'stop_accessibility' => 'stop_accessibility',
        'stop_staffing' => 'stop_staffing',
        'routes' => 'routes',
        'stop_id' => 'stop_id',
        'stop_name' => 'stop_name',
        'stop_landmark' => 'stop_landmark'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'disruption_ids' => 'setDisruptionIds',
        'station_type' => 'setStationType',
        'station_description' => 'setStationDescription',
        'route_type' => 'setRouteType',
        'stop_location' => 'setStopLocation',
        'stop_amenities' => 'setStopAmenities',
        'stop_accessibility' => 'setStopAccessibility',
        'stop_staffing' => 'setStopStaffing',
        'routes' => 'setRoutes',
        'stop_id' => 'setStopId',
        'stop_name' => 'setStopName',
        'stop_landmark' => 'setStopLandmark'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'disruption_ids' => 'getDisruptionIds',
        'station_type' => 'getStationType',
        'station_description' => 'getStationDescription',
        'route_type' => 'getRouteType',
        'stop_location' => 'getStopLocation',
        'stop_amenities' => 'getStopAmenities',
        'stop_accessibility' => 'getStopAccessibility',
        'stop_staffing' => 'getStopStaffing',
        'routes' => 'getRoutes',
        'stop_id' => 'getStopId',
        'stop_name' => 'getStopName',
        'stop_landmark' => 'getStopLandmark'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->setIfExists('disruption_ids', $data ?? [], null);
        $this->setIfExists('station_type', $data ?? [], null);
        $this->setIfExists('station_description', $data ?? [], null);
        $this->setIfExists('route_type', $data ?? [], null);
        $this->setIfExists('stop_location', $data ?? [], null);
        $this->setIfExists('stop_amenities', $data ?? [], null);
        $this->setIfExists('stop_accessibility', $data ?? [], null);
        $this->setIfExists('stop_staffing', $data ?? [], null);
        $this->setIfExists('routes', $data ?? [], null);
        $this->setIfExists('stop_id', $data ?? [], null);
        $this->setIfExists('stop_name', $data ?? [], null);
        $this->setIfExists('stop_landmark', $data ?? [], null);
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets disruption_ids
     *
     * @return int[]|null
     */
    public function getDisruptionIds()
    {
        return $this->container['disruption_ids'];
    }

    /**
     * Sets disruption_ids
     *
     * @param int[]|null $disruption_ids Disruption information identifier(s)
     *
     * @return self
     */
    public function setDisruptionIds($disruption_ids)
    {
        if (is_null($disruption_ids)) {
            throw new \InvalidArgumentException('non-nullable disruption_ids cannot be null');
        }
        $this->container['disruption_ids'] = $disruption_ids;

        return $this;
    }

    /**
     * Gets station_type
     *
     * @return string|null
     */
    public function getStationType()
    {
        return $this->container['station_type'];
    }

    /**
     * Sets station_type
     *
     * @param string|null $station_type Type of metropolitan train station (i.e. \"Premium\", \"Host\" or \"Unstaffed\" station); returns null for V/Line train
     *
     * @return self
     */
    public function setStationType($station_type)
    {
        if (is_null($station_type)) {
            throw new \InvalidArgumentException('non-nullable station_type cannot be null');
        }
        $this->container['station_type'] = $station_type;

        return $this;
    }

    /**
     * Gets station_description
     *
     * @return string|null
     */
    public function getStationDescription()
    {
        return $this->container['station_description'];
    }

    /**
     * Sets station_description
     *
     * @param string|null $station_description The definition applicable to the station_type; returns null for V/Line train
     *
     * @return self
     */
    public function setStationDescription($station_description)
    {
        if (is_null($station_description)) {
            throw new \InvalidArgumentException('non-nullable station_description cannot be null');
        }
        $this->container['station_description'] = $station_description;

        return $this;
    }

    /**
     * Gets route_type
     *
     * @return int|null
     */
    public function getRouteType()
    {
        return $this->container['route_type'];
    }

    /**
     * Sets route_type
     *
     * @param int|null $route_type Transport mode identifier
     *
     * @return self
     */
    public function setRouteType($route_type)
    {
        if (is_null($route_type)) {
            throw new \InvalidArgumentException('non-nullable route_type cannot be null');
        }
        $this->container['route_type'] = $route_type;

        return $this;
    }

    /**
     * Gets stop_location
     *
     * @return \OpenAPI\Client\Model\V3StopLocation|null
     */
    public function getStopLocation()
    {
        return $this->container['stop_location'];
    }

    /**
     * Sets stop_location
     *
     * @param \OpenAPI\Client\Model\V3StopLocation|null $stop_location stop_location
     *
     * @return self
     */
    public function setStopLocation($stop_location)
    {
        if (is_null($stop_location)) {
            throw new \InvalidArgumentException('non-nullable stop_location cannot be null');
        }
        $this->container['stop_location'] = $stop_location;

        return $this;
    }

    /**
     * Gets stop_amenities
     *
     * @return \OpenAPI\Client\Model\V3StopAmenityDetails|null
     */
    public function getStopAmenities()
    {
        return $this->container['stop_amenities'];
    }

    /**
     * Sets stop_amenities
     *
     * @param \OpenAPI\Client\Model\V3StopAmenityDetails|null $stop_amenities stop_amenities
     *
     * @return self
     */
    public function setStopAmenities($stop_amenities)
    {
        if (is_null($stop_amenities)) {
            throw new \InvalidArgumentException('non-nullable stop_amenities cannot be null');
        }
        $this->container['stop_amenities'] = $stop_amenities;

        return $this;
    }

    /**
     * Gets stop_accessibility
     *
     * @return \OpenAPI\Client\Model\V3StopAccessibility|null
     */
    public function getStopAccessibility()
    {
        return $this->container['stop_accessibility'];
    }

    /**
     * Sets stop_accessibility
     *
     * @param \OpenAPI\Client\Model\V3StopAccessibility|null $stop_accessibility stop_accessibility
     *
     * @return self
     */
    public function setStopAccessibility($stop_accessibility)
    {
        if (is_null($stop_accessibility)) {
            throw new \InvalidArgumentException('non-nullable stop_accessibility cannot be null');
        }
        $this->container['stop_accessibility'] = $stop_accessibility;

        return $this;
    }

    /**
     * Gets stop_staffing
     *
     * @return \OpenAPI\Client\Model\V3StopStaffing|null
     */
    public function getStopStaffing()
    {
        return $this->container['stop_staffing'];
    }

    /**
     * Sets stop_staffing
     *
     * @param \OpenAPI\Client\Model\V3StopStaffing|null $stop_staffing stop_staffing
     *
     * @return self
     */
    public function setStopStaffing($stop_staffing)
    {
        if (is_null($stop_staffing)) {
            throw new \InvalidArgumentException('non-nullable stop_staffing cannot be null');
        }
        $this->container['stop_staffing'] = $stop_staffing;

        return $this;
    }

    /**
     * Gets routes
     *
     * @return object[]|null
     */
    public function getRoutes()
    {
        return $this->container['routes'];
    }

    /**
     * Sets routes
     *
     * @param object[]|null $routes Routes travelling through the stop
     *
     * @return self
     */
    public function setRoutes($routes)
    {
        if (is_null($routes)) {
            throw new \InvalidArgumentException('non-nullable routes cannot be null');
        }
        $this->container['routes'] = $routes;

        return $this;
    }

    /**
     * Gets stop_id
     *
     * @return int|null
     */
    public function getStopId()
    {
        return $this->container['stop_id'];
    }

    /**
     * Sets stop_id
     *
     * @param int|null $stop_id Stop identifier
     *
     * @return self
     */
    public function setStopId($stop_id)
    {
        if (is_null($stop_id)) {
            throw new \InvalidArgumentException('non-nullable stop_id cannot be null');
        }
        $this->container['stop_id'] = $stop_id;

        return $this;
    }

    /**
     * Gets stop_name
     *
     * @return string|null
     */
    public function getStopName()
    {
        return $this->container['stop_name'];
    }

    /**
     * Sets stop_name
     *
     * @param string|null $stop_name Name of stop
     *
     * @return self
     */
    public function setStopName($stop_name)
    {
        if (is_null($stop_name)) {
            throw new \InvalidArgumentException('non-nullable stop_name cannot be null');
        }
        $this->container['stop_name'] = $stop_name;

        return $this;
    }

    /**
     * Gets stop_landmark
     *
     * @return string|null
     */
    public function getStopLandmark()
    {
        return $this->container['stop_landmark'];
    }

    /**
     * Sets stop_landmark
     *
     * @param string|null $stop_landmark Landmark in proximity of stop
     *
     * @return self
     */
    public function setStopLandmark($stop_landmark)
    {
        if (is_null($stop_landmark)) {
            throw new \InvalidArgumentException('non-nullable stop_landmark cannot be null');
        }
        $this->container['stop_landmark'] = $stop_landmark;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[\ReturnTypeWillChange]
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


