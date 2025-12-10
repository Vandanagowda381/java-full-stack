public class arrysmallnumber{
    public static void main(String[] args) {
        int array[] = {1, 3, 4, 5, 60};
        int small = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < small) {
                small= array[i];
            }
        }
        System.out.println("large element is  :" + small);

    }
}


