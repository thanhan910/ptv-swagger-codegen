//
// V3SearchParameters.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class V3SearchParameters: JSONEncodable {
    public enum RouteTypes: String {
        case _0 = "0"
        case _1 = "1"
        case _2 = "2"
        case _3 = "3"
        case _4 = "4"
    }
    /** Filter by route_type; values returned via RouteTypes API (note: stops and routes are ordered by route_types specified) */
    public var routeTypes: [RouteTypes]?
    /** Filter by geographic coordinate of latitude */
    public var latitude: Float?
    /** Filter by geographic coordinate of longitude */
    public var longitude: Float?
    /** Filter by maximum distance (in metres) from location specified via latitude and longitude parameters */
    public var maxDistance: Float?
    /** Placeholder for future development; currently unavailable */
    public var includeAddresses: Bool?
    /** Indicates if outlets will be returned in response (default &#x3D; true) */
    public var includeOutlets: Bool?
    /** Indicates whether to find stops by suburbs in the search term (default &#x3D; true) */
    public var matchStopBySuburb: Bool?
    /** Indicates whether to find routes by suburbs in the search term (default &#x3D; true) */
    public var matchRouteBySuburb: Bool?
    /** Indicates whether to search for stops according to a metlink stop ID (default &#x3D; false) */
    public var matchStopByGtfsStopId: Bool?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["route_types"] = self.routeTypes?.map({$0.rawValue}).encodeToJSON()
        nillableDictionary["latitude"] = self.latitude
        nillableDictionary["longitude"] = self.longitude
        nillableDictionary["max_distance"] = self.maxDistance
        nillableDictionary["include_addresses"] = self.includeAddresses
        nillableDictionary["include_outlets"] = self.includeOutlets
        nillableDictionary["match_stop_by_suburb"] = self.matchStopBySuburb
        nillableDictionary["match_route_by_suburb"] = self.matchRouteBySuburb
        nillableDictionary["match_stop_by_gtfs_stop_id"] = self.matchStopByGtfsStopId

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}