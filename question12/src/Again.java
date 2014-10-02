
public class Again {

	public static void main(String[] args) {
		
		int i = 0;
		int number = 0;
		while(findDivisors(number)<500){
			
			number += i;
			i++;
		}
		
		System.out.println(number);
	}
	
	public static int findDivisors(int number){
		int nod = 0;
		int sqrt = (int) Math.sqrt(number);
		
		for(int i=1; i<=sqrt; i++){
			if(number % i ==0){
				nod += 2;
			}
		}
		
		if(sqrt*sqrt == number){
			nod--;
		}
		
		return nod;
	}

}
