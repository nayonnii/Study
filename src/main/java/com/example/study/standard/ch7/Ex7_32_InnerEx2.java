package com.example.study.standard.ch7;

public class Ex7_32_InnerEx2 {
    class InstanceInner {}
    static class StaticInner {}

//     인스턴스 멤버 간에는 서로 직접 접근이 가능하다.
    InstanceInner iv = new InstanceInner();
//     static 멤버 간에는 서로 직접 접근이 가능하다.
    static StaticInner cv = new StaticInner();

    static void staticMethod() {
//      static 멤버는 인스턴스 멤버에 직접 접근할 수 없다.
//      InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        Ex7_32_InnerEx2 outer = new Ex7_32_InnerEx2();
        // 외부 클래스 선언 후엔 인스턴스 클래스에도 접근 가능하다.
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod() {
//        인스턴스메서드에서는 인스턴스멤버와 static 멤버 모두 접근 가능하다.
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
//        메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다.
//        LocalInner lv = new LocalInner();
    }

    void myMethod() {
        class LocalInner {}
        LocalInner lv = new LocalInner();
    }


}
