package Abstract_Factory_Pattern;

public class MacFactory implements IFactory {

    public IButton getButton() {
        return new MacButton();
    }

    public ITextBox getTextBox() {
        return new MacTextBox();
    }
}
