import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class creatingfile2 {
    public static void main(String[] args){
        String s="two.png";
        try{
            Files.write(Paths.get(s),"hello vandana ganduuuuuu...".getBytes());
            System.out.println("created successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
