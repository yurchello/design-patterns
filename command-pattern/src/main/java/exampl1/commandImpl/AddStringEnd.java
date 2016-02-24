package exampl1.commandImpl;

import exampl1.Command;
import exampl1.Document;

/**
 * Created by Mezentsev.Y on 2/19/2016.
 */
//ConcreteCommand
public class AddStringEnd implements Command {
    private Document document;
    private String str;
    public AddStringEnd(Document document, String str) {
        this.document= document;
        this.str= str;
    }
    @Override
    public void execute() {
        document.addStringAfter(str);
        document.output("Add string ("+ str+") after document");
    }
}