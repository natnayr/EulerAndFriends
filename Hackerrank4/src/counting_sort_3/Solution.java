package counting_sort_3;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		
		int[] list = new int[100];
		
		for(int i=0; i<t; i++){
			String str = sc.nextLine();
			str = str.replaceAll("(\\s)[a-zA-Z]*", "");
			list[Integer.parseInt(str)]++;
		}
		
		int total = 0;
		for(int i=0; i<list.length; i++){
			total += list[i];
			System.out.print(total + " ");
		}
	}
	
}
