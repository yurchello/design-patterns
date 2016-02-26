package example_1;

/**
 * Created by Mezentsev.Y on 2/26/2016.
 */
public class Main {
    public static void main(String[] args) {
        Abstract abst1 = new ConcreteOne();
        Abstract abst2= new ConcreteTwo();

        abst1.print();
        abst2.print();
    }
}
