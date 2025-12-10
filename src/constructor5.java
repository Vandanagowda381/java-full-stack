class tatastrive{
    String cource_name1;String batchID1;String reg_no1;
    tatastrive(String cource_name,String batchID,String reg_no){
        cource_name1=cource_name;
        batchID1=batchID;
        reg_no1=reg_no;
    }
    public void tatstrivedetile(String address,long phone){
        System.out.println("cource_name  :"+cource_name1);
        System.out.println("batchID  :"+ batchID1);
        System.out.println("reg_no  :"+reg_no1);
        System.out.println("addre  :"+address);
        System.out.println("phone  :"+phone);
    }
}
public class constructor5 {
    public static void main(String[] args){
        tatastrive obj=new tatastrive("java full stack","j09988775","ka63t713");
        obj.tatstrivedetile("nagavara",8123275900l);
    }
}


