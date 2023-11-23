package com.enset.adapter;


import com.enset.computer.HDMI;
import com.enset.computer.VGA;

public class HdmiVgaAdapterComposition implements VGA {
    private HDMI hdmi;
    @Override
    public void print(String message) {
        System.out.println("-------------Adapter-------------");
        byte[] msg=message.getBytes();
        hdmi.view(msg);
        System.out.println("-------------Adapter-------------");
    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
}
