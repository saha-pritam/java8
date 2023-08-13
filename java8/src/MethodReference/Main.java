package MethodReference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		//Method reference to static method
		Function<Integer,Double> ob1 = Math::sqrt; //It is same as Function<Integer,Double> ob = x -> Math.sqrt(x);
		System.out.println("Square root of 16 is "+ob1.apply(16));

		//Method reference to instance method
		Dummy dummy = new Dummy(20,30);
		BiFunction<Integer,Integer,Integer> ob2 = dummy::sum; //It is same as BiFunction<Integer,Integer,Integer> ob2 = (x,y) -> dummy.sum(x+y);
		System.out.println("Sum of 20 and 30 is "+ob2.apply(20,30));
		
		//Method reference to instance method of an arbitrary object
		Function<String,String> ob3 = String::toUpperCase; //It is same as Function<String,String> ob3 = x -> x.toUpperCase(); 
		System.out.println("Pritam in upper case is "+ob3.apply("Pritam"));
		
		//Method reference to constructor
		BiFunction<Integer,Integer,Dummy> ob4 = Dummy::new; //It is same as BiFunction<Integer,Integer,Dummy> ob4 = (x,y) -> new Dummy(x,y);
		dummy = ob4.apply(100, 200);
		System.out.println(dummy);
	}

}
