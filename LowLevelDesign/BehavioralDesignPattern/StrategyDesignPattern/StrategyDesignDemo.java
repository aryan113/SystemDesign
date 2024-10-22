public class StrategyDesignDemo {
    public static void main(String[] args) {

        Vehical vehical = new PassengerVehical(new NormalDriveStrategy());
        vehical.drive();
        vehical = new OffRoadVehical(new SpecialDriveStrategy());
        vehical.drive();
        vehical = new SportyVehical(new SpecialDriveStrategy());
        vehical.drive();
    }
}
