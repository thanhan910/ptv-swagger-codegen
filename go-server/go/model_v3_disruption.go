/*
 * PTV Timetable API - Version 3
 *
 * The PTV Timetable API provides direct access to Public Transport Victoria's public transport timetable data.    The API returns scheduled timetable, route and stop data for all metropolitan and regional train, tram and bus services in Victoria, including Night Network(Night Train and Night Tram data are included in metropolitan train and tram services data, respectively, whereas Night Bus is a separate route type).    The API also returns real-time data for metropolitan train, tram and bus services (where this data is made available to PTV), as well as disruption information, stop facility information, and access to myki ticket outlet data.    This Swagger is for Version 3 of the PTV Timetable API. By using this documentation you agree to comply with the licence and terms of service.    Train timetable data is updated daily, while the remaining data is updated weekly, taking into account any planned timetable changes (for example, due to holidays or planned disruptions). The PTV timetable API is the same API used by PTV for its apps. To access the most up to date data PTV has (including real-time data) you must use the API dynamically.    You can access the PTV Timetable API through a HTTP or HTTPS interface, as follows:        base URL / version number / API name / query string  The base URL is either:    *  http://timetableapi.ptv.vic.gov.au  or    *  https://timetableapi.ptv.vic.gov.au    The Swagger JSON file is available at http://timetableapi.ptv.vic.gov.au/swagger/docs/v3    Frequently asked questions are available on the PTV website at http://ptv.vic.gov.au/apifaq    Links to the following information are also provided on the PTV website at http://ptv.vic.gov.au/ptv-timetable-api/  * How to register for an API key and calculate a signature  * PTV Timetable API V2 to V3 Migration Guide  * PTV Timetable API Data Quality Statement    All information about how to use the API is in this documentation. PTV cannot provide technical support for the API.  
 *
 * API version: v3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger
import (
	"time"
)

type V3Disruption struct {
	// Disruption information identifier
	DisruptionId int64 `json:"disruption_id,omitempty"`
	// Headline title summarising disruption information
	Title string `json:"title,omitempty"`
	// URL of relevant article on PTV website
	Url string `json:"url,omitempty"`
	// Description of the disruption
	Description string `json:"description,omitempty"`
	// Status of the disruption (e.g. \"Planned\", \"Current\")
	DisruptionStatus string `json:"disruption_status,omitempty"`
	// Type of disruption
	DisruptionType string `json:"disruption_type,omitempty"`
	// Date and time disruption information is published on PTV website, in ISO 8601 UTC format
	PublishedOn time.Time `json:"published_on,omitempty"`
	// Date and time disruption information was last updated by PTV, in ISO 8601 UTC format
	LastUpdated time.Time `json:"last_updated,omitempty"`
	// Date and time at which disruption begins, in ISO 8601 UTC format
	FromDate time.Time `json:"from_date,omitempty"`
	// Date and time at which disruption ends, in ISO 8601 UTC format (returns null if unknown)
	ToDate time.Time `json:"to_date,omitempty"`
	// Route relevant to a disruption (if applicable)
	Routes []V3DisruptionRoute `json:"routes,omitempty"`
	// Stop relevant to a disruption (if applicable)
	Stops []V3DisruptionStop `json:"stops,omitempty"`

	Colour string `json:"colour,omitempty"`

	DisplayOnBoard bool `json:"display_on_board,omitempty"`

	DisplayStatus bool `json:"display_status,omitempty"`
}