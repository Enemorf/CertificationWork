package com.gridnine.testing;

public class Main {
    public static void main(String[] args) {
       //Тест 1
       new OutputInformationImpl().printFlightInfo(
               new Filter_flightToCurrentTime().filterProcess(FlightBuilder.createFlights()),Filters.FLIGHT_TO_CURRENT_TIME);

       //Тест 2
        new OutputInformationImpl().printFlightInfo(
                new Filter_flightWithConflictSegments().filterProcess(FlightBuilder.createFlights()),Filters.FLIGHT_WITH_CONFLICT_SEGMENTS);

        //Тест 3
        new OutputInformationImpl().printFlightInfo(
                new Filter_flightWithMore2hGround().filterProcess(FlightBuilder.createFlights()),Filters.FLIGHT_WITH_MORE2H_GROUND);
    }
}