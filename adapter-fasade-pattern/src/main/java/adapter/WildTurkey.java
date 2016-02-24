package adapter;

/**
 * Created by Mezentsev.Y on 2/19/2016.
 */
public class WildTurkey implements ITurkey {

    @Override
    public void gobble() {
        System.out.println("gobble");
    }

    @Override
    public void walk() {
        System.out.println("walk");
    }
}
