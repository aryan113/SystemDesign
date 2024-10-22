public abstract class Vehical {
    DriveStrategy driveStrategy;
    public Vehical(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
    abstract void drive();
}
