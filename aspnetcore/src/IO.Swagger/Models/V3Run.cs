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
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Models
{
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class V3Run : IEquatable<V3Run>
    { 
        /// <summary>
        /// Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric
        /// </summary>
        /// <value>Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric</value>

        [DataMember(Name="run_id")]
        public int? RunId { get; private set; }

        /// <summary>
        /// Alphanumeric trip/service run identifier
        /// </summary>
        /// <value>Alphanumeric trip/service run identifier</value>

        [DataMember(Name="run_ref")]
        public string RunRef { get; set; }

        /// <summary>
        /// Route identifier
        /// </summary>
        /// <value>Route identifier</value>

        [DataMember(Name="route_id")]
        public int? RouteId { get; set; }

        /// <summary>
        /// Transport mode identifier
        /// </summary>
        /// <value>Transport mode identifier</value>

        [DataMember(Name="route_type")]
        public int? RouteType { get; set; }

        /// <summary>
        /// stop_id of final stop of run
        /// </summary>
        /// <value>stop_id of final stop of run</value>

        [DataMember(Name="final_stop_id")]
        public int? FinalStopId { get; set; }

        /// <summary>
        /// Name of destination of run
        /// </summary>
        /// <value>Name of destination of run</value>

        [DataMember(Name="destination_name")]
        public string DestinationName { get; set; }

        /// <summary>
        /// Status of metropolitan train run; returns \&quot;scheduled\&quot; for other modes
        /// </summary>
        /// <value>Status of metropolitan train run; returns \&quot;scheduled\&quot; for other modes</value>

        [DataMember(Name="status")]
        public string Status { get; set; }

        /// <summary>
        /// Direction of travel identifier
        /// </summary>
        /// <value>Direction of travel identifier</value>

        [DataMember(Name="direction_id")]
        public int? DirectionId { get; set; }

        /// <summary>
        /// Chronological sequence of the trip/service run on the route in direction. Order ascendingly by this field to get chronological order (earliest first) of runs with the same route_id and direction_id.
        /// </summary>
        /// <value>Chronological sequence of the trip/service run on the route in direction. Order ascendingly by this field to get chronological order (earliest first) of runs with the same route_id and direction_id.</value>

        [DataMember(Name="run_sequence")]
        public int? RunSequence { get; set; }

        /// <summary>
        /// The number of remaining skipped/express stations for the run/service from a stop
        /// </summary>
        /// <value>The number of remaining skipped/express stations for the run/service from a stop</value>

        [DataMember(Name="express_stop_count")]
        public int? ExpressStopCount { get; set; }

        /// <summary>
        /// Gets or Sets VehiclePosition
        /// </summary>

        [DataMember(Name="vehicle_position")]
        public V3VehiclePosition VehiclePosition { get; set; }

        /// <summary>
        /// Gets or Sets VehicleDescriptor
        /// </summary>

        [DataMember(Name="vehicle_descriptor")]
        public V3VehicleDescriptor VehicleDescriptor { get; set; }

        /// <summary>
        /// Geopath of the route
        /// </summary>
        /// <value>Geopath of the route</value>

        [DataMember(Name="geopath")]
        public List<Object> Geopath { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V3Run {\n");
            sb.Append("  RunId: ").Append(RunId).Append("\n");
            sb.Append("  RunRef: ").Append(RunRef).Append("\n");
            sb.Append("  RouteId: ").Append(RouteId).Append("\n");
            sb.Append("  RouteType: ").Append(RouteType).Append("\n");
            sb.Append("  FinalStopId: ").Append(FinalStopId).Append("\n");
            sb.Append("  DestinationName: ").Append(DestinationName).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  DirectionId: ").Append(DirectionId).Append("\n");
            sb.Append("  RunSequence: ").Append(RunSequence).Append("\n");
            sb.Append("  ExpressStopCount: ").Append(ExpressStopCount).Append("\n");
            sb.Append("  VehiclePosition: ").Append(VehiclePosition).Append("\n");
            sb.Append("  VehicleDescriptor: ").Append(VehicleDescriptor).Append("\n");
            sb.Append("  Geopath: ").Append(Geopath).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (ReferenceEquals(null, obj)) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((V3Run)obj);
        }

        /// <summary>
        /// Returns true if V3Run instances are equal
        /// </summary>
        /// <param name="other">Instance of V3Run to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V3Run other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    RunId == other.RunId ||
                    RunId != null &&
                    RunId.Equals(other.RunId)
                ) && 
                (
                    RunRef == other.RunRef ||
                    RunRef != null &&
                    RunRef.Equals(other.RunRef)
                ) && 
                (
                    RouteId == other.RouteId ||
                    RouteId != null &&
                    RouteId.Equals(other.RouteId)
                ) && 
                (
                    RouteType == other.RouteType ||
                    RouteType != null &&
                    RouteType.Equals(other.RouteType)
                ) && 
                (
                    FinalStopId == other.FinalStopId ||
                    FinalStopId != null &&
                    FinalStopId.Equals(other.FinalStopId)
                ) && 
                (
                    DestinationName == other.DestinationName ||
                    DestinationName != null &&
                    DestinationName.Equals(other.DestinationName)
                ) && 
                (
                    Status == other.Status ||
                    Status != null &&
                    Status.Equals(other.Status)
                ) && 
                (
                    DirectionId == other.DirectionId ||
                    DirectionId != null &&
                    DirectionId.Equals(other.DirectionId)
                ) && 
                (
                    RunSequence == other.RunSequence ||
                    RunSequence != null &&
                    RunSequence.Equals(other.RunSequence)
                ) && 
                (
                    ExpressStopCount == other.ExpressStopCount ||
                    ExpressStopCount != null &&
                    ExpressStopCount.Equals(other.ExpressStopCount)
                ) && 
                (
                    VehiclePosition == other.VehiclePosition ||
                    VehiclePosition != null &&
                    VehiclePosition.Equals(other.VehiclePosition)
                ) && 
                (
                    VehicleDescriptor == other.VehicleDescriptor ||
                    VehicleDescriptor != null &&
                    VehicleDescriptor.Equals(other.VehicleDescriptor)
                ) && 
                (
                    Geopath == other.Geopath ||
                    Geopath != null &&
                    Geopath.SequenceEqual(other.Geopath)
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
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (RunId != null)
                    hashCode = hashCode * 59 + RunId.GetHashCode();
                    if (RunRef != null)
                    hashCode = hashCode * 59 + RunRef.GetHashCode();
                    if (RouteId != null)
                    hashCode = hashCode * 59 + RouteId.GetHashCode();
                    if (RouteType != null)
                    hashCode = hashCode * 59 + RouteType.GetHashCode();
                    if (FinalStopId != null)
                    hashCode = hashCode * 59 + FinalStopId.GetHashCode();
                    if (DestinationName != null)
                    hashCode = hashCode * 59 + DestinationName.GetHashCode();
                    if (Status != null)
                    hashCode = hashCode * 59 + Status.GetHashCode();
                    if (DirectionId != null)
                    hashCode = hashCode * 59 + DirectionId.GetHashCode();
                    if (RunSequence != null)
                    hashCode = hashCode * 59 + RunSequence.GetHashCode();
                    if (ExpressStopCount != null)
                    hashCode = hashCode * 59 + ExpressStopCount.GetHashCode();
                    if (VehiclePosition != null)
                    hashCode = hashCode * 59 + VehiclePosition.GetHashCode();
                    if (VehicleDescriptor != null)
                    hashCode = hashCode * 59 + VehicleDescriptor.GetHashCode();
                    if (Geopath != null)
                    hashCode = hashCode * 59 + Geopath.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(V3Run left, V3Run right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(V3Run left, V3Run right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}