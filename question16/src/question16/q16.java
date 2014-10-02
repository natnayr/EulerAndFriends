package question16;

import java.math.BigInteger;

public class q16 {
	public static void main(String[] args){
		BigInteger tick = BigInteger.valueOf(2).pow(1000);
		String num = tick.toString();
		long sum = 0;
		for(int i=0; i<num.length(); i++){
			sum += Integer.parseInt(num.substring(i, i+1));
		}
		
		System.out.println(sum);
		
	}
}
