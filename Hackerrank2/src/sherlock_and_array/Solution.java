package sherlock_and_array;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T > 0){
			int N = sc.nextInt();
			int[] ar = new int[N];
			ar[0] = sc.nextInt();
			for(int i=1; i<N; i++){
				ar[i] = ar[i-1] + sc.nextInt();
			}
			
			boolean exists = false;
			
			if(ar.length == 1){
				exists = true;
			}
			
			for(int i=1; i<N; i++){
				if(ar[i-1] ==  (ar[N-1]-ar[i])){
					exists = true;
					break;
				}
			}
			
			if(exists == true){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
			T--;
		}
	}
}
