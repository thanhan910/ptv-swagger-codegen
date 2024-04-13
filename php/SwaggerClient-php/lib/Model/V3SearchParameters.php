<?php
/**
 * V3SearchParameters
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * PTV Timetable API - Version 3
 *
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.
 *
 * OpenAPI spec version: v3
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 3.0.52
 */
/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;
use \Swagger\Client\ObjectSerializer;

/**
 * V3SearchParameters Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class V3SearchParameters implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'V3.SearchParameters';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'route_types' => 'int[]',
        'latitude' => 'float',
        'longitude' => 'float',
        'max_distance' => 'float',
        'include_addresses' => 'bool',
        'include_outlets' => 'bool',
        'match_stop_by_suburb' => 'bool',
        'match_route_by_suburb' => 'bool',
        'match_stop_by_gtfs_stop_id' => 'bool'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'route_types' => 'int32',
        'latitude' => 'float',
        'longitude' => 'float',
        'max_distance' => 'float',
        'include_addresses' => null,
        'include_outlets' => null,
        'match_stop_by_suburb' => null,
        'match_route_by_suburb' => null,
        'match_stop_by_gtfs_stop_id' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'route_types' => 'route_types',
        'latitude' => 'latitude',
        'longitude' => 'longitude',
        'max_distance' => 'max_distance',
        'include_addresses' => 'include_addresses',
        'include_outlets' => 'include_outlets',
        'match_stop_by_suburb' => 'match_stop_by_suburb',
        'match_route_by_suburb' => 'match_route_by_suburb',
        'match_stop_by_gtfs_stop_id' => 'match_stop_by_gtfs_stop_id'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'route_types' => 'setRouteTypes',
        'latitude' => 'setLatitude',
        'longitude' => 'setLongitude',
        'max_distance' => 'setMaxDistance',
        'include_addresses' => 'setIncludeAddresses',
        'include_outlets' => 'setIncludeOutlets',
        'match_stop_by_suburb' => 'setMatchStopBySuburb',
        'match_route_by_suburb' => 'setMatchRouteBySuburb',
        'match_stop_by_gtfs_stop_id' => 'setMatchStopByGtfsStopId'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'route_types' => 'getRouteTypes',
        'latitude' => 'getLatitude',
        'longitude' => 'getLongitude',
        'max_distance' => 'getMaxDistance',
        'include_addresses' => 'getIncludeAddresses',
        'include_outlets' => 'getIncludeOutlets',
        'match_stop_by_suburb' => 'getMatchStopBySuburb',
        'match_route_by_suburb' => 'getMatchRouteBySuburb',
        'match_stop_by_gtfs_stop_id' => 'getMatchStopByGtfsStopId'
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
        return self::$swaggerModelName;
    }

    const ROUTE_TYPES__0 = '0';
    const ROUTE_TYPES__1 = '1';
    const ROUTE_TYPES__2 = '2';
    const ROUTE_TYPES__3 = '3';
    const ROUTE_TYPES__4 = '4';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getRouteTypesAllowableValues()
    {
        return [
            self::ROUTE_TYPES__0,
            self::ROUTE_TYPES__1,
            self::ROUTE_TYPES__2,
            self::ROUTE_TYPES__3,
            self::ROUTE_TYPES__4,
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
        $this->container['route_types'] = isset($data['route_types']) ? $data['route_types'] : null;
        $this->container['latitude'] = isset($data['latitude']) ? $data['latitude'] : null;
        $this->container['longitude'] = isset($data['longitude']) ? $data['longitude'] : null;
        $this->container['max_distance'] = isset($data['max_distance']) ? $data['max_distance'] : null;
        $this->container['include_addresses'] = isset($data['include_addresses']) ? $data['include_addresses'] : null;
        $this->container['include_outlets'] = isset($data['include_outlets']) ? $data['include_outlets'] : null;
        $this->container['match_stop_by_suburb'] = isset($data['match_stop_by_suburb']) ? $data['match_stop_by_suburb'] : null;
        $this->container['match_route_by_suburb'] = isset($data['match_route_by_suburb']) ? $data['match_route_by_suburb'] : null;
        $this->container['match_stop_by_gtfs_stop_id'] = isset($data['match_stop_by_gtfs_stop_id']) ? $data['match_stop_by_gtfs_stop_id'] : null;
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
     * Gets route_types
     *
     * @return int[]
     */
    public function getRouteTypes()
    {
        return $this->container['route_types'];
    }

    /**
     * Sets route_types
     *
     * @param int[] $route_types Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified)
     *
     * @return $this
     */
    public function setRouteTypes($route_types)
    {
        $allowedValues = $this->getRouteTypesAllowableValues();
        if (!is_null($route_types) && array_diff($route_types, $allowedValues)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'route_types', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['route_types'] = $route_types;

        return $this;
    }

    /**
     * Gets latitude
     *
     * @return float
     */
    public function getLatitude()
    {
        return $this->container['latitude'];
    }

    /**
     * Sets latitude
     *
     * @param float $latitude Filter by geographic coordinate of latitude
     *
     * @return $this
     */
    public function setLatitude($latitude)
    {
        $this->container['latitude'] = $latitude;

        return $this;
    }

    /**
     * Gets longitude
     *
     * @return float
     */
    public function getLongitude()
    {
        return $this->container['longitude'];
    }

    /**
     * Sets longitude
     *
     * @param float $longitude Filter by geographic coordinate of longitude
     *
     * @return $this
     */
    public function setLongitude($longitude)
    {
        $this->container['longitude'] = $longitude;

        return $this;
    }

    /**
     * Gets max_distance
     *
     * @return float
     */
    public function getMaxDistance()
    {
        return $this->container['max_distance'];
    }

    /**
     * Sets max_distance
     *
     * @param float $max_distance Filter by maximum distance (in metres) from location specified via latitude and longitude parameters
     *
     * @return $this
     */
    public function setMaxDistance($max_distance)
    {
        $this->container['max_distance'] = $max_distance;

        return $this;
    }

    /**
     * Gets include_addresses
     *
     * @return bool
     */
    public function getIncludeAddresses()
    {
        return $this->container['include_addresses'];
    }

    /**
     * Sets include_addresses
     *
     * @param bool $include_addresses Placeholder for future development; currently unavailable
     *
     * @return $this
     */
    public function setIncludeAddresses($include_addresses)
    {
        $this->container['include_addresses'] = $include_addresses;

        return $this;
    }

    /**
     * Gets include_outlets
     *
     * @return bool
     */
    public function getIncludeOutlets()
    {
        return $this->container['include_outlets'];
    }

    /**
     * Sets include_outlets
     *
     * @param bool $include_outlets Indicates if outlets will be returned in response (default = true)
     *
     * @return $this
     */
    public function setIncludeOutlets($include_outlets)
    {
        $this->container['include_outlets'] = $include_outlets;

        return $this;
    }

    /**
     * Gets match_stop_by_suburb
     *
     * @return bool
     */
    public function getMatchStopBySuburb()
    {
        return $this->container['match_stop_by_suburb'];
    }

    /**
     * Sets match_stop_by_suburb
     *
     * @param bool $match_stop_by_suburb Indicates whether to find stops by suburbs in the search term (default = true)
     *
     * @return $this
     */
    public function setMatchStopBySuburb($match_stop_by_suburb)
    {
        $this->container['match_stop_by_suburb'] = $match_stop_by_suburb;

        return $this;
    }

    /**
     * Gets match_route_by_suburb
     *
     * @return bool
     */
    public function getMatchRouteBySuburb()
    {
        return $this->container['match_route_by_suburb'];
    }

    /**
     * Sets match_route_by_suburb
     *
     * @param bool $match_route_by_suburb Indicates whether to find routes by suburbs in the search term (default = true)
     *
     * @return $this
     */
    public function setMatchRouteBySuburb($match_route_by_suburb)
    {
        $this->container['match_route_by_suburb'] = $match_route_by_suburb;

        return $this;
    }

    /**
     * Gets match_stop_by_gtfs_stop_id
     *
     * @return bool
     */
    public function getMatchStopByGtfsStopId()
    {
        return $this->container['match_stop_by_gtfs_stop_id'];
    }

    /**
     * Sets match_stop_by_gtfs_stop_id
     *
     * @param bool $match_stop_by_gtfs_stop_id Indicates whether to search for stops according to a metlink stop ID (default = false)
     *
     * @return $this
     */
    public function setMatchStopByGtfsStopId($match_stop_by_gtfs_stop_id)
    {
        $this->container['match_stop_by_gtfs_stop_id'] = $match_stop_by_gtfs_stop_id;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    #[\ReturnTypeWillChange]
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    #[\ReturnTypeWillChange]
    public function offsetSet($offset, $value)
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
    #[\ReturnTypeWillChange]
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}