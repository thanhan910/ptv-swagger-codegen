<?php
/**
 * V3StopAccessibility
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
 * V3StopAccessibility Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class V3StopAccessibility implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'V3.StopAccessibility';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'lighting' => 'bool',
        'platform_number' => 'int',
        'audio_customer_information' => 'bool',
        'escalator' => 'bool',
        'hearing_loop' => 'bool',
        'lift' => 'bool',
        'stairs' => 'bool',
        'stop_accessible' => 'bool',
        'tactile_ground_surface_indicator' => 'bool',
        'waiting_room' => 'bool',
        'wheelchair' => '\Swagger\Client\Model\V3StopAccessibilityWheelchair'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'lighting' => null,
        'platform_number' => 'int32',
        'audio_customer_information' => null,
        'escalator' => null,
        'hearing_loop' => null,
        'lift' => null,
        'stairs' => null,
        'stop_accessible' => null,
        'tactile_ground_surface_indicator' => null,
        'waiting_room' => null,
        'wheelchair' => null
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
        'lighting' => 'lighting',
        'platform_number' => 'platform_number',
        'audio_customer_information' => 'audio_customer_information',
        'escalator' => 'escalator',
        'hearing_loop' => 'hearing_loop',
        'lift' => 'lift',
        'stairs' => 'stairs',
        'stop_accessible' => 'stop_accessible',
        'tactile_ground_surface_indicator' => 'tactile_ground_surface_indicator',
        'waiting_room' => 'waiting_room',
        'wheelchair' => 'wheelchair'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'lighting' => 'setLighting',
        'platform_number' => 'setPlatformNumber',
        'audio_customer_information' => 'setAudioCustomerInformation',
        'escalator' => 'setEscalator',
        'hearing_loop' => 'setHearingLoop',
        'lift' => 'setLift',
        'stairs' => 'setStairs',
        'stop_accessible' => 'setStopAccessible',
        'tactile_ground_surface_indicator' => 'setTactileGroundSurfaceIndicator',
        'waiting_room' => 'setWaitingRoom',
        'wheelchair' => 'setWheelchair'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'lighting' => 'getLighting',
        'platform_number' => 'getPlatformNumber',
        'audio_customer_information' => 'getAudioCustomerInformation',
        'escalator' => 'getEscalator',
        'hearing_loop' => 'getHearingLoop',
        'lift' => 'getLift',
        'stairs' => 'getStairs',
        'stop_accessible' => 'getStopAccessible',
        'tactile_ground_surface_indicator' => 'getTactileGroundSurfaceIndicator',
        'waiting_room' => 'getWaitingRoom',
        'wheelchair' => 'getWheelchair'
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
        $this->container['lighting'] = isset($data['lighting']) ? $data['lighting'] : null;
        $this->container['platform_number'] = isset($data['platform_number']) ? $data['platform_number'] : null;
        $this->container['audio_customer_information'] = isset($data['audio_customer_information']) ? $data['audio_customer_information'] : null;
        $this->container['escalator'] = isset($data['escalator']) ? $data['escalator'] : null;
        $this->container['hearing_loop'] = isset($data['hearing_loop']) ? $data['hearing_loop'] : null;
        $this->container['lift'] = isset($data['lift']) ? $data['lift'] : null;
        $this->container['stairs'] = isset($data['stairs']) ? $data['stairs'] : null;
        $this->container['stop_accessible'] = isset($data['stop_accessible']) ? $data['stop_accessible'] : null;
        $this->container['tactile_ground_surface_indicator'] = isset($data['tactile_ground_surface_indicator']) ? $data['tactile_ground_surface_indicator'] : null;
        $this->container['waiting_room'] = isset($data['waiting_room']) ? $data['waiting_room'] : null;
        $this->container['wheelchair'] = isset($data['wheelchair']) ? $data['wheelchair'] : null;
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
     * Gets lighting
     *
     * @return bool
     */
    public function getLighting()
    {
        return $this->container['lighting'];
    }

    /**
     * Sets lighting
     *
     * @param bool $lighting Indicates if there is lighting at the stop
     *
     * @return $this
     */
    public function setLighting($lighting)
    {
        $this->container['lighting'] = $lighting;

        return $this;
    }

    /**
     * Gets platform_number
     *
     * @return int
     */
    public function getPlatformNumber()
    {
        return $this->container['platform_number'];
    }

    /**
     * Sets platform_number
     *
     * @param int $platform_number Indicates the platform number for xivic information (Platform 0 indicates general stop facilities)
     *
     * @return $this
     */
    public function setPlatformNumber($platform_number)
    {
        $this->container['platform_number'] = $platform_number;

        return $this;
    }

    /**
     * Gets audio_customer_information
     *
     * @return bool
     */
    public function getAudioCustomerInformation()
    {
        return $this->container['audio_customer_information'];
    }

    /**
     * Sets audio_customer_information
     *
     * @param bool $audio_customer_information Indicates if there is at least one audio customer information at the stop/platform
     *
     * @return $this
     */
    public function setAudioCustomerInformation($audio_customer_information)
    {
        $this->container['audio_customer_information'] = $audio_customer_information;

        return $this;
    }

    /**
     * Gets escalator
     *
     * @return bool
     */
    public function getEscalator()
    {
        return $this->container['escalator'];
    }

    /**
     * Sets escalator
     *
     * @param bool $escalator Indicates if there is at least one accessible escalator at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992)
     *
     * @return $this
     */
    public function setEscalator($escalator)
    {
        $this->container['escalator'] = $escalator;

        return $this;
    }

    /**
     * Gets hearing_loop
     *
     * @return bool
     */
    public function getHearingLoop()
    {
        return $this->container['hearing_loop'];
    }

    /**
     * Sets hearing_loop
     *
     * @param bool $hearing_loop Indicates if there is a hearing loop facility at the stop/platform
     *
     * @return $this
     */
    public function setHearingLoop($hearing_loop)
    {
        $this->container['hearing_loop'] = $hearing_loop;

        return $this;
    }

    /**
     * Gets lift
     *
     * @return bool
     */
    public function getLift()
    {
        return $this->container['lift'];
    }

    /**
     * Sets lift
     *
     * @param bool $lift Indicates if there is an elevator at the stop/platform
     *
     * @return $this
     */
    public function setLift($lift)
    {
        $this->container['lift'] = $lift;

        return $this;
    }

    /**
     * Gets stairs
     *
     * @return bool
     */
    public function getStairs()
    {
        return $this->container['stairs'];
    }

    /**
     * Sets stairs
     *
     * @param bool $stairs Indicates if there are stairs available in the stop
     *
     * @return $this
     */
    public function setStairs($stairs)
    {
        $this->container['stairs'] = $stairs;

        return $this;
    }

    /**
     * Gets stop_accessible
     *
     * @return bool
     */
    public function getStopAccessible()
    {
        return $this->container['stop_accessible'];
    }

    /**
     * Sets stop_accessible
     *
     * @param bool $stop_accessible Indicates if the stop is accessible
     *
     * @return $this
     */
    public function setStopAccessible($stop_accessible)
    {
        $this->container['stop_accessible'] = $stop_accessible;

        return $this;
    }

    /**
     * Gets tactile_ground_surface_indicator
     *
     * @return bool
     */
    public function getTactileGroundSurfaceIndicator()
    {
        return $this->container['tactile_ground_surface_indicator'];
    }

    /**
     * Sets tactile_ground_surface_indicator
     *
     * @param bool $tactile_ground_surface_indicator Indicates if there are tactile tiles (also known as tactile ground surface indicators, or TGSIs) at the stop
     *
     * @return $this
     */
    public function setTactileGroundSurfaceIndicator($tactile_ground_surface_indicator)
    {
        $this->container['tactile_ground_surface_indicator'] = $tactile_ground_surface_indicator;

        return $this;
    }

    /**
     * Gets waiting_room
     *
     * @return bool
     */
    public function getWaitingRoom()
    {
        return $this->container['waiting_room'];
    }

    /**
     * Sets waiting_room
     *
     * @param bool $waiting_room Indicates if there is a general waiting area at the stop
     *
     * @return $this
     */
    public function setWaitingRoom($waiting_room)
    {
        $this->container['waiting_room'] = $waiting_room;

        return $this;
    }

    /**
     * Gets wheelchair
     *
     * @return \Swagger\Client\Model\V3StopAccessibilityWheelchair
     */
    public function getWheelchair()
    {
        return $this->container['wheelchair'];
    }

    /**
     * Sets wheelchair
     *
     * @param \Swagger\Client\Model\V3StopAccessibilityWheelchair $wheelchair Facilities relating to the accessibility of the stop by wheelchair
     *
     * @return $this
     */
    public function setWheelchair($wheelchair)
    {
        $this->container['wheelchair'] = $wheelchair;

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


