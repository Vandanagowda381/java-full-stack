interface grandparent{
    void add(int a,int b);
}
interface parent2 extends grandparent{
    void sub(int a,int b );
}
interface parent3 extends grandparent{
    void mul(int a,int b);
}
class child6 implements grandparent{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void sub(int a,int b){
        System.out.println(a-b);
    }
    public void mul(int a,int b){
        System.out.println(a*b);
    }
}
public class multilevlinterface {
    public static void main(String[] args){
        child6 obj=new child6();
        obj.add(5,6);
        obj.sub(2,3);
        obj.mul(2,3);
    }
}
