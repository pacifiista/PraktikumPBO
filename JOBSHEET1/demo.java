public class demo {
    public static void main(String[] args) {
        // Instansiasi objek kipasPortable
        kipasPortable kipas1 = new kipasPortable(2, 2000);
        kipas1.cetakInformasi();
        kipas1.aturKecepatan(3);
        kipas1.isiBaterai();
        System.out.println("======================================");

        System.out.println(); // Pemisah output

        // Instansiasi objek laptop
        laptop laptop1 = new laptop("Intel Core i7", 16);
        laptop1.cetakInformasi();
        laptop1.bukaAplikasi("Microsoft Word");
        laptop1.isiBaterai();
        System.out.println("======================================");

        System.out.println(); // Pemisah output

        // Instansiasi objek showcasecooler
        showcaseCooler cooler1 = new showcaseCooler(180, 2, 5, true);
        cooler1.cetakInformasi();
        cooler1.nyalakan();
        cooler1.pajangMinuman();
        cooler1.nyalakanLampu();
        cooler1.matikan();
        System.out.println("======================================");
        System.out.println(); // Pemisah output

        // Instansiasi objek freezer
        freezer freezer1 = new freezer(250, -18, 10, true);
        freezer1.cetakInformasi();
        freezer1.nyalakan();
        freezer1.adaKunciPintu();
        freezer1.dibekukanCepat();  
        freezer1.matikan();
    }
}
