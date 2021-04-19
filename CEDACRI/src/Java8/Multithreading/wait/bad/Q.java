package Java8.Multithreading.wait.bad;

public class Q {
    int n;

    synchronized int get()
    {
        System.out.println("Получено: " + n);
        return this.n;
    }
    synchronized void put(int n)
    {
        this.n = n;
        System.out.println("Отправлено: " + n);
    }
}
