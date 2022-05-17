public class Trucks extends Cars {

    private final int loadCapacity;

    public Trucks(long engineSerialNo, long price, int year, String brand, int loadCapacity) {
        super(engineSerialNo, price, year, brand);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity(){
        return this.loadCapacity;
    }

    @Override
    public void getCarDetails(){
        super.getCarDetails();
        System.out.println("Load Capacity (kgs): " + this.getLoadCapacity());
        System.out.println("=====================================================================");
    }
}
