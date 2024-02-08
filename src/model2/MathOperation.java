package model2;

@FunctionalInterface //함수형 인터페이스(=단일 추상 메서드 인터페이스)
public interface MathOperation {
    public int operation(int x, int y); // 추상 메서드
}
