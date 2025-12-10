import java.util.HashSet;
import java.util.Set;

public class collection8 {
    public static void main(String[] args){
        HashSet<Integer> age=new HashSet<>() ;//set hash set
        age.add(1);
        age.add(2);
        age.add(3);
        System.out.println(age);

        System.out.println(age.hashCode());
        age.remove(1);
        System.out.println(age);
        System.out.println(age.contains(1));
        age.iterator();//for loops
        System.out.println(age);
        System.out.println(age.isEmpty());
        }
    }

