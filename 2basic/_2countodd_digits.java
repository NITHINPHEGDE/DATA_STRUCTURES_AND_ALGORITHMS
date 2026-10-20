import java.util.*;
public class _2countodd_digits {
  public static int odddigit(int n){
    int count=0;
    if(n==0){
      return 1;}
      else{
        while(n>0){
          int d=n%10;
          if(d%2!=0){
            count++;
          }
          n=n/10;
        }
      }
    
  return count;}

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(odddigit(n));}
}
