import java.util.*;
public class _1count_digits{
   public static int countDigit(int n) {
        int count=0;
        if(n==0){return 1;}
        
        else{
            while(n>0){
                n=n/10;
                count++;
            }
        }
    return count;}
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(countDigit(n));}
}