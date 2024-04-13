//
// V3OutletGeolocationParameters.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct V3OutletGeolocationParameters: Codable {

    /** Filter by maximum distance (in metres) from location specified via latitude and longitude parameters (default &#x3D; 300) */
    public var maxDistance: Double?
    /** Maximum number of results returned (default &#x3D; 30) */
    public var maxResults: Int?

    public init(maxDistance: Double? = nil, maxResults: Int? = nil) {
        self.maxDistance = maxDistance
        self.maxResults = maxResults
    }

    public enum CodingKeys: String, CodingKey { 
        case maxDistance = "max_distance"
        case maxResults = "max_results"
    }

}