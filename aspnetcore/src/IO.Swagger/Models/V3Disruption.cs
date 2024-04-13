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
    public partial class V3Disruption : IEquatable<V3Disruption>
    { 
        /// <summary>
        /// Disruption information identifier
        /// </summary>
        /// <value>Disruption information identifier</value>

        [DataMember(Name="disruption_id")]
        public long? DisruptionId { get; set; }

        /// <summary>
        /// Headline title summarising disruption information
        /// </summary>
        /// <value>Headline title summarising disruption information</value>

        [DataMember(Name="title")]
        public string Title { get; set; }

        /// <summary>
        /// URL of relevant article on PTV website
        /// </summary>
        /// <value>URL of relevant article on PTV website</value>

        [DataMember(Name="url")]
        public string Url { get; set; }

        /// <summary>
        /// Description of the disruption
        /// </summary>
        /// <value>Description of the disruption</value>

        [DataMember(Name="description")]
        public string Description { get; set; }

        /// <summary>
        /// Status of the disruption (e.g. \&quot;Planned\&quot;, \&quot;Current\&quot;)
        /// </summary>
        /// <value>Status of the disruption (e.g. \&quot;Planned\&quot;, \&quot;Current\&quot;)</value>

        [DataMember(Name="disruption_status")]
        public string DisruptionStatus { get; set; }

        /// <summary>
        /// Type of disruption
        /// </summary>
        /// <value>Type of disruption</value>

        [DataMember(Name="disruption_type")]
        public string DisruptionType { get; set; }

        /// <summary>
        /// Date and time disruption information is published on PTV website, in ISO 8601 UTC format
        /// </summary>
        /// <value>Date and time disruption information is published on PTV website, in ISO 8601 UTC format</value>

        [DataMember(Name="published_on")]
        public DateTime? PublishedOn { get; set; }

        /// <summary>
        /// Date and time disruption information was last updated by PTV, in ISO 8601 UTC format
        /// </summary>
        /// <value>Date and time disruption information was last updated by PTV, in ISO 8601 UTC format</value>

        [DataMember(Name="last_updated")]
        public DateTime? LastUpdated { get; set; }

        /// <summary>
        /// Date and time at which disruption begins, in ISO 8601 UTC format
        /// </summary>
        /// <value>Date and time at which disruption begins, in ISO 8601 UTC format</value>

        [DataMember(Name="from_date")]
        public DateTime? FromDate { get; set; }

        /// <summary>
        /// Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown)
        /// </summary>
        /// <value>Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown)</value>

        [DataMember(Name="to_date")]
        public DateTime? ToDate { get; set; }

        /// <summary>
        /// Route relevant to a disruption (if applicable)
        /// </summary>
        /// <value>Route relevant to a disruption (if applicable)</value>

        [DataMember(Name="routes")]
        public List<V3DisruptionRoute> Routes { get; set; }

        /// <summary>
        /// Stop relevant to a disruption (if applicable)
        /// </summary>
        /// <value>Stop relevant to a disruption (if applicable)</value>

        [DataMember(Name="stops")]
        public List<V3DisruptionStop> Stops { get; set; }

        /// <summary>
        /// Gets or Sets Colour
        /// </summary>

        [DataMember(Name="colour")]
        public string Colour { get; set; }

        /// <summary>
        /// Gets or Sets DisplayOnBoard
        /// </summary>

        [DataMember(Name="display_on_board")]
        public bool? DisplayOnBoard { get; set; }

        /// <summary>
        /// Gets or Sets DisplayStatus
        /// </summary>

        [DataMember(Name="display_status")]
        public bool? DisplayStatus { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class V3Disruption {\n");
            sb.Append("  DisruptionId: ").Append(DisruptionId).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  DisruptionStatus: ").Append(DisruptionStatus).Append("\n");
            sb.Append("  DisruptionType: ").Append(DisruptionType).Append("\n");
            sb.Append("  PublishedOn: ").Append(PublishedOn).Append("\n");
            sb.Append("  LastUpdated: ").Append(LastUpdated).Append("\n");
            sb.Append("  FromDate: ").Append(FromDate).Append("\n");
            sb.Append("  ToDate: ").Append(ToDate).Append("\n");
            sb.Append("  Routes: ").Append(Routes).Append("\n");
            sb.Append("  Stops: ").Append(Stops).Append("\n");
            sb.Append("  Colour: ").Append(Colour).Append("\n");
            sb.Append("  DisplayOnBoard: ").Append(DisplayOnBoard).Append("\n");
            sb.Append("  DisplayStatus: ").Append(DisplayStatus).Append("\n");
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
            return obj.GetType() == GetType() && Equals((V3Disruption)obj);
        }

        /// <summary>
        /// Returns true if V3Disruption instances are equal
        /// </summary>
        /// <param name="other">Instance of V3Disruption to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(V3Disruption other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    DisruptionId == other.DisruptionId ||
                    DisruptionId != null &&
                    DisruptionId.Equals(other.DisruptionId)
                ) && 
                (
                    Title == other.Title ||
                    Title != null &&
                    Title.Equals(other.Title)
                ) && 
                (
                    Url == other.Url ||
                    Url != null &&
                    Url.Equals(other.Url)
                ) && 
                (
                    Description == other.Description ||
                    Description != null &&
                    Description.Equals(other.Description)
                ) && 
                (
                    DisruptionStatus == other.DisruptionStatus ||
                    DisruptionStatus != null &&
                    DisruptionStatus.Equals(other.DisruptionStatus)
                ) && 
                (
                    DisruptionType == other.DisruptionType ||
                    DisruptionType != null &&
                    DisruptionType.Equals(other.DisruptionType)
                ) && 
                (
                    PublishedOn == other.PublishedOn ||
                    PublishedOn != null &&
                    PublishedOn.Equals(other.PublishedOn)
                ) && 
                (
                    LastUpdated == other.LastUpdated ||
                    LastUpdated != null &&
                    LastUpdated.Equals(other.LastUpdated)
                ) && 
                (
                    FromDate == other.FromDate ||
                    FromDate != null &&
                    FromDate.Equals(other.FromDate)
                ) && 
                (
                    ToDate == other.ToDate ||
                    ToDate != null &&
                    ToDate.Equals(other.ToDate)
                ) && 
                (
                    Routes == other.Routes ||
                    Routes != null &&
                    Routes.SequenceEqual(other.Routes)
                ) && 
                (
                    Stops == other.Stops ||
                    Stops != null &&
                    Stops.SequenceEqual(other.Stops)
                ) && 
                (
                    Colour == other.Colour ||
                    Colour != null &&
                    Colour.Equals(other.Colour)
                ) && 
                (
                    DisplayOnBoard == other.DisplayOnBoard ||
                    DisplayOnBoard != null &&
                    DisplayOnBoard.Equals(other.DisplayOnBoard)
                ) && 
                (
                    DisplayStatus == other.DisplayStatus ||
                    DisplayStatus != null &&
                    DisplayStatus.Equals(other.DisplayStatus)
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
                    if (DisruptionId != null)
                    hashCode = hashCode * 59 + DisruptionId.GetHashCode();
                    if (Title != null)
                    hashCode = hashCode * 59 + Title.GetHashCode();
                    if (Url != null)
                    hashCode = hashCode * 59 + Url.GetHashCode();
                    if (Description != null)
                    hashCode = hashCode * 59 + Description.GetHashCode();
                    if (DisruptionStatus != null)
                    hashCode = hashCode * 59 + DisruptionStatus.GetHashCode();
                    if (DisruptionType != null)
                    hashCode = hashCode * 59 + DisruptionType.GetHashCode();
                    if (PublishedOn != null)
                    hashCode = hashCode * 59 + PublishedOn.GetHashCode();
                    if (LastUpdated != null)
                    hashCode = hashCode * 59 + LastUpdated.GetHashCode();
                    if (FromDate != null)
                    hashCode = hashCode * 59 + FromDate.GetHashCode();
                    if (ToDate != null)
                    hashCode = hashCode * 59 + ToDate.GetHashCode();
                    if (Routes != null)
                    hashCode = hashCode * 59 + Routes.GetHashCode();
                    if (Stops != null)
                    hashCode = hashCode * 59 + Stops.GetHashCode();
                    if (Colour != null)
                    hashCode = hashCode * 59 + Colour.GetHashCode();
                    if (DisplayOnBoard != null)
                    hashCode = hashCode * 59 + DisplayOnBoard.GetHashCode();
                    if (DisplayStatus != null)
                    hashCode = hashCode * 59 + DisplayStatus.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(V3Disruption left, V3Disruption right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(V3Disruption left, V3Disruption right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}