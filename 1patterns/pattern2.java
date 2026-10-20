// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class pattern2 {
   public pattern2() {
   }

   public static int pattern(int var0) {
      for(int var1 = 1; var1 <= var0; ++var1) {
         for(int var2 = 1; var2 <= var1; ++var2) {
            System.out.print("*");
         }

         System.out.println();
      }

      return 0;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      pattern(var2);
   }
}
