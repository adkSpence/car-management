public class Luxury extends Cars {

    private final int seatCapacity;

    public Luxury(long engineSerialNo, long price, int year, String brand, int seatCapacity) {
        super(engineSerialNo, price, year, brand);
        this.seatCapacity = seatCapacity;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    @Override
    public void getCarDetails() {
        super.getCarDetails();
        System.out.println("Seat Capacity: " + this.getSeatCapacity());
        System.out.println("=====================================================================");
    }
}
