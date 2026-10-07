import java.util.*;
public class pattern7 {
  public static int pattern(int n){
for(int i=1;i<=n;i++){
  for(int j=0;j<=i-1;j++){
    System.out.print(" ");
  }
  for(int k = 1; k <= 2 * (n - i) + 1; k++){
    System.out.print("*");
    

}
System.out.println();
  }
  return 0;
}
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter n");
  int n = sc.nextInt();
  pattern(n);
}
}
