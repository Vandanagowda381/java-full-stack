public class pattern3 {
    public static void main(String[] args){
        int n=1;
        for( int i=1; i<=5; i++) {
            for (int j=n; j>=i; j++){
                System.out.print("* ");
                n++;
            }
            System.out.println();
        }
    }
}


