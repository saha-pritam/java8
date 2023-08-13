package Optional;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		//Optional.empty demo
		Optional<String> op1 = Optional.empty(); //This means i am creating an optional object for string whose value is null
//		System.out.println(op1.get()); //This will give you exception since value for op1 is null
		
		Optional<String> op2 = Optional.of("Pritam"); //This means i am creating an optional object for string whose value is pritam
		System.out.println("Op2 :- "+op2.get());
		
		
		//Optional.of demo
//		Optional<String> op3 = Optional.of(null); //This will give you an exception since you are trying to create optional using of() but passing null value
		
		
		//Optional.ofNullable demo
		Optional<String> op4 = Optional.ofNullable(null); //This is same as Optional.empty since passing null in ofNullable will create empty optional object
//		System.out.println(op4.get()); //This will give you exception since value for op4 is null
		
		Optional<String> op5 = Optional.ofNullable("Aditya"); //This is same as Optional.of since passing some value in ofNullable will create optional object with the passed value
		System.out.println("Op5 :- "+op5.get());
		
		
		//isPresent() demo
		System.out.println("\n= = = = = = = = isPresent() = = = = = = = = ");
		System.out.println("Op1 :- "+(op1.isPresent()? op1.get() : "No value found"));
		System.out.println("Op2 :- "+(op2.isPresent()? op2.get() : "No value found"));
		
		//isEmpty demo
		System.out.println("\n= = = = = = = = isEmpty() = = = = = = = = ");
		System.out.println("Op1 :- "+(op1.isEmpty()? "No value found" : op1.get()));
		System.out.println("Op2 :- "+(op2.isEmpty()? "No value found" : op2.get()));
		
		System.out.println("\n= = = = = = = = orElse(String) = = = = = = = = ");
		System.out.println("Op1 :- "+op1.orElse("No value found"));
		System.out.println("Op2 :- "+op2.orElse("No value found"));
		
		System.out.println("\n= = = = = = = = orElseGet(Supplier) = = = = = = = = ");
		System.out.println("Op1 :- "+op1.orElseGet(()->"No value found"));
		System.out.println("Op2 :- "+op2.orElseGet(()->"No value found"));
		
		System.out.println("\n= = = = = = = = orElseThrow() = = = = = = = = ");
		try {
		System.out.println("Op1 :- "+op1.orElseThrow());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Op2 :- "+op2.orElseThrow());
		
		System.out.println("\n= = = = = = = = ifPresent(Consumer = = = = = = = = ");
		op1.ifPresent(System.out::print);
		op2.ifPresent(System.out::print);
	}

}
