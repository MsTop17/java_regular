package other.tools;

// This inherits add and sub from Calc
public class AdvCalc extends Calc {
    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return n1 / n2;
    }
}