package pairs;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int pairs(int[] a,int k) {
    	/* Complete this function */
    	Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();
    	int numPairs = 0;
    	
    	for(int i=0; i<a.length; i++){
    		
    		if(hash.containsKey(a[i]))
    			numPairs += hash.get(a[i]);
    		
    		int max = a[i] + k;
    		int min = a[i] - k;
    		if(hash.containsKey(max)){
    			hash.put(max, hash.get(max)+1);
    		}else{
    			hash.put(max, 1);
    		}
    		
    		if(hash.containsKey(min)){
    			hash.put(min, hash.get(min)+1);
    		}else{
    			hash.put(min, 1);
    		}
    	}
    	
        return numPairs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        String n = in.nextLine();
        String[] n_split = n.split(" ");
        
        int _a_size = Integer.parseInt(n_split[0]);
        int _k = Integer.parseInt(n_split[1]);
        
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = pairs(_a,_k);
        System.out.println(res);
    }
}