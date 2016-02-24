package example_1;

import java.util.Observable;

/**
 * Created by Mezentsev.Y on 2/18/2016.
 */
public class Amount extends Observable {

    private  int amount = 0;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
        super.setChanged();
    }

    public  void amountPlus(){
        amount++;
        super.setChanged();
    }
}
