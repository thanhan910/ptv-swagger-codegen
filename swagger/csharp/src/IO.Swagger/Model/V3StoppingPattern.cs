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
    /// V3StoppingPattern
    /// </summary>
    [DataContract]
    public partial class V3StoppingPattern :  IEquatable<V3StoppingPattern>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="V3StoppingPattern" /> class.
        /// </summary>
        /// <param name="disruptions">Disruption information applicable to relevant routes or stops.</param>
        /// <param name="departures">Timetabled and real-time service departures.</param>
        /// <param name="stops">A train station, tram stop, bus stop, regional coach stop or Night Bus stop.</param>
        /// <param name="routes">Train lines, tram routes, bus routes, regional coach routes, Night Bus routes.</param>
        /// <param name="runs">Individual trips/services of a route.</param>
        /// <param name="directions">Directions of travel of route.</param>
        /// <param name="status">API Status / Metadata.</param>
        public V3StoppingPattern(List<V3Disruption> disruptions = default(List<V3Disruption>), List<V3PatternDeparture> departures = default(List<V3PatternDeparture>), Dictionary<string, V3StoppingPatternStop> stops = default(Dictionary<string, V3StoppingPatternStop>), Dictionary<string, Object> routes = default(Dictionary<string, Object>), Dictionary<string, V3Run> runs = default(Dictionary<string, V3Run>), Dictionary<string, V3Direction> directions = default(Dictionary<string, V3Direction>), V3Status status = default(V3Status))
        {
            this.Disruptions = disruptions;
            this.Departures = departures;
            this.Stops = stops;
            this.Routes = routes;
            this.Runs = runs;
            this.Directions = directions;
            this.Status = status;
        }
        
        /// <summary>
        /// Disruption information applicable to relevant routes or stops
        /// </summary>
        /// <value>Disruption information applicable to relevant routes or stops</value>
        [DataMember(Name="disruptions", EmitDefaultValue=false)]
        public List<V3Disruption> Disruptions { get; set; }

        /// <summary>
        /// Timetabled and real-time service departures
        /// </summary>
        /// <value>Timetabled and real-time service departures</value>
        [DataMember(Name="departures", EmitDefaultValue=false)]
        public List<V3PatternDeparture> Departures { get; set; }

        /// <summary>
        /// A train station, tram stop, bus stop, regional coach stop or Night Bus stop
        /// </summary>
        /// <value>A train station, tram stop, bus stop, regional coach stop or Night Bus stop</value>
        [DataMember(Name="stops", EmitDefaultValue=false)]
        public Dictionary<string, V3StoppingPatternStop> Stops { get; set; }

        /// <summary>
        /// Train lines, tram routes, bus routes, regional coach routes, Night Bus routes
        /// </summary>
        /// <value>Train lines, tram routes, bus routes, regional coach routes, Night Bus routes</value>
        [DataMember(Name="routes", EmitDefaultValue=false)]
        public Dictionary<string, Object> Routes { get; set; }

        /// <summary>
        /// Individual trips/services of a route
        /// </summary>
        /// <value>Individual trips/services of a route</value>
        [DataMember(Name="runs", EmitDefaultValue=false)]
        public Dictionary<string, V3Run> Runs { get; set; }

        /// <summary>
        /// Directions of travel of route
        /// </summary>
        /// <value>Directions of travel of route</value>
        [DataMember(Name="directions", EmitDefaultValue=false)]
        public Dictionary<string, V3Direction> Directions { get; set; }

        /// <summary>
        /// API Status / Metadata
        /// </summary>
        /// <value>API Status / Metadata</value>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public V3Status Status { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V3StoppingPattern {\n");
            sb.Append("  Disruptions: ").Append(Disruptions).Append("\n");
            sb.Append("  Departures: ").Append(Departures).Append("\n");
            sb.Append("  Stops: ").Append(Stops).Append("\n");
            sb.Append("  Routes: ").Append(Routes).Append("\n");
            sb.Append("  Runs: ").Append(Runs).Append("\n");
            sb.Append("  Directions: ").Append(Directions).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
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
            return this.Equals(input as V3StoppingPattern);
        }

        /// <summary>
        /// Returns true if V3StoppingPattern instances are equal
        /// </summary>
        /// <param name="input">Instance of V3StoppingPattern to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V3StoppingPattern input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Disruptions == input.Disruptions ||
                    this.Disruptions != null &&
                    this.Disruptions.SequenceEqual(input.Disruptions)
                ) && 
                (
                    this.Departures == input.Departures ||
                    this.Departures != null &&
                    this.Departures.SequenceEqual(input.Departures)
                ) && 
                (
                    this.Stops == input.Stops ||
                    this.Stops != null &&
                    this.Stops.SequenceEqual(input.Stops)
                ) && 
                (
                    this.Routes == input.Routes ||
                    this.Routes != null &&
                    this.Routes.SequenceEqual(input.Routes)
                ) && 
                (
                    this.Runs == input.Runs ||
                    this.Runs != null &&
                    this.Runs.SequenceEqual(input.Runs)
                ) && 
                (
                    this.Directions == input.Directions ||
                    this.Directions != null &&
                    this.Directions.SequenceEqual(input.Directions)
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
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
                if (this.Disruptions != null)
                    hashCode = hashCode * 59 + this.Disruptions.GetHashCode();
                if (this.Departures != null)
                    hashCode = hashCode * 59 + this.Departures.GetHashCode();
                if (this.Stops != null)
                    hashCode = hashCode * 59 + this.Stops.GetHashCode();
                if (this.Routes != null)
                    hashCode = hashCode * 59 + this.Routes.GetHashCode();
                if (this.Runs != null)
                    hashCode = hashCode * 59 + this.Runs.GetHashCode();
                if (this.Directions != null)
                    hashCode = hashCode * 59 + this.Directions.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
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
