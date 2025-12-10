import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the marks :");
        int marks = sc.nextInt();
        if(marks>90){
            System.out.println("a");
        } else if (marks>80) {
            System.out.println("b");
        } else if (marks>70) {
            System.out.println("c");
        } else if (marks>=60) {
            System.out.println("d");
        } else {
            System.out.println("F");
        }

    }

}
