package find_the_median;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] list = new int[N];
		
		for(int i=0; i<list.length; i++){
			list[i] = sc.nextInt();
		}
		
//		quickSort(list, 0, list.length-1);
		Arrays.sort(list);
		System.out.print(list[list.length/2]);
		
	} 
	
	public static int partition(int[] list, int left, int right){
		
		int pIndex = left + ((right-left)/2); //middle of search
		int pValue = list[pIndex];
		
		swap(list, pIndex, right);
		int sIndex = left;
		for(int i=left; i<right; i++){
			if(list[i] <= pValue){
				swap(list, i, sIndex);
				sIndex++;
			}
		}
		swap(list, sIndex, right);
		return sIndex;
	}
	
	public static void quickSort(int[] list, int i, int k){
		if(i<k){
			int p = partition(list, i, k);
			quickSort(list, i, p-1);
			quickSort(list, i, p-1);
		}
	}
	
	public static void swap(int[] list, int i, int j){
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
}
