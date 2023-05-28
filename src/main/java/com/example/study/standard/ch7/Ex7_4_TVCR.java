package com.example.study.standard.ch7;

class Tv2 {
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class VCR {
    boolean power;
    int counter = 0;
    void power() {power = !power;}
    void play() {}
    void stop() {}
    void rew() {}
    void ff() {}
}

public class Ex7_4_TVCR extends Tv2{ // Tv클래스를 조상클래스로 하고, VCR클래스는 TVCR클래스에 포함시킴
    VCR vcr = new VCR();
    void play() {
        vcr.play();
    }
    void stop() {
        vcr.stop();
    }
    void rew() {
        vcr.rew();
    }
    void ff() {
        vcr.ff();
    }

    public static void main(String[] args) {
    }
}
