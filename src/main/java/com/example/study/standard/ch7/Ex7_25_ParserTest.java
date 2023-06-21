package com.example.study.standard.ch7;

public class Ex7_25_ParserTest {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");
    }
}

interface Parseable {
    // 구문 분석 작업을 수행한다.
    public abstract void parse(String fileName);
}

class ParserManager {
    public static Parseable getParser(String type) {    // 반환타입이 인터페이스이므로 해당 인터페이스를 구현한 인스턴스 반환 필요
        if (type.equals("XML")) {
            return new XMLParser();
        } else {
            return new HTMLParser();
        }
    }
}

class XMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "- XML parsing completed.");
    }
}

class HTMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "- HTML parsing completed.");
    }
}