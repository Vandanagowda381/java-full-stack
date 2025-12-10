class car{
    String name="maruthi800";
    int price=20000;
    String colour="white";
    int model=2025;
    String reg_no="KA11420";
}
class bike{
    String bname="bullate";
    long bprice=190000l;
    String bcolour="red";
}
public class oop2 {
    public static void main(String[] args){
        car obj=new car();
        bike obj2=new bike();
        System.out.println("enter car name  :"+obj.name+"enter price  :"+obj.colour+"enter the model  :"+obj.price+"enter the model  :"+obj.model+"enter the re_no  :"+obj.reg_no);
        System.out.println("enter bike name  :"+obj2.bname+"enter price  :"+obj2.bprice+"enter the model  :"+obj2.bcolour);
    }

}
