package FunctionalInterface;
/*
 * The below interface is a functional interface.
 * It can be implemented by any class, anonymous class as well as lambda expressions.
 * If the void func2() is un-commented then it no longer remains a functional interface and cannot be used for lambda expressions
 * For invoking default methods the interface must be implemented by any class, anonymous class or lambda expressions and then instantiated.
 * For invoking static methods no implementation is required
 */
public interface InterfaceOne {
	void func1();
	
//	Un-commenting the below abstract function definition will make the interface behave like a traditional interface. 
//	void func2();
	
	default void defaultFunc1() {
		System.out.println("Hi I am defaultFunc1 from InterfaceOne");
	}
	
	default void defaultFunc2() {
		System.out.println("Hi I am defaultFunc2 from InterfaceOne");
	}
	
	static void staticFunc1() {
		System.out.println("Hi I am staticFunc1 from InterfaceOne");
	}
	
	static void staticFunc2() {
		System.out.println("Hi I am staticFunc1 from InterfaceOne");
	}

}
