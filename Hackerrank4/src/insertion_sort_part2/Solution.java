package insertion_sort_part2;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int[] arr = new int[s];
		
		//array initialised
		for(int i=0; i<s; i++){
			arr[i] = sc.nextInt();
		}
		
		//run through and sort
		for(int i=1; i<arr.length; i++){
			
			for(int k=i; k>0 && arr[k] < arr[k-1]; k--){
				swap(arr, k, k-1);
			}
			
			for(int j=0; j<arr.length; j++){
				System.out.print(arr[j] + " ");
			}
			System.out.println();
			
		}

	}
	
	
	public static void swap(int[] arr,int i, int j){
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
}