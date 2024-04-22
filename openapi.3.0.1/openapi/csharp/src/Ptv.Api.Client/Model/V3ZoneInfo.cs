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
    /// V3ZoneInfo
    /// </summary>
    [DataContract(Name = "V3.ZoneInfo")]
    public partial class V3ZoneInfo : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="V3ZoneInfo" /> class.
        /// </summary>
        /// <param name="minZone">minZone.</param>
        /// <param name="maxZone">maxZone.</param>
        /// <param name="uniqueZones">uniqueZones.</param>
        public V3ZoneInfo(int minZone = default(int), int maxZone = default(int), List<int> uniqueZones = default(List<int>))
        {
            this.MinZone = minZone;
            this.MaxZone = maxZone;
            this.UniqueZones = uniqueZones;
        }

        /// <summary>
        /// Gets or Sets MinZone
        /// </summary>
        [DataMember(Name = "MinZone", EmitDefaultValue = false)]
        public int MinZone { get; set; }

        /// <summary>
        /// Gets or Sets MaxZone
        /// </summary>
        [DataMember(Name = "MaxZone", EmitDefaultValue = false)]
        public int MaxZone { get; set; }

        /// <summary>
        /// Gets or Sets UniqueZones
        /// </summary>
        [DataMember(Name = "UniqueZones", EmitDefaultValue = false)]
        public List<int> UniqueZones { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class V3ZoneInfo {\n");
            sb.Append("  MinZone: ").Append(MinZone).Append("\n");
            sb.Append("  MaxZone: ").Append(MaxZone).Append("\n");
            sb.Append("  UniqueZones: ").Append(UniqueZones).Append("\n");
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
