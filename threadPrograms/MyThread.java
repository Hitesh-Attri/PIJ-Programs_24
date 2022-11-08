// Creating my thread using Thread Class
package threadPrograms;

public class MyThread extends Thread{
    public void run() {
        System.out.print("\nExecuting my thread...");
    }
    public static void main(String[] args)
    {
        MyThread t = new MyThread();
        MyThread t2 = new MyThread();
        MyThreadJJJ2 ob = new MyThreadJJJ2();
        ob.start();
        t.start();
        t2.start();
    }
}

class MyThreadJJJ2 extends Thread {
    public void run() {
        System.out.print("\nExecuting my thread class2...");
    }
}

