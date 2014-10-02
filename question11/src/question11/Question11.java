package question11;

import java.util.Scanner;

public class Question11 {
	
	
	public static final int HEIGHT = 20;
	public static final int WIDTH = 20;
	
	public static int store[] = {0,0,0,0};
	
	public static void main(String args[]){
		int numbers[][] = new int[20][20];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<20; i++){
			String items[] = sc.nextLine().split(" ");
			for(int j=0; j<20; j++){
				numbers[i][j] = Integer.parseInt(items[j]);
			}
		}
		
		//compare rows
		for(int i=0; i<20; i++){
			for(int j=0; j<20-3; j++){
				int check[] = {numbers[i][j],numbers[i][j+1],numbers[i][j+2],numbers[i][j+3]};
				store(check); 
			}
		}
		
		
		//compare columns
		for(int i=0; i<20-3; i++){
			for(int j=0; j<20; j++){
				int check[] = {numbers[i][j],numbers[i+1][j],numbers[i+2][j],numbers[i+3][j]};
				store(check); 
			}
		}

		//compare diagonal topleft to btm right
		for(int i=0; i<20; i++){
			for(int j=0; j<20; j++){
				if((i+3)<20 && (j+3)<20){
					int check[] = {numbers[i][j],numbers[i+1][j+1],numbers[i+2][j+2],numbers[i+3][j+3]};
					store(check);
				}
			}
		}
		
		//compare diagonal topright to btm left
		for(int i=0; i<20; i++){
			for(int j=0; j<20; j++){
				if((i+3)<20 && (j-3)>=0){
					int check[] = {numbers[i][j],numbers[i+1][j-1],numbers[i+2][j-2],numbers[i+3][j-3]};
					store(check);
				}
			}
		}
		System.out.println(store[0]+" "+store[1]+" "+store[2]+" "+store[3]);
		System.out.println(store[0]*store[1]*store[2]*store[3]);
	}
	
	
	public static void store(int num[]){
		int storesum = store[0];
		int numsum = num[0];
		
		for(int i=1;i<4;i++){
			storesum *= store[i];
			numsum *= num[i];
		}
		System.out.println(numsum);
		
		if(storesum<numsum){
			store = num;
		}
	}
}
