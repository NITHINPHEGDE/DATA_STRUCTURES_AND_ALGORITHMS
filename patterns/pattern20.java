import java.util.*;

public class pattern20 {
  public static int pattern(int n) {
    // for first part
    for (int i = 0; i < n; i++) {
      // for stars
      for (int j = 0; j < n - i; j++) {
        System.out.print("*");
      }
      // for spaces
      for (int k = 0; k < i * 2; k++) {
        System.out.print(" ");
      }
      // for stars
      for (int l = 0; l < n - i; l++) {
        System.out.print("*");
      }
      System.out.println();
    }
    //for the second half
    for(int m=1;m<=n;m++){
      for(int o=0;o<m;o++){
        System.out.print("*");
      }
      for(int p=0;p<2*(n-m);p++){
        System.out.print(" ");
      }
      for(int q=0;q<m;q++){
        System.out.print("*");}
        System.out.println();
    }
    return 0;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    pattern(n);
  }
}