package example_1;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Mezentsev.Y on 2/18/2016.
 */
public class A implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        int amount = ((Amount)o).getAmount();
        System.out.println("Class A, amount = " + amount);
    }
}
