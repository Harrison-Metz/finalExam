public class ElectricCar extends Car{
    private static double capacity;
    private static double chargeTime;

    public static void setChargeLimit(int i){
        System.out.println("charge limit set to: " + i);
    }

    public static void activateEnergySaverMode(){
        System.out.println("energy saver mode activated...");
    }
}
