/* 
 * PTV Timetable API - Version 3
 *
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * OpenAPI spec version: v3
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;
namespace IO.Swagger.Model
{
    /// <summary>
    /// V3VehicleDescriptor
    /// </summary>
    [DataContract]
        public partial class V3VehicleDescriptor :  IEquatable<V3VehicleDescriptor>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="V3VehicleDescriptor" /> class.
        /// </summary>
        /// <param name="_operator">Operator name of the vehicle such as \&quot;Metro Trains Melbourne\&quot;, \&quot;Yarra Trams\&quot;, \&quot;Ventura Bus Line\&quot;, \&quot;CDC\&quot; or \&quot;Sita Bus Lines\&quot; . May be null/empty.  Only available for train, tram, v/line and some bus runs..</param>
        /// <param name="id">Operator identifier of the vehicle such as \&quot;26094\&quot;. May be null/empty. Only available for some tram and bus runs..</param>
        /// <param name="lowFloor">Indicator if vehicle has a low floor. May be null. Only available for some tram runs..</param>
        /// <param name="airConditioned">Indicator if vehicle is air conditioned. May be null. Only available for some tram runs..</param>
        /// <param name="description">Vehicle description such as \&quot;6 Car Comeng\&quot;, \&quot;6 Car Xtrapolis\&quot;, \&quot;3 Car Comeng\&quot;, \&quot;6 Car Siemens\&quot;, \&quot;3 Car Siemens\&quot;. May be null/empty.  Only available for some metropolitan train runs..</param>
        /// <param name="supplier">Supplier of vehicle descriptor data..</param>
        /// <param name="length">The length of the vehicle. Applies to CIS - Metro Trains.</param>
        public V3VehicleDescriptor(string _operator = default(string), string id = default(string), bool? lowFloor = default(bool?), bool? airConditioned = default(bool?), string description = default(string), string supplier = default(string), string length = default(string))
        {
            this._Operator = _operator;
            this.Id = id;
            this.LowFloor = lowFloor;
            this.AirConditioned = airConditioned;
            this.Description = description;
            this.Supplier = supplier;
            this.Length = length;
        }
        
        /// <summary>
        /// Operator name of the vehicle such as \&quot;Metro Trains Melbourne\&quot;, \&quot;Yarra Trams\&quot;, \&quot;Ventura Bus Line\&quot;, \&quot;CDC\&quot; or \&quot;Sita Bus Lines\&quot; . May be null/empty.  Only available for train, tram, v/line and some bus runs.
        /// </summary>
        /// <value>Operator name of the vehicle such as \&quot;Metro Trains Melbourne\&quot;, \&quot;Yarra Trams\&quot;, \&quot;Ventura Bus Line\&quot;, \&quot;CDC\&quot; or \&quot;Sita Bus Lines\&quot; . May be null/empty.  Only available for train, tram, v/line and some bus runs.</value>
        [DataMember(Name="operator", EmitDefaultValue=false)]
        public string _Operator { get; set; }

        /// <summary>
        /// Operator identifier of the vehicle such as \&quot;26094\&quot;. May be null/empty. Only available for some tram and bus runs.
        /// </summary>
        /// <value>Operator identifier of the vehicle such as \&quot;26094\&quot;. May be null/empty. Only available for some tram and bus runs.</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Indicator if vehicle has a low floor. May be null. Only available for some tram runs.
        /// </summary>
        /// <value>Indicator if vehicle has a low floor. May be null. Only available for some tram runs.</value>
        [DataMember(Name="low_floor", EmitDefaultValue=false)]
        public bool? LowFloor { get; set; }

        /// <summary>
        /// Indicator if vehicle is air conditioned. May be null. Only available for some tram runs.
        /// </summary>
        /// <value>Indicator if vehicle is air conditioned. May be null. Only available for some tram runs.</value>
        [DataMember(Name="air_conditioned", EmitDefaultValue=false)]
        public bool? AirConditioned { get; set; }

        /// <summary>
        /// Vehicle description such as \&quot;6 Car Comeng\&quot;, \&quot;6 Car Xtrapolis\&quot;, \&quot;3 Car Comeng\&quot;, \&quot;6 Car Siemens\&quot;, \&quot;3 Car Siemens\&quot;. May be null/empty.  Only available for some metropolitan train runs.
        /// </summary>
        /// <value>Vehicle description such as \&quot;6 Car Comeng\&quot;, \&quot;6 Car Xtrapolis\&quot;, \&quot;3 Car Comeng\&quot;, \&quot;6 Car Siemens\&quot;, \&quot;3 Car Siemens\&quot;. May be null/empty.  Only available for some metropolitan train runs.</value>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public string Description { get; set; }

        /// <summary>
        /// Supplier of vehicle descriptor data.
        /// </summary>
        /// <value>Supplier of vehicle descriptor data.</value>
        [DataMember(Name="supplier", EmitDefaultValue=false)]
        public string Supplier { get; set; }

        /// <summary>
        /// The length of the vehicle. Applies to CIS - Metro Trains
        /// </summary>
        /// <value>The length of the vehicle. Applies to CIS - Metro Trains</value>
        [DataMember(Name="length", EmitDefaultValue=false)]
        public string Length { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V3VehicleDescriptor {\n");
            sb.Append("  _Operator: ").Append(_Operator).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  LowFloor: ").Append(LowFloor).Append("\n");
            sb.Append("  AirConditioned: ").Append(AirConditioned).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Supplier: ").Append(Supplier).Append("\n");
            sb.Append("  Length: ").Append(Length).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as V3VehicleDescriptor);
        }

        /// <summary>
        /// Returns true if V3VehicleDescriptor instances are equal
        /// </summary>
        /// <param name="input">Instance of V3VehicleDescriptor to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V3VehicleDescriptor input)
        {
            if (input == null)
                return false;

            return 
                (
                    this._Operator == input._Operator ||
                    (this._Operator != null &&
                    this._Operator.Equals(input._Operator))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.LowFloor == input.LowFloor ||
                    (this.LowFloor != null &&
                    this.LowFloor.Equals(input.LowFloor))
                ) && 
                (
                    this.AirConditioned == input.AirConditioned ||
                    (this.AirConditioned != null &&
                    this.AirConditioned.Equals(input.AirConditioned))
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Supplier == input.Supplier ||
                    (this.Supplier != null &&
                    this.Supplier.Equals(input.Supplier))
                ) && 
                (
                    this.Length == input.Length ||
                    (this.Length != null &&
                    this.Length.Equals(input.Length))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this._Operator != null)
                    hashCode = hashCode * 59 + this._Operator.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.LowFloor != null)
                    hashCode = hashCode * 59 + this.LowFloor.GetHashCode();
                if (this.AirConditioned != null)
                    hashCode = hashCode * 59 + this.AirConditioned.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.Supplier != null)
                    hashCode = hashCode * 59 + this.Supplier.GetHashCode();
                if (this.Length != null)
                    hashCode = hashCode * 59 + this.Length.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }
}
