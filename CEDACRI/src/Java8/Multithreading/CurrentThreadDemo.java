package Java8.Multithreading;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Текуший поток исполнения: " + thread);

        //изменяем имя потока
        thread.setName("My Thread");
        System.out.println("После изменения имени потока: " + thread);

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
        }
    }
}
