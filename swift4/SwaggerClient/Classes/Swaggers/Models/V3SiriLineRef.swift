//
// V3SiriLineRef.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct V3SiriLineRef: Codable {

    public enum DirectionRef: Int, Codable { 
        case _1 = 1
        case _2 = 2
        case _5 = 5
        case _10 = 10
        case _16 = 16
        case _32 = 32
        case _65 = 65
        case _130 = 130
    }

    /** Siri LineRef */
    public var lineRef: String
    /** Siri DirectionRef  (in, out, up, down, clockwise, counterclockwise, Inbound, Outbound) */
    public var directionRef: DirectionRef?
    public init(lineRef: String, directionRef: DirectionRef? = nil) { 
        self.lineRef = lineRef
        self.directionRef = directionRef
    }
    public enum CodingKeys: String, CodingKey { 
        case lineRef = "line_ref"
        case directionRef = "direction_ref"
    }

}