package Praktikum05;
import java.util.Scanner;
public class ProjectPemilihan1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input kondisi barang : ");
        String kondisiBarang = sc.nextLine();

        switch (kondisiBarang.toLowerCase()){
            case "hilang":
                System.out.print("Barang hilang termasuk kerugian pegawai.");
                break;
            case "rusak":
                System.out.print("Barang rusak termasuk kerugian perusahaan.");
                break;
            case "kadaluwarsa":
                System.out.print("Barang kadaluwarsa termasuk kerugian perusahaan.");
                break;
            default:
                System.out.print("Kondisi barang tidak valid.");
        }
    }
}
