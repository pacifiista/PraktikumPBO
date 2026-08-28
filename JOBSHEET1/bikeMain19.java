package JOBSHEET1;

public class bikeMain19 {

    public static void main(String[] args) {
        bike19 mountainBike1 = new bike19();
        bike19 mountainBike2 = new bike19();
        roadBike roadBike1 = new roadBike();


        // Objek 1
        System.out.println("=== Mountain Bike 1 ===");
        mountainBike1.setBrand("Trek");
        mountainBike1.speedAcceleration(10);
        mountainBike1.gearChanges(2);
        mountainBike1.printInfo();

        System.out.println(); // Pemisah output

        // Objek 2
        System.out.println("=== Mountain Bike 2 ===");
        mountainBike2.setBrand("Giant");
        mountainBike2.speedAcceleration(20);
        mountainBike2.gearChanges(3);
        mountainBike2.printInfo();

        System.out.println(); // Pemisah output

        // Objek 3
        System.out.println("=== Road Bike 1 ===");
        roadBike1.setBrand("Specialized");
        roadBike1.setTireWidth(25);
        roadBike1.speedAcceleration(15);
        roadBike1.gearChanges(4);
        roadBike1.printInfo();
    }

    
    
        
 }
