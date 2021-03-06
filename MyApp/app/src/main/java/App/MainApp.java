/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package App;

import java.util.LinkedList;
import CommandPattern.CommandFactory;
import CommandPattern.ICommand;
import App.IConsole;
import App.Console;


public class MainApp {
    public static void main(String[] args) {
        IConsole console = new Console();
        CommandFactory cmdFactory = new CommandFactory(console);
        LinkedList<ICommand> commands = cmdFactory.returnsCommands();
        do {
            printCLIOptions(console, commands);
            ICommand cmd = selectCLIOption(console, commands);
            cmd.execute();
        } while (true);
    }
    private static ICommand selectCLIOption(IConsole console, LinkedList<ICommand> cmds) {
        do {
            int idx = console.readInteger("Please select an option: ");
            if (isValidOption(idx, 0, cmds.size())) {
                return cmds.get(idx);
            }
        } while (true);
    }
    private static boolean isValidOption(int idx, int min, int max) {
        return idx >= min && idx < max;
    }
    private static void printCLIOptions(IConsole console, LinkedList<ICommand> cmds) {
        System.out.println("Console-Application: Exercise-1\t\t\t\t\t\tLuis Maiworm 579112\n\n");
        for (int i = 1; i < cmds.size(); i++) {
            System.out.println(i + ". " + cmds.get(i));
        }
        System.out.println("0. " + cmds.get(0) + "\n");
    }
}