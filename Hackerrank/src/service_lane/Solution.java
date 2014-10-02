package service_lane;
import java.util.Scanner;


public class Solution{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lengthOfHighway = sc.nextInt();
		int testCaseNumbers = sc.nextInt();
		int arrayLength[] = new int[lengthOfHighway];
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<lengthOfHighway; i++){
			arrayLength[i] = sc.nextInt();
		}
		
		for(int i=0; i<testCaseNumbers; i++){
			int entry = sc.nextInt();
			int exit = sc.nextInt();
			int smallest = 1000;
			for(int j=entry; j<=exit; j++){
				if(arrayLength[j] < smallest){
					smallest = arrayLength[j]; 
				}
			}
			sb.append(smallest+"\n");
		}
		System.out.println(sb.toString());
	}

}
