package com.gridnine.testing;

import java.util.List;
import java.util.stream.Collectors;

public class Filter_flightWithConflictSegments implements FlightProcessing{
    @Override
    public List<Flight> filterProcess(List<Flight> data) {
        return data.stream().filter(
                flight -> flight.getSegments().stream().allMatch(
                        segment -> segment.getArrivalDate().isAfter(segment.getDepartureDate())
                )).collect(Collectors.toList());
    }
}
