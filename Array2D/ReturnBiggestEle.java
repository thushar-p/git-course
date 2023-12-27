package Array2D;
public class ReturnBiggestEle {
    public static void main(String[] args) {
        int[][] a = Matrix.readMatrix();
        Matrix.dispmatrix(a);
        int b = Matrix.biggest(a);
        System.out.println(b);
    }
}