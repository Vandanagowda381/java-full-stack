import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class createfile5 {
    public static void main(String[] args){
        String content="demo in java";
        try{
            Files.write(Paths.get("eight.txt"),content.getBytes());
            System.out.println("inserted");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
