import java.util.Scanner;
public class Perulangan1Gudang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int jumlahBarang, barangKeluar, jumlahBarangMinim;

        System.out.print("Masukkan jumlah barang: ");
        jumlahBarang = sc.nextInt();
        System.out.print("Masukkan jumlah barang minim: ");
        jumlahBarangMinim = sc.nextInt();

        int i = 0;
        while (true) {
            System.out.print("Masukkan jumlah barang keluar hari ke-" + (i+1) + ": ");
            barangKeluar =sc.nextInt();

            i++;

            jumlahBarang -= barangKeluar;
            System.out.println("Sisa barang saat ini: " + jumlahBarang);

            if (jumlahBarang <= jumlahBarangMinim) {
                System.out.println("Jumlah barang sudah mencapai batas minimum");
                break;
            }
        }
    }
}
