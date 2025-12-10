interface o{
    int a=3;
    static int b=34; //in interface static and final variable
    final int c=12;
}
public class interface2 {
    public static void main(String[] args){
        System.out.println(o.a);
        System.out.println(o.b);
        System.out.println(o.c);

    }
}
