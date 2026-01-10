// calculator using inheritance
class Calc {
    public int add(int a , int b)
    {
        return a + b;
    }
    public int sub(int a, int b)
    {
        return a - b;
    }
}


class AdvCalc extends Calc
{
    public int multi(int n1 , int n2)
    {
        return n1*n2;
    }
    public int div(int n1, int n2)
    {
        return n1/ n2;
    }
}
class VeryAdv extends AdvCalc
{
    public double power(int a , int b)
    {
        return Math.pow(a, b);
    }
}
public class Calculator
{
public static void main(String[] args) {
 
    // Calc obj = new Calc();
    // AdvCalc ob = new AdvCalc();
    VeryAdv obj = new VeryAdv();

    int x =  obj.add(2 , 7);
    int y = obj.sub(4,8);
    int p = obj.multi(4,8);
    int q = obj.div(4,8);
    double r = obj.power(4, 2);  
    System.out.println(x + " " + y +" "+ " "+ p + " " + q + " " + r);
   
}
}
// extends == keyword used  in java for inheritance
