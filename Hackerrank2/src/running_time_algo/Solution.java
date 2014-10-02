package running_time_algo;

import java.util.Scanner;

public class Solution {
    
    public static void insertIntoSorted(int[] ar) {
        int count = 0;
    	for(int i=1; i<ar.length; i++){
    		int j=i;
    		
    		while(j>0 && ar[j-1] > ar[j]){
    			int store = ar[j];
    			ar[j] = ar[j-1];
    			ar[j-1] = store;
    			count++;
    			j--;
    		}	
    	}
    	System.out.println(count);
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
}

