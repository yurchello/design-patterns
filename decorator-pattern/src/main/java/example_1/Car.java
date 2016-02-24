package example_1;

/**
 * Created by Mezentsev.Y on 2/18/2016.
 */
class Car implements InterfaceComponent{

    @Override
    public int getPrice() {
        return 6000;
    }
    public void move() {
        System.out.print("I am car");
    }

}
