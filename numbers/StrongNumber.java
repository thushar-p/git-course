package numbers;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        sc.close();
        boolean rs = isStrong(n);
        if (rs)
            System.out.println("yes it is strong number");
        else
            System.out.println("no it is not strong number");
    }

    static boolean isStrong(int n) {
        int sum = 0;
        int temp = n;
        do {
            int d = n % 10;
            sum = sum + isfact(d);
            n = n / 10;
        } while (n != 0);
        if (sum == temp)
            return true;
        else
            return false;
    }

    static int isfact(int d) {
        int fact = 1;
        do {
            fact = fact * d;
            d--;
        } while (d != 0);
        return fact;
    }
}
