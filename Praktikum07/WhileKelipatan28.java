package Praktikum07;
import java.util.Scanner;
public class WhileKelipatan28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bilangan, total = 0, counter = 0;

        System.out.print("Masukkan bilangan 1-9: ");
        bilangan = sc.nextInt();

        int i = 0;
        while (i < 50) {
            if (i % bilangan == 0) {
                total += i;
                counter++;
            } 
            i++;
        }
        System.out.printf("Pada retang 1-50 tersebut %d bilangan kelipatan %d dengan total %d", counter, bilangan, total);
    }
}
