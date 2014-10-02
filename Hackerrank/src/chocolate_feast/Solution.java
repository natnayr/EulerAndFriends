package chocolate_feast;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
    
    private static long Solve(int n, int c, int discount){
    	
    	
    	long count = 0;
        long candies = (n/c);
        count += candies;
 
        long wrappers = count;
        
        while(wrappers >= discount){
        	long extraCandies = wrappers/discount;
        	wrappers %= discount; 
        	wrappers += extraCandies;
        	count += extraCandies;	
        			
        } 
        
        return count;
    }
}

