import java.util.*;
class most_frequent {
    public static int mostFrequentElement(int[] nums) {
      HashMap<Integer,Integer> map = new HashMap<>();
            for(int num:nums){
                map.put(num,map.getOrDefault(num,0)+1);
            }
            int maxcount=0;
            int result=Integer.MAX_VALUE;
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
               int count=entry.getValue();
               int num = entry.getKey();
               if(count>maxcount||(count == maxcount && num<result)){
                maxcount=count;
                result=num;
               }
            }
    return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int n = sc.nextInt();
        System.out.println("enter the array ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
            System.out.println(mostFrequentElement(arr));
        
    }
}


