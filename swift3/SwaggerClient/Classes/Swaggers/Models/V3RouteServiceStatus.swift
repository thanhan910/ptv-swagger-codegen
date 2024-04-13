//
// V3RouteServiceStatus.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class V3RouteServiceStatus: JSONEncodable {
    public var description: String?
    public var timestamp: Date?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["description"] = self.description
        nillableDictionary["timestamp"] = self.timestamp?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}