import java.util.*;
public class pattern10 {
  public static int pattern(int n){
   for (int i = n; i >= 1; i--){
      int c=0;
      for (int j=n;j>=n-i+1;j--){
       System.out.print((char)('A' + c));
       c++;
    }
System.out.println();
  }
  return 0;
}

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    pattern(n);
  }
}
