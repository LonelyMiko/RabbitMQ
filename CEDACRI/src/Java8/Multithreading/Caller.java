package Java8.Multithreading;

public class Caller implements Runnable
{
    String msg;
    CallMe target;
    Thread thread;

    public Caller(CallMe target, String msg)
    {
        this.target = target;
        this.msg = msg;
        thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        target.call(msg);
    }
}
