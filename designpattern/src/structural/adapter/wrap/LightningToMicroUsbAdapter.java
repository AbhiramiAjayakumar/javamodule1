package structural.adapter.wrap;

import structural.adapter.phoneifaces.LightningPhone;
import structural.adapter.phoneifaces.MicroUsbPhone;

public class LightningToMicroUsbAdapter implements MicroUsbPhone {
	
    private final LightningPhone lightningPhone;

    public LightningToMicroUsbAdapter(LightningPhone lightningPhone) {
        this.lightningPhone = lightningPhone;
    }

    @Override
    public void useMicroUsb() {
        System.out.println("MicroUsb connected");
        lightningPhone.uselightning();
    }

    @Override
    public void recharge() {
        lightningPhone.recharge();
    }
}