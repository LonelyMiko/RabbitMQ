package metanit.Multithreading;

public class MyThread implements Runnable {
    private boolean isActive;

    void disable() {
        isActive = false;
    }

    MyThread() {
        isActive = true;
    }


    @Override
    public void run() {
        System.out.printf("%s started ... \n",Thread.currentThread().getName());
        int count = 0;
        while (isActive) {
            System.out.println("Loop " + count++);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
        System.out.printf("%s finished... \n",Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Main thread started...");
        MyThread myThread = new MyThread();
        new Thread(myThread,"MyThread").start();
        try {
            Thread.sleep(1100);
            myThread.disable();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished");
    }
}