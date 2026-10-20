import java.util.*;
public class _5largestdigit{
  public static void largest(int n){
    int largest = Integer.MIN_VALUE;
        while(n>0){
            int digit = n%10;
            largest = Math.max(largest,digit);
            n/=10;
        }
        System.out.println(largest);
  }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        largest(n);
    }
}