package quick_sort_1;

import java.util.*;

public class Solution {

	static void partition(int[] ar) {
		LinkedList<Integer> less = new LinkedList<Integer>();
		LinkedList<Integer> more = new LinkedList<Integer>();
		LinkedList<Integer> equal = new LinkedList<Integer>();
		
		int pivot = ar[0];
		for(int i=0; i<ar.length; i++){
			if(ar[i] < pivot){
				less.add(ar[i]);
			}else if(ar[i] == pivot){
				equal.add(ar[i]);
			}else if(ar[i] > pivot){
				more.add(ar[i]);
			}
		}
		
		less.addAll(equal);
		less.addAll(more);
		for(int i=0; i<ar.length; i++){
			ar[i] = less.get(i);
		}
		printArray(ar);
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		partition(ar);
		
	}
}
