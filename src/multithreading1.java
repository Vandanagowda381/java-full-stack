class jav extends Thread{//run with thread class
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("java developer");
            try{
                Thread.sleep(5000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class react extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("react developer");
            try{
                Thread.sleep(1500);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
public class multithreading1 {
    public static void main(String[] args){
        jav obj=new jav();
        react obj1=new react();
        obj.start();
        obj1.start();
    }
}
