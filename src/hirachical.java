class h1 {
    String fuel;
    int seats;
    h1(String fuel, int seats){
        this.fuel=fuel;
        this.seats=seats;

    }
    public void uz(){
        System.out.println(fuel+" "+seats);
    }
}
class car5 extends h1 {
    String car_namez;
    String m_odel;
    car5(String car_namez,String m_odel,String fuel,int seats){
        super(fuel,seats);
        this.car_namez=car_namez;
        this.m_odel=m_odel;
    }
    public void details(){
        System.out.println(car_namez+" "+m_odel+" "+fuel+" "+seats);
    }
}
class bmw extends h1 {
    long price;
    bmw(String fuel,int seats,long price)
    {
        super(fuel,seats);
        this.price=price;
    }
    public void detailss()
    {
        System.out.println(price+" "+fuel+ seats);
    }
}

public class hirachical
{
    public static void main(String[] args)
    {
        bmw obj=new bmw("indian",2,767657l);
        obj.detailss();
        obj.uz();
        car5 obj1=new car5("bmww","new","indian",2);
        obj1.details();
        obj1.uz();
    }
}
