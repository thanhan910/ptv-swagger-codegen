//
// V3BulkDeparturesRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct V3BulkDeparturesRequest: Codable {

    public enum Expand: String, Codable { 
        case all = "All"
        case stop = "Stop"
        case route = "Route"
        case run = "Run"
        case direction = "Direction"
        case disruption = "Disruption"
        case vehicleDescriptor = "VehicleDescriptor"
        case vehiclePosition = "VehiclePosition"
        case _none = "None"
    }

    /** Collection of departure requests */
    public var requests: [V3StopDepartureRequest]

    /** Filter by the date and time of the request (ISO 8601 UTC format) (default &#x3D; current date and time) */
    public var dateUtc: Date?

    /** Indicates if filtering runs (and their departures) to those that arrive at destination before date_utc (default &#x3D; false). Requires max_results &amp;gt; 0. */
    public var lookBackwards: Bool?

    /** Indicates if cancelled services (if they exist) are returned (default &#x3D; false) - metropolitan train only */
    public var includeCancelled: Bool?

    /** Indicates if the route geopath should be returned */
    public var includeGeopath: Bool?
    /** List objects to be returned in full (i.e. expanded) - options include: all, stop, route, run, direction, disruption, none */
    public var expand: [Expand]?
    public init(requests: [V3StopDepartureRequest], dateUtc: Date? = nil, lookBackwards: Bool? = nil, includeCancelled: Bool? = nil, includeGeopath: Bool? = nil, expand: [Expand]? = nil) { 
        self.requests = requests
        self.dateUtc = dateUtc
        self.lookBackwards = lookBackwards
        self.includeCancelled = includeCancelled
        self.includeGeopath = includeGeopath
        self.expand = expand
    }
    public enum CodingKeys: String, CodingKey { 
        case requests
        case dateUtc = "date_utc"
        case lookBackwards = "look_backwards"
        case includeCancelled = "include_cancelled"
        case includeGeopath = "include_geopath"
        case expand
    }

}