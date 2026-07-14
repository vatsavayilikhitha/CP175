import java.util.*;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y= sc.nextDouble();

        if (y == 0) {
            System.out.println("Division by zero is not allowed");
            return;
        }

        double a = Math.abs(x);
        double b = Math.abs(y);

        double l = 0;
        double r = a;
        double ans = 0;

        while (r - l > 1e-7) {
            double m = l + (r - l) / 2.0;

            if (m * b <= a) {
                ans = m;
                l = m;
            } else {
                r = m;
            }
        }

        if ((x < 0) ^ (y < 0)) {
            ans = -ans;
        }

        System.out.printf("%.6f\n", ans);
    }
}