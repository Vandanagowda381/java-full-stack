public class singaltidimention {
    public static void main(String[] args) {
        int array[][] = {
                {2, 3, 4},
                {3, 4, 5},
                {2, 7, 8}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}