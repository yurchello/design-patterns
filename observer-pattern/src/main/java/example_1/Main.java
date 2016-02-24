package example_1;

/**
 * Created by Mezentsev.Y on 2/18/2016.
 */
public class Main {
    public static void main(String[] args) {
        Amount amount = new Amount();
        A a = new A();
        B b = new B();
        amount.addObserver(a);
        amount.addObserver(b);


        for (int i = 0; i < 10; i++) {
            amount.amountPlus();
            amount.notifyObservers();
        }
    }
}
