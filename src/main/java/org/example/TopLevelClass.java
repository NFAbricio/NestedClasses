package org.example;

public class TopLevelClass {
    void accessMembers (OuterClass outer) {
        //Compiler erro
        // field OuterClass.outerField
        // System
        System.out.println(outer.outerField);
        System.out.println(OuterClass.staticOuterField);
    }
}
