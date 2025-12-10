import java.util.Scanner;

public class Turnary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a value :");
        int a = sc.nextInt();
        System.out.print("enter b value :");
        int b = sc.nextInt();
        int r = (a > b) ? a : b;
        System.out.println(r);
    }
}
