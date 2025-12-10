class outer1{
    private int age=18;
    public class inner1{
        int getValue(){
            return age;
        }
    }
}
public class localinnerclass1
{
    public static void main(String[] args){
        outer1 obj=new outer1();
        outer1.inner1 obj2=obj.new inner1();
        System.out.println(obj2.getValue());
    }
}
