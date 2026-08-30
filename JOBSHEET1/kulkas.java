public class kulkas {
    // Atribut
    // protected fungsi agar bisa diakses oleh kelas turunan
    protected int dayaListrik; // dalam watt
    protected int suhuMinimal; 

    // Konstruktor
    public kulkas(int dayaListrik, int suhuMinimal) {
        this.dayaListrik = dayaListrik;
        this.suhuMinimal = suhuMinimal;
    }

    // method 1
    public void nyalakan() {
        System.out.println("Kulkas dinyalakan.");
    }

    // method 2
    public void matikan() {
        System.out.println("Kulkas dimatikan.");
    }

    // method 3
    public void cetakInformasi() {
        System.out.println("Daya Listrik: " + dayaListrik + " watt");
        System.out.println("Suhu Minimal: " + suhuMinimal + " °C");
    }
}
