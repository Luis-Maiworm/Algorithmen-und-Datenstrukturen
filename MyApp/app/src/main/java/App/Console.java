package App;

import java.util.InputMismatchException;
import java.util.Scanner;
import App.IConsole;
public class Console implements IConsole {

    Scanner in = new Scanner(System.in);
    @Override
    public int readInteger(String text) {
        while (true) {
            System.out.print(text);
            try {
                int num = in.nextInt();
                return num;
            } catch (InputMismatchException e) {
                System.err.println("Wrong input! Input only integer number allowed!");
                in.nextLine();
            }
        }
    }
    Scanner in2 = new Scanner(System.in);
    @Override
    public String readString(String text) {
        while (true) {
            System.out.print(text);
            try {
                String str = in2.nextLine();
                return str.trim();
            } catch (InputMismatchException e) {
                System.err.println("Wrong input! Input only characters allowed!");
                in2.nextLine();
            }
        }
    }
    @Override
    public void write(String s) {
        System.out.println(s);
    }

}
