package course2.part2;

import model2.MathOperation;

public class FunctionInterfaceTest implements MathOperation {
    public static void main(String[] args) {
        MathOperation mo = new FunctionInterfaceTest();
        System.out.println(mo.operation(10,20));
    }

    @Override
    public int operation(int x, int y) {
        return x + y;
    }
}
