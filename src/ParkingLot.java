import java.util.ArrayList;

public class ParkingLot {
    static int defaultParkingSpots = 30;
    static int defaultMotorCycleSpots = 10;


    public static ArrayList<Car> carSpots = new ArrayList<>();
    public static ArrayList<Motorcycle> motorCycles = new ArrayList<>();

    public static int getDefaultParkingSpots(){
        return defaultParkingSpots;
    }
    public static int getAvailableSpaces(){
        return defaultParkingSpots - carSpots.size();
    }

    // add specific vechicle
    // this works for various vehicles
    // what i was thinking for add is to create counter for each different type
    // of vehicle and then check to see if there space for this specific type of vehicle
    // then update the list and the count for the specific vehicle type
    // I then considered creating different type of list keep a record of each vehicle
//    public static boolean addCar(Vehicle vehicle){
//        if(getAvailableSpaces() <= 30){
//            carSpots.add(vehicle)
//            return true;
//        }
//        return false;
//    }
//    public static int search(Vehicle vehicle){
//        for(int i = 0; i < carSpots.size(); i++){
//            String license = vehicle.get(i).getLicense();
//            Size type = vehicle.get(i).getSize();
//            if(license == vehicle.getLicense() && type == vehicle.size ){
//                return i;
//            }
//        }
//        return -1;
//    }
//    public static boolean removeCar(Vehicle vehicle){
//        int isCarpresent = searchCar(vehicle);
//        if(isCarpresent != -1){
//            carSpots.remove(isCarpresent);
//            return true;
//        }
//        return false;
//    }
//    public static boolean addCar(Vehicle vehicle){
//        if(getMotorCycleAvailableSpaces() <= 10 && vehicle.size == "Small"){
//            vehicle.add(vehicle)
//            return true;
//        }
//        if(getCarAvailableSpaces() <= 30 && vehicle.size == "Medium"){
//            vehicle.add(vehicle)
//            return true;
//        }
//        return false;
//    }
    // just considering assiging a generic type to arrayList in order
    // to reduce duplicate code. It won't work in my opinion
    // must research it on my own time for generics.
    //  public static boolean addCar(Car vehicle, ArrayList<T> vehicle){
    //        if(getAvailableSpaces() <= 30){
    //            carSpots.add(vehicle);
    //            return true;
    //        }
    //        return false;
    //    }


    public static boolean addCar(Car vehicle){
        if(getAvailableSpaces() <= 30){
            carSpots.add(vehicle);
            return true;
        }
        return false;
    }

    public static boolean addMotorCycle(Motorcycle vehicle){
        if(motorCycles.size() <= defaultMotorCycleSpots){
            motorCycles.add(vehicle);
            return true;
        }
        return false;
    }

    public static int searchCar(Vehicle vehicle){
        for(int i = 0; i < carSpots.size(); i++){
            String license = carSpots.get(i).getLicense();
            if(license == vehicle.getLicense()){
                return i;
            }
        }
        return -1;
    }

    public static int searchMotorCycle(Motorcycle vehicle){
        for(int i = 0; i < motorCycles.size(); i++){
            String license = motorCycles.get(i).getLicense();
            if(license == vehicle.getLicense()){
                return i;
            }
        }
        return -1;
    }

    public static boolean removeCar(Car vehicle){
        int isCarpresent = searchCar(vehicle);
        if(isCarpresent != -1){
            carSpots.remove(isCarpresent);
            return true;
        }
        return false;
    }
    public static boolean removeMotorCycle(Motorcycle vehicle){
        int isMotorCyclePresent = searchMotorCycle(vehicle);
        if(isMotorCyclePresent != -1){
            motorCycles.remove(isMotorCyclePresent);
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Car car1 = new Car("tekgken", Size.Medium);
        Car car2 = new Car("rerewrr", Size.Medium);
        Motorcycle car3 = new Motorcycle("rervfsr", Size.Small);
        System.out.println("Added Car1 -> " + addCar(car1));
        System.out.println("Added Car2 -> " +addCar(car2));
        System.out.println("Added Car3 -> " + addMotorCycle(car3));
        System.out.println("Search Car2 " + searchCar(car2));
        System.out.println("Delete Car1 -> " + removeCar(car1));
        System.out.println("Search Car1 " + searchCar(car1));


    }
}
