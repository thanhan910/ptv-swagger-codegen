//
// V3RouteResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class V3RouteResponse: JSONEncodable {
    public var route: V3RouteWithStatus?
    public var status: V3Status?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["route"] = self.route?.encodeToJSON()
        nillableDictionary["status"] = self.status?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}