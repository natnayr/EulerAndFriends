package lonely_integer;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] list = new int[N];
		
		for(int i=0; i<N; i++){
			list[i] = sc.nextInt();
		}
		
		Arrays.sort(list);
		
		if(list.length == 1){
			System.out.println(list[0]);
			System.exit(0);
		}
		
		for(int i=0; i<N; i+=2){
			//last item on list
			if(i == N-1){
				System.out.println(list[i]);
				System.exit(0);
			}
			
			//something does not match
			if(list[i] != list[i+1]){
				System.out.println(list[i]);
				System.exit(0);
			}
			
		}
	}
	
}
