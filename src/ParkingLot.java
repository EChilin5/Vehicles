import java.util.ArrayList;

public class ParkingLot {
    int defaultParkingSpots = 30;

    private ArrayList<Vehicle> vehiclesSpots = new ArrayList<>();
    public int getDefaultParkingSpots(){
        return defaultParkingSpots;
    }
    public int getAvailableSpaces(){
        return defaultParkingSpots - vehiclesSpots.size();
    }

    public boolean add(Vehicle vehicle){
        if(getDefaultParkingSpots() < 30){
            vehiclesSpots.add(vehicle);
            return true;
        }
        return false;
    }

    public boolean search(Vehicle vehicle){
        for(int i = 0; i < vehiclesSpots.size(); i++){
            String license = vehiclesSpots.get(i).getLicense();
            if(license == vehicle.getLicense()){
                return true;
            }
        }
        return false;
    }

    public boolean remove(Vehicle vehicle){
        for(int i = 0; i < vehiclesSpots.size(); i++){
            String license = vehiclesSpots.get(i).getLicense();
            if(license == vehicle.getLicense()){
                vehiclesSpots.remove(i);
                return true;
            }
        }
        return false;
    }
}
