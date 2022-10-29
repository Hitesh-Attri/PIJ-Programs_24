// this program is to show the different functinality of
// Static, Local and instance variable
// 25Aug2022

class test2{
    static int x=0; // static variable
    int y = 0;      // instance variable

    public void variabe_test(){
        int z = 0;  // local variable
        ++x; ++y; ++z;
        System.out.println("Static variabe: " +x+ ", Instance variable: "+y+", Local variable: "+z);
    }

    public static void print_x(){
        System.out.println("value of x is: " + x); // this method is static, it can only access static data members.
        //System.out.println("value of y: " + y); // this line of code will give error. as y is not static
    }
}

public class Practical_2 {
    public static void main(String[] args) {
        // creating objects of class test
        test2 ob = new test2();
        test2 ob2 = new test2();
        
        // calling methods
        ob.variabe_test();
        ob.variabe_test();
        ob2.variabe_test();
        ob2.variabe_test();
        test2.print_x();
    }
}
