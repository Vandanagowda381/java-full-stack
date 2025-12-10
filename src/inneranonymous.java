
class inneranoymous {

    public void add(int a, int b) {

    }

    public static void main(String[] args) {
        inneranoymous an = new inneranoymous() {
            public void add(int a ,int b){
                System.out.println(a+b);
            }
        };
        an.add(5,8);
    }
}