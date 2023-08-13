package LambdaExpressions;

public class Main {
	
	public static void calc(InterfaceFour interfaceFour, int x) {
		System.out.println("Result is :- "+interfaceFour.func(x));
	}

	public static void main(String[] args) {
		InterfaceOne interfaceOne1 = new InterfaceOneImpl(); //Instantiating InterfaceOne by traditional class 
		interfaceOne1.func();
		
		InterfaceOne interfaceOne2 = ()->{System.out.println("Hi i am func() from lambda expression");}; //Instantiating InterfaceOne by lambda expression 
		interfaceOne2.func();
		System.out.println("==============================================================================================");
		
		InterfaceTwo interfaceTwo1 = new InterfaceTwoImpl(); //Instantiating InterfaceOne by traditional class 
		interfaceTwo1.func(10);
		
		InterfaceTwo interfaceTwo2 = x -> {System.out.println("Hi i am func(int x) from lambda expression");}; //Instantiating InterfaceOne by lambda expression 
		interfaceTwo2.func(10);
		System.out.println("==============================================================================================");
		
		InterfaceThree interfaceThree1 = new InterfaceThreeImpl(); //Instantiating InterfaceOne by traditional class 
		interfaceThree1.func(10,20);
		
		InterfaceThree interfaceThree2 = (x,y)->{System.out.println("Hi i am func(int x, int y) from lambda expression");}; //Instantiating InterfaceOne by lambda expression 
		interfaceThree2.func(10,20);
		System.out.println("==============================================================================================");
		
		InterfaceFour interfaceFour1 = x -> x * x; // Same as (x) -> {return x*x;}; Curly braces becomes optional for
													// just single statement lambda expression. But for multiple
													// statements curly braces are mandatory as well as return
													// statement.
		System.out.println("Square of 4 is "+interfaceFour1.func(4));
		
		InterfaceFour interfaceFour2 = (int x) -> x * x * x; // Same as x -> x * x; Mentioning data types are optional.
		System.out.println("Cube of 4 is "+interfaceFour2.func(4));
		
		calc(x->x*x*x*x,5); //Passing lambda as an argument
	}

}
