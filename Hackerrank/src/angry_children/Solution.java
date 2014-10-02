package angry_children;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class Solution {

	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			LinkedList<Integer> list = new LinkedList<Integer>();
			int N = Integer.parseInt(br.readLine());
			int K = Integer.parseInt(br.readLine());
			
			for(int i=0; i<N; i++){
				list.add(Integer.parseInt(br.readLine()));
			}
			Collections.sort(list);
			
			LinkedList<Integer> finalList = new LinkedList<Integer>();
			for(int i=0; i<K; i++){
				finalList.add(list.pop());
			}
			
			System.out.println(Collections.max(finalList)-Collections.min(finalList));
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
