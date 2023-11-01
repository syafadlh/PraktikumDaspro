package Praktikum09;
import java.util.Scanner;
public class LinearSearch28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        int key, jumlahElemen;
        int hasil = -1;

        System.out.print("Masukkan jumlah elemen array: ");
        jumlahElemen = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" + i + ": ");
            arrayInt[i] = sc.nextInt();
        }
        System.out.print("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();

        for (int i = 0; i < jumlahElemen; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        if (hasil != -1) {
            System.out.print("Key ada di posisi indeks ke- " + hasil); 
        } else {
            System.out.print("Key tidak ditemukan");
        }
    }
}
