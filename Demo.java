class Human 
{
    private int first;
    private int age; 
    private String name;
    
    public int getfirst()
    {
        return first;
    }
    public void setfirst(int a)
    {
        first = a;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
 
    public void setName(String name)
    {
        this.name =  name ;
    }

    // void setfirstAge(int i) {
    //     throw new UnsupportedOperationException("Not supported yet.");
    // }
}
public class Demo
{
    public static void main(String[] args) 
    {
        Human obj = new Human();
        obj.setfirst(5);
        obj.setAge(4);
        obj.setName("tamnu");
        // obj.age
        System.out.println(obj.getName() + ": " + obj.getAge() + " and " + obj.getfirst());
        
    }
}
// we can change name of get and set 