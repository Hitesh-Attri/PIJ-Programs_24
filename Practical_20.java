// Program showing how to create AnonymousClass using class and interface

// using class :-
class Animal{
    void makeNoise(){
        System.out.println("ku.. ku... ku.. ku....");
    }

}

interface Polygon {
    public void display();
}

class AnonymousDemo {
    public void createClass() {
        // anonymous class implementing interface
        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("Inside an anonymous class.");
            }
        };
        p1.display();
    }
}
public class Practical_20{
    public static void main(String []arg){
        Animal firstAnimal = new Animal();
        firstAnimal.makeNoise();

        Animal kittie = new Animal(){
            void makeNoise(){
                System.out.println("mew.. mew.. mew...");
            }
        };
        kittie.makeNoise();

        AnonymousDemo an = new AnonymousDemo();
        an.createClass();
    }
}