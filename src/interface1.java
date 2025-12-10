interface v{
    void greet();
}
class demo2 implements v{
    public void greet(){
        System.out.println("this is interface ");
    }
}
public class interface1 {
    public static void main(String[] args){
        demo2 obj=new demo2();
        obj.greet();
    }
}
