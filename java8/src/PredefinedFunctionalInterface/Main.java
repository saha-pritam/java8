package PredefinedFunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		System.out.println("=========C O N S U M E R=========");
		Consumer<Integer> conDecreaseBy100 = new ConsumerImpl(); 
		conDecreaseBy100.accept(200);

		
		Consumer<Integer> conIncreaseBy100 = x->System.out.println(x+100);
		conIncreaseBy100.accept(200);
		
		
		
		System.out.println("\n=========B I   C O N S U M E R=========");
		BiConsumer<Integer,Integer> biConSubstract = new BiConsumerImpl();
		biConSubstract.accept(250, 100);
		
		BiConsumer<Integer,Integer> biConAdd = (x,y)->System.out.println(x+y);
		biConAdd.accept(250, 100);
		
		
		
		System.out.println("\n=========F U N C T I O N=========");
		Function<Integer,Integer> functionDecreaseBy100 = new FunctionImpl();
		System.out.println(functionDecreaseBy100.apply(300));
		
		Function<Integer,Integer> functionIncreaseBy100 = x -> x + 100;
		System.out.println(functionIncreaseBy100.apply(300));
		

		
		System.out.println("\n=========B I   F U N C T I O N=========");
		BiFunction<Integer,Integer,Integer> biFunctionSub = new BiFunctionImpl();
		System.out.println(biFunctionSub.apply(250, 100));
		
		BiFunction<Integer,Integer,Integer> biFunctionAdd = (x,y) -> x+y;
		System.out.println(biFunctionAdd.apply(250, 100));
		
		
		
		System.out.println("\n=========P R E D I C A T E=========");
		Predicate<Integer> evenCheck = new PredicateImpl();
		System.out.println("10 is even :- "+evenCheck.test(10));
		
		Predicate<Integer> oddCheck = x -> x%2==1;
		System.out.println("10 is even :- "+oddCheck.test(10));
		
		
		
		System.out.println("\n=========B I   P R E D I C A T E=========");
		BiPredicate<Integer,Integer> biPredicateEquality = new BiPredicateImpl();
		System.out.println("10 and 10 is equal :- "+biPredicateEquality.test(10, 10));
		
		BiPredicate<Integer,Integer> biPredicateUnequality = (x,y) -> x!=y;
		System.out.println("10 and 10 is equal :- "+biPredicateUnequality.test(10, 10));
		

	}

}
