package mark_and_toys;

import java.util.Scanner;


public class Solution {
	
	static int[] helper;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int money = sc.nextInt();
		
		int[] arr = new int[t];
		helper = new int[t];
		
		for(int i=0; i<t; i++){
			arr[i] = sc.nextInt();
		}
		
		
		mergeSort(arr, 0, arr.length-1 );
		
		int count = 0;
		for(int n : arr){
			if(n <= money){
				money-=n;
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static void mergeSort(int[] arr, int low, int high){
		if(low < high){
			int middle = low + (high - low)/2;
			mergeSort(arr, low, middle);
			mergeSort(arr, middle+1, high);
			merge(arr, low, middle, high);
		}
	}
	
	public static void merge(int[] arr, int low, int middle, int high){
		
		for(int i=low; i<=high; i++){
			helper[i] = arr[i];
		}
		
		int i = low, j = middle + 1, k = low;
		
		while(i<= middle && j <= high){
			if(helper[i] <= helper[j]){
				arr[k] = helper[i];
				i++;
			}else{
				arr[k] = helper[j];
				j++;
			}
			k++;
		}
		
		while(i <= middle){
			arr[k] = helper[i];
			k++;
			i++;
		}
	}
	
}
