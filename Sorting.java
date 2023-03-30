class SortAlgo {
  //Insertion sort is one of the most efficient ways to sort your algorithm
  static void insertionSort(int arr[], int n) {
    if (n <= 1) {
      return;
    }
    insertionSort(arr, n - 1);
    int last = arr[n - 1];
    int j = n - 2;

    while (j >= 0 && arr[j] < last) {
      arr[j + 1] = arr[j];
      j--;
    }
    arr[j + 1] = last;
  }
  
  void display(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = {43, 63, 24, 64, 24};

    insertionSort(arr, arr.length);
    Sort ob = new Sort();
    ob.display(arr);
  }
}