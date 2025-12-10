class k1{
    public void mobile(){
        System.out.println("nokia c1");
    }
}
class v1 extends k1{
    public void mobile(){
        System.out.println("new phone");
    }
}
public class methodoverriding {
    public static void main(String[] args){
        v1 obj=new v1();
        obj.mobile();
    }
}

