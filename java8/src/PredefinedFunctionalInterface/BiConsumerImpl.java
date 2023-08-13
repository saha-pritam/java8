package PredefinedFunctionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerImpl implements BiConsumer<Integer, Integer> {

	@Override
	public void accept(Integer t, Integer u) {
		System.out.println(t-u);
	}

}
