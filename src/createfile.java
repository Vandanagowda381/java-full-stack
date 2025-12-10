import java.io.File;

public class createfile {
    public static void main(String[] args){
        File obj=new File("jff.txt");//for creat file
        try{
            if(obj.createNewFile()){
                System.out.println("file created successfully");
            }else{
                System.out.println("failed to create");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
