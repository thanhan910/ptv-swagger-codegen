<?php
/**
 * V3BulkDeparturesRequest
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
 * V3BulkDeparturesRequest Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class V3BulkDeparturesRequest implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'V3.BulkDeparturesRequest';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'requests' => '\OpenAPI\Client\Model\V3StopDepartureRequest[]',
        'date_utc' => '\DateTime',
        'look_backwards' => 'bool',
        'include_cancelled' => 'bool',
        'include_geopath' => 'bool',
        'expand' => 'string[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'requests' => null,
        'date_utc' => 'date-time',
        'look_backwards' => null,
        'include_cancelled' => null,
        'include_geopath' => null,
        'expand' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'requests' => false,
        'date_utc' => false,
        'look_backwards' => false,
        'include_cancelled' => false,
        'include_geopath' => false,
        'expand' => false
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
        'requests' => 'requests',
        'date_utc' => 'date_utc',
        'look_backwards' => 'look_backwards',
        'include_cancelled' => 'include_cancelled',
        'include_geopath' => 'include_geopath',
        'expand' => 'expand'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'requests' => 'setRequests',
        'date_utc' => 'setDateUtc',
        'look_backwards' => 'setLookBackwards',
        'include_cancelled' => 'setIncludeCancelled',
        'include_geopath' => 'setIncludeGeopath',
        'expand' => 'setExpand'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'requests' => 'getRequests',
        'date_utc' => 'getDateUtc',
        'look_backwards' => 'getLookBackwards',
        'include_cancelled' => 'getIncludeCancelled',
        'include_geopath' => 'getIncludeGeopath',
        'expand' => 'getExpand'
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

    public const EXPAND_ALL = 'All';
    public const EXPAND_STOP = 'Stop';
    public const EXPAND_ROUTE = 'Route';
    public const EXPAND_RUN = 'Run';
    public const EXPAND_DIRECTION = 'Direction';
    public const EXPAND_DISRUPTION = 'Disruption';
    public const EXPAND_VEHICLE_DESCRIPTOR = 'VehicleDescriptor';
    public const EXPAND_VEHICLE_POSITION = 'VehiclePosition';
    public const EXPAND_NONE = 'None';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getExpandAllowableValues()
    {
        return [
            self::EXPAND_ALL,
            self::EXPAND_STOP,
            self::EXPAND_ROUTE,
            self::EXPAND_RUN,
            self::EXPAND_DIRECTION,
            self::EXPAND_DISRUPTION,
            self::EXPAND_VEHICLE_DESCRIPTOR,
            self::EXPAND_VEHICLE_POSITION,
            self::EXPAND_NONE,
        ];
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
        $this->setIfExists('requests', $data ?? [], null);
        $this->setIfExists('date_utc', $data ?? [], null);
        $this->setIfExists('look_backwards', $data ?? [], null);
        $this->setIfExists('include_cancelled', $data ?? [], null);
        $this->setIfExists('include_geopath', $data ?? [], null);
        $this->setIfExists('expand', $data ?? [], null);
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

        if ($this->container['requests'] === null) {
            $invalidProperties[] = "'requests' can't be null";
        }
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
     * Gets requests
     *
     * @return \OpenAPI\Client\Model\V3StopDepartureRequest[]
     */
    public function getRequests()
    {
        return $this->container['requests'];
    }

    /**
     * Sets requests
     *
     * @param \OpenAPI\Client\Model\V3StopDepartureRequest[] $requests Collection of departure requests
     *
     * @return self
     */
    public function setRequests($requests)
    {
        if (is_null($requests)) {
            throw new \InvalidArgumentException('non-nullable requests cannot be null');
        }
        $this->container['requests'] = $requests;

        return $this;
    }

    /**
     * Gets date_utc
     *
     * @return \DateTime|null
     */
    public function getDateUtc()
    {
        return $this->container['date_utc'];
    }

    /**
     * Sets date_utc
     *
     * @param \DateTime|null $date_utc Filter by the date and time of the request (ISO 8601 UTC format) (default = current date and time)
     *
     * @return self
     */
    public function setDateUtc($date_utc)
    {
        if (is_null($date_utc)) {
            throw new \InvalidArgumentException('non-nullable date_utc cannot be null');
        }
        $this->container['date_utc'] = $date_utc;

        return $this;
    }

    /**
     * Gets look_backwards
     *
     * @return bool|null
     */
    public function getLookBackwards()
    {
        return $this->container['look_backwards'];
    }

    /**
     * Sets look_backwards
     *
     * @param bool|null $look_backwards Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default = false). Requires max_results &gt; 0.
     *
     * @return self
     */
    public function setLookBackwards($look_backwards)
    {
        if (is_null($look_backwards)) {
            throw new \InvalidArgumentException('non-nullable look_backwards cannot be null');
        }
        $this->container['look_backwards'] = $look_backwards;

        return $this;
    }

    /**
     * Gets include_cancelled
     *
     * @return bool|null
     */
    public function getIncludeCancelled()
    {
        return $this->container['include_cancelled'];
    }

    /**
     * Sets include_cancelled
     *
     * @param bool|null $include_cancelled Indicates if cancelled services (if they exist) are returned (default = false) - metropolitan train only
     *
     * @return self
     */
    public function setIncludeCancelled($include_cancelled)
    {
        if (is_null($include_cancelled)) {
            throw new \InvalidArgumentException('non-nullable include_cancelled cannot be null');
        }
        $this->container['include_cancelled'] = $include_cancelled;

        return $this;
    }

    /**
     * Gets include_geopath
     *
     * @return bool|null
     */
    public function getIncludeGeopath()
    {
        return $this->container['include_geopath'];
    }

    /**
     * Sets include_geopath
     *
     * @param bool|null $include_geopath Indicates if the route geopath should be returned
     *
     * @return self
     */
    public function setIncludeGeopath($include_geopath)
    {
        if (is_null($include_geopath)) {
            throw new \InvalidArgumentException('non-nullable include_geopath cannot be null');
        }
        $this->container['include_geopath'] = $include_geopath;

        return $this;
    }

    /**
     * Gets expand
     *
     * @return string[]|null
     */
    public function getExpand()
    {
        return $this->container['expand'];
    }

    /**
     * Sets expand
     *
     * @param string[]|null $expand List objects to be returned in full (i.e. expanded) - options include: all, stop, route, run, direction, disruption, none
     *
     * @return self
     */
    public function setExpand($expand)
    {
        if (is_null($expand)) {
            throw new \InvalidArgumentException('non-nullable expand cannot be null');
        }
        $allowedValues = $this->getExpandAllowableValues();
        if (array_diff($expand, $allowedValues)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'expand', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['expand'] = $expand;

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


