/*
 * PTV Timetable API - Version 3
 *
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * The version of the OpenAPI document: v3
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ptv.Api.Client.Client.OpenAPIDateConverter;

namespace Ptv.Api.Client.Model
{
    /// <summary>
    /// V3StopStaffing
    /// </summary>
    [DataContract(Name = "V3.StopStaffing")]
    public partial class V3StopStaffing : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="V3StopStaffing" /> class.
        /// </summary>
        /// <param name="friAmFrom">Stop staffing hours.</param>
        /// <param name="friAmTo">Stop staffing hours.</param>
        /// <param name="friPmFrom">Stop staffing hours.</param>
        /// <param name="friPmTo">Stop staffing hours.</param>
        /// <param name="monAmFrom">Stop staffing hours.</param>
        /// <param name="monAmTo">Stop staffing hours.</param>
        /// <param name="monPmFrom">Stop staffing hours.</param>
        /// <param name="monPmTo">Stop staffing hours.</param>
        /// <param name="phAdditionalText">Stop staffing hours.</param>
        /// <param name="phFrom">Stop staffing hours.</param>
        /// <param name="phTo">Stop staffing hours.</param>
        /// <param name="satAmFrom">Stop staffing hours.</param>
        /// <param name="satAmTo">Stop staffing hours.</param>
        /// <param name="satPmFrom">Stop staffing hours.</param>
        /// <param name="satPmTo">Stop staffing hours.</param>
        /// <param name="sunAmFrom">Stop staffing hours.</param>
        /// <param name="sunAmTo">Stop staffing hours.</param>
        /// <param name="sunPmFrom">Stop staffing hours.</param>
        /// <param name="sunPmTo">Stop staffing hours.</param>
        /// <param name="thuAmFrom">Stop staffing hours.</param>
        /// <param name="thuAmTo">Stop staffing hours.</param>
        /// <param name="thuPmFrom">Stop staffing hours.</param>
        /// <param name="thuPmTo">Stop staffing hours.</param>
        /// <param name="tueAmFrom">Stop staffing hours.</param>
        /// <param name="tueAmTo">Stop staffing hours.</param>
        /// <param name="tuePmFrom">Stop staffing hours.</param>
        /// <param name="tuePmTo">Stop staffing hours.</param>
        /// <param name="wedAmFrom">Stop staffing hours.</param>
        /// <param name="wedAmTo">Stop staffing hours.</param>
        /// <param name="wedPmFrom">Stop staffing hours.</param>
        /// <param name="wedPmTo">Stop staffing hours.</param>
        public V3StopStaffing(string friAmFrom = default(string), string friAmTo = default(string), string friPmFrom = default(string), string friPmTo = default(string), string monAmFrom = default(string), string monAmTo = default(string), string monPmFrom = default(string), string monPmTo = default(string), string phAdditionalText = default(string), string phFrom = default(string), string phTo = default(string), string satAmFrom = default(string), string satAmTo = default(string), string satPmFrom = default(string), string satPmTo = default(string), string sunAmFrom = default(string), string sunAmTo = default(string), string sunPmFrom = default(string), string sunPmTo = default(string), string thuAmFrom = default(string), string thuAmTo = default(string), string thuPmFrom = default(string), string thuPmTo = default(string), string tueAmFrom = default(string), string tueAmTo = default(string), string tuePmFrom = default(string), string tuePmTo = default(string), string wedAmFrom = default(string), string wedAmTo = default(string), string wedPmFrom = default(string), string wedPmTo = default(string))
        {
            this.FriAmFrom = friAmFrom;
            this.FriAmTo = friAmTo;
            this.FriPmFrom = friPmFrom;
            this.FriPmTo = friPmTo;
            this.MonAmFrom = monAmFrom;
            this.MonAmTo = monAmTo;
            this.MonPmFrom = monPmFrom;
            this.MonPmTo = monPmTo;
            this.PhAdditionalText = phAdditionalText;
            this.PhFrom = phFrom;
            this.PhTo = phTo;
            this.SatAmFrom = satAmFrom;
            this.SatAmTo = satAmTo;
            this.SatPmFrom = satPmFrom;
            this.SatPmTo = satPmTo;
            this.SunAmFrom = sunAmFrom;
            this.SunAmTo = sunAmTo;
            this.SunPmFrom = sunPmFrom;
            this.SunPmTo = sunPmTo;
            this.ThuAmFrom = thuAmFrom;
            this.ThuAmTo = thuAmTo;
            this.ThuPmFrom = thuPmFrom;
            this.ThuPmTo = thuPmTo;
            this.TueAmFrom = tueAmFrom;
            this.TueAmTo = tueAmTo;
            this.TuePmFrom = tuePmFrom;
            this.TuePmTo = tuePmTo;
            this.WedAmFrom = wedAmFrom;
            this.WedAmTo = wedAmTo;
            this.WedPmFrom = wedPmFrom;
            this.WedPmTo = wedPmTo;
        }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "fri_am_from", EmitDefaultValue = false)]
        public string FriAmFrom { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "fri_am_to", EmitDefaultValue = false)]
        public string FriAmTo { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "fri_pm_from", EmitDefaultValue = false)]
        public string FriPmFrom { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "fri_pm_to", EmitDefaultValue = false)]
        public string FriPmTo { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "mon_am_from", EmitDefaultValue = false)]
        public string MonAmFrom { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "mon_am_to", EmitDefaultValue = false)]
        public string MonAmTo { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "mon_pm_from", EmitDefaultValue = false)]
        public string MonPmFrom { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "mon_pm_to", EmitDefaultValue = false)]
        public string MonPmTo { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "ph_additional_text", EmitDefaultValue = false)]
        public string PhAdditionalText { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "ph_from", EmitDefaultValue = false)]
        public string PhFrom { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "ph_to", EmitDefaultValue = false)]
        public string PhTo { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "sat_am_from", EmitDefaultValue = false)]
        public string SatAmFrom { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "sat_am_to", EmitDefaultValue = false)]
        public string SatAmTo { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "sat_pm_from", EmitDefaultValue = false)]
        public string SatPmFrom { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "sat_pm_to", EmitDefaultValue = false)]
        public string SatPmTo { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "sun_am_from", EmitDefaultValue = false)]
        public string SunAmFrom { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "sun_am_to", EmitDefaultValue = false)]
        public string SunAmTo { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "sun_pm_from", EmitDefaultValue = false)]
        public string SunPmFrom { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "sun_pm_to", EmitDefaultValue = false)]
        public string SunPmTo { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "thu_am_from", EmitDefaultValue = false)]
        public string ThuAmFrom { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "thu_am_to", EmitDefaultValue = false)]
        public string ThuAmTo { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "thu_pm_from", EmitDefaultValue = false)]
        public string ThuPmFrom { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "thu_pm_to", EmitDefaultValue = false)]
        public string ThuPmTo { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "tue_am_from", EmitDefaultValue = false)]
        public string TueAmFrom { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "tue_am_to", EmitDefaultValue = false)]
        public string TueAmTo { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "tue_pm_from", EmitDefaultValue = false)]
        public string TuePmFrom { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "tue_pm_to", EmitDefaultValue = false)]
        public string TuePmTo { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "wed_am_from", EmitDefaultValue = false)]
        public string WedAmFrom { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "wed_am_to", EmitDefaultValue = false)]
        public string WedAmTo { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "wed_pm_from", EmitDefaultValue = false)]
        public string WedPmFrom { get; set; }

        /// <summary>
        /// Stop staffing hours
        /// </summary>
        /// <value>Stop staffing hours</value>
        [DataMember(Name = "wed_pm_To", EmitDefaultValue = false)]
        public string WedPmTo { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class V3StopStaffing {\n");
            sb.Append("  FriAmFrom: ").Append(FriAmFrom).Append("\n");
            sb.Append("  FriAmTo: ").Append(FriAmTo).Append("\n");
            sb.Append("  FriPmFrom: ").Append(FriPmFrom).Append("\n");
            sb.Append("  FriPmTo: ").Append(FriPmTo).Append("\n");
            sb.Append("  MonAmFrom: ").Append(MonAmFrom).Append("\n");
            sb.Append("  MonAmTo: ").Append(MonAmTo).Append("\n");
            sb.Append("  MonPmFrom: ").Append(MonPmFrom).Append("\n");
            sb.Append("  MonPmTo: ").Append(MonPmTo).Append("\n");
            sb.Append("  PhAdditionalText: ").Append(PhAdditionalText).Append("\n");
            sb.Append("  PhFrom: ").Append(PhFrom).Append("\n");
            sb.Append("  PhTo: ").Append(PhTo).Append("\n");
            sb.Append("  SatAmFrom: ").Append(SatAmFrom).Append("\n");
            sb.Append("  SatAmTo: ").Append(SatAmTo).Append("\n");
            sb.Append("  SatPmFrom: ").Append(SatPmFrom).Append("\n");
            sb.Append("  SatPmTo: ").Append(SatPmTo).Append("\n");
            sb.Append("  SunAmFrom: ").Append(SunAmFrom).Append("\n");
            sb.Append("  SunAmTo: ").Append(SunAmTo).Append("\n");
            sb.Append("  SunPmFrom: ").Append(SunPmFrom).Append("\n");
            sb.Append("  SunPmTo: ").Append(SunPmTo).Append("\n");
            sb.Append("  ThuAmFrom: ").Append(ThuAmFrom).Append("\n");
            sb.Append("  ThuAmTo: ").Append(ThuAmTo).Append("\n");
            sb.Append("  ThuPmFrom: ").Append(ThuPmFrom).Append("\n");
            sb.Append("  ThuPmTo: ").Append(ThuPmTo).Append("\n");
            sb.Append("  TueAmFrom: ").Append(TueAmFrom).Append("\n");
            sb.Append("  TueAmTo: ").Append(TueAmTo).Append("\n");
            sb.Append("  TuePmFrom: ").Append(TuePmFrom).Append("\n");
            sb.Append("  TuePmTo: ").Append(TuePmTo).Append("\n");
            sb.Append("  WedAmFrom: ").Append(WedAmFrom).Append("\n");
            sb.Append("  WedAmTo: ").Append(WedAmTo).Append("\n");
            sb.Append("  WedPmFrom: ").Append(WedPmFrom).Append("\n");
            sb.Append("  WedPmTo: ").Append(WedPmTo).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
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
