package Factory;

public class Seltos implements Vehicle {
		
	

	@Override
	public void start() {
		System.out.println("Started...."+getClass());
		
	}

	@Override
	public void stop() {
		System.out.println("Stop...."+getClass());
		
	}

	@Override
	public void honk() {
		System.out.println("palm palm...."+getClass());
	}

	@Override
	public void move() {
		System.out.println("Moving...."+getClass());
		
	}

}
