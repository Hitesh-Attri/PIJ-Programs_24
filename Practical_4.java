//Variable initialization in another cLass
public class Practical_4 {
    public static void main(String[] args) {
        Employee E1= new Employee();
        E1.displayInfo();  
    }
}

class Employee{
    int ID=7;
    String name="Hitesh";

    public void displayInfo(){
        System.out.println("ID: "+ID+", Name: "+name);
    }
}