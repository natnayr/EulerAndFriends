package question20;

import java.math.BigInteger;

public class q20 {
	public static void main(String[] args){
		BigInteger n = BigInteger.valueOf(1);
		int i=100;
		while(i>1){
			n = n.multiply(BigInteger.valueOf(i));
			i--;
		}
		long sum = 0;
		for(int j=0;j<n.toString().length();j++){
			sum += Integer.parseInt(n.toString().substring(j, j+1));
		}
		System.out.println(sum);
	}
	
}
