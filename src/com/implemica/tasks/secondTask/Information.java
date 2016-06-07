package com.implemica.tasks.secondTask;

/**
 * Created by Dariia on 07.06.2016.
 */
//The class with the statement of the problem
public class Information {
    private CityInformation cityInformation;
    private RoutsInformation routsInformation;
    private int countCities;
    private int testNumber;
    private int countRoutesToFind;
    private String [] cityNames;

    public CityInformation getCityInformation() {
        return cityInformation;
    }

    public void setCityInformation(CityInformation cityInformation) {
        this.cityInformation = cityInformation;
    }

    public RoutsInformation getRoutsInformation() {
        return routsInformation;
    }

    public void setRoutsInformation(RoutsInformation routsInformation) {
        this.routsInformation = routsInformation;
    }

    public int getCountRoutesToFind() {
        return countRoutesToFind;
    }

    public void setCountRoutesToFind(int countRoutesToFind) {
        this.countRoutesToFind = countRoutesToFind;
    }

    public int getCountCities() {
        return countCities;
    }

    public void setCountCities(int countCities) {
        this.countCities = countCities;
    }

    public int getTestNumber() {
        return testNumber;
    }

    public void setTestNumber(int testNumber) {
        this.testNumber = testNumber;
    }

    public String[] getCityNames() {
        return cityNames;
    }

    public void setCityNames(String[] cityNames) {
        this.cityNames = cityNames;
    }
}
