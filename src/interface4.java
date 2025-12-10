interface A3{
    default int demo0(int a,int b){
        return a+b;
    }
}
class demo8 implements A3{

}
public class interface4 {
    public static void main(String[] args){
        demo8 obj=new demo8();
        System.out.println(obj.demo0(2,3));
    }
}
