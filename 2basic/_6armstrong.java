import java.util.*;
public class _6armstrong{ 
  public static boolean armstrong(int n){
    int sum=0;
    int num=n;
    if(n==0){return false;}
    else{
      while(n>0){
        int digit =n%10;
        double pow=Math.pow(digit,3);
        sum+=pow;
        n=n/10;
      }
      return sum==num;
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(armstrong(n));
  }
}