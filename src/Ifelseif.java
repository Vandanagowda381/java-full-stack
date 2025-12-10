import java.util.Scanner;

public class Ifelseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the a :");
        int a = sc.nextInt();
        System.out.print("enter the b :");
        int b = sc.nextInt();
        System.out.print("enter the c :");
        int c = sc.nextInt();

        if (a>b && b>c) {
            System.out.println("a is grater"+a);
        } else if (b>a && b>c) {
            System.out.println("b is larger"+b);
        } else {
            System.out.println("c is larger"+c);
        }
    }
}