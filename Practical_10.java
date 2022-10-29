// accesing instance variable and methods of class using this keyword.
public class Practical_10 {
    int data;
    
    void assignData(int data){
        this.data = data;       // using this keyword with instance variable
        this.display();         // using this keyword to call method
    }
    void display(){
        System.out.println("Data: " + this.data);
    }
    public static void main(String[] args) {
        Practical_10 obj = new Practical_10();
        obj.assignData(87);
    }
    
}
