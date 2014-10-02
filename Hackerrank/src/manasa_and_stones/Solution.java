package manasa_and_stones;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			LinkedList<Integer> list = new LinkedList<Integer>();
			t--;
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			for(int i=n-1, j=0; i>=0 && j<=n-1; i--, j++){
				int tote = (i*a) + (j*b);
				if(!list.contains(tote)){
					list.add(tote);
				}
			}
			Collections.sort(list);
			Iterator<Integer> lit = list.iterator();
			while(lit.hasNext()){
				System.out.print(lit.next() + " ");
			}
			System.out.print("\n");
		}
	}
}
