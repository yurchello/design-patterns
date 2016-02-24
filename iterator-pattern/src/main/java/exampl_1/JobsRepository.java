package exampl_1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Mezentsev.Y on 2/23/2016.
 */
public class JobsRepository implements  IIterator {

    private List list;
    private int index = 0;

    public JobsRepository(){
        list = Arrays.asList("manager", "Dev", "QA");

    }

    @Override
    public boolean hasNext() {
        if (index<list.size()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(hasNext()) {
            return list.get(index++);
        }
        return null;
    }

    @Override
    public IIterator getIterator() {
        return this;
    }


}
