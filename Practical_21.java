public class Practical_21 {
    public static void main(String[] args) {
        System.out.println("Thread!!");
        Thread t = Thread.currentThread();
        System.out.println("Current Thread: " + t);
        System.out.println("Current Thread Name: " + t.getName());
    }
}
