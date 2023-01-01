package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;
    Vehicle(DriveStrategy dStrategy)
    {
        this.driveObject = dStrategy;
    }

    public void drive()
    {
        driveObject.drive();
    }
}
