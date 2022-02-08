package util;

import java.util.ArrayList;
import java.util.List;

public class MyMatcher<T> {
	public String verify(List<T> list1, List<T> list2) {
		List<T> result = new ArrayList<>();

		if (!(list1 != null && !list1.isEmpty() && list2 != null && !list2.isEmpty())) {
			return "[ERROR] Lists cannot be Empty or null";
		}
		
		list1.forEach(x -> {
			if (list2.contains(x)) {
				result.add(x);
			}
		});
		return result.size() + " matches: " + result;
	}
}
