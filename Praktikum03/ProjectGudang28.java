import java.util.Scanner;
    public class ProjectGudang28{
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);


            //deklarasi variabel alas tinggi
            int stok, barangmasuk, barangkeluar;
            int total;

            //statement untuk membaca nilai
            System.out.println("Masukkan stok barang: ");
            stok = sc.nextInt();
            System.out.println("Masukkan Jumlah barang yang baru masuk; ");
            barangmasuk = sc.nextInt();
            System.out.println("Masukkan jumlah barang yang keluar; ");
            barangkeluar = sc.nextInt();

            //operasi
            total = stok + barangmasuk - barangkeluar;
            System.out.println("Total stok: " + total);
        }
    }