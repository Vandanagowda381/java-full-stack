import java.util.Scanner;

public class returnstatement{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String name=sc.nextLine();
        System.out.println("enter the age");
        int age=sc.nextInt();
        System.out.println("Student name is "+name+" student age is "+age+" ");
    }
}
