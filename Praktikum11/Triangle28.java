import java.util.Scanner;
public class Triangle28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n: ");
        int n = sc.nextInt();
        int i = 0;

        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
