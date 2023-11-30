package org.example;

public class OuterClass {
    String outerField = "Outer field";
    static String staticOuterField = "Static outer field";


    class InnerClass {
        void accessMember() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    static class StaticNestedClass{
        void accessMembers (OuterClass outer){
            //compiler error: cannot make  a static reference to the non-static
            //  field outerFIeld
            // System.out.println(outer.outerField);
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }


    public static void main(String[] args) {
        System.out.println("Inner class");
        System.out.println("--------------");
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.accessMember();


        System.out.println("\nTop-level class:");
        System.out.println("---------------");
        StaticNestedClass staticNestedObject = new StaticNestedClass();
        staticNestedObject.accessMembers(outerObject);


        System.out.println("\nTop-level class:");
        System.out.println("---------------");
        TopLevelClass topLevelObject = new TopLevelClass();
        topLevelObject.accessMembers(outerObject);

    }
}
