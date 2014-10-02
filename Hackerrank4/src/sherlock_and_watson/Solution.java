package sherlock_and_watson;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++){
			arr[i] = sc.nextInt();
		}
		
		int[] query = new int[Q];
		for(int i=0; i<Q; i++){
			query[i] = sc.nextInt();
		}
		
		//(i-k+n) % n 
		for(int i=0; i<N; i++){
			arr[i] = arr[foo((i-K+N),N)];
		}
		
		for(int i=0; i<Q; i++){
			System.out.println(arr[query[i]]);
		}
	}
	
	public static int foo(int k, int n){
		while(k<0){
			k += n;
		}
		return k % n;
	}
}
