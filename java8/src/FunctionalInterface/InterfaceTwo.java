package FunctionalInterface;
/*
 * The below interface is a functional interface.
 * It can be implemented by any class, anonymous class as well as lambda expressions.
 * If the void func2() is un-commented then it will be an error since the interface is marked as @FunctionalInterface and any functional interface cannot have multiple abstract methods.
 * For invoking default methods the interface must be implemented by any class, anonymous class or lambda expressions and then instantiated.
 * For invoking static methods no implementation is required
 */
@FunctionalInterface
public interface InterfaceTwo {
	void func1();
	
//	Un-commenting the below abstract function definition will be an error since the interface is marked as @FunctionalInterface 
//	void func2();
	
	default void defaultFunc1() {
		System.out.println("Hi I am defaultFunc1 from InterfaceTwo");
	}
	
	default void defaultFunc2() {
		System.out.println("Hi I am defaultFunc2 from InterfaceTwo");
	}
	
	static void staticFunc1() {
		System.out.println("Hi I am staticFunc1 from InterfaceTwo");
	}
	
	static void staticFunc2() {
		System.out.println("Hi I am staticFunc1 from InterfaceTwo");
	}

}
