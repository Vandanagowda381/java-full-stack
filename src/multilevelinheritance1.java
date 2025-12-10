class collagev{
    String clg_name;
    String clg_loc;
    collagev(String clg_name,String clg_loc){
        this.clg_name=clg_name;
        this.clg_loc=clg_loc;

    }
    public void c1(){
        System.out.println(clg_loc+" "+clg_name);
    }
}
class department6 extends collagev{
    String dep_name;
    String dep_id;
    department6(String dep_name,String dep_id,String clg_name,String clg_loc){
        super(clg_name,clg_loc);
        this.dep_name=dep_name;
        this.dep_id=dep_id;
    }
    public void c2(){
        System.out.println(clg_name+" "+clg_loc+" "+dep_name+" "+dep_id);
    }
}
class studentv extends department6 {
    String stu_name;
    int stu_roll;
    studentv(String stu_name, int stu_roll, String dep_name, String dep_id,String clg_name,String clg_loc) {
        super(dep_name, dep_id,clg_name,clg_loc);
        this.stu_name = stu_name;
        this.stu_roll = stu_roll;
    }
    public void v3() {
        System.out.println(stu_name + " " + stu_roll+" "+clg_name+" "+clg_loc+ " "+dep_name+" " +dep_id);
    }
}
class multilevelinheritance1{
    public static void main(String[] args){
        studentv obj=new studentv("vandana gowda",878787,"MCA","MC2023","P.E.S COLLAGE OF ENGINEERING MANDYA","MANDYA");
        obj.v3();

    }
}
