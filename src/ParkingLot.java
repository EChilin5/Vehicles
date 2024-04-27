import java.util.ArrayList;

public class ParkingLot {
    static int defaultParkingSpots = 30;

    public static ArrayList<Vehicle> vehiclesSpots = new ArrayList<>();
    public static int getDefaultParkingSpots(){
        return defaultParkingSpots;
    }
    public static int getAvailableSpaces(){
        return defaultParkingSpots - vehiclesSpots.size();
    }

    public static boolean add(Vehicle vehicle){
        if(getAvailableSpaces() <= 30){
            vehiclesSpots.add(vehicle);
            return true;
        }
        return false;
    }

    public static boolean search(Vehicle vehicle){
        for(int i = 0; i < vehiclesSpots.size(); i++){
            String license = vehiclesSpots.get(i).getLicense();
            if(license == vehicle.getLicense()){
                return true;
            }
        }
        return false;
    }

    public static boolean remove(Vehicle vehicle){
        for(int i = 0; i < vehiclesSpots.size(); i++){
            String license = vehiclesSpots.get(i).getLicense();
            if(license == vehicle.getLicense()){
                vehiclesSpots.remove(i);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Car car1 = new Car("tekgken", Size.Medium);
        Car car2 = new Car("rerewrr", Size.Medium);
        Car car3 = new Car("rervfsr", Size.Medium);
        System.out.println("Added Car1 -> " + add(car1));
        System.out.println("Added Car2 -> " +add(car2));
        System.out.println("Added Car3 -> " + add(car3));
        System.out.println("Search Car2 " + search(car2));
        System.out.println("Delete Car1 -> " + remove(car1));
        System.out.println("Search Car1 " + search(car1));


    }
}
