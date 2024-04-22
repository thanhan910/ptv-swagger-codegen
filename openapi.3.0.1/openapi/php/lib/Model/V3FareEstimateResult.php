<?php
/**
 * V3FareEstimateResult
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
 * V3FareEstimateResult Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class V3FareEstimateResult implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'V3.FareEstimateResult';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'is_early_bird' => 'bool',
        'is_journey_in_free_tram_zone' => 'bool',
        'is_this_weekend_journey' => 'bool',
        'zone_info' => '\OpenAPI\Client\Model\V3ZoneInfo',
        'passenger_fares' => '\OpenAPI\Client\Model\V3PassengerFare[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'is_early_bird' => null,
        'is_journey_in_free_tram_zone' => null,
        'is_this_weekend_journey' => null,
        'zone_info' => null,
        'passenger_fares' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'is_early_bird' => false,
        'is_journey_in_free_tram_zone' => false,
        'is_this_weekend_journey' => false,
        'zone_info' => false,
        'passenger_fares' => false
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
        'is_early_bird' => 'IsEarlyBird',
        'is_journey_in_free_tram_zone' => 'IsJourneyInFreeTramZone',
        'is_this_weekend_journey' => 'IsThisWeekendJourney',
        'zone_info' => 'ZoneInfo',
        'passenger_fares' => 'PassengerFares'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'is_early_bird' => 'setIsEarlyBird',
        'is_journey_in_free_tram_zone' => 'setIsJourneyInFreeTramZone',
        'is_this_weekend_journey' => 'setIsThisWeekendJourney',
        'zone_info' => 'setZoneInfo',
        'passenger_fares' => 'setPassengerFares'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'is_early_bird' => 'getIsEarlyBird',
        'is_journey_in_free_tram_zone' => 'getIsJourneyInFreeTramZone',
        'is_this_weekend_journey' => 'getIsThisWeekendJourney',
        'zone_info' => 'getZoneInfo',
        'passenger_fares' => 'getPassengerFares'
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
        $this->setIfExists('is_early_bird', $data ?? [], null);
        $this->setIfExists('is_journey_in_free_tram_zone', $data ?? [], null);
        $this->setIfExists('is_this_weekend_journey', $data ?? [], null);
        $this->setIfExists('zone_info', $data ?? [], null);
        $this->setIfExists('passenger_fares', $data ?? [], null);
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
     * Gets is_early_bird
     *
     * @return bool|null
     */
    public function getIsEarlyBird()
    {
        return $this->container['is_early_bird'];
    }

    /**
     * Sets is_early_bird
     *
     * @param bool|null $is_early_bird is_early_bird
     *
     * @return self
     */
    public function setIsEarlyBird($is_early_bird)
    {
        if (is_null($is_early_bird)) {
            throw new \InvalidArgumentException('non-nullable is_early_bird cannot be null');
        }
        $this->container['is_early_bird'] = $is_early_bird;

        return $this;
    }

    /**
     * Gets is_journey_in_free_tram_zone
     *
     * @return bool|null
     */
    public function getIsJourneyInFreeTramZone()
    {
        return $this->container['is_journey_in_free_tram_zone'];
    }

    /**
     * Sets is_journey_in_free_tram_zone
     *
     * @param bool|null $is_journey_in_free_tram_zone is_journey_in_free_tram_zone
     *
     * @return self
     */
    public function setIsJourneyInFreeTramZone($is_journey_in_free_tram_zone)
    {
        if (is_null($is_journey_in_free_tram_zone)) {
            throw new \InvalidArgumentException('non-nullable is_journey_in_free_tram_zone cannot be null');
        }
        $this->container['is_journey_in_free_tram_zone'] = $is_journey_in_free_tram_zone;

        return $this;
    }

    /**
     * Gets is_this_weekend_journey
     *
     * @return bool|null
     */
    public function getIsThisWeekendJourney()
    {
        return $this->container['is_this_weekend_journey'];
    }

    /**
     * Sets is_this_weekend_journey
     *
     * @param bool|null $is_this_weekend_journey is_this_weekend_journey
     *
     * @return self
     */
    public function setIsThisWeekendJourney($is_this_weekend_journey)
    {
        if (is_null($is_this_weekend_journey)) {
            throw new \InvalidArgumentException('non-nullable is_this_weekend_journey cannot be null');
        }
        $this->container['is_this_weekend_journey'] = $is_this_weekend_journey;

        return $this;
    }

    /**
     * Gets zone_info
     *
     * @return \OpenAPI\Client\Model\V3ZoneInfo|null
     */
    public function getZoneInfo()
    {
        return $this->container['zone_info'];
    }

    /**
     * Sets zone_info
     *
     * @param \OpenAPI\Client\Model\V3ZoneInfo|null $zone_info zone_info
     *
     * @return self
     */
    public function setZoneInfo($zone_info)
    {
        if (is_null($zone_info)) {
            throw new \InvalidArgumentException('non-nullable zone_info cannot be null');
        }
        $this->container['zone_info'] = $zone_info;

        return $this;
    }

    /**
     * Gets passenger_fares
     *
     * @return \OpenAPI\Client\Model\V3PassengerFare[]|null
     */
    public function getPassengerFares()
    {
        return $this->container['passenger_fares'];
    }

    /**
     * Sets passenger_fares
     *
     * @param \OpenAPI\Client\Model\V3PassengerFare[]|null $passenger_fares passenger_fares
     *
     * @return self
     */
    public function setPassengerFares($passenger_fares)
    {
        if (is_null($passenger_fares)) {
            throw new \InvalidArgumentException('non-nullable passenger_fares cannot be null');
        }
        $this->container['passenger_fares'] = $passenger_fares;

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


