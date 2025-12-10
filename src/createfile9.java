import java.io.File;
public class createfile9 {
    public static void main(String[] args){
        File file=new File("one.txt");
        if (file.exists()) {
            if (file.exists()) {
                System.out.println("file deleted successfully");
            }
        }
            else {
                System.out.println("filed to delete file ");
            }
        file.delete( );
    }
}
