package com.example.spacexapp.util

import com.example.spacexapp.data.networking.service.FlightDto
import com.example.spacexapp.data.persistent.db.FlightEntity

// Extension function to convert FlightDto(Data Transfer Object) to FlightEntity
fun FlightDto.toFlightEntity(): FlightEntity {
    return FlightEntity(
        flightNumber = flightNumber,
        rocketName = name,
        rocketType = details ?: "Type Unavailable",
        missionName = name.extractMissionName(),
        launch = details?.extractLaunchInfo() ?: "No Launch Info",
        details = details ?: "No details available",
        patchUrl = links.patch.small ?: "",
        patchUrlLarge = links.patch.large ?: "",
        dateUtc = dateUtc,
        dateUnix = dateUnix,
        webCastUrl = webCastUrl ?: "",
    )
}