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
}
