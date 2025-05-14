package Exercise1;
/*Bei direktem versuch run(), wird die Methode synchron aufgerufen, es wird also kein extra thread erstellt
* das verhindert den Sinn hinter multithreading
*
* Wenn wir start() benutzen, wird ein neuer Thread, der eigenständig läuft errichtet, was zu einer Leistungserhöhung führen kann */
public class MatrixMultMain {
    public static void main(String[] args) {
    int [][] a = {{1,2}, {3,4}};
    int [][] b = {{5,6},{7,8}};
    int[][] result = multiplyMatrices(a, b);
        System.out.println("Product of matrixen: ");
        for(int[] row : result){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;
        int [][]result = new int[rowsA][colsA];
        Thread[][] threads = new Thread[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                int sum = 0;
                for (int k = 0; k < colsA; k++) {
                    DotProductThread thread = new DotProductThread(A[i][k], B[k][j]);
                    thread.start();

                    try {
                        thread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    sum += thread.getDot();
                }
                result[i][j] = sum;
            }
        } return result;
    }
}
