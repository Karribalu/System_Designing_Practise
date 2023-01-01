package WithStrategyPattern;

import javax.swing.SpinnerDateModel;

import WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle()
    {
        super(new SportsDriveStrategy());
    }
}
