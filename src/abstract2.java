import java.util.Scanner;

abstract class ab{
    abstract void person(String namej,int agej);
}
class af extends ab{
    void person(String namej,int agej){
        System.out.println(namej+" "+agej);
    }
}
public class abstract2 {
    public static void main(String[] args){
        af obj=new af();
        obj.person("vandana",22);

    }
}
