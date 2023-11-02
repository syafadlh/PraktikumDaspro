package Praktikum09;
import java.util.Scanner;
public class ArrayNilai28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] nilaiAkhir = new int [10];
        int max = nilaiAkhir[0];
        int min;
        float nilaiRata, total = 0;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i+1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
            total += nilaiAkhir [i];

            if (nilaiAkhir[i] > max) {
                max = nilaiAkhir[i];
            }
        }
        min = nilaiAkhir[0];
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] < min) {
                min = nilaiAkhir[i];   
            }
            if (nilaiAkhir[i] > 70) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Nilai akhir mahasiswa ke-" + (i+1) + " lulus ");
            } else {
                System.out.println("Nilai akhir mahasiswa ke-" + (i+1) + " tidak lulus ");
            }  
        }
        nilaiRata = total/10;
        System.out.println("Hasil nilai rata-rata adalah: " + nilaiRata);
        System.out.println("Hasil nilai tertinggi adalah: " + max);
        System.out.println("Hasil nilai terendah adalah: " + min);
        System.out.println("Jumlah mahsaiswa yang lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jumlahTidakLulus);
    }   
}
