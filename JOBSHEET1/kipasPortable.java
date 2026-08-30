public class kipasPortable {
    // Atribut
    private int kecepatanAngin; // level 1-3
    private int kapasitasBaterai; // mAh

    // Konstruktor
    public kipasPortable(int kecepatanAngin, int kapasitasBaterai) {
        this.kecepatanAngin = kecepatanAngin;
        this.kapasitasBaterai = kapasitasBaterai;
    }

    // method 1
    public void aturKecepatan(int level) {
        this.kecepatanAngin = level;
        System.out.println("Kecepatan angin diatur ke level " + level);
    }

    // method 2
    public void isiBaterai() {
        System.out.println("Baterai sedang diisi.");
    }
    
    // method 3
    public void cetakInformasi() {
        System.out.println("=== Informasi Kipas Portable ===");
        System.out.println("Kecepatan Angin: " + kecepatanAngin + " (level)");
        System.out.println("Kapasitas Baterai: " + kapasitasBaterai + " mAh");
    }
}
