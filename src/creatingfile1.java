import java.io.File;
import java.io.FileOutputStream;

public class creatingfile1 {
    public static void main(String[] args) {
        try (FileOutputStream obj = new FileOutputStream("one.txt")) {//create using constructor
            System.out.println("file created successfully");
        } catch (Exception e) {
            System.out.println("filed to create ");
        }
    }
}