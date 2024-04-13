//
// V3StopAccessibility.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class V3StopAccessibility: JSONEncodable {
    /** Indicates if there is lighting at the stop */
    public var lighting: Bool?
    /** Indicates the platform number for xivic information (Platform 0 indicates general stop facilities) */
    public var platformNumber: Int32?
    /** Indicates if there is at least one audio customer information at the stop/platform */
    public var audioCustomerInformation: Bool?
    /** Indicates if there is at least one accessible escalator at the stop/platform that complies with the Disability Standards for Accessible Public Transport under the Disability Discrimination Act (1992) */
    public var escalator: Bool?
    /** Indicates if there is a hearing loop facility at the stop/platform */
    public var hearingLoop: Bool?
    /** Indicates if there is an elevator at the stop/platform */
    public var lift: Bool?
    /** Indicates if there are stairs available in the stop */
    public var stairs: Bool?
    /** Indicates if the stop is accessible */
    public var stopAccessible: Bool?
    /** Indicates if there are tactile tiles (also known as tactile ground surface indicators, or TGSIs) at the stop */
    public var tactileGroundSurfaceIndicator: Bool?
    /** Indicates if there is a general waiting area at the stop */
    public var waitingRoom: Bool?
    public var wheelchair: V3StopAccessibilityWheelchair?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["lighting"] = self.lighting
        nillableDictionary["platform_number"] = self.platformNumber?.encodeToJSON()
        nillableDictionary["audio_customer_information"] = self.audioCustomerInformation
        nillableDictionary["escalator"] = self.escalator
        nillableDictionary["hearing_loop"] = self.hearingLoop
        nillableDictionary["lift"] = self.lift
        nillableDictionary["stairs"] = self.stairs
        nillableDictionary["stop_accessible"] = self.stopAccessible
        nillableDictionary["tactile_ground_surface_indicator"] = self.tactileGroundSurfaceIndicator
        nillableDictionary["waiting_room"] = self.waitingRoom
        nillableDictionary["wheelchair"] = self.wheelchair?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}