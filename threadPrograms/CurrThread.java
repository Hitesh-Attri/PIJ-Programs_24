package threadPrograms;
import java.lang.Thread;

public class CurrThread {
    public static void main(String[] args) {
        System.out.println("Finding Current Thread...\n");
        Thread t = new Thread();
        Thread t2 = new Thread();
        System.out.println("Current Thread: " + t);
        System.out.println("Current thread name: " + t.getName());
        System.out.println("Current Thread: " + t2);
        System.out.println("Current thread name: " + t2.getName());
    }
}
