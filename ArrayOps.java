public class ArrayOps {
  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static int largest(int[] arr) {
    int out = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > out) out = arr[i];
    }
    return out;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] out = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      out[i] = sum(matrix[i]);
    }
    return out;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] out = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      out[i] = largest(matrix[i]);
    }
    return out;
  }

  public static int sum(int[][] arr) {
    int out = 0;
    for (int start = 0; start < arr.length; start++) {
      for (int i = 0; i < arr[start].length; i++) {
        out += arr[start][i];
      }
    }
    return out;
  }

  public static int[] sumCols(int[][] matrix) {
    int[] out = new int[matrix[0].length];
    for (int col = 0; col < out.length; col++) {
      for (int i = 0; i < matrix.length; i++) {
        out[col] += matrix[i][col];
      }
    }
    return out;
  }

  public static boolean isRowMagic(int[][] matrix) {
    int check = sum(matrix[0]);
    for (int row = 1; row < matrix.length; row++) {
      if (sum(matrix[row]) != check) return false;
    }
    return true;
  }

  public static boolean isColMagic(int[][] matrix) {
    int [] sumsAre = sumCols(matrix);
    int check = sumsAre[0];
    for (int cols = 1; cols < sumsAre.length; cols++) {
      if (sumsAre[cols] != check) return false;
    }
    return true;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
    return sumCols(matrix)[col] == sumRows(matrix)[row];
  }
}
