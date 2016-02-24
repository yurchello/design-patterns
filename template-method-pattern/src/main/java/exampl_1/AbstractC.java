package exampl_1;

/**
 * Created by Mezentsev.Y on 2/23/2016.
 */
public abstract class AbstractC {

    public void templateMethod(){
        System.out.println("1");
        dif1();//the difference part
        System.out.println("3");
        dif2();//the difference part
    }


    public abstract void dif1();

    public abstract void dif2();
}
