class outer8{
    void V1(){
        System.out.println("hshv");
    }
    static class inner80{
        void demo10(){
            System.out.println("static nested class");
        }
    }
}
public class innerstatic {
    public static void main(String[] args){
        outer8.inner80 obj=new outer8.inner80();
        outer8 obj1=new outer8();
        obj.demo10();
        obj1.V1();
    }
}
