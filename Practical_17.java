// program showing the use of this and super keyword.

public class Practical_17 extends Parent{ // child class
    private int C_cum;
    private int data = 11;

    void display(){
        System.out.println("This is child class method.");
        this.checkThis(2001); // calling child class method
        super.display();
    }
    void checkThis(int data){
        System.out.println("Value of data: " + (this.data + data));
        System.out.println("Value of P_num from Parent class: " + super.P_num);
        System.out.println("\nthis method is called from C_display(), using \"this\" keyword!");
    }

    public static void main(String[] arg){
        Practical_17 ob = new Practical_17();
//        ob.display();
        ob.display();
    }
}

class Parent{
    int P_num;
    Parent(){
        P_num = 20;
    }
    void display(){
        System.out.println("This is Parent class method.");
    }
    int modify(int data){
        return 12 + data;
    }
}
