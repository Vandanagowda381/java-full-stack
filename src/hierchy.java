class one{
    public void parent(){
        System.out.println("parent");
    }
}
class two2 extends one{
    public void child1(){
        System.out.println("child1");
    }
}
class three extends one{
    public void child2(){
        System.out.println("child2");
    }
}
public class hierchy {
    public static void main(String[] args){
        three obj=new three();
        obj.child2();
        obj.parent();
        two2 obj1=new two2();
        obj1.child1();
        obj1.parent();
    }
}
