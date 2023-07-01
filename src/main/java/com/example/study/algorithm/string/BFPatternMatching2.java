package com.example.study.algorithm.string;

public class BFPatternMatching2 {
    // target 문자와 pattern 문자를 하나하나 비교하여 일치여부 확인

    public void solution(String target, String pattern) {
       int tarIdx = 0;
       int parIdx = 0;

       // tarIdx는 전체 길이보다 작을 동안에 반복한다.
        // 존재하는지만 검사하면 된다고 가정, parIdx가 pattern.length()보다 작을 동안 반복한다.
        while(tarIdx < target.length() && parIdx < pattern.length()) {

            // target[tarIdx]가 pattern[parIdx]와 다를 경우
            if(target.charAt(tarIdx) != pattern.charAt(parIdx)) {
                // 여태 이동한 만큼 되돌린다.
                tarIdx -= parIdx;
                // parIdx = -1로 할당한다.
                parIdx = -1;
            }

            // 다음 칸으로 이동한다.
            tarIdx += 1;
            parIdx += 1;
        }

        // parIdx == pattern.length()면 성공이다.
        // 어디에서 찾았는지 출력한다.
        if(parIdx == pattern.length()) {
            System.out.println(tarIdx - parIdx);
        }
        // 못찾았다면 에러메시지를 출력한다.
        else {
            System.out.println("404 Not Found");
        }
    }

    public static void main(String[] args) {
        String target = "Andy loved to sleep on a bed of nails";
        String pattern1 = "sleep";
        String pattern2 = "sleeeee";

        BFPatternMatching2 bfp = new BFPatternMatching2();
        bfp.solution(target, pattern1);
        bfp.solution(target, pattern2);
    }
}
