package com.maximus.earthquakeexampleapp;

/**
 * Created by maximus on 17.01.18.
 */

public class EarthQuake {

    private double magnitude;
    private String cityName;
    private long timeMillis;
    private String url;

    public EarthQuake(String cityName) {
        this.cityName = cityName;
    }

    public EarthQuake(double magnitude, String cityName, long timeMillis, String url) {
        this.magnitude = magnitude;
        this.cityName = cityName;
        this.timeMillis = timeMillis;
        this.url = url;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return cityName;
    }

    public long getTimeMillis() {
        return timeMillis;
    }

    public String getUrl() {
        return url;
    }
}
