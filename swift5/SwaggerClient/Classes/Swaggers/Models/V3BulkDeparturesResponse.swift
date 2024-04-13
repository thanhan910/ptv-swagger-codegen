//
// V3BulkDeparturesResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct V3BulkDeparturesResponse: Codable {

    /** Contains departures for the requested stop and route(s). It includes details as to the route_direction and whether it is still valid. */
    public var responses: [V3BulkDeparturesUpdateResponse]?
    /** A train station, tram stop, bus stop, regional coach stop or Night Bus stop */
    public var stops: [String:V3BulkDeparturesStopResponse]?
    /** Train lines, tram routes, bus routes, regional coach routes, Night Bus routes */
    public var routes: [Any]?
    /** Individual trips/services of a route */
    public var runs: [V3Run]?
    /** Directions of travel of route */
    public var directions: [V3Direction]?
    /** Disruption information applicable to relevant routes or stops */
    public var disruptions: [String:V3Disruption]?
    public var status: V3Status?

    public init(responses: [V3BulkDeparturesUpdateResponse]? = nil, stops: [String:V3BulkDeparturesStopResponse]? = nil, routes: [Any]? = nil, runs: [V3Run]? = nil, directions: [V3Direction]? = nil, disruptions: [String:V3Disruption]? = nil, status: V3Status? = nil) {
        self.responses = responses
        self.stops = stops
        self.routes = routes
        self.runs = runs
        self.directions = directions
        self.disruptions = disruptions
        self.status = status
    }


}