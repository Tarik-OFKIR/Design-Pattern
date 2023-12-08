package org.tarik.frameWork.classDiagram;

import org.tarik.frameWork.attributObserver.Observable;
import org.tarik.frameWork.attributObserver.Observer;

import java.util.List;

public class Attribut implements Observable {
    private String name;
    private String type;
    private boolean isStatic;
    private boolean isFinal;
    private Visibility visibility;
    private List<Observer> observers;

    @Override
    public void notifyObserver() {

    }
}
