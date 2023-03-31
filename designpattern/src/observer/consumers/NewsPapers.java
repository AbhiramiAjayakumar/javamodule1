package observer.consumers;

import observer.iface.WeatherObserver;

public class NewsPapers implements WeatherObserver
	{

	@Override
	public void doUpdate(int temperature) {
		System.out.println("Newspapers are updating temperature as " +temperature);
		
	}
		
	}


