import java.util.Scanner;

class ccat1{
    String colorj;
    String breedj;
    ccat1(String color,String breed){
        this.breedj=breed;
        this.colorj=colorj;
    }
    public void cdetails(){
        System.out.println(colorj+" "+breedj);
    }
}
class dog10 extends ccat1{
    String dname1;
    dog10(String dname1,String colorj,String breed){
        super(breed,colorj);
        this.dname1=dname1;
    }
    public void dcdetails(){
        System.out.println(dname1+" "+colorj+" "+breedj);
    }
}public class singalinheritance2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name breed color and name");
        String breedj=sc.nextLine();
        String colorj= sc.nextLine();
        String dname1=sc.nextLine();
        dog10 obj=new dog10(breedj,colorj,dname1);
        obj.dcdetails();
    }
}
