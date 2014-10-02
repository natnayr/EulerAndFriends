package two_arrays;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		for(int j=0; j<cases; j++){
			
			int t = sc.nextInt();
			int score = sc.nextInt();
			
			int a[] = new int[t];
			int b[] = new int[t];
			
			for(int i=0; i<t; i++){
				a[i] = sc.nextInt();
			}
			
			for(int i=0; i<t; i++){
				b[i] = sc.nextInt();
			}
			
			quickSort(a, 0, a.length-1);
			quickSort(b, 0, b.length-1);

			
			for(int i=0, k=a.length-1; i<a.length/2; i++, k--) swap(b, i, k);
			
			boolean accept = true;
			for(int i=0; i<t; i++){
				if((a[i] + b[i]) < score){
					accept = false;
				}
			}
			
			if(accept){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
	
	public static void quickSort(int[] arr, int i, int k){
		if(i < k){
			int p = partition(arr, i, k);
			quickSort(arr, i, p-1);
			quickSort(arr, p+1, k);
		}
	}
	
	public static int partition(int[] arr, int left, int right){
		
		int pivotIndex = left;
		int val = arr[pivotIndex];
		swap(arr, pivotIndex, right);
		int s = left;
		
		for(int i=left; i<right; i++){
			if(arr[i] < val){
				swap(arr, i, s);
				s++;
			}
		}
		
		swap(arr, s, right);
		return s;
	}
	
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
