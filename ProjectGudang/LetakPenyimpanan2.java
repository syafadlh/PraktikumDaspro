
import java.util.Scanner;
public class LetakPenyimpanan2 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String jenisProduk, detailProduk, letakPenyimpanan = " ";

        System.out.print("Masukkan jenis produk: ");
        jenisProduk = sc.nextLine();

        System.out.print("Masukkan detail produk: ");
        detailProduk = sc.nextLine();

         if (jenisProduk.equalsIgnoreCase("Makanan")) {
            if (detailProduk.equalsIgnoreCase("Segar")){
                letakPenyimpanan = "Rak Makanan Segar";
            } else {
                letakPenyimpanan = "Rak Makanan Kering";
            }
        } else if (jenisProduk.equalsIgnoreCase("Minuman")) {
            if (detailProduk.equalsIgnoreCase("Kaleng")) {
                letakPenyimpanan = "Rak Minuman Kaleng";
            } else {
                letakPenyimpanan = "Rak Minuman Botol";
            }
        } else {
            System.out.println("Jenis produk tidak valid");
        }
        System.out.print("Letak Produk di " + letakPenyimpanan);
     }
}
      
        

