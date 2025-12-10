import java.util.Scanner;

public class array3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array elemets :");
        int size= sc.nextInt();
        int[] array=new int[size];
        System.out.println("enter the array elements  :");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=array[i];
        }
        System.out.println("sum is :"+sum);
        int avg=sum/size;
        for (int i=0;i<size;i++){
            avg=array[i];
        }
        System.out.println("avg is :"+avg);
    }
}
