package Array2D;
public class Transpose {
    public static void main(String[] args) {
        int [][] a=Matrix.readMatrix();
        System.out.println("enetered Matrix");
        Matrix.dispmatrix(a);
        System.out.println("after transpose");
        int [][] b=Matrix.transpose(a);
        Matrix.dispmatrix(b);
    }
}
