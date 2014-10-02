package closest_numbers;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
		LinkedHashMap<Integer, LinkedList<Integer>> hashtable = 
				new LinkedHashMap<Integer, LinkedList<Integer>>();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] list = new int[N];
		
		for(int i=0; i<N; i++){
			list[i] = sc.nextInt();
		}
		
		Arrays.sort(list);
		
		for(int i=0; i<N-1; i++){
			int key = Math.abs(list[i] - list[i+1]);
			if(hashtable.get(key) == null){
				hashtable.put(key, new LinkedList<Integer>());
			}
			hashtable.get(key).add(list[i]);
			hashtable.get(key).add(list[i+1]);
		}
		int smallest = Integer.MAX_VALUE;
		Iterator<Integer> tit = hashtable.keySet().iterator();
		while(tit.hasNext()){
			int value = tit.next();
			if(value < smallest){
				smallest = value;
			}
		}
		StringBuffer sb = new StringBuffer();
		Iterator<Integer> iit = hashtable.get(smallest).iterator();
		while(iit.hasNext()){
			sb.append(iit.next()+" ");
		}
		System.out.println(sb.toString().trim());
	}
}
