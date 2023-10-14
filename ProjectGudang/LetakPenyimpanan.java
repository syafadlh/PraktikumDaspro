package ProjectGudang;
import java.util.Scanner;
public class LetakPenyimpanan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String jenisProduk, detailProduk, letakProduk = " ";

        System.out.print("Masukkan jenis produk: ");
        jenisProduk = sc.nextLine();

        System.out.print("Masukkan detail produk: ");
        detailProduk = sc.nextLine();

        if (jenisProduk.equalsIgnoreCase("makanan minuman")){
            if (detailProduk.equalsIgnoreCase("makanan")){
                letakProduk = "rak 1";
            } else {
                letakProduk = "kulkas/rak 2";
            }
        } else if(jenisProduk.equalsIgnoreCase("kesehatan kecantikan")){
            if (detailProduk.equalsIgnoreCase("kesehatan")){
                letakProduk = "rak 3";
            } else {
                letakProduk = "rak 4";
            }
        } else {
            System.out.println("jenis prosuk tidak valid");
        }   
        System.out.print("Letak produk di " + letakProduk);
        }
    }
    

