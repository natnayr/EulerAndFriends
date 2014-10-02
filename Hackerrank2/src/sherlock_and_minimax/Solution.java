package sherlock_and_minimax;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] list = new long[N];
		for(int i=0; i<N; i++){
			list[i] = sc.nextLong();
		}
		long P = sc.nextLong();
		long Q = sc.nextLong();
		
		Arrays.sort(list);
		
		long output = 0;
		
		for(int i=0; i<N; i++){
			
			for(long j = P; j<=Q; j++){
				long value = Math.min(Math.abs(list[i]-j), i);
				if(value > output) output = value;
			}
		}
		System.out.println(output);
	}	
}
