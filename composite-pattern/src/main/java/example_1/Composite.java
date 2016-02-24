package example_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mezentsev.Y on 2/23/2016.
 */
public class Composite implements Shape {

    private List<Shape> components = new ArrayList<>();

    public void addComponent(Shape component){
        components.add(component);
    }

    public void removeComponent(Shape component){
        components.remove(component);
    }

    @Override
    public void draw() {
        for (Shape comp: components){
            comp.draw();
        }
    }
}
