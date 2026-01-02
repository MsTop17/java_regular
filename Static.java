class Mobile 
{
    String brand;
    int price;
    static String name;

    static 
    {
        name = "phone";
        System.out.println("in static block");
    }
    
    public Mobile()
    {
        brand = "Ass";
        price = 200;
        // name = "Phone";  Shoule be iinitialised only once
        System.out.println("in constructor");
    }


    public void show()
    {
        System.out.println(brand + " : " + price + ": " +  name );
    }
    public static void Show1(Mobile obj)
    {
        System.out.println(obj.brand + " : " + obj.price + ": " +  name);
    }
}

public class Static 
{
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 45666;
        Mobile.name = "Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsug";
        obj2.price = 40666;
        Mobile.name = "Smartphone";

        Mobile obj3 = new Mobile();

        Mobile.name = "phone";

        obj1.show();
        obj2.show();

        Mobile.Show1(obj1);


        Class.forName("Mobile");

    }
}
