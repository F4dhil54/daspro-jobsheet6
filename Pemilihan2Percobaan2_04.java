import java.util.Scanner;

public class Pemilihan2Percobaan2_04 {
    public static void main(String[] args) {
        Scanner empat = new Scanner(System.in);

        int pilihan_menu;
        String member;
        double diskon = 0, total_bayar, harga = 0;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = empat.nextInt();
        empat.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = emapat.nextLine();
        System.out.println("-------------------------");
        input.close();

        if (member.equals("y")) {
            diskon = 0.1;
            System.out.println("Mendapatkan Diskon 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Risbowl : " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Es teh : " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling : " + harga);
            } else {
                System.out.println("Masukan Pilihan menu dengan benar");
                return;
            }
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar dengan diskon : " + total_bayar);
        } else if (member.equalsIgnoreCase("n")) {
            System.out.println("Mencapatkan Diskon 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Risbowl : " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Es teh : " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling : " + harga);
            } else {
                System.out.println("Masukan Pilihan menu dengan benar");
                return;
            }
            System.out.println("Total bayar dengan diskon : " + harga);

        }
    }
}