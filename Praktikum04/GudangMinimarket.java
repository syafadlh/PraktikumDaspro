import java.util.Scanner;
public class GudangMinimarket {
    public static void main(String[] args) {
        
  

        Scanner sc = new Scanner(System.in);

        //deklarasi variabel
        int stok, barangMasuk, barangKeluar, total1, total2;
        stok = 500;

        //statement untuk membaca nilai
        System.out.println("Jumlah stok barang;" +stok);

        System.out.println("Masukkan jumlah barang yang baru masuk; ");
        barangMasuk = sc.nextInt();

        total1 = stok + barangMasuk;
        System.out.println("stok: " + total1);

        System.out.println("Masukkan jumlah barang yang baru keluar; ");
        barangKeluar = sc.nextInt();
        total2 = total1 - barangKeluar;
        System.out.println("stok akhir; " + total2);
      }
    
}
