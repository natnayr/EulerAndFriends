package question14;

import java.math.BigInteger;

public class Q14 {

	public static void main(String[] args) {
		long store = 0;
		long num = 0;
		for(int i=2; i<1000000; i++){
			long n = i;
			long chain = 1;
			while(n != 1){
				if(n % 2 == 0){
					n = n/2;
				}else{
					n = n * 3 + 1;
				}
				chain++;
			}
			
			if(chain > store){
				store = chain;
				num = i;
			}
		}
		System.out.println(store + " " + num);
		BigInteger i = BigInteger.valueOf(0);
		
	}

	public static int evenOdd(int n){
		//check even
		if(n%2==0){
			return (n/2);
		}else{
			return (3*n) + 1;
		}
	}
	
	public static void store(int n, int ith){
		
	}
	
}
