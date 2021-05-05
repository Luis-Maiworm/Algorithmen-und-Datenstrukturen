package CommandPattern;


import CommandPattern.ICommand;
import App.IConsole;
import Algorithms.ReadProperties;


public class ReadPropertiesCmd implements ICommand {

    private IConsole mConsole;
    public ReadPropertiesCmd(IConsole mConsole) {
        super();
        this.mConsole = mConsole;
    }
    @Override
    public void execute() {
        String preName = mConsole.readString(IConsole.sInputTextPrename);
        String surName = mConsole.readString(IConsole.sInputTextSurname);
        var props = new ReadProperties();
        mConsole.write("Name: " + props.readNames(preName) + " " + props.readNames(surName));
    }
    @Override
    public String toString() {
        return "Read properties, like surname and prename.";
    }

}