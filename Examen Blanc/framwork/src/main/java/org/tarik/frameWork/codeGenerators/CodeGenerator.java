package org.tarik.frameWork.codeGenerators;

import org.tarik.frameWork.classDiagram.ClassDiagram;

public interface CodeGenerator {
    String fromClassDiagram(ClassDiagram classDiagram);
}
