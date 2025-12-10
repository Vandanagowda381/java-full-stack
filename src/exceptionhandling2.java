public class exceptionhandling2 {
    public static void main(String[] args){

        try{
            String name=null;
            System.out.println(name.length());//null point exception
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("mandatary");//try,catch,finally are keywords
        }
    }
}


