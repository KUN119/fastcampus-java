package course2.part2;

public class IntArrayBasic {

    public static void main(String[] args) {
        // 정수 5개를 배열에 저장히고 출력하세요.
        int[] arr = new int[5]; // 배열 생성 동작: 고정길이(단점) -> 가변?

        //저장 동작
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " "); //출력 동작
        }

        for (int i : arr) {
            System.out.println();
            System.out.print(i + " ");
        }
    }
}
