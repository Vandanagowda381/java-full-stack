import java.util.Scanner;

public class amsterdom {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number   :");
        int num =sc.nextInt();  //153
        int n=num;
        int r=0;
        while(num!=0) {
            int a = num % 10;
            r = r + a * a* a;
            num = num / 10;
        }
        if(n==r)
        {
            System.out.print("number is amsterdom ");
        }
        else {
            System.out.print("number is not amsterdom  ");
        }
    }
}

