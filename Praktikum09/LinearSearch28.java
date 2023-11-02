package Praktikum09;
import java.util.Scanner;
public class LinearSearch28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        int banyakElemen;
        int[] hasilArray = new int[5];
        int jumlahHasil = 0;

        System.out.print("Masukkan banyaknya elemen array: ");
        banyakElemen = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" + i + ": ");
            arrayInt[i] = sc.nextInt();
        }
        System.out.print("Masukkan key yang ingin dicari: ");
        int key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasilArray[jumlahHasil] = i;
                jumlahHasil++;
            }
        }
        if (jumlahHasil > 0) {
            System.out.print("Key ditemukan di posisi indeks: ");
            for (int i = 0; i < jumlahHasil; i++) {
                System.out.print(hasilArray[i]);
                if (i < jumlahHasil - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Key tidak ditemukan dalam array.");
        }
    }
}
