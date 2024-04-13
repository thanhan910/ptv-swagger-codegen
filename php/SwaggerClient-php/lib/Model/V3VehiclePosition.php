<?php
/**
 * V3VehiclePosition
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
 * V3VehiclePosition Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class V3VehiclePosition implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'V3.VehiclePosition';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'latitude' => 'double',
        'longitude' => 'double',
        'easting' => 'double',
        'northing' => 'double',
        'direction' => 'string',
        'bearing' => 'double',
        'supplier' => 'string',
        'datetime_utc' => '\DateTime',
        'expiry_time' => '\DateTime'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'latitude' => 'double',
        'longitude' => 'double',
        'easting' => 'double',
        'northing' => 'double',
        'direction' => null,
        'bearing' => 'double',
        'supplier' => null,
        'datetime_utc' => 'date-time',
        'expiry_time' => 'date-time'
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
        'latitude' => 'latitude',
        'longitude' => 'longitude',
        'easting' => 'easting',
        'northing' => 'northing',
        'direction' => 'direction',
        'bearing' => 'bearing',
        'supplier' => 'supplier',
        'datetime_utc' => 'datetime_utc',
        'expiry_time' => 'expiry_time'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'latitude' => 'setLatitude',
        'longitude' => 'setLongitude',
        'easting' => 'setEasting',
        'northing' => 'setNorthing',
        'direction' => 'setDirection',
        'bearing' => 'setBearing',
        'supplier' => 'setSupplier',
        'datetime_utc' => 'setDatetimeUtc',
        'expiry_time' => 'setExpiryTime'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'latitude' => 'getLatitude',
        'longitude' => 'getLongitude',
        'easting' => 'getEasting',
        'northing' => 'getNorthing',
        'direction' => 'getDirection',
        'bearing' => 'getBearing',
        'supplier' => 'getSupplier',
        'datetime_utc' => 'getDatetimeUtc',
        'expiry_time' => 'getExpiryTime'
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
        $this->container['latitude'] = isset($data['latitude']) ? $data['latitude'] : null;
        $this->container['longitude'] = isset($data['longitude']) ? $data['longitude'] : null;
        $this->container['easting'] = isset($data['easting']) ? $data['easting'] : null;
        $this->container['northing'] = isset($data['northing']) ? $data['northing'] : null;
        $this->container['direction'] = isset($data['direction']) ? $data['direction'] : null;
        $this->container['bearing'] = isset($data['bearing']) ? $data['bearing'] : null;
        $this->container['supplier'] = isset($data['supplier']) ? $data['supplier'] : null;
        $this->container['datetime_utc'] = isset($data['datetime_utc']) ? $data['datetime_utc'] : null;
        $this->container['expiry_time'] = isset($data['expiry_time']) ? $data['expiry_time'] : null;
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
     * Gets latitude
     *
     * @return double
     */
    public function getLatitude()
    {
        return $this->container['latitude'];
    }

    /**
     * Sets latitude
     *
     * @param double $latitude Geographic coordinate of latitude of the vehicle when known. May be null.  Only available for some bus runs.
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
     * @return double
     */
    public function getLongitude()
    {
        return $this->container['longitude'];
    }

    /**
     * Sets longitude
     *
     * @param double $longitude Geographic coordinate of longitude of the vehicle when known.   Only available for some bus runs.
     *
     * @return $this
     */
    public function setLongitude($longitude)
    {
        $this->container['longitude'] = $longitude;

        return $this;
    }

    /**
     * Gets easting
     *
     * @return double
     */
    public function getEasting()
    {
        return $this->container['easting'];
    }

    /**
     * Sets easting
     *
     * @param double $easting CIS - Metro Train Vehicle Location Easting coordinate
     *
     * @return $this
     */
    public function setEasting($easting)
    {
        $this->container['easting'] = $easting;

        return $this;
    }

    /**
     * Gets northing
     *
     * @return double
     */
    public function getNorthing()
    {
        return $this->container['northing'];
    }

    /**
     * Sets northing
     *
     * @param double $northing CIS - Metro Train Vehicle Location Northing coordinate
     *
     * @return $this
     */
    public function setNorthing($northing)
    {
        $this->container['northing'] = $northing;

        return $this;
    }

    /**
     * Gets direction
     *
     * @return string
     */
    public function getDirection()
    {
        return $this->container['direction'];
    }

    /**
     * Sets direction
     *
     * @param string $direction CIS - Metro Train Vehicle Location Direction
     *
     * @return $this
     */
    public function setDirection($direction)
    {
        $this->container['direction'] = $direction;

        return $this;
    }

    /**
     * Gets bearing
     *
     * @return double
     */
    public function getBearing()
    {
        return $this->container['bearing'];
    }

    /**
     * Sets bearing
     *
     * @param double $bearing Compass bearing of the vehicle when known, clockwise from True North, i.e., 0 is North and 90 is East. May be null.  Only available for some bus runs.
     *
     * @return $this
     */
    public function setBearing($bearing)
    {
        $this->container['bearing'] = $bearing;

        return $this;
    }

    /**
     * Gets supplier
     *
     * @return string
     */
    public function getSupplier()
    {
        return $this->container['supplier'];
    }

    /**
     * Sets supplier
     *
     * @param string $supplier Supplier of vehicle position data.
     *
     * @return $this
     */
    public function setSupplier($supplier)
    {
        $this->container['supplier'] = $supplier;

        return $this;
    }

    /**
     * Gets datetime_utc
     *
     * @return \DateTime
     */
    public function getDatetimeUtc()
    {
        return $this->container['datetime_utc'];
    }

    /**
     * Sets datetime_utc
     *
     * @param \DateTime $datetime_utc Date and time that the vehicle position data was supplied.
     *
     * @return $this
     */
    public function setDatetimeUtc($datetime_utc)
    {
        $this->container['datetime_utc'] = $datetime_utc;

        return $this;
    }

    /**
     * Gets expiry_time
     *
     * @return \DateTime
     */
    public function getExpiryTime()
    {
        return $this->container['expiry_time'];
    }

    /**
     * Sets expiry_time
     *
     * @param \DateTime $expiry_time CIS - Metro Train Vehicle Location data expiry time
     *
     * @return $this
     */
    public function setExpiryTime($expiry_time)
    {
        $this->container['expiry_time'] = $expiry_time;

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