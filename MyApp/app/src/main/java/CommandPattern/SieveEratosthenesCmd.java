package CommandPattern;


import CommandPattern.ICommand;
import App.IConsole;
import Algorithms.SieveEratosthenes;


public class SieveEratosthenesCmd implements ICommand {

    private IConsole mConsole;
    public SieveEratosthenesCmd(IConsole mConsole) {
        super();
        this.mConsole = mConsole;
    }
    @Override
    public void execute() {
        int x = mConsole.readInteger(IConsole.sInputText);
        var gcd = new SieveEratosthenes();
        mConsole.write("Primenumbers (0-" + x + "): " + gcd.sieveErat(x));
    }
    @Override
    public String toString() {
        return "Sieve of Eratosthenes.";
    }

}