package maximizing_xor;

import java.util.*;
import java.util.Comparator;

public class Solution {

	static int maxXor(int l, int r) {
    	
    	PriorityQueue<Integer> que = new PriorityQueue<Integer>(200, new Comparator<Integer>(){
    		@Override
    		public int compare(Integer x, Integer y) {
    			if(x<y) return 1;
    			if(x>y) return -1;
    			
    			return 0;
    		}
    	}); 
    	
    	for(int i=l; i<=r; i++){
    		for(int j=l; j<=r; j++){
        		que.add(i^j);
        	}
    	}
    	
    	
    	return que.poll();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}