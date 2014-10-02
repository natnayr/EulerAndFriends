import java.util.ArrayList;


public class Q12 {

	public static void main(String[] args) {

		ArrayList<Integer> primelist = sievePrime(1000);
		int number = 1;
		int i = 2;
		int cnt = 0;
		int Dn1 = 2;
		int Dn = 2;
		
		while (cnt < 500) {
		    if (i % 2 == 0) {
		        Dn = primeFactorisation(i + 1, primelist);
		        cnt = Dn * Dn1;
		    } else {
		        Dn1 = primeFactorisation((i + 1) / 2, primelist);
		        cnt = Dn*Dn1;
		    }
		    i++;
		}
		number = i * (i - 1) / 2;
		System.out.println(number);
	}
	
	
	
	public static int primeFactorisation(long number, ArrayList<Integer> primeList){
		int nod = 1;
	    int exponent;
	    long remain = number;
	    
	    for (int i = 0; i < primeList.size(); i++) {
	        // In case there is a remainder this is a prime factor as well
	        // The exponent of that factor is 1
	        if (primeList.get(i) * primeList.get(i) > number) {
	            return nod * 2;
	        }
	 
	        exponent = 1;
	        while (remain % primeList.get(i) == 0) {
	            exponent++;
	            remain = remain / primeList.get(i);
	        }
	        nod *= exponent;
	 
	        //If there is no remainder, return the count
	        if (remain == 1) {
	            return nod;
	        }
	    }
	    return nod;
	}
	
	public static int getNSum(int n){
		return (n*(n-1))/2;
	}
	
	public static ArrayList<Integer> sievePrime(int limit){
		
		boolean sieveboolean[] = new boolean[limit];
		
		sieveboolean[0] = false;
		sieveboolean[1] = false;
		for(int i=2;i<limit;i++){
			sieveboolean[i] = true;
		}
		
		for(int i=2;i<limit;i++){
			for(int j=(int) Math.pow(i, 2); j<limit; j+=i){
				sieveboolean[j] = false;
			}
		}
		
		ArrayList<Integer> sieve = new ArrayList<Integer>();
		for(int i=0;i<sieveboolean.length;i++){
			if(sieveboolean[i]==true){
				sieve.add(i);
			}
		}
		
		return sieve;
	}

}
