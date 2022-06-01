package ducks.behaviours.quacking;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<< The Sound Of Silence >>");
    }
}
