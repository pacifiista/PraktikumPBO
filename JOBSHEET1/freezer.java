public class freezer extends kulkas {
    // atribut tambahan
    private int kapasitasKilo;
    private boolean adaKunciPintu;

    // konstruktor
    public freezer(int dayaListrik, int suhuMinimal, int kapasitasKilo, boolean adaKunciPintu) {
        super(dayaListrik, suhuMinimal); // Memanggil konstruktor dari kelas induk
        this.kapasitasKilo = kapasitasKilo;
        this.adaKunciPintu = adaKunciPintu;
    }

    // method 1
    public void adaKunciPintu() {
        this.adaKunciPintu = true;
        System.out.println("Kunci pintu freezer tersedia.");

    }

    // method 2
    public void dibekukanCepat() {
        System.out.println("Makanan sedang dibekukan dengan cepat.");
    }

    // method 3
    @Override // fungsi override untuk menampilkan informasi tambahan
    public void cetakInformasi() {
        System.out.println("=== Informasi Freezer ===");
        System.out.println();
        super.cetakInformasi(); // Memanggil method cetakInformasi dari kelas induk
        System.out.println("Kapasitas: " + kapasitasKilo + " kg");
        System.out.println("Ada Kunci Pintu: " + (adaKunciPintu ? "Terkunci" : "Tidak Terkunci"));
    }
}
