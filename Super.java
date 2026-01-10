class A 
{
    public A()
    {
        super();
        System.out.println("in A");
    }
    public A(int n)
    {
        super();
        System.out.println("in A 0000");
        
    }
   

}
class B extends A
{
    public B()
    {
        super();
        System.out.println("in B");
    }
    public B(int n)
    {   
        this();
        System.out.println("in B oooo");
    }
}



public class Super 
{
    public static void main(String[] args)
    {
        B obj = new B(5);   
     


        
    }
}
// in A 0000
// in B
// Experiment with parameterized ones and this() and super() keywords