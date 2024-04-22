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
    /// V3PatternDeparture
    /// </summary>
    [DataContract]
    public partial class V3PatternDeparture :  IEquatable<V3PatternDeparture>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="V3PatternDeparture" /> class.
        /// </summary>
        /// <param name="skippedStops">The stops to be skipped following the current departure in order..</param>
        /// <param name="stopId">Stop identifier.</param>
        /// <param name="routeId">Route identifier.</param>
        /// <param name="runRef">Alphanumeric trip/service run identifier.</param>
        /// <param name="directionId">Direction of travel identifier.</param>
        /// <param name="disruptionIds">Disruption information identifier(s).</param>
        /// <param name="scheduledDepartureUtc">Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format.</param>
        /// <param name="estimatedDepartureUtc">Real-time estimate of departure time and date in ISO 8601 UTC format.</param>
        /// <param name="atPlatform">Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes.</param>
        /// <param name="platformNumber">Platform number at stop (metropolitan train only; returns null for other modes).</param>
        /// <param name="flags">Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag).</param>
        /// <param name="departureSequence">Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4.</param>
        public V3PatternDeparture(List<V3StopModel> skippedStops = default(List<V3StopModel>), int? stopId = default(int?), int? routeId = default(int?), string runRef = default(string), int? directionId = default(int?), List<long?> disruptionIds = default(List<long?>), DateTime? scheduledDepartureUtc = default(DateTime?), DateTime? estimatedDepartureUtc = default(DateTime?), bool? atPlatform = default(bool?), string platformNumber = default(string), string flags = default(string), int? departureSequence = default(int?))
        {
            this.SkippedStops = skippedStops;
            this.StopId = stopId;
            this.RouteId = routeId;
            this.RunRef = runRef;
            this.DirectionId = directionId;
            this.DisruptionIds = disruptionIds;
            this.ScheduledDepartureUtc = scheduledDepartureUtc;
            this.EstimatedDepartureUtc = estimatedDepartureUtc;
            this.AtPlatform = atPlatform;
            this.PlatformNumber = platformNumber;
            this.Flags = flags;
            this.DepartureSequence = departureSequence;
        }
        
        /// <summary>
        /// The stops to be skipped following the current departure in order.
        /// </summary>
        /// <value>The stops to be skipped following the current departure in order.</value>
        [DataMember(Name="skipped_stops", EmitDefaultValue=false)]
        public List<V3StopModel> SkippedStops { get; set; }

        /// <summary>
        /// Stop identifier
        /// </summary>
        /// <value>Stop identifier</value>
        [DataMember(Name="stop_id", EmitDefaultValue=false)]
        public int? StopId { get; set; }

        /// <summary>
        /// Route identifier
        /// </summary>
        /// <value>Route identifier</value>
        [DataMember(Name="route_id", EmitDefaultValue=false)]
        public int? RouteId { get; set; }

        /// <summary>
        /// Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric
        /// </summary>
        /// <value>Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric</value>
        [DataMember(Name="run_id", EmitDefaultValue=false)]
        public int? RunId { get; private set; }

        /// <summary>
        /// Alphanumeric trip/service run identifier
        /// </summary>
        /// <value>Alphanumeric trip/service run identifier</value>
        [DataMember(Name="run_ref", EmitDefaultValue=false)]
        public string RunRef { get; set; }

        /// <summary>
        /// Direction of travel identifier
        /// </summary>
        /// <value>Direction of travel identifier</value>
        [DataMember(Name="direction_id", EmitDefaultValue=false)]
        public int? DirectionId { get; set; }

        /// <summary>
        /// Disruption information identifier(s)
        /// </summary>
        /// <value>Disruption information identifier(s)</value>
        [DataMember(Name="disruption_ids", EmitDefaultValue=false)]
        public List<long?> DisruptionIds { get; set; }

        /// <summary>
        /// Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format
        /// </summary>
        /// <value>Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format</value>
        [DataMember(Name="scheduled_departure_utc", EmitDefaultValue=false)]
        public DateTime? ScheduledDepartureUtc { get; set; }

        /// <summary>
        /// Real-time estimate of departure time and date in ISO 8601 UTC format
        /// </summary>
        /// <value>Real-time estimate of departure time and date in ISO 8601 UTC format</value>
        [DataMember(Name="estimated_departure_utc", EmitDefaultValue=false)]
        public DateTime? EstimatedDepartureUtc { get; set; }

        /// <summary>
        /// Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes
        /// </summary>
        /// <value>Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes</value>
        [DataMember(Name="at_platform", EmitDefaultValue=false)]
        public bool? AtPlatform { get; set; }

        /// <summary>
        /// Platform number at stop (metropolitan train only; returns null for other modes)
        /// </summary>
        /// <value>Platform number at stop (metropolitan train only; returns null for other modes)</value>
        [DataMember(Name="platform_number", EmitDefaultValue=false)]
        public string PlatformNumber { get; set; }

        /// <summary>
        /// Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag)
        /// </summary>
        /// <value>Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag)</value>
        [DataMember(Name="flags", EmitDefaultValue=false)]
        public string Flags { get; set; }

        /// <summary>
        /// Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4
        /// </summary>
        /// <value>Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4</value>
        [DataMember(Name="departure_sequence", EmitDefaultValue=false)]
        public int? DepartureSequence { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V3PatternDeparture {\n");
            sb.Append("  SkippedStops: ").Append(SkippedStops).Append("\n");
            sb.Append("  StopId: ").Append(StopId).Append("\n");
            sb.Append("  RouteId: ").Append(RouteId).Append("\n");
            sb.Append("  RunId: ").Append(RunId).Append("\n");
            sb.Append("  RunRef: ").Append(RunRef).Append("\n");
            sb.Append("  DirectionId: ").Append(DirectionId).Append("\n");
            sb.Append("  DisruptionIds: ").Append(DisruptionIds).Append("\n");
            sb.Append("  ScheduledDepartureUtc: ").Append(ScheduledDepartureUtc).Append("\n");
            sb.Append("  EstimatedDepartureUtc: ").Append(EstimatedDepartureUtc).Append("\n");
            sb.Append("  AtPlatform: ").Append(AtPlatform).Append("\n");
            sb.Append("  PlatformNumber: ").Append(PlatformNumber).Append("\n");
            sb.Append("  Flags: ").Append(Flags).Append("\n");
            sb.Append("  DepartureSequence: ").Append(DepartureSequence).Append("\n");
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
            return this.Equals(input as V3PatternDeparture);
        }

        /// <summary>
        /// Returns true if V3PatternDeparture instances are equal
        /// </summary>
        /// <param name="input">Instance of V3PatternDeparture to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V3PatternDeparture input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.SkippedStops == input.SkippedStops ||
                    this.SkippedStops != null &&
                    this.SkippedStops.SequenceEqual(input.SkippedStops)
                ) && 
                (
                    this.StopId == input.StopId ||
                    (this.StopId != null &&
                    this.StopId.Equals(input.StopId))
                ) && 
                (
                    this.RouteId == input.RouteId ||
                    (this.RouteId != null &&
                    this.RouteId.Equals(input.RouteId))
                ) && 
                (
                    this.RunId == input.RunId ||
                    (this.RunId != null &&
                    this.RunId.Equals(input.RunId))
                ) && 
                (
                    this.RunRef == input.RunRef ||
                    (this.RunRef != null &&
                    this.RunRef.Equals(input.RunRef))
                ) && 
                (
                    this.DirectionId == input.DirectionId ||
                    (this.DirectionId != null &&
                    this.DirectionId.Equals(input.DirectionId))
                ) && 
                (
                    this.DisruptionIds == input.DisruptionIds ||
                    this.DisruptionIds != null &&
                    this.DisruptionIds.SequenceEqual(input.DisruptionIds)
                ) && 
                (
                    this.ScheduledDepartureUtc == input.ScheduledDepartureUtc ||
                    (this.ScheduledDepartureUtc != null &&
                    this.ScheduledDepartureUtc.Equals(input.ScheduledDepartureUtc))
                ) && 
                (
                    this.EstimatedDepartureUtc == input.EstimatedDepartureUtc ||
                    (this.EstimatedDepartureUtc != null &&
                    this.EstimatedDepartureUtc.Equals(input.EstimatedDepartureUtc))
                ) && 
                (
                    this.AtPlatform == input.AtPlatform ||
                    (this.AtPlatform != null &&
                    this.AtPlatform.Equals(input.AtPlatform))
                ) && 
                (
                    this.PlatformNumber == input.PlatformNumber ||
                    (this.PlatformNumber != null &&
                    this.PlatformNumber.Equals(input.PlatformNumber))
                ) && 
                (
                    this.Flags == input.Flags ||
                    (this.Flags != null &&
                    this.Flags.Equals(input.Flags))
                ) && 
                (
                    this.DepartureSequence == input.DepartureSequence ||
                    (this.DepartureSequence != null &&
                    this.DepartureSequence.Equals(input.DepartureSequence))
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
                if (this.SkippedStops != null)
                    hashCode = hashCode * 59 + this.SkippedStops.GetHashCode();
                if (this.StopId != null)
                    hashCode = hashCode * 59 + this.StopId.GetHashCode();
                if (this.RouteId != null)
                    hashCode = hashCode * 59 + this.RouteId.GetHashCode();
                if (this.RunId != null)
                    hashCode = hashCode * 59 + this.RunId.GetHashCode();
                if (this.RunRef != null)
                    hashCode = hashCode * 59 + this.RunRef.GetHashCode();
                if (this.DirectionId != null)
                    hashCode = hashCode * 59 + this.DirectionId.GetHashCode();
                if (this.DisruptionIds != null)
                    hashCode = hashCode * 59 + this.DisruptionIds.GetHashCode();
                if (this.ScheduledDepartureUtc != null)
                    hashCode = hashCode * 59 + this.ScheduledDepartureUtc.GetHashCode();
                if (this.EstimatedDepartureUtc != null)
                    hashCode = hashCode * 59 + this.EstimatedDepartureUtc.GetHashCode();
                if (this.AtPlatform != null)
                    hashCode = hashCode * 59 + this.AtPlatform.GetHashCode();
                if (this.PlatformNumber != null)
                    hashCode = hashCode * 59 + this.PlatformNumber.GetHashCode();
                if (this.Flags != null)
                    hashCode = hashCode * 59 + this.Flags.GetHashCode();
                if (this.DepartureSequence != null)
                    hashCode = hashCode * 59 + this.DepartureSequence.GetHashCode();
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
