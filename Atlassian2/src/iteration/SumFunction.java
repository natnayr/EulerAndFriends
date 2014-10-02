package iteration;

import java.math.BigInteger;

public class SumFunction implements Function2<Object, Object, Object>{

	@Override
	public Object apply(Object t, Object u) {
		
		return (Object) (((BigInteger) u).multiply((BigInteger) t));
	}

}
