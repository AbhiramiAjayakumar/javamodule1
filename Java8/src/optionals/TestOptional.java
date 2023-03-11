package optionals;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		String str2 = "Hello";
		// Optional<String>optional=Optional.of(str);
		// System.out.println(optional.get());

		Optional<String> optional1 = Optional.ofNullable(str2);
		Optional<String> optional = Optional.ofNullable(str);
		// when str2 is used we get element

		if (optional1.isPresent()) {
			System.out.println("value present " + optional1.get());
		} else
			System.out.println("is null");

		// when str is used we get no such element exception

		if (optional.isPresent()) {
			System.out.println("value present " + optional.get());
		} else
			System.out.println("is null "+optional.orElse("str not intialised"));
	}
}
