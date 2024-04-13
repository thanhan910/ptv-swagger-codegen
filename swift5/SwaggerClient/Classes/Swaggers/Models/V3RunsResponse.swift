//
// V3RunsResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct V3RunsResponse: Codable {

    /** Individual trips/services of a route */
    public var runs: [V3Run]?
    public var status: V3Status?

    public init(runs: [V3Run]? = nil, status: V3Status? = nil) {
        self.runs = runs
        self.status = status
    }


}