package com.example.study.algorithm.string;

public class BFPatternMatching1 {
    // target문자열에서 pattern 문자열 길이만큼 잘라서 pattern문자와 뭉텅이씩 비교
    public void solution(String target, String pattern) {
        int num = target.length() - pattern.length();   // 비교할 횟수
        int answerIndex = -1;   // 일치하는 문자가 시작되는 위치(default: -1)

        // target 문자열의 첫글자부터 pattern 문자열과 비교
        for(int i = 0; i < num; i++) {
            String targetSub = target.substring(i, i + pattern.length());
            // 일치하는 문자가 있을 경우 해당 index 저장
            if(targetSub.equals(pattern)) {
                answerIndex = i;
            }
        }

        // 일치하는 문자 존재 유무에 따라 내용 출력
        if(answerIndex != -1) {
            System.out.println("pattern과 일치하는 문자는 " + (answerIndex + 1) + "번째부터 있습니다.");
        } else {
            System.out.println("pattern과 일치하는 문자가 없습니다.");
        }
    }

    public static void main(String[] args) {
        String target = "Andy loved to sleep on a bed of nails";
        String pattern1 = "sleep";
        String pattern2 = "sleeeee";

        BFPatternMatching1 bfp = new BFPatternMatching1();
        bfp.solution(target, pattern1);
        bfp.solution(target, pattern2);
    }
}
