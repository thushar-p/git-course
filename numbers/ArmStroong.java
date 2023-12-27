package numbers;

import java.util.Scanner;

public class ArmStroong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        boolean rs=isArm(n);
        sc.close();
        if(rs)
        System.out.println("yes");
        else
        System.out.println("no");
    }
    static boolean isArm(int n){
        int sum=0;
        int dig=countDig(n);
        int temp=n;
        do{
            int d=n%10;
            sum=sum+getpower(d,dig);
            n=n/10;
        }while(n!=0);
        if(sum==temp)
        return true;
        else
        return false;
    }
    static int countDig(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    static int getpower(int d, int dig)
    {   
        int prod=1;
        do{
            prod=prod*d;
            dig--;
        }while(dig!=0);
        return prod;
    }
}
