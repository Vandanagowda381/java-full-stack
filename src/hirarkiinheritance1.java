interface bird{
    void bird(String color,int age);
}
interface dove extends bird{
    void dove(String color);
}
interface crow extends bird{
    void crow(String color);
}
class birds3 implements bird,crow,dove{
    public void bird(String color,int age){
        System.out.println("color :"+color+"age :"+age);
    }
    public void dove(String color){
        System.out.println("color :"+color);
    }
    public void crow(String color){
        System.out.println("color :"+color);
    }
}
public class hirarkiinheritance1 {
    public static void main(String[]args){
        birds3 obj=new birds3();
        obj.bird("red",  2);
        obj.dove("white");
        obj.crow("black");
    }
}
