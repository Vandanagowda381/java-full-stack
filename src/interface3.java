interface du{
    int a=3;
    static int b=34; //in interface static and final variable
    final int c=12;
}
class demo7 implements du{

}
public class interface3 {
    public static void main(String[] args){
        demo7 obj=new demo7();
        System.out.println(obj.a);
        System.out.println(du.b);//object is not required
        System.out.println(du.c);

    }
}











