package example_1;

/**
 * Created by Mezentsev.Y on 2/26/2016.
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("admin", "admin");
        FolderProxy proxy = new FolderProxy(user);
        proxy.doAction();

        User user2 = new User("aaa", "ssss");
        FolderProxy proxy2 = new FolderProxy(user2);
        proxy2.doAction();
    }
}
