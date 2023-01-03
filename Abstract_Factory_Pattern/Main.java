package Abstract_Factory_Pattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the OS of your System");
        String os = sc.next();

        IFactory factory = new GUIAbstractFactory().getFactory(os);

        IButton button = factory.getButton();
        button.press();
        ITextBox textBox = factory.getTextBox();
        textBox.showText();

        sc.close();
    }
}
