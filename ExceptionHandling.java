import java.util.Scanner;

public class ExceptionHandling {
    static int getQuotient(int num1, int num2) throws Exception {
        if(num2 == 0){
            throw new ArithmeticException();
        }
        int q = num1/num2;
        return q;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = 3;
        while(t-- != 0) {
            System.out.print("Enter num1: ");
            int num1 = in.nextInt();
            System.out.print("Enter num2: ");
            int num2 = in.nextInt();
            try {
                int ans = getQuotient(num1,num2);
                System.out.println("Quotient: " + ans);
            }catch (Exception e){
                System.out.println("Exception occured!..." + e);
            }
        }
        System.out.println("Program terminated normally...");
    }
}
