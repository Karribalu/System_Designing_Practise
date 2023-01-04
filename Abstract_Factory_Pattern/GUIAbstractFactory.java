package Abstract_Factory_Pattern;

public class GUIAbstractFactory {

    public IFactory getFactory(String os) {
        switch (os) {
            case "Mac":
                return new MacFactory();
            case "Windows":
                return new WindowsFactory();
            default:
                return null;
        }
    }
}
