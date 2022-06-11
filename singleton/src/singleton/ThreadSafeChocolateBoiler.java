package singleton;

public class ThreadSafeChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ThreadSafeChocolateBoiler scb;

    public static ThreadSafeChocolateBoiler getInstance() {
        if (scb == null) {
            scb = new ThreadSafeChocolateBoiler();
        }
        return scb;
    }

    private ThreadSafeChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    private boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
