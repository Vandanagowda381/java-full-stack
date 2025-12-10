import java.util.Scanner;

class  persons{
    public void details(String name,int age){
        System.out.println(name+" "+age);
    }
}

public class pre {
    public static void main(String[] args){
        persons obj=new persons();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age and name :");
        String name=sc.nextLine();
        int age=sc.nextInt();
        obj.details(name,age);
    }
}
