import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the a :");
        int a = sc.nextInt();
        System.out.print("enter the b :");
        int b = sc.nextInt();
        System.out.print("enter the c :");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("a is grater");
            } else {
            System.out.println("c is grater");
        }
    }else{
        if (b > c) {
            System.out.println("b is grater");
        } else {
            System.out.println("b is grater");
        }
        }
    }
}