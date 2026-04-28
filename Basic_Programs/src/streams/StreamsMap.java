package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class StreamsMap {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(8,1, 2, 3, 4,2);

//		list.stream()
//		.filter(l->l%2==0)
//		.map(l->l*2)
//		 .forEach(n -> System.out.println(n));

		
//		List<Integer> result=list.stream()
//				.filter(n -> n >= 3)
//		         .map(l->l*2)
//		         .collect(Collectors.toList());
//		System.out.println(result);
		
		
//		Optional<Integer> result=list.stream()
//				.filter(n -> n >= 3)
//				.findFirst();
//		       
	//	System.out.println(result);
		
		
		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
				Integer target=10;
		List<List<Integer>> pairs = nums.stream()
						.flatMap(i -> nums.stream()
		
						.filter(j -> i < j && i + j == target)
						.map(j -> List.of(i, j)))
				.collect(Collectors.toList());
			System.out.println(pairs);
		
				
				list.stream()
				.distinct()
				.sorted() 
				.map(l->l*2)
				.sorted(Comparator.reverseOrder())
				.limit(3)
				.skip(1)
				.forEach(n -> System.out.println(n));
		
		
	}

}
