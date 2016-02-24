package adapter;

/**
 * Created by Mezentsev.Y on 2/19/2016.
 */
public class TurckeyAdapter implements IDuck{

    private ITurkey turkey;
    private int i;
//
    public TurckeyAdapter(ITurkey iTurkey){
        turkey = iTurkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.walk();
    }
}
