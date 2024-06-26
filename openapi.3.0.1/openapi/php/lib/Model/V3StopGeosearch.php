<?php
/**
 * V3StopGeosearch
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
 * V3StopGeosearch Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class V3StopGeosearch implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'V3.StopGeosearch';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'disruption_ids' => 'int[]',
        'stop_distance' => 'float',
        'stop_suburb' => 'string',
        'stop_name' => 'string',
        'stop_id' => 'int',
        'route_type' => 'int',
        'routes' => 'object[]',
        'stop_latitude' => 'float',
        'stop_longitude' => 'float',
        'stop_landmark' => 'string',
        'stop_sequence' => 'int'
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
        'stop_distance' => 'float',
        'stop_suburb' => null,
        'stop_name' => null,
        'stop_id' => 'int32',
        'route_type' => 'int32',
        'routes' => null,
        'stop_latitude' => 'float',
        'stop_longitude' => 'float',
        'stop_landmark' => null,
        'stop_sequence' => 'int32'
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'disruption_ids' => false,
        'stop_distance' => false,
        'stop_suburb' => false,
        'stop_name' => false,
        'stop_id' => false,
        'route_type' => false,
        'routes' => false,
        'stop_latitude' => false,
        'stop_longitude' => false,
        'stop_landmark' => false,
        'stop_sequence' => false
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
        'stop_distance' => 'stop_distance',
        'stop_suburb' => 'stop_suburb',
        'stop_name' => 'stop_name',
        'stop_id' => 'stop_id',
        'route_type' => 'route_type',
        'routes' => 'routes',
        'stop_latitude' => 'stop_latitude',
        'stop_longitude' => 'stop_longitude',
        'stop_landmark' => 'stop_landmark',
        'stop_sequence' => 'stop_sequence'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'disruption_ids' => 'setDisruptionIds',
        'stop_distance' => 'setStopDistance',
        'stop_suburb' => 'setStopSuburb',
        'stop_name' => 'setStopName',
        'stop_id' => 'setStopId',
        'route_type' => 'setRouteType',
        'routes' => 'setRoutes',
        'stop_latitude' => 'setStopLatitude',
        'stop_longitude' => 'setStopLongitude',
        'stop_landmark' => 'setStopLandmark',
        'stop_sequence' => 'setStopSequence'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'disruption_ids' => 'getDisruptionIds',
        'stop_distance' => 'getStopDistance',
        'stop_suburb' => 'getStopSuburb',
        'stop_name' => 'getStopName',
        'stop_id' => 'getStopId',
        'route_type' => 'getRouteType',
        'routes' => 'getRoutes',
        'stop_latitude' => 'getStopLatitude',
        'stop_longitude' => 'getStopLongitude',
        'stop_landmark' => 'getStopLandmark',
        'stop_sequence' => 'getStopSequence'
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
        $this->setIfExists('stop_distance', $data ?? [], null);
        $this->setIfExists('stop_suburb', $data ?? [], null);
        $this->setIfExists('stop_name', $data ?? [], null);
        $this->setIfExists('stop_id', $data ?? [], null);
        $this->setIfExists('route_type', $data ?? [], null);
        $this->setIfExists('routes', $data ?? [], null);
        $this->setIfExists('stop_latitude', $data ?? [], null);
        $this->setIfExists('stop_longitude', $data ?? [], null);
        $this->setIfExists('stop_landmark', $data ?? [], null);
        $this->setIfExists('stop_sequence', $data ?? [], null);
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
     * Gets stop_distance
     *
     * @return float|null
     */
    public function getStopDistance()
    {
        return $this->container['stop_distance'];
    }

    /**
     * Sets stop_distance
     *
     * @param float|null $stop_distance Distance of stop from input location (in metres); returns 0 if no location is input
     *
     * @return self
     */
    public function setStopDistance($stop_distance)
    {
        if (is_null($stop_distance)) {
            throw new \InvalidArgumentException('non-nullable stop_distance cannot be null');
        }
        $this->container['stop_distance'] = $stop_distance;

        return $this;
    }

    /**
     * Gets stop_suburb
     *
     * @return string|null
     */
    public function getStopSuburb()
    {
        return $this->container['stop_suburb'];
    }

    /**
     * Sets stop_suburb
     *
     * @param string|null $stop_suburb suburb of stop
     *
     * @return self
     */
    public function setStopSuburb($stop_suburb)
    {
        if (is_null($stop_suburb)) {
            throw new \InvalidArgumentException('non-nullable stop_suburb cannot be null');
        }
        $this->container['stop_suburb'] = $stop_suburb;

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
     * @param object[]|null $routes List of routes travelling through the stop
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
     * Gets stop_latitude
     *
     * @return float|null
     */
    public function getStopLatitude()
    {
        return $this->container['stop_latitude'];
    }

    /**
     * Sets stop_latitude
     *
     * @param float|null $stop_latitude Geographic coordinate of latitude at stop
     *
     * @return self
     */
    public function setStopLatitude($stop_latitude)
    {
        if (is_null($stop_latitude)) {
            throw new \InvalidArgumentException('non-nullable stop_latitude cannot be null');
        }
        $this->container['stop_latitude'] = $stop_latitude;

        return $this;
    }

    /**
     * Gets stop_longitude
     *
     * @return float|null
     */
    public function getStopLongitude()
    {
        return $this->container['stop_longitude'];
    }

    /**
     * Sets stop_longitude
     *
     * @param float|null $stop_longitude Geographic coordinate of longitude at stop
     *
     * @return self
     */
    public function setStopLongitude($stop_longitude)
    {
        if (is_null($stop_longitude)) {
            throw new \InvalidArgumentException('non-nullable stop_longitude cannot be null');
        }
        $this->container['stop_longitude'] = $stop_longitude;

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
     * Gets stop_sequence
     *
     * @return int|null
     */
    public function getStopSequence()
    {
        return $this->container['stop_sequence'];
    }

    /**
     * Sets stop_sequence
     *
     * @param int|null $stop_sequence Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.
     *
     * @return self
     */
    public function setStopSequence($stop_sequence)
    {
        if (is_null($stop_sequence)) {
            throw new \InvalidArgumentException('non-nullable stop_sequence cannot be null');
        }
        $this->container['stop_sequence'] = $stop_sequence;

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


