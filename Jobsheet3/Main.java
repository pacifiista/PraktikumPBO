package Jobsheet3;

public class Main {
    public static void main(String[] args) {
       
        // --- Output Tugas Mandiri ---
        System.out.println("=== Output Tugas Mandiri ===");
        // Membuat akun Fajar dengan saldo 1000000 dan batas harian 200000
        Account19 limited = new Account19("A005", "Fajar", 1000000, 200000);
        
        // Coba tarik 300000 (seharusnya ditolak / false)[cite: 1]
        System.out.println("Withdraw 300000 allowed? " + limited.withdraw(300000));
    
        // Coba tarik 150000 (seharusnya berhasil / true)[cite: 1]
        System.out.println("Withdraw 150000 allowed? " + limited.withdraw(150000));
        
        // Cetak info terakhir
        limited.printInfo();

    }
}

 // // Menambahkan titik koma dan menyesuaikan nilai saldo menjadi 500000
        // Account19 acc = new Account19("A001", "Nadia", 500000, 200000);
        
        // // Memanggil fungsi dari Langkah 2
        // acc.withdraw(150000);
        // acc.printInfo();

        // System.out.println(); // Sekadar memberi jarak (enter) di terminal
