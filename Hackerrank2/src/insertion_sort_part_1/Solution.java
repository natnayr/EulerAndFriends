package insertion_sort_part_1;

import java.util.*;

public class Solution {
    
    public static void insertIntoSorted(int[] ar) {
        int store;
        
    	for(int i=1; i<ar.length; i++){
    		if(ar[i] < ar[i-1]){
				store = ar[i];
				int j;
				for(j=i; j>0 && store < ar[j-1]; j--){
	    			ar[j] = ar[j-1];
	    			printArray(ar);
	    		}
				ar[j] = store;
				printArray(ar);
			}
    	}
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
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}

