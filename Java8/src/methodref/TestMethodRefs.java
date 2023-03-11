package methodref;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

interface Formula {
	public void m1();
}

class Other {
	Other() {
		System.out.println("from other constructor");
	}
}

class Some {
	public static void m2() {
		System.out.println("from m2");
	}
}

public class TestMethodRefs {

	public static void main(String[] args) {
		Formula f = Some::m2;// method reference in java 8
		f.m1();
		f = Other::new;
		List<String> list = Arrays.asList("one", "two", "three");
		list.stream().forEach(System.out::println);
		List<Integer> intList = Arrays.asList(12, 32, 1323, 11);
		Optional num = intList.stream().reduce(Math::max);
		Optional num1 = intList.stream().reduce(Math::min);
		
		System.out.println(num.get());
		System.out.println(num1.get());
		// Other o=new Other();
	}

}
