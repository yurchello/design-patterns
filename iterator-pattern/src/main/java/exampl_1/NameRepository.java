package exampl_1;

/**
 * Created by Mezentsev.Y on 2/23/2016.
 */
public class NameRepository implements IIterator {

    private  String[] names;
    private int index = 0;

    protected NameRepository(){
        names = new String[]{"oleg","jhon", "igor"};
    }

    @Override
    public boolean hasNext() {
        if (index<names.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(hasNext()) {
            return names[index++];
        }
        return null;
    }

    @Override
    public IIterator getIterator() {
        return this;
    }
}
