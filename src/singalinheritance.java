class parent{
    public void demo1(){
        System.out.println("hello parent");
    }
}
class child extends parent{
    public void demo2() {
        System.out.println("hello child and patrent");
    }
}
public class singalinheritance {
    public static void main(String[] args){
        parent obj=new parent();
        child obj2=new child();
        obj.demo1();;
        obj2.demo2();
    }
}
