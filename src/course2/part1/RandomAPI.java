package cource2.part1;

import java.util.Random;

public class RandomAPI {

    public static void main(String[] args) {
        Random rand = new Random(); // java api

        int[] arr = new int[6];

        int i = 0; //저장 위치

        while(i < 6) {
            int num = rand.nextInt(45) + 1; //랜덤 값 범위
            boolean isDuplicate = false;

            //중복 검사
            for(int j = 0; j < i; j++){
                if(arr[j] == num) {
                    isDuplicate = true;
                    break;
                }
            }

            // 배열에 랜덤 값 저장 후, i+1
            if(!isDuplicate){
                arr[i++] = num;
            }
        }

        for (int i1 : arr) {
            System.out.print(i1 + " ");
        }
    }
}
