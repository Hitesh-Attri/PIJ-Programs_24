import java.util.Scanner;

// Program for input of various types of inputs from user and print the messages.

public class Practical_9 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        // taking inputing of various datatypes
        boolean boolVal = cin.nextBoolean();
        short shortNum = cin.nextShort();
        byte byteNum = cin.nextByte();
        int num = cin.nextInt();
        long numLong = cin.nextLong();
        float numFloat = cin.nextFloat();
        double numDouble = cin.nextDouble();
        char ch = cin.next().charAt(0);

        // printing of datatypes:
        System.out.println("Boolean: " + boolVal);
        System.out.println("Short: " + shortNum);
        System.out.println("Byte: " + byteNum);
        System.out.println("Integer: " + num);
        System.out.println("Long: " + numLong);
        System.out.println("Float: " + numFloat);
        System.out.println("Double: " + numDouble);
        System.out.println("Character: " + ch);
        
    }
    
}
