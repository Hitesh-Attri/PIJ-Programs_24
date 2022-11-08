// program to create thread using Runnable interface

package threadPrograms;

public class MyThread2 implements Runnable{
    public static void main(String[] args) {
        MyThread2 ob = new MyThread2();
        Thread t2 = new Thread(ob);
        t2.start();
        System.out.println("Inside main method()...");
    }

    @Override
    public void run() {
        System.out.println("Run method...");
        System.out.println("Thread creation using Runnable Interface...");
        display();
    }

    public  void display(){
        System.out.println("Inside display() method...");
    }
}
