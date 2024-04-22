<?php
/**
 * V3ResultStop
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
 * Swagger Codegen version: 2.4.39
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
 * V3ResultStop Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class V3ResultStop implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'V3.ResultStop';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'stop_distance' => 'float',
        'stop_suburb' => 'string',
        'route_type' => 'int',
        'routes' => '\Swagger\Client\Model\V3ResultRoute[]',
        'stop_latitude' => 'float',
        'stop_longitude' => 'float',
        'stop_sequence' => 'int',
        'stop_id' => 'int',
        'stop_name' => 'string',
        'stop_landmark' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'stop_distance' => 'float',
        'stop_suburb' => null,
        'route_type' => 'int32',
        'routes' => null,
        'stop_latitude' => 'float',
        'stop_longitude' => 'float',
        'stop_sequence' => 'int32',
        'stop_id' => 'int32',
        'stop_name' => null,
        'stop_landmark' => null
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
        'stop_distance' => 'stop_distance',
        'stop_suburb' => 'stop_suburb',
        'route_type' => 'route_type',
        'routes' => 'routes',
        'stop_latitude' => 'stop_latitude',
        'stop_longitude' => 'stop_longitude',
        'stop_sequence' => 'stop_sequence',
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
        'stop_distance' => 'setStopDistance',
        'stop_suburb' => 'setStopSuburb',
        'route_type' => 'setRouteType',
        'routes' => 'setRoutes',
        'stop_latitude' => 'setStopLatitude',
        'stop_longitude' => 'setStopLongitude',
        'stop_sequence' => 'setStopSequence',
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
        'stop_distance' => 'getStopDistance',
        'stop_suburb' => 'getStopSuburb',
        'route_type' => 'getRouteType',
        'routes' => 'getRoutes',
        'stop_latitude' => 'getStopLatitude',
        'stop_longitude' => 'getStopLongitude',
        'stop_sequence' => 'getStopSequence',
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
        return self::$swaggerModelName;
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
        $this->container['stop_distance'] = isset($data['stop_distance']) ? $data['stop_distance'] : null;
        $this->container['stop_suburb'] = isset($data['stop_suburb']) ? $data['stop_suburb'] : null;
        $this->container['route_type'] = isset($data['route_type']) ? $data['route_type'] : null;
        $this->container['routes'] = isset($data['routes']) ? $data['routes'] : null;
        $this->container['stop_latitude'] = isset($data['stop_latitude']) ? $data['stop_latitude'] : null;
        $this->container['stop_longitude'] = isset($data['stop_longitude']) ? $data['stop_longitude'] : null;
        $this->container['stop_sequence'] = isset($data['stop_sequence']) ? $data['stop_sequence'] : null;
        $this->container['stop_id'] = isset($data['stop_id']) ? $data['stop_id'] : null;
        $this->container['stop_name'] = isset($data['stop_name']) ? $data['stop_name'] : null;
        $this->container['stop_landmark'] = isset($data['stop_landmark']) ? $data['stop_landmark'] : null;
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
     * Gets stop_distance
     *
     * @return float
     */
    public function getStopDistance()
    {
        return $this->container['stop_distance'];
    }

    /**
     * Sets stop_distance
     *
     * @param float $stop_distance Distance of stop from input location (in metres); returns 0 if no location is input
     *
     * @return $this
     */
    public function setStopDistance($stop_distance)
    {
        $this->container['stop_distance'] = $stop_distance;

        return $this;
    }

    /**
     * Gets stop_suburb
     *
     * @return string
     */
    public function getStopSuburb()
    {
        return $this->container['stop_suburb'];
    }

    /**
     * Sets stop_suburb
     *
     * @param string $stop_suburb suburb of stop
     *
     * @return $this
     */
    public function setStopSuburb($stop_suburb)
    {
        $this->container['stop_suburb'] = $stop_suburb;

        return $this;
    }

    /**
     * Gets route_type
     *
     * @return int
     */
    public function getRouteType()
    {
        return $this->container['route_type'];
    }

    /**
     * Sets route_type
     *
     * @param int $route_type Transport mode identifier
     *
     * @return $this
     */
    public function setRouteType($route_type)
    {
        $this->container['route_type'] = $route_type;

        return $this;
    }

    /**
     * Gets routes
     *
     * @return \Swagger\Client\Model\V3ResultRoute[]
     */
    public function getRoutes()
    {
        return $this->container['routes'];
    }

    /**
     * Sets routes
     *
     * @param \Swagger\Client\Model\V3ResultRoute[] $routes List of routes travelling through the stop
     *
     * @return $this
     */
    public function setRoutes($routes)
    {
        $this->container['routes'] = $routes;

        return $this;
    }

    /**
     * Gets stop_latitude
     *
     * @return float
     */
    public function getStopLatitude()
    {
        return $this->container['stop_latitude'];
    }

    /**
     * Sets stop_latitude
     *
     * @param float $stop_latitude Geographic coordinate of latitude at stop
     *
     * @return $this
     */
    public function setStopLatitude($stop_latitude)
    {
        $this->container['stop_latitude'] = $stop_latitude;

        return $this;
    }

    /**
     * Gets stop_longitude
     *
     * @return float
     */
    public function getStopLongitude()
    {
        return $this->container['stop_longitude'];
    }

    /**
     * Sets stop_longitude
     *
     * @param float $stop_longitude Geographic coordinate of longitude at stop
     *
     * @return $this
     */
    public function setStopLongitude($stop_longitude)
    {
        $this->container['stop_longitude'] = $stop_longitude;

        return $this;
    }

    /**
     * Gets stop_sequence
     *
     * @return int
     */
    public function getStopSequence()
    {
        return $this->container['stop_sequence'];
    }

    /**
     * Sets stop_sequence
     *
     * @param int $stop_sequence Sequence of the stop on the route/run; return 0 when route_id or run_id not specified. Order ascendingly by this field (when non zero) to get physical order (earliest first) of stops on the route_id/run_id.
     *
     * @return $this
     */
    public function setStopSequence($stop_sequence)
    {
        $this->container['stop_sequence'] = $stop_sequence;

        return $this;
    }

    /**
     * Gets stop_id
     *
     * @return int
     */
    public function getStopId()
    {
        return $this->container['stop_id'];
    }

    /**
     * Sets stop_id
     *
     * @param int $stop_id Stop identifier
     *
     * @return $this
     */
    public function setStopId($stop_id)
    {
        $this->container['stop_id'] = $stop_id;

        return $this;
    }

    /**
     * Gets stop_name
     *
     * @return string
     */
    public function getStopName()
    {
        return $this->container['stop_name'];
    }

    /**
     * Sets stop_name
     *
     * @param string $stop_name Name of stop
     *
     * @return $this
     */
    public function setStopName($stop_name)
    {
        $this->container['stop_name'] = $stop_name;

        return $this;
    }

    /**
     * Gets stop_landmark
     *
     * @return string
     */
    public function getStopLandmark()
    {
        return $this->container['stop_landmark'];
    }

    /**
     * Sets stop_landmark
     *
     * @param string $stop_landmark Landmark in proximity of stop
     *
     * @return $this
     */
    public function setStopLandmark($stop_landmark)
    {
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


