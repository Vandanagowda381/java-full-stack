abstract class dem{
    abstract void display(); //abstract method
    abstract void show();
    void java(){
        System.out.println("vandana nachiketh chapriiiii");
    }
}
class demo1 extends dem{
    void display(){
        System.out.println("abstraction   ");
    }
    void show(){
        System.out.println("abstract method and class");
    }
}
public class abstract1
{
    public static void main(String[] args){
        demo1 obj=new demo1();
        obj.show();
        obj.display();
        obj.java();
    }
}
