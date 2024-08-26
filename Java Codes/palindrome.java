package Codes;
import java.util.Scanner;


public class palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String : " );
		String str =  scan.nextLine();
		char [] chars = str.toCharArray();
		int num = 0;
		
		for (int i = 0; i < chars.length/2; i++) {
			if(chars[i] != chars[chars.length-1-i]) {
				num =1; break;
			}
		}
		
		if(num == 0) {
			System.out.println(str + "is Palindrome");
		} else {
			System.out.println(str + "is not Palindrome");
		}
	}
}
