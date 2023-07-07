package Exercise;

public class OperatorEx31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec = 1234;		//00000000000000000001001000110100
		int hex = 0xABCD;	//00000000000000001010101111001101
		int mask = 0xF;		//00000000000000000000000000001111
		
		System.out.printf("hex = %X%n", hex);			//ABCD
		System.out.printf("hex = %X%n", hex & mask);	//1101 -> 13 -> D
		
		hex = hex >> 4;									//hex: 00000000000000000000101010111100
		System.out.printf("%X%n", hex & mask);			//00000000000000000000000000001100 -> C

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask); // B

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);	//A

	}

}
