class employee{
    String emp_name="vandana";
    int emp_id=012;
    int emply_salary=34567;
}
class department{
    int dep_id=001;
    String dep_name="civil";
}
public class oops4 {
    public static void main(String[] args){
        employee obj=new employee();
        department obj1=new department();
        System.out.println("name :"+ obj.emp_name+"emp_id  :"+ obj.emp_id+"emply salary  :"+obj.emply_salary);
        System.out.println("depar id :"+ obj1.dep_id+"depart name  :"+ obj1.dep_name);
    }

}
