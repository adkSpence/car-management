public class Cars {

    private final long engineSerialNo;
    private final long price;
    private final int year;
    private final String brand;

    public Cars(long engineSerialNo, long price, int year, String brand) {
        this.engineSerialNo = engineSerialNo;
        this.price = price;
        this.year = year;
        this.brand = brand;
    }

    public long getEngineSerialNo() {
        return engineSerialNo;
    }
    public long getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public void getCarDetails() {
        System.out.println("=====================================================================");
        System.out.println("Brand: " + getBrand());
        System.out.println("Year: " + getYear());
        System.out.println("Engine System Number: " + getEngineSerialNo());
        System.out.println("Price: " + getPrice());
    }
}
