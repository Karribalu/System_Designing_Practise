import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape you want");
        String shape = sc.next();

        ShapeFactory shapeObj = new ShapeFactory();
        Shape obj = shapeObj.getShape(shape);

        if (obj == null)
            System.out.println("Null Object");
        else
            obj.draw();
        sc.close();
    }
}