package singleton;

public class SingletonChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static SingletonChocolateBoiler scb;

    public static SingletonChocolateBoiler getInstance() {
        if (scb == null) {
            scb = new SingletonChocolateBoiler();
        }
        return scb;
    }

    private SingletonChocolateBoiler() {
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
