package counting_sort_1;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] input = new int[T];
		int[] count = new int[100];
		
		for(int i=0; i<T;){
			String[] line = sc.nextLine().split(" ");
			if(!line[0].equals("")){
				input[i] = Integer.parseInt(line[0]);
				count[input[i]]++;
				i++;
			}
		}
		
		int total = 0;
		for(int i=0; i<100; i++){
			total += count[i];
			System.out.print(total + " ");
		}
		
	}
}
