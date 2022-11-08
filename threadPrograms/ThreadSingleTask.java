package threadPrograms;

class Thread_H implements Runnable{

    @Override
    public void run() {
        task1();
        task2();
        task3();
    }
    void task1(){
        System.out.println("Starting task1");
    }
    void task2(){
        System.out.println("Starting task2");
    }
    void task3(){
        System.out.println("Starting task3");
    }
}

public class ThreadSingleTask {
    public static void main(String[] args) {
        Thread_H mythreadob = new Thread_H();
        Thread t = new Thread(mythreadob);
        t.start();
    }
}