package com.implemica.tasks.secondTask;

/**
 * Created by Dariia on 07.06.2016.
 */
public class MatrixUtil {
    // An array that contains the value of the ribs
    private int[][] cost;

    //Argument is the number of vertices in the graph
    public MatrixUtil(int vertices){
        cost = new int [vertices][vertices];
    }

    //Set the weight between the neighbors
    public void setEdge (int cityIndex, RoutsInformation routsInformation){
        cost [cityIndex][routsInformation.getIndex()] = routsInformation.getRoutWeight();
    }

    // Returns 0 if i and j are the same, a large number of returns if there is no connection
    // between the tops of the ribs or weight
    public int getCost(int i , int j){

                            /* [0, 0, 1, 3, 0]
                             * [0, 1, 0, 1, 4]
                             * [0, 3, 1, 0, 1]
                             * [0, 0, 4, 1, 0]*/
        if (i == j){
            return 0;
        }
        if (cost[i][j] == 0){
            return 10001;
        }
        return cost[i][j];
    }

    //Return the index of the smallest element of distances, ignoring those in visited.
    protected int cheapest (Integer[] result, boolean [] visited){
        int best = -1;
        for (int i = 0; i < cost.length; i++){
            if (!visited[i] && ((best < 0)||(result[i] < result[best]))) {
                best = i;
            }
        }
        return best;
    }

    /*Return an array of the distances from source to each other vertex*/
    public Integer[] distancesFrom (int source){
        Integer[] result = new Integer[cost.length];
        java.util.Arrays.fill(result,10001);// Set tops mark
        result [source] = source;//Assign 1st top mark equal to "source", because this vertex
        boolean [] visited = new boolean [cost.length];// visit the city
        for (int i = 0; i < cost.length; i++){
            int City = cheapest (result, visited);// Select the top of which has a minimum mark
            visited [City] = true;// Note selected vertex visited
            for (int j = 0; j < cost.length; j++){
                // Write the smallest path from one vertex to another
                result [j] = Math.min(result[j], result[City] + getCost(City,j));
            }
        }
        return result;
    }
}

