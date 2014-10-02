package encryption;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String st = sc.next().trim();
		int width = (int) Math.ceil(Math.sqrt(st.length()));
		int height = (int) Math.floor(Math.sqrt(st.length()));
		
		if((width*height) < st.length()){
			height = width;
		}
		
		char[][] box = new char[height][width];
		int k=0;
		for(int i=0; i<height; i++){
			for(int j=0; j<width; j++){
				if(k<st.length()){
					box[i][j] = st.charAt(k);
					k++;
				}
			}
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<width; i++){
			for(int j=0; j<height; j++){
				if(((int) box[j][i]) <= 122 && ((int) box[j][i]) >= 97){
					sb.append(box[j][i]);
				}
			}
			sb.append(" ");
		}
		
		System.out.print(sb.toString());
	}
}
