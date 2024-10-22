public class PassengerVehical extends Vehical{
    public PassengerVehical(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
    @Override
    public void drive() {
        driveStrategy.drive();
    }
}
