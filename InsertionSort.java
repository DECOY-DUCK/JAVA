import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] args) {

    int[] arr = { 6, 5, 1, 4, 3, 2 };
    for (int i = 1; i < arr.length; i++) {
      int store = arr[i];

      for (int j = i; j > 0; j--) {
        if (store < arr[j - 1]) {
          arr[j] = arr[j - 1];
          arr[j - 1] = store;

        }

      }

    }
    System.out.println(Arrays.toString(arr));
  }
}
