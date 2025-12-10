import java.util.Scanner;

public class gradeswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Marks  :");
        int grade = sc.nextInt();
        switch (grade) {
            case 90:
                System.out.println("A");
                break;
            case 80:
                System.out.println("B");
                break;
            case 70:
                System.out.println("C");
                break;
            case 60:
                System.out.println("D");
                break;
            case 50:
                System.out.println("E");
                break;
            case 40:
                System.out.println("F");
                break;
            case 30:
                System.out.println("G");
                break;
            default:
                System.out.println("fail");
                break;
        }
    }
}
