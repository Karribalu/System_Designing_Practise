package WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle goods = new GoodsVehicle();
        Vehicle off = new OffRoadVehicle();

        goods.drive();
        off.drive();
    }
    
}
