import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int R,G,B;
        Scanner read= new Scanner(System.in);

        System.out.println("ENTER A NUMBER FOR R: ");
        R = read.nextInt();
        if (R >= 40 && R < 80) {
            System.out.println("R is = " + R);
        } else {
            System. exit(0);
        }
        ;
        System.out.println("ENTER A NUMBER FOR G: ");
        G = read.nextInt();
        if (G < 30 && G >= 0) {
            System.out.println("G is = " + G);
        } else {
            System. exit(0);
        }
        ;
        System.out.println("ENTER A NUMBER FOR B: ");
        B = read.nextInt();
        if (B < 20 && B > -1) {
            System.out.println("B is = " + B);
        } else {
            System. exit(0);
        }
        ;
        System.out.println("============================");
        System.out.println("R-G-B is = " + R +"-"+ G +"-"+ B);
        System.out.println("============================");
        System.out.println("Thanks¡¡");

    }
}