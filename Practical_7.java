// program showing the use of type conversion and type casting.

public class Practical_7 {
    public static void main(String[] args) {
        // In type casting, the source data type with a larger size is converted into the destination data type with a smaller size.
    
        byte smallNum = 2;
        int num;

        num = smallNum;

        System.out.println(" value of 'byte' number: " + smallNum);
        System.out.println(" value of 'int' number (after type conversion): " + num);

        float floatNum = 1260.0621f;
        int num2;

        num2 = (int)floatNum;

        System.out.println("\n value of 'float' number: " + floatNum);
        System.out.println(" value of 'int' number (after type conversion): " + num2);

    }
    
}
