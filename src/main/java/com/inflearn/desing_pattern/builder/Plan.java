package com.inflearn.desing_pattern.builder;

public class Plan {
    private int day;
    private String plan;

    public Plan(int day, String plan) {
        this.day = day;
        this.plan = plan;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "day=" + day +
                ", plan='" + plan + '\'' +
                '}';
    }
}
