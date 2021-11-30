package com.inflearn.desing_pattern.builder;

import java.time.LocalDateTime;

public interface TripPlanBuilder {

    TripPlanBuilder title(String title);
    TripPlanBuilder nightAndDays(int night, int day);
    TripPlanBuilder startDate(LocalDateTime startDate);
    TripPlanBuilder endDateTime(LocalDateTime endDate);
    TripPlanBuilder addPlan(int day, String plan);
    Trip getTrip();

}
