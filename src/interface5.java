interface A30{
    default int demo0(int a,int b){
        return a+b;
    }
    static void demo9(){
        System.out.println("static method");
    }
}
class demo80 implements A30{
}
public class interface5 {
    public static void main(String[] args){
        demo80 obj=new demo80();
        System.out.println(obj.demo0(3,3));
        A30.demo9();
    }
}
