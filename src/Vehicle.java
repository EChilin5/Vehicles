enum Size {Small, Medium, Large, XLarge}
public class Vehicle {
    private String license;
    private Size size;

    public Vehicle(String license, Size size){
        this.license = license;
        this.size = size;
    }
    public String getLicense(){
        return  this.license;
    }
    public String getSize(){
        return this.size.toString();
    }
}
