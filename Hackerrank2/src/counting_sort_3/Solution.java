package counting_sort_3;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] input = new int[T];
		int[] count = new int[100];
		
		for(int i=0; i<T; i++){
			input[i] = sc.nextInt();
			count[input[i]]++;
		}
		
		int total = 0;
		for(int i=0; i<100; i++){
			for (int j=0; j<count[i]; j++){
				System.out.print(i + " ");
			}
		}
		
	}
}

