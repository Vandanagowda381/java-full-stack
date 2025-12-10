abstract class dummy{
    String name;
    dummy(String name){
        this.name=name;
    }
    abstract void detailsss();
}
class ds extends dummy{
    String name;
    ds(String name){
        super(name);
        this.name=name;
    }
    void detailsss(){
        System.out.println(name);
    }
}
public class abstract3 {
    public static void main(String[] args){
        ds obj=new ds("vandana");
        obj.detailsss();
    }
}
