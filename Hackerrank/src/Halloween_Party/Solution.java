package Halloween_Party;

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int testCaseNumbers = sc.nextInt();
		for(int i=0; i<testCaseNumbers; i++){
			BigDecimal next = BigDecimal.valueOf(sc.nextLong());
			BigDecimal floorNext = next.divide(BigDecimal.valueOf(2), BigDecimal.ROUND_FLOOR);
			BigDecimal ceilNext = next.divide(BigDecimal.valueOf(2), BigDecimal.ROUND_CEILING);
			BigDecimal out = floorNext.multiply(ceilNext);
			System.out.println(out);
		}
	}
}
