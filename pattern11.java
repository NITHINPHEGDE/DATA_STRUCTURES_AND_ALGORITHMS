import java.util.*;

public class pattern11 {

    public static int pattern(int n) {

        for(int i = 1; i <= n; i++) {

            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // increasing letters
            for(int j = 1; j <= i; j++) {
                System.out.print((char)('A' + j - 1));
            }

            // decreasing letters
            for(int j = i - 1; j >= 1; j--) {
                System.out.print((char)('A' + j - 1));
            }

            System.out.println();
        }

        return 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
    }
}   