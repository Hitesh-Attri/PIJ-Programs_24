// Program showing the use of various operators:
public class Practical_8 {
    public static void main(String[] args) {
        int numA = 15;
        int numB = 200;
        // use of various operators: 
        System.out.println(" Arithmetic operators: ");
        System.out.println(" numA + numB: " + (numA+numB) + ",\t numA - numB: " + (numA-numB));
        System.out.println(" numA * numB: " + (numA*numB) + ",\t numA / numB: " + (numA/numB));

        System.out.println("\n Assignment operators: ");
        int a = 30;     System.out.println(" value of a: " + a);
        a += 5;        System.out.println(" a += 5: " + a);
        a -= 5;        System.out.println(" a -= 5: " + a);
        a *= 5;        System.out.println(" a *= 5: " + a);
        a /= 5;        System.out.println(" a /= 5: " + a);

        // >,<, ,<=, >=, == 
        System.out.println("\n Relational operators:");
        System.out.println(" numA > numB: " + (numA > numB) + ",\t numA < numB: " + (numA < numB));
        System.out.println(" numA >= numB: " + (numA >= numB) + ",\t numA <= numB: " + (numA >= numB));
        System.out.println(" numA == numB: " + (numA == numB) + ",\t numA != numB: " + (numA != numB));

        boolean x = true, y = false;
        
        System.out.println(" true AND true: " + (true && true) + ",\t true AND false: " + (true && false));
        System.out.println(" true OR false: " + (x || !y) + ",\t true OR true: " + (x || y));
        System.out.println(" NOT true: " + (!true) + ",\t NOT false: " + (!false));

        // &, ~, |, ^
        System.out.println("\n Bitwiese operators:");
        System.out.println(" numA | numB: " + (numA | numB) + ",\t numA & numB: " + ( numA & numB));  
        System.out.println(" numA ^ numB: " +  (numA ^ numB) + ",\t ~numA: " + (~numA));    
    }
}