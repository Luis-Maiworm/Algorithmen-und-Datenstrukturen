package CommandPattern;


import CommandPattern.ICommand;
import App.IConsole;
import Algorithms.GCDEuclidDivisionRestRec;


public class GCDDivRestRecCmd implements ICommand {

    private IConsole mConsole;
    public GCDDivRestRecCmd(IConsole mConsole) {
        super();
        this.mConsole = mConsole;
    }
    @Override
    public void execute() {
        int x = mConsole.readInteger(IConsole.sInputText);
        int y = mConsole.readInteger(IConsole.sInputText);
        var gcd = new GCDEuclidDivisionRestRec();
        mConsole.write("GCD(" + x + "," + y + "): " + gcd.calc(x, y));
    }
    @Override
    public String toString() {
        return "Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm subtraction.";
    }

}
