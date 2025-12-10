class encp{
    private String name="VIJAY";
    private int age=28;
    public void setName(String name1) {
        name = name1;
    }
    public void setAge(int age1){
        age=age1;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        encp obj = new encp();
        obj.setName("harsha");
        obj.setAge(8);
        System.out.println(obj.getName() + " " + obj.getAge());
    }
}
