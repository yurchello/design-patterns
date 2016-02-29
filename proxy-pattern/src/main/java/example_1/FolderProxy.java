package example_1;

/**
 * Created by Mezentsev.Y on 2/26/2016.
 */
public class FolderProxy implements IFolder {

    private Folder folder;
    private User user;

    public FolderProxy(User user) {
        this.user = user;
    }

    @Override
    public void doAction() {
        if(user.getUserName().equalsIgnoreCase("admin") &&
                user.getPassword().equalsIgnoreCase("admin")){
            folder = new Folder();
            folder.doAction();
        }else {
            System.out.println("you aren't admin");
        }
    }
}
