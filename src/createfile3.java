import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createfile3 {
    public static void main(String[] args){
        File obj=new File("vandana nachi ganduuu.txt");
        try{
            if(obj.createNewFile()){
                System.out.println("file is created");
            }else {
                System.out.println("filed ");
            }
        FileWriter obj1=new FileWriter("six.txt");
        obj1.write("vandana patel is more beautiful than vandana n ");
        obj1.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
