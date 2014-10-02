package question13;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Q13 {
	
	public static void main(String[] args) {
		
		BigInteger sum = BigInteger.valueOf(0);
		
		try {
			Scanner sc = new Scanner(new File("file.txt"));
			while(sc.hasNext()){
				BigInteger toAdd = new BigInteger(sc.next());
				sum = sum.add(toAdd);
			}
			System.out.println(sum.toString().substring(0, 10));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
