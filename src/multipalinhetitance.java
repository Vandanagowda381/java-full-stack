interface A2{
    void add(int a, int b);
}
interface C{
    void sub(int c,int d);
}
class demo0 implements A2,C{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void sub(int a,int b){
        System.out.println(a*b);
    }
}
public class multipalinhetitance {
    public static void main(String[] args){
        demo0 obj=new demo0();
        obj.sub(2,4);
        obj.add(3,5);
    }
}
