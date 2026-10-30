public class Vehicle {
    private String make;
    private String model;
    private int year;

    Vehicle(String mk, String md, int y){
        make = mk;
        model = md;
        year = y;
    }

    public String getMake(){
        return make;
    }
    public void setMake(String m){
        make = m;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String m){
        model = m;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int y){
        year = y;
    }
    public void displayInfo(){
        System.out.println("Make: " + make + " \nModel: " + model + " \nYear: " + year);
    }
}
