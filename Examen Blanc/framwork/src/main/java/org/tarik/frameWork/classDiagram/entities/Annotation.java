package org.tarik.frameWork.classDiagram.entities;

import org.tarik.frameWork.classDiagram.Property;

import java.util.ArrayList;
import java.util.List;

public class Annotation extends Entity{
    List<Property> properties = new ArrayList<>();

    public Annotation(List<Property> properties) {
        this.properties = properties;
    }
}
