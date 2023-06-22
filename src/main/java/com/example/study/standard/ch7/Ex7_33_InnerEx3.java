package com.example.study.standard.ch7;

public class Ex7_33_InnerEx3 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv;
        int iiv2 = outerCv;
    }

    static class StaticInner {
//        int siv = outerIv;  // static 클래스에서 외부 인스턴스 멤버 선언 불가
        static int scv = outerCv;
    }

    void myMethod() {
        int lv = 0; // final이 생략되어 있는 상태라서 LocalInner에서 사용 가능
        final int LV = 0;

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
            int liv3 = lv;
            int liv4 = LV;
        }
    }
}
