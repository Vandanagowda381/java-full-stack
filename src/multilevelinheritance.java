class a1{
    public void demo1(){
        System.out.println("grand parent");
    }
}
class b1 extends a1{
    public void demo2() {
       System.out.println("parent and child");
    }
}
class c1 extends b1{
    public void demo3(){
        System.out.println("child");
    }
}
public class multilevelinheritance {
    public static void main(String[] args){
        c1 obj=new c1();
        obj.demo3();
        obj.demo2();
        obj.demo1();
    }
}
