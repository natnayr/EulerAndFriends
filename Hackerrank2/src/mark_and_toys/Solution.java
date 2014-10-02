package mark_and_toys;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		LinkedList<Long> longList = new LinkedList<Long>(); 
		for(int i=0; i<N; i++){
			longList.add(sc.nextLong());
		}
		longList = quickSort(longList);
		
		//greedy
		int count = 0;
		for(int i=0; i<N; i++){
			if(K > longList.get(i)){
				K -= longList.get(i);
				count++;	
			}
		}
		System.out.println(count);
	}

	public static LinkedList<Long> quickSort(LinkedList<Long> list){
		LinkedList<Long> less = new LinkedList<Long>();
		LinkedList<Long> equal = new LinkedList<Long>();
		LinkedList<Long> more = new LinkedList<Long>();
		Random rand = new Random(); 
		
		long pivot = list.get(rand.nextInt(list.size()));
		for(int i=0; i<list.size(); i++){
			if(pivot > list.get(i)){
				less.add(list.get(i));
			}else if(pivot == list.get(i)){
				equal.add(list.get(i)); 
			}else if(pivot < list.get(i)){
				more.add(list.get(i));
			}
		}
		
		if(less.size() > 0){
			less = quickSort(less);
		}
		
		if(more.size() > 0){
			more = quickSort(more);
		}
		less.addAll(equal);
		less.addAll(more);
		
		return less;
	}
	
}
