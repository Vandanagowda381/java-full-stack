import java.util.LinkedList;

public class collection3 {
    public static void main(String[] args){
        LinkedList<String> cars=new LinkedList<>();//for linkedlist
        cars.add("BMW");
        cars.add("Audi");
        cars.add("thar");
        System.out.println(cars);
        cars.add(1,"tata tigor");
        System.out.println(cars);
        cars.remove("Audi");
        System.out.println(cars);
        cars.addFirst("maruthi");
        System.out.println(cars);
        cars.addLast("Nissan");
        System.out.println(cars);
        cars.indexOf("maruthi");
        System.out.println(cars);

        System.out.println(cars.peek());
        System.out.println(cars);
        System.out.println(cars.poll());
        System.out.println(cars);
        cars.offer("creta");
        System.out.println(cars);
        cars.offerFirst("jhfj");
        System.out.println(cars);
        cars.offerLast("j");
        System.out.println(cars);
        cars.offerLast("j");
        System.out.println(cars);

    }
}
