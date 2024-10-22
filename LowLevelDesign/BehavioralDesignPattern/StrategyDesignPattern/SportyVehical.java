public class SportyVehical extends Vehical{
    public SportyVehical(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
    @Override
    public void drive() {
        driveStrategy.drive();
    }
}
