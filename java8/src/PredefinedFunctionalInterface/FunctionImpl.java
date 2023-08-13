package PredefinedFunctionalInterface;

import java.util.function.Function;

public class FunctionImpl implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer t) {
		return t-100;
	}

}
