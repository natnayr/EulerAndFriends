package quick_sort;

import java.util.*;

public class Solution {

	public static LinkedList<Integer> quicksort(LinkedList<Integer> ar) {
		LinkedList<Integer> less = new LinkedList<Integer>();
		LinkedList<Integer> more = new LinkedList<Integer>();
		LinkedList<Integer> equal = new LinkedList<Integer>();
		
		int pivot = ar.get(0);
		for(int i=0; i<ar.size(); i++){
			if(ar.get(i) < pivot){
				less.add(ar.get(i));
			}else if(ar.get(i) == pivot){
				equal.add(ar.get(i));
			}else if(ar.get(i) > pivot){
				more.add(ar.get(i));
			}
		}
		
		if(less.size() > 0){
			less = quicksort(less);
		}
		
		if(more.size() > 0){
			more = quicksort(more);
		}
		
		less.addAll(equal);
		less.addAll(more);
		
		if(less.size() > 1){
			printArray(less);
		}
		return less;
	}

	public static void printArray(LinkedList<Integer> ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		LinkedList<Integer> ar = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			ar.add(in.nextInt());
		}
		quicksort(ar);
		
	}
}
