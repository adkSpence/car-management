import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        welcomeMessage();
    }

    public static void welcomeMessage() {
        boolean quitApp = false;

        while(!quitApp){

            System.out.println("""
                    Welcome to An-dem Car Dealership Management System
                    Mange car data for
                    A. Compact cars
                    B. Luxury cars
                    C. Trucks
                    D. Wagons
                    Enter "Quit" to exit
                    """);
            System.out.print(">>> ");
            String response = scanner.next();

            switch (response.toUpperCase()) {
                case "A" -> showCompactCarMenu();
                case "B" -> showLuxuryCarMenu();
                case "C" -> showTrucksCarMenu();
                case "D" -> showWagonsCarMenu();
            }

            if(response.equalsIgnoreCase("quit")) {
                quitApp = true;
            }
        }
    }

    public static void showLuxuryCarMenu() {
        System.out.println("Luxury Cars Entry");

        ArrayList<Luxury> luxuryStore = new ArrayList<>();
        String response;
        boolean quit = false;

        while(!quit){
            System.out.println("Enter A. To Save New Car Entry, B. To Search Entry or Quit to exit to main menu");
            response = scanner.next();

            if(response.equalsIgnoreCase("A")){
                System.out.print("Enter Brand name: ");
                String name = scanner.next();
                System.out.print("Enter Model Year: ");
                int year = scanner.nextInt();
                System.out.print("Enter Engine Serial Number: ");
                long serialNumber = scanner.nextLong();
                System.out.print("How many people can the car hold: ");
                int seatCapacity = scanner.nextInt();
                System.out.print("Enter price for the car: ");
                long price = scanner.nextLong();
                Luxury luxury = new Luxury(serialNumber, price, year, name, seatCapacity);
                luxuryStore.add(new Luxury(serialNumber, price, year, name, seatCapacity));

                luxury.getCarDetails();
            }
            else if(response.equalsIgnoreCase("B")){
                String search;

                System.out.println("Search by: 1. Brand Name 2. Year");
                search = scanner.next();

                if(search.equalsIgnoreCase("brand")){
                    for(Luxury searchItem : luxuryStore) {
                        System.out.println(searchItem.getBrand());
                    }
                }
                else if(search.equalsIgnoreCase("year")){
                    for(Luxury searchItem : luxuryStore) {
                        System.out.println(searchItem.getYear());
                    }
                }
            }
            else{
                quit = true;
                welcomeMessage();
            }
        }

    }

    public static void showTrucksCarMenu() {
        System.out.println("Trucks Menu");

        ArrayList<Trucks> trucksStore = new ArrayList<>();
        String response;
        boolean quit = false;

        while(!quit){
            System.out.println("Enter A. To Save New Car Entry, B. To Search Entry or Quit to exit to main menu");
            response = scanner.next();

            if(response.equalsIgnoreCase("A")){
                System.out.println("Trucks Entry");
                System.out.print("Enter Brand name: ");
                String name = scanner.next();
                System.out.print("Enter Model Year: ");
                int year = scanner.nextInt();
                System.out.print("Enter Engine Serial Number: ");
                long serialNumber = scanner.nextLong();
                System.out.print("Enter Load Capacity: ");
                int loadCapacity = scanner.nextInt();
                System.out.print("Enter price for the car: ");
                long price = scanner.nextLong();
                Trucks trucks = new Trucks(serialNumber, price, year, name, loadCapacity);
                trucksStore.add(new Trucks(serialNumber, price, year, name, loadCapacity));

                trucks.getCarDetails();
            }
            else if(response.equalsIgnoreCase("B")){
                String search;

                System.out.println("Search by: 1. Brand Name 2. Year");
                search = scanner.next();

                if(search.equalsIgnoreCase("brand")){
                    for(Trucks searchItem : trucksStore) {
                        System.out.println(searchItem.getBrand());
                    }
                }
                else if(search.equalsIgnoreCase("year")){
                    for(Trucks searchItem : trucksStore) {
                        System.out.println(searchItem.getYear());
                    }
                }
            }
            else{
                quit = true;
                welcomeMessage();
            }
        }
    }

    public static void showCompactCarMenu() {
        System.out.println("Compact Cars Entry");

        ArrayList<Compact> compactStore = new ArrayList<>();
        String response;
        boolean quit = false;

        while(!quit) {
            System.out.println("Enter A. To Save New Car Entry, B. To Search Entry or Quit to exit to main menu");
            response = scanner.next();

            if (response.equalsIgnoreCase("A")) {
                System.out.println("Compact Cars Entry");
                System.out.println("Enter Brand name: ");
                String name = scanner.next();
                System.out.println("Enter Model Year: ");
                int year = scanner.nextInt();
                System.out.println("Enter Engine Serial Number: ");
                long serialNumber = scanner.nextLong();
                System.out.println("How many people can the car hold: ");
                int seatCapacity = scanner.nextInt();
                System.out.println("Enter price for the car: ");
                long price = scanner.nextLong();
                Compact compact = new Compact(serialNumber, price, year, name, seatCapacity);
                compactStore.add(new Compact(serialNumber, price, year, name, seatCapacity));
                compact.getCarDetails();
            }
            else if(response.equalsIgnoreCase("B")){
                String search;

                System.out.println("Search by: 1. Brand Name 2. Year");
                search = scanner.next();

                if(search.equalsIgnoreCase("brand")){
                    for(Compact searchItem : compactStore) {
                        System.out.println(searchItem.getBrand());
                    }
                }
                else if(search.equalsIgnoreCase("year")){
                    for(Compact searchItem : compactStore) {
                        System.out.println(searchItem.getYear());
                    }
                }
            }
            else{
                quit = true;
                welcomeMessage();
            }
        }
    }

    public static void showWagonsCarMenu() {

        System.out.println("Wagons Cars Entry");

        ArrayList<Wagons> wagonsStore = new ArrayList<>();
        String response;
        boolean quit = false;

        while(!quit) {
            System.out.println("Enter A. To Save New Car Entry, B. To Search Entry or Quit to exit to main menu");
            response = scanner.next();

            if (response.equalsIgnoreCase("A")) {

                System.out.println("Wagons Entry");
                System.out.println("Enter Brand name: ");
                String name = scanner.next();
                System.out.println("Enter Model Year: ");
                int year = scanner.nextInt();
                System.out.println("Enter Engine Serial Number: ");
                long serialNumber = scanner.nextLong();
                System.out.println("How many people can the car hold: ");
                int seatCapacity = scanner.nextInt();
                System.out.println("Enter price for the car: ");
                long price = scanner.nextLong();
                Wagons wagons = new Wagons(serialNumber, price, year, name, seatCapacity);
                wagonsStore.add(new Wagons(serialNumber, price, year, name, seatCapacity));

                wagons.getCarDetails();
            }
            else if(response.equalsIgnoreCase("B")){
                String search;

                System.out.println("Search by: 1. Brand Name 2. Year 3. Seater");
                search = scanner.next();

                if(search.equalsIgnoreCase("brand")){
                    for(Wagons searchItem : wagonsStore) {
                        System.out.println(searchItem.getBrand());
                    }
                }
                else if(search.equalsIgnoreCase("year")){
                    for(Wagons searchItem : wagonsStore) {
                        System.out.println(searchItem.getYear());
                    }
                }
            }
            else{
                quit = true;
                welcomeMessage();
            }
        }
    }

}
