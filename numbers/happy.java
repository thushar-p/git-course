package numbers;

import java.util.Scanner;

public class happy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        sc.close();
        boolean rs=isHappy(n);
        if(rs)
        System.out.println("yes");
        else
        System.out.println("no");
    }

     static boolean isHappy(int n) {
        while(n>9)
        {
            int sum=0;
            do{
                int  d=n%10;
                sum=sum+(d*d);
                n=n/10;
            }while(n!=0);
            n=sum;
        }

        return n==1 || n==7;
    }
}

