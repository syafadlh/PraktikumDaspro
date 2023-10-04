package Praktikum05;
import java.util.Scanner;
public class PemilihanOperator28 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator;

        System.out.print("Masukkan angka 1: ");
        angka1 = sc.nextDouble();
        System.out.print("Masukkan angka 2: ");
        angka2 = sc.nextDouble();
        System.out.print("Masukkan operator (+ - * :): ");
        operator = sc.next().charAt(0);

        if (operator  == '+'){
            System.out.println(hasil = angka1 + angka2);
        }
        else if (operator == '-'){
            System.out.println(hasil = angka1 - angka2);
        }    
        else if (operator == '*'){
            System.out.println(hasil = angka1 * angka2);
        }
        else{
            System.out.println(hasil = angka1 / angka2);
        }
    }  
}
