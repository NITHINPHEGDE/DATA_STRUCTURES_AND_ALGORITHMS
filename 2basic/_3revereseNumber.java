import java.util.*;
public class _3revereseNumber {
  
    public static int reverseNumber(int n) {
        int rev=0;
        while(n>0){
            rev=rev*10;
            int dig = n%10;
            rev = rev + dig;
            n=n/10;
        }
    return rev;}
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(reverseNumber(n));}

}
