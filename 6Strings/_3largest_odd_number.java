import java.util.*;

public class _3largest_odd_number {

    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';

            if (digit % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();

        System.out.println(largestOddNumber(num));
    }
}
