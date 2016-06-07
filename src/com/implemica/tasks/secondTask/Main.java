package com.implemica.tasks.secondTask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by Dariia on 07.06.2016.
 */
public class Main {
    private static File fileName =
            new File("C:\\Users\\Dariia\\IdeaProjects\\TasksFromImplemica\\src\\com\\implemica\\tasks\\secondTask\\input.txt");
    private BufferedReader bufferedReader;
    private String[] citiesIndex;
    private MatrixUtil matrixUtil;
    private String start;
    private String destination;
    private Information information;
    private CityInformation cityInformation;
    RoutsInformation routsInformation;

    public void readFromFile() throws IOException {
        bufferedReader = new BufferedReader(new FileReader(fileName)); // read information from file

        information = new Information();
        information.setTestNumber(Integer.parseInt(bufferedReader.readLine())); // read the number of tests

        for (int countTest = 0; countTest < information.getTestNumber(); countTest++) {
            information.setCountCities(Integer.parseInt(bufferedReader.readLine())); // read the number of cities
            citiesIndex = new String[information.getCountCities()]; // create an array of the condition of the job

            //matrix = countCities + 1
            matrixUtil = new MatrixUtil(information.getCountCities() + 1);

            for (int city = 0; city < information.getCountCities(); city++) {
                cityInformation = new CityInformation(); //create class cityInformation
                cityInformation.setCityName(bufferedReader.readLine());
                // set Name and count neighbors
                cityInformation.setCityCountNeighbors(Integer.parseInt(bufferedReader.readLine()));

                citiesIndex[city] = cityInformation.getCityName(); // write the name of the city
                for (int neighbor = 0; neighbor < cityInformation.getCityCountNeighbors(); neighbor++) {
                    String[] brokenLine = bufferedReader.readLine().split(" ");

                    // Write the code neighbor and the weight of the edge
                    routsInformation = new RoutsInformation();
                    routsInformation.setIndex(Integer.parseInt(brokenLine[0]));
                    routsInformation.setRoutWeight(Integer.parseInt(brokenLine[1]));

                    matrixUtil.setEdge(city, routsInformation);
                }
            }
            information.setCountRoutesToFind(Integer.parseInt(bufferedReader.readLine()));// number of calculated routes
            for (int routesIndex = 0; routesIndex < information.getCountRoutesToFind(); routesIndex++){
                information.setCityNames(bufferedReader.readLine().split(" "));
                start = information.getCityNames()[0];
                destination = information.getCityNames()[1];

                printAllInformation(destinationDistance());
            }
        }
        closeBuffered();
    }

    // find the index of the initial city
    public int findIndex(String position){
        int index = 0;
        for (int i = 0; i < citiesIndex.length; i++) {
            if(position.equals(citiesIndex[i])){
                index = i;
                break;
            }
        }
        return index;
    }
    //find distances from information
    public int destinationDistance(){
        Integer[] distancesFromSource = matrixUtil.distancesFrom(findIndex(start));
        return distancesFromSource[findIndex(destination)];
    }
    //print information
    public void printAllInformation(int destinationDistance){
        System.out.println("minimum transportation cost between cities : "
                + Arrays.asList(information.getCityNames())
                + " = " + destinationDistance);
    }
    //close buffer
    public void closeBuffered() throws IOException {
        bufferedReader.close();
    }

   public static void main(String[] args) throws IOException {
       Main m = new Main();
       m.readFromFile();
   }
}

