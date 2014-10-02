package cavity_map;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		int[][] map = new int[n][n];
		
		
		for(int i=0; i<n; i++){
			String str = sc.nextLine();
			for(int j=0; j<n; j++){
				map[i][j] = Integer.parseInt(str.charAt(j)+"");
			}
		}
		
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(i==0 || i==n-1 || j==0 || j==n-1){
					System.out.print(map[i][j]);
				}else if(map[i][j] > map[i-1][j] &&
						map[i][j] > map[i+1][j] &&
						map[i][j] > map[i][j-1] &&
						map[i][j] > map[i][j+1]){
					System.out.print("X");
				}else{
					System.out.print(map[i][j]);
				}
			}
			System.out.println();
		}
		
	}
	
}
