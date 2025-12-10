import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a value :");
        int a=sc.nextInt();
        System.out.print("enter b value :");
        int b=sc.nextInt();
        System.out.println("Addition "+(a+b));
        System.out.println("Substration "+(a-b));
        System.out.println("multiplication "+(a*b));
        System.out.println("devision "+(a/b));
        System.out.println("modul "+(a%b));
        System.out.println("post incriment "+(a++));
        System.out.println("post decrement "+(a--));
        System.out.println("pre increment "+(++b));
        System.out.println("pre decrement "+(--b));

    }
}
