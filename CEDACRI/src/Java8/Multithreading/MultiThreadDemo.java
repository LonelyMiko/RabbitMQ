package Java8.Multithreading;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("Первый");
        new NewThread("Второй");
        new NewThread("Третий");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Гланый поток завершен");
    }
}
