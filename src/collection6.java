import java.util.PriorityQueue;

public class collection6 {
    public static void main(String[] args){
        PriorityQueue<Integer> agee=new PriorityQueue<>();
        agee.offer(5);//adding element
        agee.offer(4);
        agee.offer(3);
        System.out.println(agee);
        agee.poll();//remove head element
        System.out.println(agee);
        agee.peek();//fetch the head element
        System.out.println(agee);
        agee.offer(30);
        agee.offer(35);
        agee.offer(1);
        System.out.println(agee);
    }
}
