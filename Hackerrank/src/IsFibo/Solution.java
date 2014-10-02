package IsFibo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			long[] list = fibList(60);
			
			for(int i=0; i<T; i++){
				long num = Long.parseLong(br.readLine());
				
				if(Arrays.binarySearch(list, num) > 0){
					System.out.println("IsFibo");
				}else{
					System.out.println("IsNotFibo");
				}
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static long[] fibList(int n){
		long[] list = new long[n];
		list[0] = 0;
		list[1] = 1;
		
		long fib = 1;
		long prevFib = 1;
		
		for(int i=2; i<n; i++){
			long temp = fib;
			fib += prevFib;
			list[i] = fib;
			prevFib = temp;
		}
		
		return list;
	}
}
