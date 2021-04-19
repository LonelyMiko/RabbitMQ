package Java8.Multithreading;

public class NewThread implements Runnable{
    String name;
    Thread thread;

    NewThread(String threadName)
    {
        this.name = threadName;
        thread = new Thread(this,name);
        System.out.println(name + thread);
        thread.start();
    }

    NewThread()
    {
        this.name = "Демонстрационный поток";
        thread = new Thread(this, name);
        System.out.println("Дочерний поток создан: " + thread);
        thread.start();
    }
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(this.name + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(this.name + " поток прерван");
        }
        System.out.println(this.name + " поток прерван");
    }
}
