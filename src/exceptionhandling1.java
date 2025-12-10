public class exceptionhandling1 {
    public static void main(String[] args){
        int[] array={2,3,4,4};
        try{
            System.out.println(array[5]);//ArrayIndexOutOfBoundsException
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
