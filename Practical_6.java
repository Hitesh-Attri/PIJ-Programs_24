import java.util.Scanner;
// A simple calculator

public class Practical_6 {
    private static int add(int n1, int n2){
        return n1+n2;
    }

    private static int sub(int n1, int n2){
        return n1-n2;
    }

    private static int multiply(int n1, int n2){
        return n1*n2;
    }

    private static float division(Float n1, Float n2) throws ZeroDenEx{
        if( n2 == 0){
            ZeroDenEx e = new ZeroDenEx();
            throw e;
        }
        return n1/n2;
    }

    private static int modulus(int num1, int num2) throws ZeroDenEx{
        if( num2 == 0){
            ZeroDenEx e = new ZeroDenEx();
            throw e;
        }
        return num1%num2;
    }
    public static void main(String[] args) throws ZeroDenEx {
    
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = cin.nextInt();

        System.out.print("Enter second number: ");
        int num2 = cin.nextInt();
        System.out.println("1 -> Addition\n2 -> Subtraction\n3 -> Multiplication\n4 -> Division\n5 -> Modulus");
        System.out.println("Enter choice (1-5): ");
        int key = cin.nextInt();

        switch (key) {
            case 1: System.out.println(add(num1, num2));  break;
            case 2: System.out.println(sub(num1, num2));  break;
            case 3: System.out.println(multiply(num1, num2));  break;
            case 4: 
            try {
                System.out.println(division((float)(num1), (float)(num2)));
            } catch (ZeroDenEx e) {
                System.out.println("Do not enter num2 0 as Denominator !! ( Divide by Zero Exception!!");
            }  break;
            case 5: 
            try {
                System.out.println(modulus(num1, num2));
            } catch (ZeroDenEx e) {
                System.out.println("Do not enter num2 0 as Denominator !! ( Divide by Zero Exception!!");
            }  break;

            default: System.out.println("Enter correct choice !!"); break;
        }
    }
}
class ZeroDenEx  extends Exception{}    // exception handling class