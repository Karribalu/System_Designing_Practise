package Abstract_Factory_Pattern;

public class WindowsFactory implements IFactory {
    public IButton getButton() {
        return new WindowsButton();

    }

    public ITextBox getTextBox() {
        return new WindowsTextBox();
    }
}
