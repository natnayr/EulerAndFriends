package the_full_counting_sort;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		LinkedList<LinkedList<String>> list = new LinkedList<LinkedList<String>>();
		
		for(int i=0; i<100; i++){
			list.add(new LinkedList<String>());
		}
		
		for(int i=0; i<N/2; i++){
			list.get(sc.nextInt()).add("-");
			String s = sc.next();
		}
		
		for(int i=N/2; i<N; i++){
			list.get(sc.nextInt()).add(sc.next());
		}
		StringBuffer sb = new StringBuffer(100000);
		for(int i=0; i<list.size(); i++){
			for(int j=0; j<list.get(i).size(); j++){
				sb.append(list.get(i).get(j) + " ");
			}
		}
		System.out.println(sb.toString());
	}	
}
