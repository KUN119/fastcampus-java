package course2.part2;

import model2.MathOperation;
import model2.MathOperationImpl;

public class FunctionInterfaceTest2 {
    public static void main(String[] args) {
        MathOperation mo = new MathOperationImpl();
        System.out.println(mo.operation(10,20));


    }


}
