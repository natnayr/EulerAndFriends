package make_an_anagram;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		
		int size = Character.getNumericValue('z')-Character.getNumericValue('a')+1;
		int alpha_prefix = Character.getNumericValue('a');
		
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		
		//initialise
		for(int i=0; i<size; i++){
			arr1[i] = 0;
			arr2[i] = 0;
		}
		
		for(int i=0; i<str1.length(); i++){
			arr1[Character.getNumericValue(str1.charAt(i))-alpha_prefix]++;
		}
		
		for(int i=0; i<str2.length(); i++){
			arr2[Character.getNumericValue(str2.charAt(i))-alpha_prefix]++;
		}
		
		int count = 0;
		for(int i=0; i<size; i++){
			count += Math.max(arr1[i], arr2[i]) - Math.min(arr1[i], arr2[i]);
		}
		
		System.out.println(count);
	}
	
	
}
