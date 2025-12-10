class dog{
    String color;
    dog(String color){
        this.color=color;
    }
    public void details(){
        System.out.println(color);
    }
}
class babydog extends dog {
    String name;
    babydog(String color, String name) {
        super(color);
        this.name = name;
    }
    public void bdetails() {
        System.out.println(color + " " + name);
    }
}

public class singalinheritance1 {
        public static void main(String[] args){

            babydog obj=new babydog("BROWNEY","CHARLI");
            obj.bdetails();
        }
}

