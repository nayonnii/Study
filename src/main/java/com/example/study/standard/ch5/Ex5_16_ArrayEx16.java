package Exercise;

import java.util.Arrays;

public class Ex5_16_ArrayEx16 {
//커맨드 라인을 통해 입력받기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("매개변수의 개수: " + args.length);
		for(int i=0; i<args.length; i++) {
			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
		}
	}

}