package org.tarik.frameWork.codeGenerators;

import org.tarik.frameWork.classDiagram.ClassDiagram;

public class JavaCodeGenerator implements CodeGenerator {
    @Override
    public String fromClassDiagram(ClassDiagram classDiagram) {
        return "java impl";
    }
}
