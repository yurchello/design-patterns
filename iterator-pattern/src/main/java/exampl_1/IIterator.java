package exampl_1;

/**
 * Created by Mezentsev.Y on 2/23/2016.
 */
public interface IIterator {
    boolean hasNext();
    Object next();
    IIterator getIterator();
}
