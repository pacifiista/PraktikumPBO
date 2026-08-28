package JOBSHEET1;

public class bike19 {
    private String brand; //meneklarasikan variabel brand
    private int speed; //meneklarasikan variabel speed
    private int gear = 1; //meneklarasikan variabel gear dengan nilai awal 1

    private final int[] GEAR_SPEED_LIMITS = {5, 10, 25, 30, 40, 60};

    public void setBrand(String brandName) {
        this.brand = brandName; //menetapkan nilai brand
    }

    public void gearChanges(int gearValue) {
        // PERBAIKAN: Gunakan && agar bernilai true jika di rentang 1 sampai 6
        if (gearValue >= 1 && gearValue <= 6) { //mengecek apakah gearValue berada di antara 1 dan 6
            this.gear = gearValue;
        } else {
            System.out.println("Invalid gear. Please select a gear between 1 and 6.");
        }
    }

    public int speedAcceleration(int increment) { //menambahkan kecepatan
        speed += increment;
        if (speed > GEAR_SPEED_LIMITS[gear - 1]) {
            speed = GEAR_SPEED_LIMITS[gear - 1];
        }
        return speed;
    }

    public int speedDeceleration(int decrement) { //mengurangi kecepatan
        speed -= decrement; 
        if (speed < 0) {
            speed = 0;
        }
        return speed;
    }

    public void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Current Speed: " + speed + " km/h");
        System.out.println("Current Gear: " + gear);
    }
}