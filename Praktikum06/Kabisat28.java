package Praktikum06;
import java.util.Scanner;
public class Kabisat28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tahun;

        System.out.print("masukkan tahun : ");
        tahun = sc.nextInt();
        if((tahun % 4) == 0 && (tahun % 100) != 0){
            System.out.println("Tahun Kabisat");
        }else{
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}
