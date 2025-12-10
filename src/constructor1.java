import java.util.Scanner;

class math{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b) {
        return a * b;
    }
    public int div(int a,int b) {
        return a / b;
    }
}
public class constructor1 {
    public static void main(String[] args){
        math obj=new math();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for a :");
        int a=sc.nextInt();
        System.out.println("enter the value for b :");
        int b=sc.nextInt();
        System.out.println("add  :"+(a+b));
        System.out.println("add   :"+(a-b));
        System.out.println("add   :"+(a*b));
        System.out.println("add   :"+(a/b));

    }

}

