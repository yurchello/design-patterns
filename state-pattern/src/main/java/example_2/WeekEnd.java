package example_2;

/**
 * Created by Mezentsev.Y on 2/25/2016.
 */
public class WeekEnd implements Activity {
    private int count = 0;

    @Override
    public void doSome(Human context) {
        if (count<3){
            System.out.println("we are resting...");
            count++;
        }
        else {
            context.setState(new Work());
        }
    }
}
