class intrest{
    public int calculator(int p,int r){

        return p*r/100;
    }
    public int calculator(int p,int r,int t){
        return p*r*t/10;
    }
}
public class maths10 {
    public static void main(String[] args){
        intrest obj=new intrest();
        System.out.println("principale of intrest is :"+obj.calculator(40,30));
        System.out.println("principale of intrest with time is :"+obj.calculator(30,40,50));
    }
}
