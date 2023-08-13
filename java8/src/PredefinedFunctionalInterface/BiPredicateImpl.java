package PredefinedFunctionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateImpl implements BiPredicate<Integer, Integer> {

	@Override
	public boolean test(Integer t, Integer u) {
		return t.equals(u);
	}

}
