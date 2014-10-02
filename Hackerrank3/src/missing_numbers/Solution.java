package missing_numbers;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int nA = sc.nextInt();
		int[] listA = new int[nA];
		for(int i=0; i<nA; i++){
			listA[i] = sc.nextInt();
		}
		
		LinkedHashMap<Integer, Integer> hash = 
				new  LinkedHashMap<Integer, Integer>();
		int nB = sc.nextInt();
		for(int i=0; i<nB; i++){
			int num = sc.nextInt();
			if(hash.containsKey(num)){
				hash.put(num, hash.get(num)+1);
			}else{
				hash.put(num, 1);
			}
		}
		
		for(int i=0; i<nA; i++){
			hash.put(listA[i], hash.get(listA[i])-1);
		}
		
		StringBuffer sb = new StringBuffer();
		LinkedList<Integer> list = new LinkedList(hash.keySet());
		Collections.sort(list);
		Iterator<Integer> lit = list.iterator();
		while(lit.hasNext()){
			int num = lit.next();
			if(hash.get(num) > 0){
				sb.append(num + " ");
			}
		}
		System.out.println(sb.toString().trim());
	}
	
}
