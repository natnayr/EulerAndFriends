package insertion_sort_part_2;

import java.util.Random;
import java.util.Scanner;

public class Solution {

	public static Random rand = new Random();
	public static int quickCount;

	public static int insertIntoSorted(int[] ar) {
		int count = 0;
		for (int i = 1; i < ar.length; i++) {
			int j = i;

			while (j > 0 && ar[j - 1] > ar[j]) {
				int store = ar[j];
				ar[j] = ar[j - 1];
				ar[j - 1] = store;
				count++;
				j--;
			}
		}
		return count;
	}

	public static void quicksort(int[] ar, int f, int l) {
		if (f >= l) return;
		int p = partition(ar, f, l);
		quicksort(ar, f, p);
		quicksort(ar, p+1, l);
	}

	public static int partition(int[] ar, int f, int l) {

		int pivot = ar[f];
		while (f < l) {

			while (ar[f] < pivot)
				f++;
			while (ar[l] > pivot)
				l--;
			swap(ar, f, l);
		}
		return f;
	}

	public static void swap(int[] ar, int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
		quickCount++;
	}

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar1 = new int[s];
		int[] ar2 = new int[s];

		for (int i = 0; i < s; i++) {
			ar1[i] = in.nextInt();
			ar2[i] = ar1[i];
		}
		quickCount = 0;
		int insertSortCount = insertIntoSorted(ar1);
		quicksort(ar2, 0, ar2.length - 1);
		
		System.out.println(insertSortCount - quickCount);
	}

}
