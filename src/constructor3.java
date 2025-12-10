class persons5{
    String name1;int age1;double number1;float height1;
    persons5(String name,int age,double number,float height){
        name1=name;
        age1 = age;
        number1=number;
        height1=height;
    }
    public void details(){
        System.out.println(name1+" "+age1+" "+number1+" "+height1);
    }

}

public class constructor3 {
    public static void main(String[] args){
        persons5 obj=new persons5("vandana gowda",22,8123275900l,4);
        obj.details();
    }
}
