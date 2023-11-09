package Praktikum10;
import java.util.Scanner;
public class BioskopWithScanner28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("- Menu 1 : Input data penonton");
            System.out.println("- Menu 2 : Tampilkan daftar penonton");
            System.out.println("- Menu 3 : Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menuPilihan = sc.nextInt();
            sc.nextLine();

            switch (menuPilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        if (baris >= 1 && baris <= penonton.length) {
                            break;
                        } else {
                            System.out.println("Nomor baris tidak tersedia.");
                        }
                    }
                    while (true) {
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        if (kolom >= 1 && kolom <= penonton[0].length) {
                            break;
                        } else {
                            System.out.println("Nomor kolom tidak tersedia.");
                        }                   
                    }
                    sc.nextLine();
                    if (penonton[baris - 1][kolom - 1] == null) {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Kursi telah diisi oleh " + nama);
                    } else {
                        System.out.println("Maaf, kursi sudah terisi.");
                    }
                    break;

                case 2:
                    System.out.println("Daftar Penonton: ");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i+1) + ", Kolom " + (j+1) + ": " + penonton[i][j]);
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid.");
            }
            System.out.print("Kembali ke menu utama? (y/n): ");
            next = sc.nextLine();

            if (!next.equalsIgnoreCase("y")) {
                break;
            }
        }     
    }
}


