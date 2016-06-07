package com.implemica.tasks.secondTask;

/**
 * Created by Dariia on 07.06.2016.
 */
//Class information about city
public class CityInformation {
    private String cityName;
    private int cityCountNeighbors;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCountNeighbors() {
        return cityCountNeighbors;
    }

    public void setCityCountNeighbors(int cityCountNeighbors) {
        this.cityCountNeighbors = cityCountNeighbors;
    }
}
