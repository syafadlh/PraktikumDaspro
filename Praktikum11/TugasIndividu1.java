
import java.util.Scanner;
public class TugasIndividu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n (n > 2): ");
        int n = sc.nextInt();

        if (n <= 2) {
            System.out.println("Input harus lebih dari 2");
        } else {
            for (int i = 1; i <= n; i++) {
                String kosong = ""; //membuata string kosong untuk menyimpan angka dalam baris
                for (int j =1; j <= i; j++) {
                    kosong += j; //menambahkan angka ke dalam baris
                }
                //mencetak baris dengan spasi di awal sesuai dengan posisi baris
                for (int k = 0; k < n - i; k++) {
                    System.out.print(" ");
                }
                System.out.println(kosong);
            }
        }
    }
}