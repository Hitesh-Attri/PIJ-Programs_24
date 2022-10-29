// program showing constructor chaining using this keyword

public class Practical_11 {
    int x, y;

    Practical_11(){     // default contructor
        this(60);
        x = 12;
        System.out.println(" Default constructor called.");
    }
    Practical_11(int data){     // parameterized contructor
        // this.x = 12;
        System.out.println(" Parameterized constructor called. ");
        this.y = this.x + data;
    }
    void display(){
        System.out.println("X: " + x + ", Y: " + y);
    }

    public static void main(String[] args) {
    
        Practical_11 obj = new Practical_11();
        obj.display();
    }
}
