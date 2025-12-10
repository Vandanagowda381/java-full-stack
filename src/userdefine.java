class java{
      void greet(){
        System.out.println("hello developer");
    }
    public int sub(int a,int b){
          return a-b;
}
    public int add(int x,int s){
          return x+s;
    }
}
public class userdefine {
    public static void main(String[] args){
        java obj=new java();
        obj.greet();
        int s=obj.sub(4,6);
        System.out.println(s);
        int l=obj.add(4,6);
        System.out.println(l);
    }
}
