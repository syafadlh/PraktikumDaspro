import java.util.Scanner;
public class NestedLoop28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kota: ");
        int jumlahKota = sc.nextInt();

        System.out.print("Masukkan jumlah suhu untuk setiap kota: ");
        int jumlahSuhu = sc.nextInt();

        double[][] suhu = new double[jumlahKota][jumlahSuhu];

        for (int i=0; i < suhu.length; i++) {
            System.out.println("KOTA KE-" + (i+1));

            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print(" Suhu ke-" + (j+1) + ": ");
                suhu[i][j] = sc.nextInt();
            }
        }
        // suhu foreach loop
        for (int i = 0; i < suhu.length;i++) {
            System.out.print("KOTA KE-" + (i+1) + ": ");
            double sum = 0.0; //menyimpan jumlah suhu untuk perhitungan rata-rata

            for (double temperature : suhu[i]) {
                System.out.print(temperature + " ");
                sum += temperature;
            }
            double average = sum / suhu[i].length;
            System.out.println("\nRata-rata: " + average);
        }
    }
}