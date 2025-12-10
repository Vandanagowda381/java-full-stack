class math1{
    public int area(int s){
        return(s*s);
    }
    public int area(int l,int b){
        return (l*b);
    }
    public double area(double r){
        return 3.14*r*r;
    }
}
public class methodoverloding1 {
    public static void main(String[] args){
        math1 obj=new math1();
        System.out.println("area of squre"+obj.area(2));
        System.out.println("area of redtangal "+obj.area(3,4));
        System.out.println("area of circale "+obj.area(1.3));

    }
}
