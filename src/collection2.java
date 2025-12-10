import java.util.ArrayList;
import java.util.List;

public class collection2 {
    public static void main(String[] args){
        List<String> fruits=new ArrayList<>();
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("water");
        System.out.println(fruits);
        fruits.add(1,"grapes");
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(3);
        System.out.println(fruits);
        System.out.println(fruits.isEmpty());
        System.out.println(fruits);
        fruits.remove("grapes");
        fruits.addFirst("Strobery");
        System.out.println(fruits);
        fruits.add(2,"water2");
        System.out.println(fruits);
        }
    }

