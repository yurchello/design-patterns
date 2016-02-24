package exampl_1;

/**
 * Created by Mezentsev.Y on 2/23/2016.
 */
public class Main {
    public static void main(String[] args) {
        IIterator nameRepo = new NameRepository();
        IIterator jobsRepo = new JobsRepository();
        for (IIterator val = nameRepo.getIterator(); val.hasNext();){
            System.out.println(val.next());
        }

        for (IIterator val = jobsRepo.getIterator(); val.hasNext();){
            System.out.println(val.next());
        }

    }
}
