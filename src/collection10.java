import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class collection10 {
    public static void main(String[] args){
        LinkedHashSet<Integer> age=new LinkedHashSet<>();//Linkedlist Tree set
        age.add(1);
        age.add(2);
        age.add(3);
        System.out.println(age);
        age.remove(1);
        System.out.println(age);
        age.remove(2);
        age.removeFirst();
        System.out.println(age);
    }
}

