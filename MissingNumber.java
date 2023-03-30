import java.io.*;
import java.util.*;


class MissingNumber {
    //o(n) approach
    //My solution does not use sets and has three different for loops
    public static void findMissingNum(int nums[], int max_num) {
      int temp[] = new int[max_num + 1];
      for (int i = 0; i <= max_num; i++) {
        temp[i] = 0;
      }
      for (int i = 0; i < max_num; i++) {
        temp[nums[i] - 1] = 1;
      }
      int ans = 0;
      for (int i = 0; i < max_num; i++) {
        if (temp[i] == 0) {
          ans = i + 1;
        }
      }
      System.out.println(ans);
    }
    //o(log n) approach
    //My solution does not use arrays.sort and has more variables
    public static int findMissingNumSort(int nums[], int max_num) {
      if (nums[0] != 1) {
        return 1;
      }
      if (nums[max_num - 1] != (max_num + 1)) {
        return max_num + 1;
      }
      int a = 0;
      int b = max_num - 1;
      int mid = 0;
      while ((b - a) > 1) {
        mid = (a + b) / 2;
        if ((nums[a] - a) != (nums[mid] - mid)) {
          b = mid;
        }
        else if ((nums[b] = b) != (nums[mid] - mid)) {
          a = mid;
        }
        return(nums[a] + 1);
      }
    }
    //0(1) approach
    //My solution does not use arrays, but also uses math
    public static int findMissingNumSum(int nums[], int max_num) {
      int sum = ((max_num + 1) * (max_num + 2)) / 2;
      for (int i = 0; i < max_num; i++) {
        sum -= nums[i];
      }
      return sum;
    }
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 9, 10};
    int n = arr.length;
    findMissingNum(arr, n);
    findMissingNumSort(arr, n);
    findMissingNumSum(arr, n);
    testMissingNumber_MissingMax();
    testMissingNumber_NoneMissing();
    testMissingNumber_MissingSeven();
    testMissingNumber_Performance();
    testMissingNumberSort_Performance();
    testMissingNumberSum_Performance();
  }
}