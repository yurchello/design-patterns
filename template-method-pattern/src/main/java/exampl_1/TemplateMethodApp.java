package exampl_1;

/**
 * Created by Mezentsev.Y on 2/23/2016.
 */
public class TemplateMethodApp {
    public static void main(String[] args) {
        A a = new A();
        a.templateMethod();
        System.out.println();
        B b = new B();
        b.templateMethod();
    }
}
