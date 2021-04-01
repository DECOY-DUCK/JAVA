
import java.util.*;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = { 8, 7, 3, 1, 6, 9, 10, 5, 2, 4 };
    int length = arr.length;

    for (int j = 0; length > j; length--) {
      for (int i = 0; i < length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
          int s = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = s;
        }

        System.out.println(Arrays.toString(arr));
      }

      System.out.println();
    }

    System.out.println("==============");

    // for (int i = arr.length - 1; i > 0; i--) {
    // for (int z = 0; z < i; z++) {
    // if (arr[z] > arr[z + 1]) {
    // int temp = arr[z];
    // arr[z] = arr[z + 1];
    // arr[z + 1] = temp;
    // }
    // System.out.println(Arrays.toString(arr));
    // }
    // System.out.println();
    // }
  }
}
