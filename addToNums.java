import java.util.Scanner;
// import java.util.concurrent.CountDownLatch;

// import javax.xml.transform.Source;

public class addToNums {
    public static void main(String[] args) {
    
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = cin.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = cin.nextInt();

        System.out.println("sum is: " + (num1+num2));
    }
    
}
