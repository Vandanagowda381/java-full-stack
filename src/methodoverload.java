class bank1{
    public void HDFC(String name,String address){

        System.out.println(name+" "+address);
    }
    public void HDFC(String name,String address,int IFSC,long acc_no){
        System.out.println(name+" "+address+" "+IFSC+" "+acc_no);
    }
}
public class methodoverload {
    public static void main(String[] args){
        bank1 obj=new bank1();
        obj.HDFC("Vandana","Mandya",840,420);
        obj.HDFC("Vandana n","chamrajnagar",420420,840840);
    }
}
