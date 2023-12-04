package Praktikum13;
public class CobaArgs28 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hai, selamat datang");
        } else if (args.length == 2) {
            String nama = args[0];
            String tempat = args[1];
            System.out.println(("Hai " + nama));
            System.out.println("Selamat datang di " +tempat);
        }
    }
}
