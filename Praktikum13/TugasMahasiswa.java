package Praktikum13;
import java.util.Scanner;
public class TugasMahasiswa {
    static Scanner sc = new Scanner(System.in);
    static int[][] nilai;
    static String[] nama;

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah minggu: ");
        int jumlahMinggu = sc.nextInt();

        nilai = new int[jumlahMahasiswa][jumlahMinggu];
        nama = new String[jumlahMahasiswa];

        inputNamaMahasiswa();
        System.out.printf("=======================================%n");
        inputNilai();
        System.out.printf("=======================================%n");
        tampilNilai();
        System.out.printf("=======================================%n");
        mingguTertinggi();
        System.out.printf("=======================================%n");
        mahasiswaTertinggi();        
    }
    public static void inputNamaMahasiswa() {
        for (int i = 0; i < nama.length; i++) {
            System.out.print("Masukkan nama mahasiswa ke- " + (i+1) + ": ");
            nama[i] = sc.next();
        }
    }
    public static void inputNilai() {
       for (int i = 0; i < nilai.length; i++) {
        System.out.println("Masukkan nilai untuk " + nama[i] + ": ");
        for (int j = 0; j < nilai[i].length; j++) {
            System.out.print("Minggu ke-" + (j+1) + ": ");
            nilai[i][j] = sc.nextInt();
            }
        }
    }
    public static void tampilNilai() {
        for (int i = 0; i < nama.length; i++) {
            System.out.print(nama[i] + ": ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j]);
                if (j < nilai[0].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
    public static void mingguTertinggi() {
        int maxValue = nilaiTertinggi(nilai);
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                if (nilai[i][j] == maxValue) {
                    System.out.println("Nilai tertinggi pada minggu ke-" + (j+1));
                }
            }
        }
    }
    public static void mahasiswaTertinggi() {
        int maxValue = nilaiTertinggi(nilai);
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                if (nilai[i][j] == maxValue) {
                    System.out.println("Mahasiswa dengan nilai tertinggi adalah " + nama[i] + " dengan nilai " + maxValue);
                }
            }
        }
    }
    static int nilaiTertinggi(int[][] array) {
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array [i][j];
                }
            }
        }
        return maxValue;
    }
}