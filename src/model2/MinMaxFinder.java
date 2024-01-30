package model2;

import java.sql.Array;

public class MinMaxFinder {
    private MinMaxFinder(){

    }
    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i : arr) {
            if(min > i){
                min = i;
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i : arr) {
            if(max < i){
                max = i;
            }
        }
        return max;
    }
}
