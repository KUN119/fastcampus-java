package model2;

import java.util.Arrays;

public class ObjectArray {
    private static final int DEFAULT_CAPACITY = 5; //final: 상수(수정 불가)
    private Object[] elements; //다형성 배열
    private int size;

    //생성 동작
    public ObjectArray() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //저장하는 동작
    public void add(Object element){
        if(size == elements.length){
            ensureCapacity();
        }
        elements[size++] = element;
    }
    //얻는 동작
    public Object get(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("범위 초과");
        }
        return elements[index];
    }

    public int size() {
        return size;
    }

    public void ensureCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}
