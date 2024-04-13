//
// V3SiriDirectionRefsDictionary.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class V3SiriDirectionRefsDictionary: JSONEncodable {
    public var directionRefs: [String:V3SiriStopsRefsDictionary]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["direction_refs"] = self.directionRefs?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}