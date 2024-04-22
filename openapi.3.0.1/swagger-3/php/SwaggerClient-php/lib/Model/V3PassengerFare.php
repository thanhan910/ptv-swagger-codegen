<?php
/**
 * V3PassengerFare
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
 * V3PassengerFare Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class V3PassengerFare implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'V3.PassengerFare';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'passenger_type' => 'string',
        'fare2_hour_peak' => 'float',
        'fare2_hour_off_peak' => 'float',
        'fare_daily_peak' => 'float',
        'fare_daily_off_peak' => 'float',
        'pass7_days' => 'float',
        'pass28_to69_day_per_day' => 'float',
        'pass70_plus_day_per_day' => 'float',
        'weekend_cap' => 'float',
        'holiday_cap' => 'float'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'passenger_type' => null,
        'fare2_hour_peak' => null,
        'fare2_hour_off_peak' => null,
        'fare_daily_peak' => null,
        'fare_daily_off_peak' => null,
        'pass7_days' => null,
        'pass28_to69_day_per_day' => null,
        'pass70_plus_day_per_day' => null,
        'weekend_cap' => null,
        'holiday_cap' => null
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
        'passenger_type' => 'PassengerType',
        'fare2_hour_peak' => 'Fare2HourPeak',
        'fare2_hour_off_peak' => 'Fare2HourOffPeak',
        'fare_daily_peak' => 'FareDailyPeak',
        'fare_daily_off_peak' => 'FareDailyOffPeak',
        'pass7_days' => 'Pass7Days',
        'pass28_to69_day_per_day' => 'Pass28To69DayPerDay',
        'pass70_plus_day_per_day' => 'Pass70PlusDayPerDay',
        'weekend_cap' => 'WeekendCap',
        'holiday_cap' => 'HolidayCap'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'passenger_type' => 'setPassengerType',
        'fare2_hour_peak' => 'setFare2HourPeak',
        'fare2_hour_off_peak' => 'setFare2HourOffPeak',
        'fare_daily_peak' => 'setFareDailyPeak',
        'fare_daily_off_peak' => 'setFareDailyOffPeak',
        'pass7_days' => 'setPass7Days',
        'pass28_to69_day_per_day' => 'setPass28To69DayPerDay',
        'pass70_plus_day_per_day' => 'setPass70PlusDayPerDay',
        'weekend_cap' => 'setWeekendCap',
        'holiday_cap' => 'setHolidayCap'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'passenger_type' => 'getPassengerType',
        'fare2_hour_peak' => 'getFare2HourPeak',
        'fare2_hour_off_peak' => 'getFare2HourOffPeak',
        'fare_daily_peak' => 'getFareDailyPeak',
        'fare_daily_off_peak' => 'getFareDailyOffPeak',
        'pass7_days' => 'getPass7Days',
        'pass28_to69_day_per_day' => 'getPass28To69DayPerDay',
        'pass70_plus_day_per_day' => 'getPass70PlusDayPerDay',
        'weekend_cap' => 'getWeekendCap',
        'holiday_cap' => 'getHolidayCap'
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
        $this->container['passenger_type'] = isset($data['passenger_type']) ? $data['passenger_type'] : null;
        $this->container['fare2_hour_peak'] = isset($data['fare2_hour_peak']) ? $data['fare2_hour_peak'] : null;
        $this->container['fare2_hour_off_peak'] = isset($data['fare2_hour_off_peak']) ? $data['fare2_hour_off_peak'] : null;
        $this->container['fare_daily_peak'] = isset($data['fare_daily_peak']) ? $data['fare_daily_peak'] : null;
        $this->container['fare_daily_off_peak'] = isset($data['fare_daily_off_peak']) ? $data['fare_daily_off_peak'] : null;
        $this->container['pass7_days'] = isset($data['pass7_days']) ? $data['pass7_days'] : null;
        $this->container['pass28_to69_day_per_day'] = isset($data['pass28_to69_day_per_day']) ? $data['pass28_to69_day_per_day'] : null;
        $this->container['pass70_plus_day_per_day'] = isset($data['pass70_plus_day_per_day']) ? $data['pass70_plus_day_per_day'] : null;
        $this->container['weekend_cap'] = isset($data['weekend_cap']) ? $data['weekend_cap'] : null;
        $this->container['holiday_cap'] = isset($data['holiday_cap']) ? $data['holiday_cap'] : null;
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
     * Gets passenger_type
     *
     * @return string
     */
    public function getPassengerType()
    {
        return $this->container['passenger_type'];
    }

    /**
     * Sets passenger_type
     *
     * @param string $passenger_type passenger_type
     *
     * @return $this
     */
    public function setPassengerType($passenger_type)
    {
        $this->container['passenger_type'] = $passenger_type;

        return $this;
    }

    /**
     * Gets fare2_hour_peak
     *
     * @return float
     */
    public function getFare2HourPeak()
    {
        return $this->container['fare2_hour_peak'];
    }

    /**
     * Sets fare2_hour_peak
     *
     * @param float $fare2_hour_peak fare2_hour_peak
     *
     * @return $this
     */
    public function setFare2HourPeak($fare2_hour_peak)
    {
        $this->container['fare2_hour_peak'] = $fare2_hour_peak;

        return $this;
    }

    /**
     * Gets fare2_hour_off_peak
     *
     * @return float
     */
    public function getFare2HourOffPeak()
    {
        return $this->container['fare2_hour_off_peak'];
    }

    /**
     * Sets fare2_hour_off_peak
     *
     * @param float $fare2_hour_off_peak fare2_hour_off_peak
     *
     * @return $this
     */
    public function setFare2HourOffPeak($fare2_hour_off_peak)
    {
        $this->container['fare2_hour_off_peak'] = $fare2_hour_off_peak;

        return $this;
    }

    /**
     * Gets fare_daily_peak
     *
     * @return float
     */
    public function getFareDailyPeak()
    {
        return $this->container['fare_daily_peak'];
    }

    /**
     * Sets fare_daily_peak
     *
     * @param float $fare_daily_peak fare_daily_peak
     *
     * @return $this
     */
    public function setFareDailyPeak($fare_daily_peak)
    {
        $this->container['fare_daily_peak'] = $fare_daily_peak;

        return $this;
    }

    /**
     * Gets fare_daily_off_peak
     *
     * @return float
     */
    public function getFareDailyOffPeak()
    {
        return $this->container['fare_daily_off_peak'];
    }

    /**
     * Sets fare_daily_off_peak
     *
     * @param float $fare_daily_off_peak fare_daily_off_peak
     *
     * @return $this
     */
    public function setFareDailyOffPeak($fare_daily_off_peak)
    {
        $this->container['fare_daily_off_peak'] = $fare_daily_off_peak;

        return $this;
    }

    /**
     * Gets pass7_days
     *
     * @return float
     */
    public function getPass7Days()
    {
        return $this->container['pass7_days'];
    }

    /**
     * Sets pass7_days
     *
     * @param float $pass7_days pass7_days
     *
     * @return $this
     */
    public function setPass7Days($pass7_days)
    {
        $this->container['pass7_days'] = $pass7_days;

        return $this;
    }

    /**
     * Gets pass28_to69_day_per_day
     *
     * @return float
     */
    public function getPass28To69DayPerDay()
    {
        return $this->container['pass28_to69_day_per_day'];
    }

    /**
     * Sets pass28_to69_day_per_day
     *
     * @param float $pass28_to69_day_per_day pass28_to69_day_per_day
     *
     * @return $this
     */
    public function setPass28To69DayPerDay($pass28_to69_day_per_day)
    {
        $this->container['pass28_to69_day_per_day'] = $pass28_to69_day_per_day;

        return $this;
    }

    /**
     * Gets pass70_plus_day_per_day
     *
     * @return float
     */
    public function getPass70PlusDayPerDay()
    {
        return $this->container['pass70_plus_day_per_day'];
    }

    /**
     * Sets pass70_plus_day_per_day
     *
     * @param float $pass70_plus_day_per_day pass70_plus_day_per_day
     *
     * @return $this
     */
    public function setPass70PlusDayPerDay($pass70_plus_day_per_day)
    {
        $this->container['pass70_plus_day_per_day'] = $pass70_plus_day_per_day;

        return $this;
    }

    /**
     * Gets weekend_cap
     *
     * @return float
     */
    public function getWeekendCap()
    {
        return $this->container['weekend_cap'];
    }

    /**
     * Sets weekend_cap
     *
     * @param float $weekend_cap weekend_cap
     *
     * @return $this
     */
    public function setWeekendCap($weekend_cap)
    {
        $this->container['weekend_cap'] = $weekend_cap;

        return $this;
    }

    /**
     * Gets holiday_cap
     *
     * @return float
     */
    public function getHolidayCap()
    {
        return $this->container['holiday_cap'];
    }

    /**
     * Sets holiday_cap
     *
     * @param float $holiday_cap holiday_cap
     *
     * @return $this
     */
    public function setHolidayCap($holiday_cap)
    {
        $this->container['holiday_cap'] = $holiday_cap;

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
