package gem_stones;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] main){
		
		Scanner sc = new Scanner(System.in);
		int testCaseNumbers = Integer.parseInt(sc.nextLine());
		ArrayList<Character> clList = new ArrayList<Character>();
		
		String first = sc.nextLine();
		for(int i=0; i<first.length(); i++){
			if(!match(clList, first.charAt(i))){
				clList.add(first.charAt(i));
			}
		}
		
		
		for(int i=0; i<testCaseNumbers-1; i++){
			String next = sc.nextLine();
			ArrayList<Character> list = new ArrayList<Character>();
			
			for(int j=0; j<clList.size(); j++){
				
				for(int k=0; k<next.length(); k++){
					if(clList.get(j).equals(next.charAt(k))){
						list.add(clList.get(j));
						break;
					}
				}
			}
			clList = list;
		}
		
		System.out.println(clList.size());
	}
	
	public static boolean match(ArrayList<Character> list, Character letter){
		for(int i=0; i<list.size(); i++){
			if(list.get(i).equals(letter)){
				return true;
			}
		}
		
		return false;
	}
}
