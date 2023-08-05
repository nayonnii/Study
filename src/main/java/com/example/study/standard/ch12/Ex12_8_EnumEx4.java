package com.example.study.standard.ch12;

abstract class MyEnum<T extends MyEnum<T>> implements Comparable<T> {
    static int id = 0;
    int ordinal;
    String name = "";

    public int ordinal() {
        return ordinal;
    }

    MyEnum(String name) {
        this.name = name;
        ordinal = id++;
    }

    public int compareTo(T t) {
        return ordinal - t.ordinal();
    }
}

abstract class MyTransportation2 extends MyEnum {
    static final MyTransportation2 BUS = new MyTransportation2("BUS", 100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };
    static final MyTransportation2 TRAIN = new MyTransportation2("TRAIN", 100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };
    static final MyTransportation2 SHIP = new MyTransportation2("SHIP", 100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };
    static final MyTransportation2 AIRPLAIN = new MyTransportation2("AIRPLAIN", 100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    abstract int fare(int distance);

    protected final int BASIC_FARE;

    public MyTransportation2(String name, int basicFare) {
        super(name);
        this.BASIC_FARE = basicFare;
    }


    public String name() {
        return name;
    }

    public String toString() {
        return name;
    }
}

public class Ex12_8_EnumEx4 {
    public static void main(String[] args) {
        MyTransportation2 t1 = MyTransportation2.BUS;
        MyTransportation2 t2 = MyTransportation2.BUS;
        MyTransportation2 t3 = MyTransportation2.TRAIN;
        MyTransportation2 t4 = MyTransportation2.SHIP;
        MyTransportation2 t5 = MyTransportation2.AIRPLAIN;

        System.out.printf("t1 = %s, %d\n", t1.name(), t1.ordinal());
        System.out.printf("t2 = %s, %d\n", t2.name(), t2.ordinal());
        System.out.printf("t3 = %s, %d\n", t3.name(), t3.ordinal());
        System.out.printf("t4 = %s, %d\n", t4.name(), t4.ordinal());
        System.out.printf("t5 = %s, %d\n", t5.name(), t5.ordinal());
        System.out.println("t1 == t2 ? " + (t1 == t2));
        System.out.println("t1.compareTo(t3) = " + t1.compareTo(t3));
    }
}
