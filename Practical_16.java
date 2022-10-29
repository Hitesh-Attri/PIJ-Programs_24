// program to override the method of parent class
class ParentClass{
    void display(){
        System.out.println("This is parent class method.");
    }
} 

// inheriting ParentClass
public class Practical_16 extends ParentClass {
    // overriding method of parent class
    void display(){
        System.out.println("\nInside child class --> \tThis is child class method,");
    }
    public static void main(String[] args) {
    
        Practical_16 ob = new Practical_16();
        ParentClass ob2 = new ParentClass();

        ob.display();
        ob2.display();
    }
}
