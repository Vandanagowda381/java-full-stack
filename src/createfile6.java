import java.io.FileReader;

public class createfile6 {
    public static void main(String[] args){
        try (FileReader obj=new FileReader("one.txt"))
        {
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