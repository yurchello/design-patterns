package example_1;

/**
 * Created by Mezentsev.Y on 2/18/2016.
 */
abstract class Decorator implements InterfaceComponent{
    protected InterfaceComponent component;

    public Decorator (InterfaceComponent c){
        component = c;
    }

    public int getPrice(){
        return component.getPrice();
    }

}
