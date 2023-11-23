package com.enset.adapter;

import com.enset.computer.TV;
import com.enset.computer.VGA;


public class HdmiVgaAdapterInheritance extends TV implements VGA {
    @Override
    public void print(String message) {
        System.out.println("-------------Adapter-------------");
        byte[] msg=message.getBytes();
        super.view(msg);
        System.out.println("-------------Adapter-------------");
    }


}
