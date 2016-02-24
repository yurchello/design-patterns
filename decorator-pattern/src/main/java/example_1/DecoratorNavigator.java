package example_1;

/**
 * Created by Mezentsev.Y on 2/18/2016.
 */
public class DecoratorNavigator extends Decorator{

    public DecoratorNavigator(InterfaceComponent c) {
        super(c);
    }
    @Override
    public int getPrice() {
        return super.getPrice() + 300;
    }

    public void getNameParameter(){
        System.out.println("#Navigator");
    }

}
