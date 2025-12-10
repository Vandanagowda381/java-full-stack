class outer{
    private class inner{  //inner class
        public void innermethod(){
            System.out.println("inner class data");
        }
        public void innerrmethod(){
            System.out.println("innerr class data");
        }
    }
    void details(){
        inner obj1=new inner();
        obj1.innermethod();
        obj1.innerrmethod();
    }
}
public class innerclass {
    public static void main(String[] args){
        outer obj=new outer();
        obj.details();
    }
}
