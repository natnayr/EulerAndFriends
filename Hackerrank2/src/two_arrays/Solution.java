package two_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int w=0; w<T; w++){
			int N = sc.nextInt();
			long K = sc.nextLong();
			Integer[] a = new Integer[N];
			Integer[] b = new Integer[N];
			
			for(int i=0; i<N; i++){
				a[i] = sc.nextInt();
			}
			for(int i=0; i<N; i++){
				b[i] = sc.nextInt();
			}
			
			Comparator<Integer> comparator = new Comparator<Integer>(){
				@Override
				public int compare(Integer a, Integer b) {
					return a > b ? -1 : a == b ? 0 : 1;
				}
			};
			
			Arrays.sort(a);
			Arrays.sort(b, comparator);
			
			boolean bigger = true;
			for(int i=0; i<N; i++){
				if((a[i]+b[i]) < K){
					bigger = false;
					break;
				}
			}
			
			if(bigger == true){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}
