public class Truck extends Vehicle {
    public Truck(String make, String model, int year){
        super(make,model,year);
    }

    public void displayType(){
        System.out.println("This is a truck");
    }
}
