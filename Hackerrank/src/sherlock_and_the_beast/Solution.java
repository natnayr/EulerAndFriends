package sherlock_and_the_beast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// The part of the program involving reading from STDIN and writing to STDOUT has been provided by us.

public class Solution {
   static BufferedReader in = new BufferedReader(new InputStreamReader(
         System.in));
   static StringBuilder out = new StringBuilder();

   public static void main(String[] args) throws NumberFormatException, IOException {
      int numPackets = Integer.parseInt(in.readLine());
      int numKids = Integer.parseInt(in.readLine());
      int[] packets = new int[numPackets];
      int[] kids = new int[numKids];
      
      for(int i = 0; i < numPackets; i++){
         packets[i] = Integer.parseInt(in.readLine());
      }
      
      Arrays.sort(packets);
      
      int unfairness = Integer.MAX_VALUE;
      for(int i = 0; i < numPackets-numKids; i++){
    	  int test = packets[i+numKids-1] - packets[i];
    	  if(test<unfairness){
    		  unfairness = test;
    	  }
      }
      
      System.out.println(unfairness);
   }
}
