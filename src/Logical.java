import java.util.Scanner;

public class Logical {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter a value :");
            int a = sc.nextInt();
            System.out.print("enter b value :");
            int b = sc.nextInt();
            System.out.println(a > b && a == 0);  //logical and
            System.out.println(a <= 2 || b > a);   //logical or
            System.out.println(a <= 2 || b > a);
        }
}
