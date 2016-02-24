package adapter;

/**
 * Created by Mezentsev.Y on 2/19/2016.
 */
public class Duck implements IDuck {

    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
