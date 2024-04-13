//
// V3StopDepartureRequestRouteDirection.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class V3StopDepartureRequestRouteDirection: JSONEncodable {
    /** Identifier of route; values returned by Routes API - v3/routes */
    public var routeId: String?
    /** Direction of travel identifier; values returned by Directions API - v3/directions */
    public var directionId: Int32?
    /** Name of direction of travel; values returned by Directions API - v3/directions */
    public var directionName: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["route_id"] = self.routeId
        nillableDictionary["direction_id"] = self.directionId?.encodeToJSON()
        nillableDictionary["direction_name"] = self.directionName

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}