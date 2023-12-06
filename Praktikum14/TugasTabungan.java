package Praktikum14;
public class TugasTabungan {
    public static double tabunganRekursif(double modal, double tingkatKeuntungan, int tahun) {
        if (tahun == 0) {
            return modal;
        } else {
            double hasilTahunSebelumnya = tabunganRekursif(modal, tingkatKeuntungan, tahun - 1);
            return hasilTahunSebelumnya * (1 + tingkatKeuntungan / 100);
        }
    }
    public static double tabunganIteratif(double modal, double tingkatKeuntungan, int tahun) {
        double hasil = modal;
        for (int i = 0; i < tahun; i++) {
            hasil *= (1 + tingkatKeuntungan / 100);
        }
        return hasil;
    }
    public static void main(String[] args) {
        double modalAwal = 10000;
        double tingkatKeuntungan = 11.7;
        int tahun = 10;
        
        double hasilRekursif = tabunganRekursif(modalAwal, tingkatKeuntungan, tahun);
        System.out.println("Hasil investasi setelah " + tahun + " tahun (rekursif): " + hasilRekursif);

        double hasilIteratif = tabunganIteratif(modalAwal, tingkatKeuntungan, tahun);
        System.out.println("Hail investasi setelah " + tahun + " tahun (iteratif): " + hasilIteratif);
    }
}