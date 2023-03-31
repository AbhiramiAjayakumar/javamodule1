
package structural.adapter.phoneimpl;

import structural.adapter.phoneifaces.LightningPhone;
import structural.adapter.phoneifaces.MicroUsbPhone;
public class Iphone  implements LightningPhone{
	private boolean connector;

	@Override
	public void recharge() {
	if(connector) {
		System.out.println("Recharge started");
	System.out.println("Recharge finished");
		
	}else
	{
		System.out.println("Connect Microusb first");
	}
	}
	
	

	@Override
	public void uselightning() {
		connector=true;
		System.out.println("Lightning connected");
	}
		// TODO Auto-generated method stub
		
	}
