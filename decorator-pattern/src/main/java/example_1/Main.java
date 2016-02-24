package example_1;

/**
 * Created by Mezentsev.Y on 2/18/2016.
 */
public class Main {
    public static void main(String[] args) {
        Decorator commonprice = new DecoratorNavigator(new DecoratorTitanDisk(new DecoratorNavigator(new Car())));
        System.out.println(commonprice.getPrice());
    }
}
