package example_2;

/**
 * Created by Mezentsev.Y on 2/25/2016.
 */
//context
public class Human {

    private  Activity state;

    public void setState(Activity state) {
        this.state = state;
    }

    public void doSome (){
        state.doSome(this);
    }

}
