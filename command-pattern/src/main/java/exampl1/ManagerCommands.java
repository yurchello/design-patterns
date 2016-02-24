package exampl1;

import java.util.ArrayList;

/**
 * Created by Mezentsev.Y on 2/19/2016.
 */
//Invoker
public class ManagerCommands {
private ArrayList<Command> listCommands= new ArrayList();

        public void addCommand(Command command){
            listCommands.add(command);
        }

        public void run(){
            for(Command command:listCommands){
                command.execute();
            }
        }
}
