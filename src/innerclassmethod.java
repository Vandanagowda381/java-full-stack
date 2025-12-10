class outer4{
    void demo8() {
        System.out.println("method1");
        class inner4{
            void demo9(){
                System.out.println("method");            }
        }
        inner4 obj1=new inner4();
        obj1.demo9();
    }
}
public class innerclassmethod {
    public static void main(String[] args){
        outer4 obj=new outer4();
        obj.demo8();
    }
}
