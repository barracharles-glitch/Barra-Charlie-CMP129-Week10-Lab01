public class Car extends Vehicle {

    public Car(String make, String model, int year){
        super(make,model,year);
    }

    public void displayType(){
        System.out.println("This is a car");
    }    
}
