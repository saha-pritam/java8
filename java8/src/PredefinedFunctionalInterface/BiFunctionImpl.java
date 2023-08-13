package PredefinedFunctionalInterface;

import java.util.function.BiFunction;

public class BiFunctionImpl implements BiFunction<Integer, Integer, Integer> {

	@Override
	public Integer apply(Integer x, Integer y) {
		return x-y;
	}

}
