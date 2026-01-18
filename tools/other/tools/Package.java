package other.tools;

public class Package {
    public static void main(String[] args) {
        
        AdvCalc obj = new AdvCalc();

        int sum = obj.add(10, 5);
        int difference = obj.sub(10, 5);

    
        int product = obj.multi(10, 5);
        int quotient = obj.div(10, 5);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
    }
}
// javac other/tools/*.java
// java other.tools.Package
// Addition: 15
// Subtraction: 5
// Multiplication: 50
// Division: 2