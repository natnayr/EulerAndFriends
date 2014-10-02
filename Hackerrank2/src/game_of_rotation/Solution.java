package game_of_rotation;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] list = new long[N];
		
		for(int i=0; i<N; i++){
			list[i] = sc.nextLong();
		}

		long sumList = 0;
		long sumPrev = 0;
		
		//so to calculate the next sumPrev,
		//reduce sumPrev with  
		for(int i=0; i<N; i++){
			sumList += list[i];
			sumPrev += (i+1) * list[i]; //initial without any rotation
		}
		
		long output = sumPrev;
		
		for(int i=0; i<N; i++){
			sumPrev -= sumList;
			sumPrev += (list[i] * N);
			if(sumPrev > output){
				output = sumPrev;
			}
		}
		
		System.out.println(output);
	}
}
