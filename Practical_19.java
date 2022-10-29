// Java program to demonstrate Inner class
// outer class
class OuterClass2{
    static int outer_x = 10;
    int outer_y = 20;
    private int outer_private = 30;

    // inner class
    class InnerClass {
        void display() {
            // can access static member of outer class
            System.out.println("outer_x = " + outer_x);

            // can also access non-static member of outer class
            System.out.println("outer_y = " + outer_y);

            // can also access a private member of the outer class
            System.out.println("outer_private = " + outer_private);
        }
    }
}
public class Practical_19 {
    public static void main(String[] args) {
        // accessing an inner class
        OuterClass2 outerObject = new OuterClass2();
        OuterClass2.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.display();
    }
}
