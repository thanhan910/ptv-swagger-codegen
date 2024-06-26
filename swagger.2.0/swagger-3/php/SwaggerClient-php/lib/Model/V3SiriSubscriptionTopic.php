<?php
/**
 * V3SiriSubscriptionTopic
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
 * Swagger Codegen version: 3.0.54
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
 * V3SiriSubscriptionTopic Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class V3SiriSubscriptionTopic implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'V3.SiriSubscriptionTopic';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'line_ref' => 'string',
        'direction_ref' => 'int',
        'route_type' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'line_ref' => null,
        'direction_ref' => 'int32',
        'route_type' => 'int32'
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
        'line_ref' => 'line_ref',
        'direction_ref' => 'direction_ref',
        'route_type' => 'route_type'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'line_ref' => 'setLineRef',
        'direction_ref' => 'setDirectionRef',
        'route_type' => 'setRouteType'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'line_ref' => 'getLineRef',
        'direction_ref' => 'getDirectionRef',
        'route_type' => 'getRouteType'
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

    const DIRECTION_REF_1 = 1;
    const DIRECTION_REF_2 = 2;
    const DIRECTION_REF_5 = 5;
    const DIRECTION_REF_10 = 10;
    const DIRECTION_REF_16 = 16;
    const DIRECTION_REF_32 = 32;
    const DIRECTION_REF_65 = 65;
    const DIRECTION_REF_130 = 130;
    const ROUTE_TYPE_0 = 0;
    const ROUTE_TYPE_1 = 1;
    const ROUTE_TYPE_2 = 2;
    const ROUTE_TYPE_3 = 3;
    const ROUTE_TYPE_4 = 4;

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getDirectionRefAllowableValues()
    {
        return [
            self::DIRECTION_REF_1,
            self::DIRECTION_REF_2,
            self::DIRECTION_REF_5,
            self::DIRECTION_REF_10,
            self::DIRECTION_REF_16,
            self::DIRECTION_REF_32,
            self::DIRECTION_REF_65,
            self::DIRECTION_REF_130,
        ];
    }
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getRouteTypeAllowableValues()
    {
        return [
            self::ROUTE_TYPE_0
            self::ROUTE_TYPE_1
            self::ROUTE_TYPE_2
            self::ROUTE_TYPE_3
            self::ROUTE_TYPE_4
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
        $this->container['line_ref'] = isset($data['line_ref']) ? $data['line_ref'] : null;
        $this->container['direction_ref'] = isset($data['direction_ref']) ? $data['direction_ref'] : null;
        $this->container['route_type'] = isset($data['route_type']) ? $data['route_type'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['line_ref'] === null) {
            $invalidProperties[] = "'line_ref' can't be null";
        }
        $allowedValues = $this->getDirectionRefAllowableValues();
        if (!is_null($this->container['direction_ref']) && !in_array($this->container['direction_ref'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'direction_ref', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['route_type'] === null) {
            $invalidProperties[] = "'route_type' can't be null";
        }
        $allowedValues = $this->getRouteTypeAllowableValues();
        if (!is_null($this->container['route_type']) && !in_array($this->container['route_type'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'route_type', must be one of '%s'",
                implode("', '", $allowedValues)
            );
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
     * Gets line_ref
     *
     * @return string
     */
    public function getLineRef()
    {
        return $this->container['line_ref'];
    }

    /**
     * Sets line_ref
     *
     * @param string $line_ref Siri LineRef
     *
     * @return $this
     */
    public function setLineRef($line_ref)
    {
        $this->container['line_ref'] = $line_ref;

        return $this;
    }

    /**
     * Gets direction_ref
     *
     * @return int
     */
    public function getDirectionRef()
    {
        return $this->container['direction_ref'];
    }

    /**
     * Sets direction_ref
     *
     * @param int $direction_ref Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound)
     *
     * @return $this
     */
    public function setDirectionRef($direction_ref)
    {
        $allowedValues = $this->getDirectionRefAllowableValues();
        if (!is_null($direction_ref) && !in_array($direction_ref, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'direction_ref', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['direction_ref'] = $direction_ref;

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
     * @param int $route_type Route Type eg. 0 (Train) 1 (Tram) 2 (Bus) 3 (Vline) 4 (NightRider)
     *
     * @return $this
     */
    public function setRouteType($route_type)
    {
        $allowedValues = $this->getRouteTypeAllowableValues();
        if (!in_array($route_type, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'route_type', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['route_type'] = $route_type;

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
