<?php
/**
 * V3StopTicket
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
 * V3StopTicket Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class V3StopTicket implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'V3.StopTicket';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'ticket_type' => 'string',
        'zone' => 'string',
        'is_free_fare_zone' => 'bool',
        'ticket_machine' => 'bool',
        'ticket_checks' => 'bool',
        'vline_reservation' => 'bool',
        'ticket_zones' => 'int[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'ticket_type' => null,
        'zone' => null,
        'is_free_fare_zone' => null,
        'ticket_machine' => null,
        'ticket_checks' => null,
        'vline_reservation' => null,
        'ticket_zones' => 'int32'
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
        'ticket_type' => 'ticket_type',
        'zone' => 'zone',
        'is_free_fare_zone' => 'is_free_fare_zone',
        'ticket_machine' => 'ticket_machine',
        'ticket_checks' => 'ticket_checks',
        'vline_reservation' => 'vline_reservation',
        'ticket_zones' => 'ticket_zones'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'ticket_type' => 'setTicketType',
        'zone' => 'setZone',
        'is_free_fare_zone' => 'setIsFreeFareZone',
        'ticket_machine' => 'setTicketMachine',
        'ticket_checks' => 'setTicketChecks',
        'vline_reservation' => 'setVlineReservation',
        'ticket_zones' => 'setTicketZones'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'ticket_type' => 'getTicketType',
        'zone' => 'getZone',
        'is_free_fare_zone' => 'getIsFreeFareZone',
        'ticket_machine' => 'getTicketMachine',
        'ticket_checks' => 'getTicketChecks',
        'vline_reservation' => 'getVlineReservation',
        'ticket_zones' => 'getTicketZones'
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
        $this->container['ticket_type'] = isset($data['ticket_type']) ? $data['ticket_type'] : null;
        $this->container['zone'] = isset($data['zone']) ? $data['zone'] : null;
        $this->container['is_free_fare_zone'] = isset($data['is_free_fare_zone']) ? $data['is_free_fare_zone'] : null;
        $this->container['ticket_machine'] = isset($data['ticket_machine']) ? $data['ticket_machine'] : null;
        $this->container['ticket_checks'] = isset($data['ticket_checks']) ? $data['ticket_checks'] : null;
        $this->container['vline_reservation'] = isset($data['vline_reservation']) ? $data['vline_reservation'] : null;
        $this->container['ticket_zones'] = isset($data['ticket_zones']) ? $data['ticket_zones'] : null;
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
     * Gets ticket_type
     *
     * @return string
     */
    public function getTicketType()
    {
        return $this->container['ticket_type'];
    }

    /**
     * Sets ticket_type
     *
     * @param string $ticket_type Indicates the ticket type for the stop (myki, paper or both)
     *
     * @return $this
     */
    public function setTicketType($ticket_type)
    {
        $this->container['ticket_type'] = $ticket_type;

        return $this;
    }

    /**
     * Gets zone
     *
     * @return string
     */
    public function getZone()
    {
        return $this->container['zone'];
    }

    /**
     * Sets zone
     *
     * @param string $zone Description of the zone
     *
     * @return $this
     */
    public function setZone($zone)
    {
        $this->container['zone'] = $zone;

        return $this;
    }

    /**
     * Gets is_free_fare_zone
     *
     * @return bool
     */
    public function getIsFreeFareZone()
    {
        return $this->container['is_free_fare_zone'];
    }

    /**
     * Sets is_free_fare_zone
     *
     * @param bool $is_free_fare_zone Indicates whether the stop is inside the free fare zone
     *
     * @return $this
     */
    public function setIsFreeFareZone($is_free_fare_zone)
    {
        $this->container['is_free_fare_zone'] = $is_free_fare_zone;

        return $this;
    }

    /**
     * Gets ticket_machine
     *
     * @return bool
     */
    public function getTicketMachine()
    {
        return $this->container['ticket_machine'];
    }

    /**
     * Sets ticket_machine
     *
     * @param bool $ticket_machine ticket_machine
     *
     * @return $this
     */
    public function setTicketMachine($ticket_machine)
    {
        $this->container['ticket_machine'] = $ticket_machine;

        return $this;
    }

    /**
     * Gets ticket_checks
     *
     * @return bool
     */
    public function getTicketChecks()
    {
        return $this->container['ticket_checks'];
    }

    /**
     * Sets ticket_checks
     *
     * @param bool $ticket_checks ticket_checks
     *
     * @return $this
     */
    public function setTicketChecks($ticket_checks)
    {
        $this->container['ticket_checks'] = $ticket_checks;

        return $this;
    }

    /**
     * Gets vline_reservation
     *
     * @return bool
     */
    public function getVlineReservation()
    {
        return $this->container['vline_reservation'];
    }

    /**
     * Sets vline_reservation
     *
     * @param bool $vline_reservation vline_reservation
     *
     * @return $this
     */
    public function setVlineReservation($vline_reservation)
    {
        $this->container['vline_reservation'] = $vline_reservation;

        return $this;
    }

    /**
     * Gets ticket_zones
     *
     * @return int[]
     */
    public function getTicketZones()
    {
        return $this->container['ticket_zones'];
    }

    /**
     * Sets ticket_zones
     *
     * @param int[] $ticket_zones ticket_zones
     *
     * @return $this
     */
    public function setTicketZones($ticket_zones)
    {
        $this->container['ticket_zones'] = $ticket_zones;

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
