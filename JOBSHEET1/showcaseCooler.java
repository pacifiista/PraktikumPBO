public class showcaseCooler extends kulkas { // Inheritance dari kelas kulkas

    // Atribut tambahan untuk showcaseCooler
    private int jumlahRak; // Jumlah rak dalam showcase cooler
    private boolean adaLampuLED;

    // Konstruktor
    public showcaseCooler(int dayaListrik, int suhuMinimal, int jumlahRak, boolean adaLampuLED) {
        super(dayaListrik, suhuMinimal); // Memanggil konstruktor dari kelas induk
        this.jumlahRak = jumlahRak;
        this.adaLampuLED = adaLampuLED;
    }

    // method 1
    public void pajangMinuman() {
        System.out.println("Minuman sedang dipajang di showcase cooler.");
    }

    // method 2
    public void nyalakanLampu(){
        this.adaLampuLED = true;
        System.out.println("Lampu LED dinyalakan.");
    }

    // method 3
    @Override // fungsi override untuk menampilkan informasi tambahan
    public void cetakInformasi() {
        System.out.println("=== Informasi Showcase Cooler ===");
        System.out.println();
        super.cetakInformasi(); // Memanggil method cetakInformasi dari kelas induk
        System.out.println("Jumlah Rak: " + jumlahRak + " buah");
        System.out.println("Ada Lampu LED: " + (adaLampuLED ? "Menyala" : "Mati"));
    }
}
