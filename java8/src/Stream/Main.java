package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		//Creating stream
		//For each demo
		System.out.println("\n= = = = = = C R E A T I N G   S T R E A M S = = = = = = ");
		Stream<String> stream = Stream.of("Pritam","Aditya","Gunjan");
		stream.forEach(System.out::println);
		
		//Getting stream from list
		System.out.println("\n= = = = = = C R E A T I N G   S T R E A M S   F R O M   L I S T = = = = = = ");
		List<Integer> list = List.of(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
		Stream<Integer> streamList = list.stream();
		streamList.forEach(System.out::println);
		
		//Getting stream from set
		System.out.println("\n= = = = = = C R E A T I N G   S T R E A M S   F R O M   S E T = = = = = = ");
		Set<Integer> set = Set.of(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
		Stream<Integer> streamSet = set.stream();
		streamSet.forEach(System.out::println);
		
		//Getting stream from array
		System.out.println("\n= = = = = = C R E A T I N G   S T R E A M S   F R O M   A R R A Y = = = = = = ");
		int arr[]= {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		IntStream streamArr = Arrays.stream(arr);
		streamArr.forEach(System.out::println);
		
		//Filter demo
		//Collect demo
		System.out.println("\n= = = = = = F I L T E R = = = = = = ");
		streamList = list.stream();
		System.out.println(streamList.filter(item->item%3==0).collect(Collectors.toList()));

		
		List<Student> studentList = List.of(new Student(5,"Velma Clemons", 43),
				new Student(2,"Kibo Underwood", 81),
				new Student(1,"James Walker", 31),
				new Student(4,"Phyllis Paul", 18),
				new Student(3,"Louis Mcgee", 11));
						
		//Sorting in ascending
		//Sorted demo
		System.out.println("\n= = = = = = S O R T E D   A S C E N D I N G = = = = = = ");
		Stream<Student> streamStudentList = studentList.stream();
		System.out.println(streamStudentList.sorted().collect(Collectors.toList()));
		
		//Sorting in ascending
		//Sorted demo
		streamStudentList = studentList.stream();
		System.out.println(streamStudentList.sorted(Comparator.naturalOrder()).collect(Collectors.toList()));
		
		//Sorting in ascending w.r.t marks
		//Sorted demo
		streamStudentList = studentList.stream();
		System.out.println(streamStudentList.sorted((s1,s2)->{
			if(s1.getMarks()<s2.getMarks())
				return -1;
			else if(s1.getMarks()>s2.getMarks())
				return 1;
			return 0;
		}).collect(Collectors.toList()));
		
		//Sorting in descending
		//Sorted demo
		System.out.println("\n= = = = = = S O R T E D   D E S C E N D I N G = = = = = = ");
		streamStudentList = studentList.stream();
		System.out.println(streamStudentList.sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		
		//Sorting in descending w.r.t marks
		//Sorted demo
		streamStudentList = studentList.stream();
		System.out.println(streamStudentList.sorted((s1,s2)->{
			if(s1.getMarks()<s2.getMarks())
				return 1;
			else if(s1.getMarks()>s2.getMarks())
				return -1;
			return 0;
		}).collect(Collectors.toList()));

		
		//Map demo
		System.out.println("\n= = = = = = M A P = = = = = = ");
		streamList = list.stream();
		System.out.println(streamList.map(x->x*10).collect(Collectors.toList()));
		
		//Find First demo
		System.out.println("\n= = = = = = F I N D   F I R S T = = = = = = ");
		streamList = list.stream();
		System.out.println(streamList.findFirst().orElse(-999));
		
		//Find Any demo
		System.out.println("\n= = = = = = F I N D   A N Y = = = = = = ");
		streamList = list.stream();
		System.out.println(streamList.findAny().orElse(-999));
		
		//Count demo
		System.out.println("\n= = = = = = C O U N T = = = = = = ");
		streamList = list.stream();
		System.out.println(streamList.count());
		
		//Min demo
		System.out.println("\n= = = = = = M I N = = = = = = ");
		streamList = list.stream();
		System.out.println(streamList.min((a,b)->{
			if(a<b)
				return -1;
			else if(a>b)
				return 1;
			else 
				return 0;
		}).orElse(-999));
		
		System.out.println("\n= = = = = = M A X = = = = = = ");
		streamList = list.stream();
		System.out.println(streamList.min((a,b)->{
			if(a<b)
				return 1;
			else if(a>b)
				return -1;
			else 
				return 0;
		}).orElse(-999));
		
	}

}
