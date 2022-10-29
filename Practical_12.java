import java.util.Scanner;
// WAP to show single level inheritance.

class test{
    String name;
    int rollNo;

    test(){
        System.out.println("This is class 'test'.\n");
    }
}

public class Practical_12 extends test {
    float grades;

    public void display(){
        System.out.println("\nName of the student: " + name);
        System.out.println("Roll no. of the student: " + rollNo);
        System.out.println("Grades of the student: " + grades);
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Practical_12 ob = new Practical_12();
        System.out.print("Enter name of the student: ");
        ob.name = cin.next();
        System.out.print("Enter Roll number: ");
        ob.rollNo = cin.nextInt();
        System.out.print("Enter grades: ");
        ob.grades = cin.nextFloat();

        ob.display();
    }
}
