package p09;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	// Set은 중복이 안됨
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		System.out.println(set.size());
		set.add(1);
		set.add(1);
		set.add(1);
		System.out.println(set.size());
	}

}
