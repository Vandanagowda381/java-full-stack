class j1{
    public void add(int a,int b){

        System.out.println(a+b);
    }
    public void add(int a,int b,int c){

        System.out.println(a+b+c);
    }
}
public class methodoverloding {
    public static void main(String[] args){
        j1 obj=new j1();
        obj.add(2,6);
        obj.add(2,3,4);
    }
}
