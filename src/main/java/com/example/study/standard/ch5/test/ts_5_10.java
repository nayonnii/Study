package com.example.study.standard.ch5.test;

public class ts_5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] abcCode = {
				'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[', ']', '{', '}', ';', ':', ',', '/', '/' 
		};	
		char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
						  //0 1 2 3 4 5 6 7 8 9
		String src = "abc123";
		String result = "";
		
		//���ڿ� src�� ���ڸ� charAt()���� �ϳ��� �о ��ȯ �� result�� ����
		for(int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);
			
			if('a' <= ch && ch <= 'z') {
				for(int j=0; j<abcCode.length; j++) {
					if(ch - '0' - 49 == abcCode[j]) {
						result += abcCode[j];
					}
				}
			}
			
			if('0' <= ch && ch <= '9') {
				for(int j=0; j<numCode.length; j++) {
					if(ch == numCode[j]) {
						result += numCode[j];
					}
				}
			}
			
		}
		
		System.out.println("src:" + src);
		System.out.println("result:" + result);
		System.out.println('a' - '0' - 49);
	}

}
