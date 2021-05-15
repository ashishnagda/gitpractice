import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ArrayDistinct {

	public static void main(String gg[]) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println("List 1: "+ list);
		List<String> list2 = list.stream().distinct().collect(Collectors.toList());
		System.out.println("List 2: "+ list2);
		list.add("a");
		
		List<String> list3 = list.stream().distinct().collect(Collectors.toList());

	}
}