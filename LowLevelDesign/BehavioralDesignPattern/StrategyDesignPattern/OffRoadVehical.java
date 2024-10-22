public class OffRoadVehical extends Vehical{
    public OffRoadVehical(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
    @Override
    public void drive() {
        driveStrategy.drive();
    }
}
