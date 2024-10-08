import java.util.Scanner;

public class Pemilihan2Percobaan1_04 {
    public static void main(String[] args) {

        Scanner empat = new Scanner(System.in);
        int tahun;

        System.out.println("==========Menghitung Tahun Kabisat=========");

        System.out.println("Masukkan Tahun Kabisat : ");
        tahun = empat.nextInt();

        // // FRIST
        // if (tahun % 4 == 0) {
        //     if (tahun % 100 != 0) {
        //         System.out.println(tahun + " Adalah Tahun kabisat");
        //     } else {
        //         System.out.println(tahun + " Bukan Tahun kabisat");
        //     }
        // } else {
        //     System.out.println(tahun + " Bukan Tahun kabisat");
        // }

        // MODIFIKASI CODE
        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) {
                    System.out.println(tahun + " Adalah Tahun kabisat");
                } else {
                    System.out.println(tahun + " Bukan Tahun kabisat");
                }
            } else {
                System.out.println(tahun + " Adalah Tahun kabisat");
            }
        } else {
            System.out.println(tahun + " Bukan Tahun kabisat");
        }
    }
}
//     }
// }
