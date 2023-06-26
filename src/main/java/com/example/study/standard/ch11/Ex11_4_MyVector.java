package com.example.study.standard.ch11;

import java.util.*;
import java.util.function.UnaryOperator;

public class Ex11_4_MyVector implements List {
    Object[] data = null;   // 객체를 담기 위한 객체배열
    int capacity = 0;   // 용량
    int size = 0;   // 크기

    public Ex11_4_MyVector(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("유효하지 않은 값입니다 : " + capacity);
        }
        this.capacity = capacity;
        data = new Object[capacity];
    }
    public Ex11_4_MyVector() {
        this(10);   // 용량 미지정 시 default 용량 10
    }

    // 최소한의 저장공간(capacity)를 확보하는 메소드
    public void ensureCapacity(int minCapacity) {
        if(minCapacity - data.length > 0) {
            setCapacity(minCapacity);
        }
    }

    public boolean add(Object obj) {
        // 새로운 객체를 저장하기 전에 저장할 공간을 확보한다.
        ensureCapacity(size + 1);
        data[size++] = obj;
        return true;
    }

    public Object get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        return data[index];
    }

    public Object remove(int index) {
        Object oldObj = null;

        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        oldObj = data[index];

        // 삭제하고자 하는 객체가 마지막 객체가 아니라면, 배열 복사를 통해 빈자리를 채워줘야 한다.
        // System.arraycopy(원본 배열, 원본 배열에서 복사 시작 위치, 복사할 배열(결과배열), 복사할 배열에서 복사 시작 위치, 복사할 요소의 개수);
        if(index != size - 1) {
            System.arraycopy(data, index + 1, data, index, size - index - 1);
            // index = 2, size = 8
            // System.arraycopy(data, 3, data, 2, 5)
            // 1,2,3,4,5,6,7,8
            // 1,2,3,4,5,6,7,8
            // 1,2, ,4,5,6,7,8

        }
        data[size - 1] = null; // 마지막 데이터는 null로 저장
        size--;
        return oldObj;
    }

    public boolean remove(Object obj) {
        for(int i = 0; i < size; i++) {
            if(obj.equals(data[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public void trimSize() {
        setCapacity(size);
    }

    private void setCapacity(int capacity) {
        if(this.capacity == capacity) return;   // 용량이 같으면 변경하지 않음

        Object[] tmp = new Object[capacity];
        System.arraycopy(data, 0, tmp, 0, size);
        data = tmp;
        this.capacity = capacity;
    }

    public void clear() {
        for(int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public Object[] toArray() {
        Object[] result = new Object[size];
        System.arraycopy(data, 0, result, 0, size);
        return result;
    }

    public boolean isEmpty() {return size == 0;}
    public int getCapacity() {return capacity;}
    public int size() {return size;}


/*  List 인터페이스로부터 상속받은 메소드들  */
//    public int size();
//    public boolean isEmpty();
    public boolean contains(Object o) {return false;}
//    public Object[] toArray();
    public Object[] toArray(Object a[]) {return null;}
//    public boolean add(Object o);
//    public boolean remove(Object o);
    public boolean containsAll(Collection c) {return false;}
    public boolean addAll(Collection c) {return false;}
    public boolean addAll(int index, Collection c) {return false;}
    public boolean removeAll(Collection c) {return false;}
    public boolean retainAll(Collection c) {return false;}
//    public void clear();
    public boolean equals(Object o) {return false;}
//    public int hashCode();
//    public Object get(int index);
    public Object set(int index, Object element) {return null;}
    public void add(int index, Object element){}
//    public Object remove(int index);
    public int indexOf(Object o){return -1;}
    public int lastIndexOf(Object o) {return -1;}
    public ListIterator listIterator() {return null;}
    public ListIterator listIterator(int index){return null;}
    public List subList(int fromIndex, int toIndex){return null;}

    public void sort(Comparator c) {/* 내용 생략 */}   // JDK 1.8부터
    public Spliterator spliterator() {/* 내용 생략 */ return null;}   // JDK 1.8부터
    public void replaceAll(UnaryOperator operator) {/* 내용 생략 */}   // JDK 1.8부터

    @Override
    public Iterator iterator() {
        return null;
    }

    public static void main(String[] args) {

    }
}
