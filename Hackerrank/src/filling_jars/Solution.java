package filling_jars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] line = br.readLine().split(" ");
			int N = Integer.parseInt(line[0]);
			int M = Integer.parseInt(line[1]);
			BigInteger total = BigInteger.ZERO;
		
			while(M>0){
				M--;
				String[] lines = br.readLine().split(" ");
				int a = Integer.parseInt(lines[0]);
				int b = Integer.parseInt(lines[1]);
				int k = Integer.parseInt(lines[2]);
				total = total.add(noOfCandies(a,b,k));
			}
			
			System.out.println(total.divide(BigInteger.valueOf(N)));
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static BigInteger noOfCandies(int a, int b, int k){
		
		long diff = (b-a)+1;
		BigInteger noOfChocolate = BigInteger.valueOf(diff);
		return noOfChocolate.multiply(BigInteger.valueOf(k));
		
	}
}
