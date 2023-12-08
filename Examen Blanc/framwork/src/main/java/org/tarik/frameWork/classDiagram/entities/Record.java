package org.tarik.frameWork.classDiagram.entities;

import org.tarik.frameWork.classDiagram.Attribut;
import org.tarik.frameWork.classDiagram.Method;

import java.util.List;

public class Record extends Class{
    public Record(boolean isPublic, boolean isAbstract, boolean isStatic, boolean isFinal, List<Attribut> attributs, List<Method> methods) {
        super(isPublic, isAbstract, isStatic, isFinal, attributs, methods);
    }
}
