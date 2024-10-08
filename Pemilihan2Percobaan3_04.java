import java.util.Scanner;

public class Pemilihan2Percobaan3_04 {
    public static void main(String[] args) {
        Scanner empat = new Scanner(System.in);

        String katagori;
        int penghasilan, gajiBersih;
        double pajak;

        System.out.println("Masukkan Katagori Penghasilan : ");
        katagori = empat.nextLine();
        System.out.println("Masukkan Penghasilan : ");
        penghasilan = empat.nextInt();

        System.out.println("==========Penghasilan Pajak Penghasilan==========");

        if (katagori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <=2000000) {
                pajak = 0.1;
            }else if (penghasilan <=3000000){
                pajak = 0.15;
            }else{
                pajak = 0.2;
            }
            gajiBersih = (int)(penghasilan-(pajak*penghasilan));
            System.out.println("Gaji Bersih Pekerja " + gajiBersih);

        }else if(katagori.equals("pebisnis")){
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            }else if(penghasilan <=3500000){
                pajak = 0.2;
            }else{
                pajak=0.25;
            }
            gajiBersih = (int)(penghasilan-(pajak*penghasilan));
            System.out.println("Gaji Bersih Pembisnis " + gajiBersih);
        }else{
            System.out.println("Masukkan Kategori Salah");
        }
    }
}

// import java.util.Scanner;

// public class Pemilihan2Percobaan316{
//     public static void main(String[] args) {

//         Scanner scanner16 = new Scanner(System.in);
//         String Kategori;
//         int Penghasilan, GajiBersih;
//         double pajak = 0;

//         System.out.println("masukkan kategori");
//         Kategori = scanner16.nextLine();
//         System.out.println("masukkan besarnya penghasilan : ");
//         Penghasilan = scanner16.nextInt();

//         if (Kategori.equals("pekerja")) {
//             if (Penghasilan <= 2000000)
//                 pajak = 0.1;
//             else if (Penghasilan <= 3000000)
//                 pajak = 0.15;
//             else
//                 pajak = 0.2;
//             GajiBersih = (int) (Penghasilan - (pajak * Penghasilan));
//             System.out.println("penghasilbersih ; " + GajiBersih);

//         } else if (Kategori.equals("pebisnis")) {
//             if (Penghasilan <= 2500000) {
//                 pajak = 0.15;
//             }else if (Penghasilan <=3500000){
//                 pajak = 0.2;
//             }else{
//                 pajak = 0.25;
//             }
//             GajiBersih = (int) (Penghasilan - (pajak * Penghasilan));
//             System.out.println("penghasilan bersih : " + GajiBersih);
//         }else{
//             System.out.println("Masukkan Kategori Salah");
//         }
//     }
// }