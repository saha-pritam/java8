package FunctionalInterface;

public class Main {

	public static void main(String[] args) {
		//Calling static methods of InterfaceOne
		InterfaceOne.staticFunc1();
		InterfaceOne.staticFunc2();
		
		//Implementing InterfaceOne via anonymous class. This can also be implemented by traditional class and lambda expression
		InterfaceOne one = new InterfaceOne() {
			@Override
			public void func1() {
				System.out.println("Hi I am Func1 from InterfaceOne and definition is provided by an anonymous class");
			}
		};
		
		//Since InterfaceOne is instantiated so we can invoke the abstract methods and default methods
		one.func1();
		one.defaultFunc1();
		one.defaultFunc2();
		
		System.out.println("==================================================================================");
		
		//Calling static methods of InterfaceOne
		InterfaceTwo.staticFunc1();
		InterfaceTwo.staticFunc2();
		
		//Implementing InterfaceTwo via anonymous class. This can also be implemented by traditional class and lambda expression
		InterfaceTwo two = new InterfaceTwo() {
			@Override
			public void func1() {
				System.out.println("Hi I am Func1 from InterfaceTwo and definition is provided by an anonymous class");
			}
		};
		
		//Since InterfaceOne is instantiated so we can invoke the abstract methods and default methods
		two.func1();
		two.defaultFunc1();
		two.defaultFunc2();

	}

}
