package Codes;
// finding numbers divible by 3 & 5 from [1-100]
public class divisiblethree {

	public static void main(String[] arggs) {
		for(int i = 0; i <100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.print(i);
			}
		}
	}
	
}
