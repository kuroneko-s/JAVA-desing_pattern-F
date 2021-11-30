package com.inflearn.desing_pattern.builder;

import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;

@Builder
public class LombokTrip {
        private int night;
        private String title;
        private int day;
        private LocalDateTime startDate;
        private LocalDateTime endDate;
        private List<Plan> planList;

        public int getNight() {
            return night;
        }

        public String getTitle() {
            return title;
        }

        public int getDay() {
            return day;
        }

        public LocalDateTime getStartDate() {
            return startDate;
        }

        public LocalDateTime getEndDate() {
            return endDate;
        }

        public List<Plan> getPlanList() {
            return planList;
        }

        @Override
        public String toString() {
            return "Trip{" +
                    "night='" + night + '\'' +
                    ", title='" + title + '\'' +
                    ", day=" + day +
                    ", startDate=" + startDate +
                    ", endDate=" + endDate +
                    ", planList=" + planList.toString() +
                    '}';
        }

    }

