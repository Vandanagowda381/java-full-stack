import java.util.Scanner;

import java.util.Scanner;

public class array5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int size= sc.nextInt();
        int[] array=new int[size];
        System.out.println("enter the number :");
        for (int i=0;i<array.length;i++){
            array[i]= sc.nextInt();
        }
        int sum=10;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }
        System.out.println("sum :"+sum);
        int avg=sum/size;
        System.out.println("avg :"+avg);


    }
}