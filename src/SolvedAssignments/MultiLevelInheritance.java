package SolvedAssignments;

//public class Multilevalinheritance // Class A
//{
class A {
    static void method1A() {
        System.out.println("Method 1 from class A");
    }

    static void method2A() {
        System.out.println("Method 2 from class A");
    }
}

// Class B inherits from class A
class B extends A {
    static void method1B() {
        System.out.println("Method 1 from class B");
    }

    static void method2B() {
        System.out.println("Method 2 from class B");
    }
}

// Class C inherits from class B
class C extends B {
    static void method1C() {
        System.out.println("Method 1 from class C");
    }

    static void method2C() {
        System.out.println("Method 2 from class C");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        // Calling static methods from each class
        A.method1A();
        A.method2A();
        B.method1B();
        B.method2B();
        C.method1C();
        C.method2C();
    }
}


