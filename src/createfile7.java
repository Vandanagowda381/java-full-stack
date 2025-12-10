import java.io.File;
import java.io.FileInputStream;

public class createfile7 {
    public static void main(String[] args){
        try(FileInputStream obj=new FileInputStream("sev.jpg")){
            int c;
            while ((c=obj.read())!=-1)
            {
                System.out.print((char)c);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
