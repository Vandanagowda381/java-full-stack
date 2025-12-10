class A{
    A(){  //constructor no methods
        System.out.println("hello");
    }
    A(int A){
        System.out.println(A);
    }
    A(int A ,int B){
        System.out.println(A+""+B);
    }
}
public class constructor {
    public static void main(String[]args){
        A obj=new A();
        A obj1=new A(4);
        A obj2=new A(2,7);
    }
}
