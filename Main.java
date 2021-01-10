class Main {
  public static void main(String[] args) {
    int[] arr = {1, 5, 1, 10, 13, 9, 40, 33, 28, 15};
    
    System.out.print("Unsorted: ");
    for (int n : arr) {
      System.out.print(n + " ");
    }
    System.out.println();

    mergeSort(arr, 0, arr.length - 1);

    System.out.print("Sorted:   ");
    for (int n : arr) {
      System.out.print(n + " ");
    }
    System.out.println();

  }

  static void merge(int arr[], int start, int mid, int end) {
    int sizeOne = mid - start + 1;
    int sizeTwo = end - mid;
    int left[] = new int[sizeOne];
    int right[] = new int[sizeTwo];

    for (int i = 0; i < sizeOne; ++i) {
      left[i] = arr[start + i];
    }

    for (int i = 0; i < sizeTwo; ++i) {
      right[i] = arr[mid + 1 + i];
    }

      int i = 0;
      int j = 0;
      int k = start;

      while (i < sizeOne && j < sizeTwo) {
        if (left[i] <= right[j]) {
          arr[k] = left[i++];
        } else {
          arr[k] = right[j++];
        }
        k++;

      }

      while (i < sizeOne) {
        arr[k++] = left[i++];
      }

      while (j < sizeTwo) {
        arr[k++] = right[j++];
      }
    
  }

  static void mergeSort(int arr[], int start, int end) {
    if (start < end) {
      int mid = (start + end) / 2;
      mergeSort(arr, start, mid);
      mergeSort(arr, mid + 1, end);
      merge(arr, start, mid, end);
    }

  }
  
}