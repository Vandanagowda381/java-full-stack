class mobile1{
    public void mobile(String name,String ram,String processor,int android_verson,String phonestorage){
        System.out.println(name+" "+ram+" "+processor+" "+android_verson+" "+" "+phonestorage);
    }
}
class laptop extends mobile1{
    public void mobile(String name1,String ram1,String processor1,int android_verson1,String phonestorage1){
        System.out.println(name1+" "+ ram1+" "+processor1+" "+ android_verson1+" "+phonestorage1);

    }
    public void laptop(String name2,String ram2,String processor2,int android_verson2,String laptopstorage2){
        System.out.println(name2+ " "+ram2+" "+android_verson2+" "+laptopstorage2);
    }
}
public class methosoverriding2 {
    public static void main(String[] args){
        laptop obj=new laptop();
        obj.laptop("lenova ","3 ","i5 ",13,"154gb ");
        obj.mobile("vivo ","3 ","i5 ",13,"154gb ");

    }

}
