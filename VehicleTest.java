public class VehicleTest {
        public static void main(String[] args){
            Car car1 = new Car("Toyota", "Camry", 2024);
            Car car2 = new Car("Tesla", "Roadster", 2026);
            Truck truck1 = new Truck("Ford", "F-150", 2023);
            Truck truck2 = new Truck("Chevy", "Ram 1500", 2023);

            displayCarInformation(car1);
            displayCarInformation(car2);
            
            displayTruckInformation(truck1);
            displayTruckInformation(truck2);

        }

        public static void displayCarInformation(Car v){
            System.out.println("Vehicle Information\n-------------------");
            v.displayInfo();
            v.displayType();
            System.out.println();
        }

        public static void displayTruckInformation(Truck v){
            System.out.println("Vehicle Information\n-------------------");
            v.displayInfo();
            v.displayType();
            System.out.println();
        }
}
