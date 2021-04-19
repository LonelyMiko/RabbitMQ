package Java8.Multithreading.wait.bad;


public class PC
{
    public static void main(String[] args)
    {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}
