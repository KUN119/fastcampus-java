package course2.part1;

import model2.MinMaxFinder;

public class MinMaxFinderMain {
    public static void main(String[] args) {

        int[] arr = {12, 34, 54, 11};

        int min = MinMaxFinder.findMin(arr);
        int max = MinMaxFinder.findMax(arr);


        System.out.println("min:" + min);
        System.out.println("max:" + max);

    }
}
