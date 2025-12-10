import java.io.FileOutputStream;

public class createfile4 {
    public static void main(String[] args){
        String content ="hello word";
        try(FileOutputStream obj=new FileOutputStream("sev.txt"))
        {
            System.out.println("file is created ");
            byte[] bytes=content.getBytes();
            obj.write(bytes);
        }
        catch (Exception e){
            System.out.println(e);

        }
    }
}
