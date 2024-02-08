package course2.part2;

import model2.MathOperation;

public class FunctionInterfaceTest3 {
    public static void main(String[] args) {
        // MathOperation 인터페이스를 내부 익명클래스로 구현
        MathOperation mo = new MathOperation(){

            @Override
            public int operation(int x, int y) {
                return x + y;
            }
        };

        System.out.println(mo.operation(10,15));
        
    }
}
