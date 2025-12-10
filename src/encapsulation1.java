class collage1 {
    private String Colg_name = "VIJAY";
    private int Collage_roll = 4;
    private String Clg_branch = "MCA";
    public void setColg_name(String Colg_name1){
        Colg_name=Colg_name1;
    }
    public void setCollage_roll(int Collage_roll1){
        Collage_roll=Collage_roll1;
    }
    public void setClg_branch(String Clg_branch1){
        Clg_branch=Clg_branch1;
    }
    public String getColg_name(){
        return Colg_name;
    }
    public int getCollage_roll(){
        return Collage_roll;
    }
    public String getClg_branch(){
        return Clg_branch;
    }
}
public class encapsulation1{
    public static void main(String[]args){
        collage1 obj=new collage1();
        obj.setColg_name("harsha");
        obj.setCollage_roll(5);
        obj.setClg_branch("cs");
        System.out.println(obj.getColg_name()+" "+obj.getCollage_roll()+" "+obj.getClg_branch());
    }
}


