package running_time_of_algorithm;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr = new int[t];
		
		for(int i=0; i<t; i++){
			arr[i] = sc.nextInt();
		}
	
		int count = 0;
		for(int i=1; i<arr.length; i++){
			for(int k=i; k>0 && arr[k-1] > arr[k]; k--){
				swap(arr, k, k-1);
				count++;
			}
		}
		

		System.out.print(count);
		
	}
	
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
