package example_1;

/**
 * Created by Mezentsev.Y on 2/18/2016.
 */
public class DecoratorTitanDisk extends Decorator{

    public DecoratorTitanDisk(InterfaceComponent c) {
        super(c);
    }
    @Override
    public int getPrice() {
        return super.getPrice() + 2000;
    }

    public void getNameParameter(){
        System.out.println("#TitanDisk");
    }

}
