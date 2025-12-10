import java.util.Scanner;

public class Assinment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a value :");
        int a = sc.nextInt();
        System.out.print("enter b value :");
        int b = sc.nextInt();
        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a *= b);
        System.out.println(a /= b);
        System.out.println(a %= b);
        System.out.println(a &= b);
        System.out.println(a&=b);
        System.out.println(a|=b);
        System.out.println(a^=b);
        System.out.println(~a);
        System.out.println(a<<2);
        System.out.println(2>>a);

    }
}
