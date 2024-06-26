<?php
/**
 * V3SiriProductionTimetableSubscriptionRequest
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
 * V3SiriProductionTimetableSubscriptionRequest Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class V3SiriProductionTimetableSubscriptionRequest implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'V3.SiriProductionTimetableSubscriptionRequest';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'start_time' => '\DateTime',
        'end_time' => '\DateTime',
        'subscriber_ref' => 'string',
        'subscription_ref' => 'string',
        'siri_format' => 'int',
        'siri_version' => 'string',
        'consumer_address' => 'string',
        'initial_termination_time' => '\DateTime',
        'topics' => '\Swagger\Client\Model\V3SiriSubscriptionTopic[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'start_time' => 'date-time',
        'end_time' => 'date-time',
        'subscriber_ref' => null,
        'subscription_ref' => null,
        'siri_format' => 'int32',
        'siri_version' => null,
        'consumer_address' => null,
        'initial_termination_time' => 'date-time',
        'topics' => null
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
        'start_time' => 'start_time',
        'end_time' => 'end_time',
        'subscriber_ref' => 'subscriber_ref',
        'subscription_ref' => 'subscription_ref',
        'siri_format' => 'siri_format',
        'siri_version' => 'siri_version',
        'consumer_address' => 'consumer_address',
        'initial_termination_time' => 'initial_termination_time',
        'topics' => 'topics'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'start_time' => 'setStartTime',
        'end_time' => 'setEndTime',
        'subscriber_ref' => 'setSubscriberRef',
        'subscription_ref' => 'setSubscriptionRef',
        'siri_format' => 'setSiriFormat',
        'siri_version' => 'setSiriVersion',
        'consumer_address' => 'setConsumerAddress',
        'initial_termination_time' => 'setInitialTerminationTime',
        'topics' => 'setTopics'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'start_time' => 'getStartTime',
        'end_time' => 'getEndTime',
        'subscriber_ref' => 'getSubscriberRef',
        'subscription_ref' => 'getSubscriptionRef',
        'siri_format' => 'getSiriFormat',
        'siri_version' => 'getSiriVersion',
        'consumer_address' => 'getConsumerAddress',
        'initial_termination_time' => 'getInitialTerminationTime',
        'topics' => 'getTopics'
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

    const SIRI_FORMAT_0 = 0;
    const SIRI_FORMAT_1 = 1;

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getSiriFormatAllowableValues()
    {
        return [
            self::SIRI_FORMAT_0,
            self::SIRI_FORMAT_1,
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
        $this->container['start_time'] = isset($data['start_time']) ? $data['start_time'] : null;
        $this->container['end_time'] = isset($data['end_time']) ? $data['end_time'] : null;
        $this->container['subscriber_ref'] = isset($data['subscriber_ref']) ? $data['subscriber_ref'] : null;
        $this->container['subscription_ref'] = isset($data['subscription_ref']) ? $data['subscription_ref'] : null;
        $this->container['siri_format'] = isset($data['siri_format']) ? $data['siri_format'] : null;
        $this->container['siri_version'] = isset($data['siri_version']) ? $data['siri_version'] : null;
        $this->container['consumer_address'] = isset($data['consumer_address']) ? $data['consumer_address'] : null;
        $this->container['initial_termination_time'] = isset($data['initial_termination_time']) ? $data['initial_termination_time'] : null;
        $this->container['topics'] = isset($data['topics']) ? $data['topics'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['start_time'] === null) {
            $invalidProperties[] = "'start_time' can't be null";
        }
        if ($this->container['end_time'] === null) {
            $invalidProperties[] = "'end_time' can't be null";
        }
        if ($this->container['subscriber_ref'] === null) {
            $invalidProperties[] = "'subscriber_ref' can't be null";
        }
        if ($this->container['subscription_ref'] === null) {
            $invalidProperties[] = "'subscription_ref' can't be null";
        }
        if ($this->container['siri_format'] === null) {
            $invalidProperties[] = "'siri_format' can't be null";
        }
        $allowedValues = $this->getSiriFormatAllowableValues();
        if (!is_null($this->container['siri_format']) && !in_array($this->container['siri_format'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'siri_format', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['siri_version'] === null) {
            $invalidProperties[] = "'siri_version' can't be null";
        }
        if ($this->container['consumer_address'] === null) {
            $invalidProperties[] = "'consumer_address' can't be null";
        }
        if ($this->container['initial_termination_time'] === null) {
            $invalidProperties[] = "'initial_termination_time' can't be null";
        }
        if ($this->container['topics'] === null) {
            $invalidProperties[] = "'topics' can't be null";
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
     * Gets start_time
     *
     * @return \DateTime
     */
    public function getStartTime()
    {
        return $this->container['start_time'];
    }

    /**
     * Sets start_time
     *
     * @param \DateTime $start_time Siri Start Time of the Validity Period
     *
     * @return $this
     */
    public function setStartTime($start_time)
    {
        $this->container['start_time'] = $start_time;

        return $this;
    }

    /**
     * Gets end_time
     *
     * @return \DateTime
     */
    public function getEndTime()
    {
        return $this->container['end_time'];
    }

    /**
     * Sets end_time
     *
     * @param \DateTime $end_time Siri End Time of the Validity Period
     *
     * @return $this
     */
    public function setEndTime($end_time)
    {
        $this->container['end_time'] = $end_time;

        return $this;
    }

    /**
     * Gets subscriber_ref
     *
     * @return string
     */
    public function getSubscriberRef()
    {
        return $this->container['subscriber_ref'];
    }

    /**
     * Sets subscriber_ref
     *
     * @param string $subscriber_ref Siri Subscriber Ref
     *
     * @return $this
     */
    public function setSubscriberRef($subscriber_ref)
    {
        $this->container['subscriber_ref'] = $subscriber_ref;

        return $this;
    }

    /**
     * Gets subscription_ref
     *
     * @return string
     */
    public function getSubscriptionRef()
    {
        return $this->container['subscription_ref'];
    }

    /**
     * Sets subscription_ref
     *
     * @param string $subscription_ref Siri Subscription Ref - Unique to a Subscriber Ref
     *
     * @return $this
     */
    public function setSubscriptionRef($subscription_ref)
    {
        $this->container['subscription_ref'] = $subscription_ref;

        return $this;
    }

    /**
     * Gets siri_format
     *
     * @return int
     */
    public function getSiriFormat()
    {
        return $this->container['siri_format'];
    }

    /**
     * Sets siri_format
     *
     * @param int $siri_format Siri Message Format 'xml' or 'json'
     *
     * @return $this
     */
    public function setSiriFormat($siri_format)
    {
        $allowedValues = $this->getSiriFormatAllowableValues();
        if (!in_array($siri_format, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'siri_format', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['siri_format'] = $siri_format;

        return $this;
    }

    /**
     * Gets siri_version
     *
     * @return string
     */
    public function getSiriVersion()
    {
        return $this->container['siri_version'];
    }

    /**
     * Sets siri_version
     *
     * @param string $siri_version Siri Message Version '1.3' or '2.0'
     *
     * @return $this
     */
    public function setSiriVersion($siri_version)
    {
        $this->container['siri_version'] = $siri_version;

        return $this;
    }

    /**
     * Gets consumer_address
     *
     * @return string
     */
    public function getConsumerAddress()
    {
        return $this->container['consumer_address'];
    }

    /**
     * Sets consumer_address
     *
     * @param string $consumer_address Siri Consumer Address - Baseline and Updates will be sent to this address
     *
     * @return $this
     */
    public function setConsumerAddress($consumer_address)
    {
        $this->container['consumer_address'] = $consumer_address;

        return $this;
    }

    /**
     * Gets initial_termination_time
     *
     * @return \DateTime
     */
    public function getInitialTerminationTime()
    {
        return $this->container['initial_termination_time'];
    }

    /**
     * Sets initial_termination_time
     *
     * @param \DateTime $initial_termination_time Siri Initial Termination Time - Expiry of the subscription
     *
     * @return $this
     */
    public function setInitialTerminationTime($initial_termination_time)
    {
        $this->container['initial_termination_time'] = $initial_termination_time;

        return $this;
    }

    /**
     * Gets topics
     *
     * @return \Swagger\Client\Model\V3SiriSubscriptionTopic[]
     */
    public function getTopics()
    {
        return $this->container['topics'];
    }

    /**
     * Sets topics
     *
     * @param \Swagger\Client\Model\V3SiriSubscriptionTopic[] $topics topics
     *
     * @return $this
     */
    public function setTopics($topics)
    {
        $this->container['topics'] = $topics;

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
