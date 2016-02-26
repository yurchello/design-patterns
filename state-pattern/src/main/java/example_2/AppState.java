package example_2;

/**
 * Created by Mezentsev.Y on 2/25/2016.
 */
public class AppState {
    public static void main(String[] args) {
        Human human = new Human();
        human.setState(new Work());
        for (int i = 0; i<10; i++){
           human.doSome();
        }
    }
}
