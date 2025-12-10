import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number   :");
        int num =sc.nextInt();
        int n=num;
        int r=0;
        while(num!=0) {
            int a = num % 10;
            r = r * 10 + a;
            num = n / 10;
        }
        if(n==r)
        {
            System.out.print("number is palindrome  ");
        }
        else {
            System.out.print("number is not palindrome  ");
        }
    }
}
