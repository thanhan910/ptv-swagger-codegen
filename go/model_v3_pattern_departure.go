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

type V3PatternDeparture struct {
	// The stops to be skipped following the current departure in order.
	SkippedStops []V3StopModel `json:"skipped_stops,omitempty"`
	// Stop identifier
	StopId int32 `json:"stop_id,omitempty"`
	// Route identifier
	RouteId int32 `json:"route_id,omitempty"`
	// Numeric trip/service run identifier. Defaults to -1 when run identifier is Alphanumeric
	RunId int32 `json:"run_id,omitempty"`
	// Alphanumeric trip/service run identifier
	RunRef string `json:"run_ref,omitempty"`
	// Direction of travel identifier
	DirectionId int32 `json:"direction_id,omitempty"`
	// Disruption information identifier(s)
	DisruptionIds []int64 `json:"disruption_ids,omitempty"`
	// Scheduled (i.e. timetabled) departure time and date in ISO 8601 UTC format
	ScheduledDepartureUtc time.Time `json:"scheduled_departure_utc,omitempty"`
	// Real-time estimate of departure time and date in ISO 8601 UTC format
	EstimatedDepartureUtc time.Time `json:"estimated_departure_utc,omitempty"`
	// Indicates if the metropolitan train service is at the platform at the time of query; returns false for other modes
	AtPlatform bool `json:"at_platform,omitempty"`
	// Platform number at stop (metropolitan train only; returns null for other modes)
	PlatformNumber string `json:"platform_number,omitempty"`
	// Flag indicating special condition for run (e.g. RR Reservations Required, GC Guaranteed Connection, DOO Drop Off Only, PUO Pick Up Only, MO Mondays only, TU Tuesdays only, WE Wednesdays only, TH Thursdays only, FR Fridays only, SS School days only; ignore E flag)
	Flags string `json:"flags,omitempty"`
	// Chronological sequence for the departures in a run. Order ascendingly by this field to get chronological order (earliest first) of departures with the same run_ref. NOTE, this field is not always N+1 or N-1 of the previous or following departure. e.g 100, 200, 250, 300 instead of 1, 2, 3, 4
	DepartureSequence int32 `json:"departure_sequence,omitempty"`
}