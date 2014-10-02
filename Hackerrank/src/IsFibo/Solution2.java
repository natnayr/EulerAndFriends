package IsFibo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution2 {
	
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			
			for(int i=0; i<T; i++){
				long num = Long.parseLong(br.readLine());
				
				if(isFib(num)){
					System.out.println("IsFibo");
				}else{
					System.out.println("IsNotFibo");
				}
			}
				
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static boolean isFib(long num){
		
		long plusEquation = (long) (5*num*num + 4);
		long minusEquation = (long) (5*num*num - 4);
		
		double plusRoot = (long) Math.floor(Math.sqrt(plusEquation));
		double minusRoot = (long) Math.floor(Math.sqrt(minusEquation));
		
		return (plusRoot*plusRoot == plusEquation) || (minusRoot*minusRoot == minusEquation);
		
	}
}
