package Java8.Multithreading;

public class Synch {
    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller ob1 = new Caller(target,"Добро пожаловать");
        Caller ob2 = new Caller(target,"в синхронизированный");
        Caller ob3 = new Caller(target,"мир!");

        try {
            /*
                В Java предусмотрен механизм, позволяющий одному потоку ждать завершения выполнения другого.
                Для этого используется метод join().
                Например, чтобы главный поток подождал завершения побочного потока myThready,
                необходимо выполнить инструкцию myThready.join() в главном потоке.
                Как только поток myThready завершится, метод join() вернет управление,
                и главный поток сможет продолжить выполнение.
             */
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Пpepвaнo");
        }
    }
}
