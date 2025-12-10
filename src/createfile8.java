import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class createfile8 {//using files.readalllines methods
    public static void main(String[] args){
        try {
            List<String> obj= Files.readAllLines(Paths.get("six.txt"));
            for (String s:obj){
                System.out.println(s);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
