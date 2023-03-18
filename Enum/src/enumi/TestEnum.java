package enumi;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayOfWeek today = DayOfWeek.SATURDAY;
		System.out.println("Today is " + today.getName());

		switch (today) {
		case MONDAY:
			System.out.println("Work hard");
			break;

		case TUESDAY:
			System.out.println("Work LITTLE");
			break;

		case WEDNESDAY:
			System.out.println("Work work little more");
			break;

		case THURSDAY:
			System.out.println("Work work more,weekend is soon");
			break;

		case FRIDAY:
			System.out.println("Weekend has arrived");
			break;

		case SATURDAY:
			System.out.println("enjoy morning ");
			break;

		case SUNDAY:
			System.out.println("do all cleaning works,snooozzzzz");
			break;
		}
	}

}
