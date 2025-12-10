class vahicale{
    String vehicle1;String color1;String regno1;double price1;
    vahicale(String vahicale ,String color,String regno,double price){
        vehicle1=vahicale;
        color1=color;
        regno1=regno;
        price1=price;
    }
    public void vahicaledetails(String color){
        System.out.println(vehicle1);
        System.out.println(color1);
        System.out.println(regno1);
        System.out.println(price1);
        System.out.println(color);
    }
}
public class constructor4 {
    public static void main(String[] args){
        vahicale obj=new vahicale("TVS","blue","KA112003",20000);
        obj.vahicaledetails("blue");
    }
}


