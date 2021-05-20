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

		List<String> list2 = list.stream().distinct().collect(Collectors.toList());
		list.add("a");
		List<String> list3 = list.stream().distinct().collect(Collectors.toList());

	}
}