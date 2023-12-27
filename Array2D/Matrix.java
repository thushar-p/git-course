package Array2D;

import java.util.Scanner;

public class Matrix {
    static int[][] readMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] n = new int[r][c];
        System.out.println("enter " + r * c + " values");
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = sc.nextInt();
            }
        }
        return n;
    }

    static void dispmatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int biggest(int[][] a) {
        int big = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > big)
                    big = a[i][j];
            }
        }
        return big;
    }

    static int[][] afterAdd(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length)
            return null;
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    static int[][] transpose(int[][] a) {
        int [][] b=new int[a[0].length][a.length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                b[i][j]=a[j][i];
            }
        }
        return b;
    }
}
