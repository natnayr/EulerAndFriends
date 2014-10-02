package love_letter_palindrome;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCaseNumbers = Integer.parseInt(sc.nextLine());
		for(int i=0; i<testCaseNumbers; i++){
			String next = sc.nextLine();
			String flip = flip(next);
			
			int count = 0;
			for(int j=0; j<flip.length(); j++){
				count += Math.abs(flip.charAt(j) - next.charAt(j));
			}
			
			System.out.println(count/2);
		}	
	}
	
	public static String flip(String inWord){
		StringBuffer sb = new StringBuffer();
		for(int i=inWord.length()-1; i>=0; i--){
			sb.append(inWord.charAt(i));
		}
		return sb.toString();
	}
}
