// Creating my thread using Thread Class
package threadPrograms;

class Thread1 extends Thread{
    public void run() {
        System.out.println("\nThread1 class run method ==> ");
        for(int i = 1 ; i < 6;i+=2){
            System.out.print(i +  " ");
        }
        System.out.println();
    }
}
class Thread2 extends Thread{
    public void run() {
        System.out.println("\nThread2 class run method ==> ");
        for(int i = 0 ; i <= 6;i+=2){
            System.out.print(i +  " ");
        }
        System.out.println();
    }
}

public class MyThread {

    public static void main(String[] args)
    {
        Thread1 ob1 = new Thread1();
        Thread2 ob2 = new Thread2();

        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);

        t1.start();
        t2.start();
    }
}

class MyThreadJJJ2 extends Thread {
    public void run() {
        System.out.print("\nExecuting my thread class2...");
    }
}

