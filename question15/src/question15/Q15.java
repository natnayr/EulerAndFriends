package question15;

public class Q15 {
	public static void main(String[] args){
		
		int gridlength = 20;
		long[][] gridbox = new long[gridlength+1][gridlength+1];
		long lastbox = 19;
		
		for(int i=0; i<=gridlength; i++){
			gridbox[i][0] = 1;
			gridbox[0][i] = 1;
		}
		
		for(int i=1; i<=gridlength; i++){
			for(int j=1; j<=gridlength; j++){
				gridbox[j][i] = gridbox[j][i-1] + gridbox[j-1][i];
			}
		}
		
		//prlong
		for(int i=0; i<=gridlength; i++){
			for(int j=0; j<=gridlength; j++){
				System.out.print("["+gridbox[i][j]+"]");
			}
			System.out.println();
		}
		
		System.out.println(gridbox[20][20]);
	}
}
