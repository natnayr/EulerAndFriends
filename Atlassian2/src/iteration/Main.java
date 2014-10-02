package iteration;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		Queue<BigInteger> que = new LinkedList<BigInteger>();
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		que.add(BigInteger.valueOf((long) Math.pow(2,62)));
		
		
		Folder<BigInteger, BigInteger> myFold = new MyFolder<BigInteger, BigInteger>();
		Function2 sum = new SumFunction(); 
		System.out.println(myFold.fold(BigInteger.valueOf(1), que, sum));
	}

}
