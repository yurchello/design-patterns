package adapter;

/**
 * Created by Mezentsev.Y on 2/19/2016.
 */
public class Client {



    public static void main(String[] args) {
        IDuck duck = new Duck();

        ITurkey turkey = new WildTurkey();
        IDuck turkeyAdapter = new TurckeyAdapter(turkey);

        duck.quack();
        duck.fly();

        turkey.gobble();
        turkey.walk();

        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }


}
