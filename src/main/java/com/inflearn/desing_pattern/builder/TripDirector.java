package com.inflearn.desing_pattern.builder;

import java.time.LocalDateTime;

public class TripDirector {
    TripPlanBuilder builder;

    public TripDirector(TripPlanBuilder builder) {
        this.builder = builder;
    }

    public Trip japanTrip(){
        return builder.title("일본")
                .startDate(LocalDateTime.of(2021, 11, 30, 15, 23))
                .endDateTime(LocalDateTime.of(2021, 12, 05, 12, 35))
                .nightAndDays(2, 3)
                .addPlan(0, "밥")
                .addPlan(0, "산책")
                .getTrip();
    }

    public Trip shotJejuTrip(){
        return builder.title("단기 제주 여행")
                .startDate(LocalDateTime.of(2021, 12, 02, 11, 25))
                .getTrip();
    }

}
