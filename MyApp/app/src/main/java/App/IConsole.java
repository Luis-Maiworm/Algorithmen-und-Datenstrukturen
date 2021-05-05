package App;

public interface IConsole {
    static final String sInputText = "Please, insert a number: ";
    static final String sInputTextPrename = "Please, insert your Prename: ";
    static final String sInputTextSurname = "Please, insert your Surname: ";
    public int readInteger(String text);
    public String readString(String text);
    public void write(String s);
}
