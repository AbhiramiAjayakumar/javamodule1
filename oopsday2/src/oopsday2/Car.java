package oopsday2;

public class Car implements CarIface {
	private double fuel;
	private double battery;
	private double kilometersRun;
	private boolean engineStatus;

	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Car(double fuel, double battery, double kilometersRun, boolean engineStatus) {
		
		this.fuel = fuel;
		this.battery = battery;
		this.kilometersRun = kilometersRun;
		this.engineStatus = engineStatus;
	}


	


	public double getFuel() {
		return fuel;
	}


	public void setFuel(double fuel) {
		this.fuel = fuel;
	}


	public double getBattery() {
		return battery;
	}


	public void setBattery(double battery) {
		this.battery = battery;
	}


	public double getKilometersRun() {
		return kilometersRun;
	}


	public void setKilometersRun(double kilometersRun) {
		this.kilometersRun = kilometersRun;
	}


	public boolean isEngineStatus() {
		return engineStatus;
	}


	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus = engineStatus;
	}


	@Override
	public void start() {
		if(engineStatus== false &&fuel >1000 && battery>100)
			System.out.println("Engine starting");
			engineStatus=true;
		// TODO Auto-generated method stub

	}

	@Override
	public void honk() {
		System.out.println("pa pa pa pa");
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {
		if(engineStatus)
		{
			for(int i=0;i<50;i++)
			{
				System.out.println("Car is moving");
				fuel=fuel-100;
				battery=battery-2;
				kilometersRun++;
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
			}
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void changeGear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		System.out.println("car is stopping..");
		this.engineStatus=false;
		
		
	}

	@Override
	public String toString() {
		return "Car [fuel=" + fuel + ", battery=" + battery + ", kilometersRun=" + kilometersRun + ", engineStatus="
				+ engineStatus + "]";
	}

}

