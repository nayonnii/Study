package Exercise;

public class Ex4_33_FlowEx34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop1 : for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==5)
//					break Loop1;	//2*4���� ���
//					break;			//i*4������ ���
//					continue Loop1;	//i*4������ ���
					continue;		//j=5�� ��츸 ���� ���
				System.out.println(i + "*" + j + "=" + "i*j");
			}
		}
	}

}
