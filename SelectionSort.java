import java.util.*;

public class SelectionSort {
  public static void main(String[] args) {

    int[] arry = R_arry(6);
    System.out.println(Arrays.toString(arry));
    for (int i = 0; i < arry.length; i++) {
      int store = i;
      for (int j = store; j < arry.length; j++) {

        if (arry[store] > arry[j]) {

          store = j;
        }
      }
      int temp = arry[i];
      arry[i] = arry[store];
      arry[store] = temp;
    }
    System.out.println(Arrays.toString(arry));
    // 내림차순으로 바꾸기
    for (int i = 0; i < arry.length / 2; i++) {
      int temp = arry[i];
      arry[i] = arry[arry.length - i - 1];
      arry[arry.length - i - 1] = temp;
      // for (int j = arry.length; j > 0; j--) {
      // if (i + j == 9) {
      // int temp = arry[i];
      // arry[i] = arry[j];
      // arry[j] = temp;
      // }
      // }
    }
    System.out.println(Arrays.toString(arry));
  }

  public static int[] R_arry(int n) {

    int[] arr = new int[n];

    // 중복값 없는 난수 생성
    for (int i = 0; i < n; i++) {

      arr[i] = (int) (Math.random() * n + 1);// 1-10

      for (int j = 0; j < i; j++) {
        if (arr[i] == arr[j]) {
          arr[i] = (int) (Math.random() * n + 1);
          i--;
          break;
        }

      }
    }
    return arr;
  }
}