package flowers;

import java.util.Arrays;
import java.util.Scanner;

public class Solution{
   public static void main( String args[] ){
      
// helpers for input/output      

      Scanner in = new Scanner(System.in);
      
      int N, K;
      N = in.nextInt();
      K = in.nextInt();
      
      int C[] = new int[N];
      for(int i=0; i<N; i++){
         C[i] = in.nextInt();
      }
      
      
      Arrays.sort(C); //natural ordering
      
      int total = 0;
      int counter = 0;
      
      for(int i=N-1; i>=0; i--){
    	  total += (counter/K + 1) * C[i];
    	  counter++;
      }
      
      
      System.out.println(total);
      
   }
}
