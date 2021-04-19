package Java8.Multithreading;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread ( "Один");
        NewThread ob2 = new NewThread ( "Двa");
        NewThread ob3 = new NewThread ( "Tpи");

        System.out.println("Поток один запушен: " + ob1.thread.isAlive());
        System.out.println("Поток двa запушен: " + ob2.thread.isAlive());
        System.out.println("Поток тpи запушен: " + ob3.thread.isAlive());
        // ожидать завершения потоков исполнения
        try {
            System.out.println("Ожидание завершения потоков");
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
        } catch (InterruptedException e) {
            System.out.println ("Глaвный поток прерван");
        }
        System.out.println("Поток один запушен: " + ob1.thread.isAlive());
        System.out.println("Поток двa запушен: " + ob2.thread.isAlive());
        System.out.println("Поток тpи запушен: " + ob3.thread.isAlive());

        System.out.println("Глaвный поток завершен");
    }
}
