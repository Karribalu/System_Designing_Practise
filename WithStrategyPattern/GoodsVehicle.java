package WithStrategyPattern;
import WithStrategyPattern.Strategy.*;
public class GoodsVehicle extends Vehicle{
    GoodsVehicle()
    {
        super(new NormalDriveStrategy());
    }
}
