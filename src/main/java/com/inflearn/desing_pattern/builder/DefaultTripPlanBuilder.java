package com.inflearn.desing_pattern.builder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DefaultTripPlanBuilder implements TripPlanBuilder{
    private int night;
    private String title;
    private int day;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private List<Plan> planList;

    @Override
    public TripPlanBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public TripPlanBuilder nightAndDays(int night, int day) {
        this.night = night;
        this.day = day;
        return this;
    }

    @Override
    public TripPlanBuilder startDate(LocalDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public TripPlanBuilder endDateTime(LocalDateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    @Override
    public TripPlanBuilder addPlan(int day, String plan) {
        if ( planList == null ) {
            planList = new ArrayList<>();
        }
        planList.add(new Plan(day, plan));
        return this;
    }

    @Override
    public Trip getTrip() {
        return new Trip(night, title, day, startDate, endDate, planList);
    }
}
