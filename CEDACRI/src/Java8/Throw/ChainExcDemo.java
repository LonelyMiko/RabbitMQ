package Java8.Throw;

class ChainExcDemo {
    static void demoproc() {
// создать исключение
        NullPointerException e = new NullPointerException(" вepxний уровень");
        e.initCause(new ArithmeticException("пpичинa "));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException exception)
        {
            System.out.println("Пepexвaчeнo исключение: " + exception);
            System.out.println("Пepвoпpичинa : " + exception.getCause());
        }
    }
}
