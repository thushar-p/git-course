package Array2D;

public class Add2Matrix {
    public static void main(String[] args) {
        int[][] a = Matrix.readMatrix();
        int[][] b = Matrix.readMatrix();
        System.out.println("your first matrix");
        Matrix.dispmatrix(a);
        System.out.println("your second Matrix");
        Matrix.dispmatrix(b);
        int[][] c = Matrix.afterAdd(a, b);
        if (c == null)
            System.out.println("addition failed");
        else
            Matrix.dispmatrix(c);
    }
}
