// program demonstrating the use of static inner class

// outer class
class OuterClass {
    static int outer_x = 10;
    int outer_y = 20;
    private static int outer_private = 30;
    static class StaticNestedClass{
        void display(){
            System.out.println("outer_x = " + outer_x);
            System.out.println("outer_private = " + outer_private);
            // as static nested class cannot directly access non-static members
            // System.out.println("outer_y = " + outer_y); //
        }
    }
}

public class Practical_18{
    public static void main(String[] args) {
        // accessing a static nested class
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.display();
    }
}