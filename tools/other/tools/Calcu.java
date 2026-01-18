// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package other.tools;

public class Calcu {
   public Calcu() {
   }

   public static void main(String[] var0) {
      AdvCalc var1 = new AdvCalc();
      int var2 = var1.add(10, 5);
      int var3 = var1.sub(10, 5);
      int var4 = var1.multi(10, 5);
      int var5 = var1.div(10, 5);
      System.out.println("Addition: " + var2);
      System.out.println("Subtraction: " + var3);
      System.out.println("Multiplication: " + var4);
      System.out.println("Division: " + var5);
   }
}
