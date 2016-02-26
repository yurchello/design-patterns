package example_2;

/**
 * Created by Mezentsev.Y on 2/25/2016.
 */
public class Work implements Activity {

    @Override
    public void doSome(Human context) {
        System.out.println("Working...");
        context.setState(new WeekEnd());
    }
}
