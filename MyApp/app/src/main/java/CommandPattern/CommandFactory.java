package CommandPattern;

import java.util.LinkedList;

import CommandPattern.ExitProgramCmd;
import CommandPattern.GCDDivRestItCmd;
import App.IConsole;

public class CommandFactory {
    IConsole mConsole;
    public CommandFactory(IConsole console) {
        super();
        this.mConsole = console;
    }
    public LinkedList<ICommand> returnsCommands() {
        LinkedList<ICommand> list = new LinkedList<ICommand>();
        list.add(new ExitProgramCmd());
        list.add(new GCDDivRestItCmd(mConsole));
        list.add(new GCDDivRestRecCmd(mConsole));
        list.add(new GCDSubItCmd(mConsole));
        list.add(new GCDSubRecCmd(mConsole));
        list.add(new SieveEratosthenesCmd(mConsole));
        list.add(new ReadPropertiesCmd(mConsole));
        return list;
    }
}
