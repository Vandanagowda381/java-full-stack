class class1{
    int student_id=408085;
    String student_name="harshan gowda";
    int student_age=23;
    long number=8123275900l;
    float height=6.2f;
}
class  clas2{
    int cstudent_id=635635;
    String cstudent_name="harshan gowda";
    int cstudent_age=23;
    long cnumber=8123275900l;
    float cheight=6.2f;
}
public class oops1 {
    public static void main(String[] args){
        class1 obj=new class1();
        clas2  obj1=new clas2();
        System.out.println("student_id is :"+obj1.cstudent_id);
        System.out.println("student_id is :"+obj1.cstudent_name);
        System.out.println("student_id is :"+obj1.cstudent_age);
        System.out.println("student_id is :"+obj1.cnumber);
        System.out.println("student_id is :"+obj1.cheight);
        System.out.println("student_id is :"+obj.student_id);
        System.out.println("student_id is :"+obj.student_name);
        System.out.println("student_id is :"+obj.student_age);
        System.out.println("student_id is :"+obj.number);
        System.out.println("student_id is :"+obj.height);
    }
}




