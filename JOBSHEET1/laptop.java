public class laptop {
    // atribut
    private String prosesor;
    private int ram;

    // konstruktor
    public laptop(String prosesor, int ram) {
        this.prosesor = prosesor;
        this.ram = ram;
    }

    // method 1
    public void bukaAplikasi(String namaAplikasi) {
        System.out.println("Membuka aplikasi: " + namaAplikasi);
    }

    // method 2
    public void isiBaterai() {
        System.out.println("Baterai sedang diisi.");
    }   

    // method 3
    public void cetakInformasi() {
        System.out.println("=== Informasi Laptop ===");
        System.out.println("Prosesor: " + prosesor);
        System.out.println("RAM: " + ram + " GB");
    }
}
