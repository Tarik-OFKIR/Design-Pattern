package com.enset;

import com.enset.adapter.HdmiVgaAdapterComposition;
import com.enset.adapter.HdmiVgaAdapterInheritance;
import com.enset.computer.*;

public class Main {

    public static void main(String[] args) {
        UniteCentrale uniteCentrale=new UniteCentrale();
        uniteCentrale.setVga(new Ecran());
        uniteCentrale.print("Test");
        System.out.println();

        uniteCentrale.setVga(new VideoProjecteur());
        uniteCentrale.print("Test");
        System.out.println();

        HdmiVgaAdapterComposition hdmiVgaAdapterComposition =new HdmiVgaAdapterComposition();
        hdmiVgaAdapterComposition.setHdmi(new TV());
        uniteCentrale.setVga(hdmiVgaAdapterComposition);
        hdmiVgaAdapterComposition.print("Test");
        System.out.println();

        HdmiVgaAdapterInheritance hdmiVgaAdapterInheritance =new HdmiVgaAdapterInheritance();
        uniteCentrale.setVga(hdmiVgaAdapterInheritance);
        hdmiVgaAdapterInheritance.print("Test");
        System.out.println();

        uniteCentrale.setVga(new SuperVP());
        uniteCentrale.print("Test");
        System.out.println();

        HdmiVgaAdapterComposition hdmiVgaAdapterComposition1 =new HdmiVgaAdapterComposition();
        hdmiVgaAdapterComposition1.setHdmi(new SuperVP());
        uniteCentrale.setVga(hdmiVgaAdapterComposition1);
        uniteCentrale.print("Test");
    }
}