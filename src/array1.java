public class array1 {
    public static void main(String[] args) {
        int array[] = {1, 3, 4, 5, 60};
        int large = array[1];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > large) {
                large = array[i];
            }
        }
        System.out.println("large element is  :" + large);

    }
}
