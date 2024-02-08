package course2.part2;

import model2.MathOperation;

public class LambdaExample {
    public static void main(String[] args) {
        MathOperation add = (x, y) -> x + y;
        int result = add.operation(10, 232);
        System.out.println("result = " + result);
        
        MathOperation mul = (x, y) -> x * y;
        int mutResult = mul.operation(23, 12);
        System.out.println("mutResult = " + mutResult);
    }
}
