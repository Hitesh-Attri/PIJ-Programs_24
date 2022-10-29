// Program to overload main method

public class Practical_15 {
    public static void main(String[] args) {
        System.out.println("\nInside main method\n");
        System.out.println("\t(calling overloaded main method->)");
        // call overloaded main method
        main(60);
        
    }
    public static void main( int x){
        System.out.println("\nThis is over loaded main method!\n");
        System.out.println("Value of data is: " + x);
    }
}
