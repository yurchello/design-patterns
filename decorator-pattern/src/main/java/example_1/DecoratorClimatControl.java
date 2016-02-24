package example_1;

/**
 * Created by Mezentsev.Y on 2/18/2016.
 */
public class DecoratorClimatControl extends Decorator{

    public DecoratorClimatControl(InterfaceComponent c) {
        super(c);
    }
    @Override
    public int getPrice() {
        return super.getPrice() + 1500;
    }

    public void getNameParameter(){
        System.out.println("#ClimatControl");
    }

}
