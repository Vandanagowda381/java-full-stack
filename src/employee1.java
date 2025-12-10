import java.util.Scanner;

class company1 {
    public void empolye(String name, int salary, String role) {
        System.out.println(name + " " + salary + " " + role);
    }

    public void department( int DID,String deptname) {
        System.out.println("DID"+"  "+deptname);
    }
}
public class employee1 {
    public static void main(String[] args){
        company1 obj=new company1();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the details of employ");
        System.out.println("enter the name");
        String name=sc.nextLine();
        System.out.println("enter the salary");
        int salary=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the role");
        String role=sc.nextLine();


        System.out.println("enter the id");
        int DID=sc.nextInt();
        sc.nextLine();

        System.out.println(" enter the department name");
        String deptname=sc.nextLine();
        obj.empolye(name,salary,role);
        obj.department(DID,deptname);
    }
}