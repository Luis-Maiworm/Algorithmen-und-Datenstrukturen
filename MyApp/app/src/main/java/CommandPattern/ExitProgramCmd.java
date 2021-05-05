package CommandPattern;
import CommandPattern.ICommand;

public class ExitProgramCmd implements ICommand {
    @Override
    public void execute() {
        System.exit(0);
    }
    @Override
    public String toString() {
        return "Exit Command"; // IntelliJ ALT + EINFÜGEN
    }


}
