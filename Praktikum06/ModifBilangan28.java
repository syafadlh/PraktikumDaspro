package Praktikum06;
import java.util.Scanner;
public class ModifBilangan28 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama : ");
        int bil1 = input.nextInt();

        System.out.print("Masukkan bilangan kedua : ");
        int bil2 = input.nextInt();

        System.out.print("Masukkan bilangan ketiga : ");
        int bil3 = input.nextInt();

        int bilanganTerbesar = (bil1 > bil2) ? ((bil1 > bil3) ? bil1 : bil3) : ((bil2 > bil3) ? bil2 : bil3);

        System.out.println("bilanganTerbesar : " + bilanganTerbesar);
    }
}
