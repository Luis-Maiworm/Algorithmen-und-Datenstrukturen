package CommandPattern;


import CommandPattern.ICommand;
import App.IConsole;
import Algorithms.GCDEuclidSubtractionRec;


public class GCDSubRecCmd implements ICommand {

    private IConsole mConsole;
    public GCDSubRecCmd(IConsole mConsole) {
        super();
        this.mConsole = mConsole;
    }
    @Override
    public void execute() {
        int x = mConsole.readInteger(IConsole.sInputText);
        int y = mConsole.readInteger(IConsole.sInputText);
        var gcd = new GCDEuclidSubtractionRec();
        mConsole.write("GCD(" + x + "," + y + "): " + gcd.calc(x, y));
    }
    @Override
    public String toString() {
        return "Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm division rest.";
    }

}