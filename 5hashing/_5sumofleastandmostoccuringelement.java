import java.util.*;

class _5sumofleastandmostoccuringelement {

    public static int sumOfElements(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxcount = 0;
        int first = Integer.MAX_VALUE;

        // Most frequent element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int count = entry.getValue();
            int num = entry.getKey();

            if (count > maxcount || (count == maxcount && num < first)) {
                maxcount = count;
                first = num;
            }
        }

        int mincount = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        // Least frequent element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int count = entry.getValue();
            int num = entry.getKey();

            if (count < mincount || (count == mincount && num < second)) {
                mincount = count;
                second = num;
            }
        }

        return first + second;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum: " + sumOfElements(arr));

        sc.close();
    }
}