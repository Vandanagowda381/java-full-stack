import java.util.Stack;

public class collection5 {
    public static void main(String[] args){
        Stack<Integer>number=new Stack<>();
        number.push(5);
        number.push(4);
        number.push(6);
        System.out.println(number);
        number.pop();
        System.out.println(number);
        System.out.println(number.isEmpty());//it will show array is mt or not
        System.out.println(number.capacity());//it store max number
    }
}
