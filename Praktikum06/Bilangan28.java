package Praktikum06;
import java.util.Scanner;
public class Bilangan28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bil1, bil2, bil3;
        int bilanganTerbesar;

        System.out.print("Input Bil1 : ");
        bil1 = sc.nextInt();

        System.out.print("Input Bil2 : ");
        bil2 = sc.nextInt();

        System.out.print("Input Bil3 : ");
        bil3 = sc.nextInt();

        if ((bil1 >= bil2) && (bil2 >= bil3)){
            System.out.println("Bilangan terbesar = " + bil1);
        }else if ((bil2 >= bil3) && (bil2 >= bil1)){
            System.out.println("Bilangan terbesar = " +bil2);
        } else{
            System.out.println("Bilangan terbesar = " + bil3);
        }
    }
}
