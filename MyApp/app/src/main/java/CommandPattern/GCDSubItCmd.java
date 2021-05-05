package CommandPattern;


import CommandPattern.ICommand;
import App.IConsole;
import Algorithms.GCDEuclidSubtractionIt;


public class GCDSubItCmd implements ICommand {

    private IConsole mConsole;
    public GCDSubItCmd(IConsole mConsole) {
        super();
        this.mConsole = mConsole;
    }
    @Override
    public void execute() {
        int x = mConsole.readInteger(IConsole.sInputText);
        int y = mConsole.readInteger(IConsole.sInputText);
        var gcd = new GCDEuclidSubtractionIt();
        mConsole.write("GCD(" + x + "," + y + "): " + gcd.calc(x, y));
    }
    @Override
    public String toString() {
        return "Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm division rest.";
    }

}