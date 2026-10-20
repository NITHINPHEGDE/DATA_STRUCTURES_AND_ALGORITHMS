import java.util.*;
public class _7perfectnumber {
  public static void perfect(int n){
    int sum=0;
    if(n==0){System.err.println("false");}
  
  for(int i=1;i*i<=n;i++){
    if(n%i==0){
      sum+=i;
    }
  }

if(sum==n){System.err.println("true");}
else{System.err.println("false");}
}
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  perfect(n);
}
}
