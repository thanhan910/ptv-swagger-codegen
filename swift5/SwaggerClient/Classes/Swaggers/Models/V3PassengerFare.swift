//
// V3PassengerFare.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct V3PassengerFare: Codable {

    public var passengerType: String?
    public var fare2HourPeak: Decimal?
    public var fare2HourOffPeak: Decimal?
    public var fareDailyPeak: Decimal?
    public var fareDailyOffPeak: Decimal?
    public var pass7Days: Decimal?
    public var pass28To69DayPerDay: Decimal?
    public var pass70PlusDayPerDay: Decimal?
    public var weekendCap: Decimal?
    public var holidayCap: Decimal?

    public init(passengerType: String? = nil, fare2HourPeak: Decimal? = nil, fare2HourOffPeak: Decimal? = nil, fareDailyPeak: Decimal? = nil, fareDailyOffPeak: Decimal? = nil, pass7Days: Decimal? = nil, pass28To69DayPerDay: Decimal? = nil, pass70PlusDayPerDay: Decimal? = nil, weekendCap: Decimal? = nil, holidayCap: Decimal? = nil) {
        self.passengerType = passengerType
        self.fare2HourPeak = fare2HourPeak
        self.fare2HourOffPeak = fare2HourOffPeak
        self.fareDailyPeak = fareDailyPeak
        self.fareDailyOffPeak = fareDailyOffPeak
        self.pass7Days = pass7Days
        self.pass28To69DayPerDay = pass28To69DayPerDay
        self.pass70PlusDayPerDay = pass70PlusDayPerDay
        self.weekendCap = weekendCap
        self.holidayCap = holidayCap
    }

    public enum CodingKeys: String, CodingKey { 
        case passengerType = "PassengerType"
        case fare2HourPeak = "Fare2HourPeak"
        case fare2HourOffPeak = "Fare2HourOffPeak"
        case fareDailyPeak = "FareDailyPeak"
        case fareDailyOffPeak = "FareDailyOffPeak"
        case pass7Days = "Pass7Days"
        case pass28To69DayPerDay = "Pass28To69DayPerDay"
        case pass70PlusDayPerDay = "Pass70PlusDayPerDay"
        case weekendCap = "WeekendCap"
        case holidayCap = "HolidayCap"
    }

}