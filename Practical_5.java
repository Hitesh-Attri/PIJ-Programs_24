// Variable Intialization using Default and Parameterized Constructors 

public class Practical_5{
    public static void main(String[] args) {
        
        Employee2 E1= new Employee2();
        Employee2 E2= new Employee2(60,"Hitesh");

        E1.displayInfo();  
        E2.displayInfo();  
    }
}

class Employee2{
    int ID;
    String name;
    
    public Employee2(){
        ID=111;
        name="Tony";
    }
    public Employee2(int id,String name){
        ID=id;
        this.name=name;
    }

    public void displayInfo(){
        System.out.println("ID: "+ID+", Name: "+name);
    }
}
