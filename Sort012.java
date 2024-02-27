
public class Sort012 {
    public static void main(String[] args) {
        int[] arr1 = {0, 2, 1, 2, 0};
        int[] arr2 = {0, 1, 0};

        System.out.println("Original array 1:");
        printArray(arr1);
        sort012(arr1);
        System.out.println("Sorted array 1:");
        printArray(arr1);

        System.out.println("Original array 2:");
        printArray(arr2);
        sort012(arr2);
        System.out.println("Sorted array 2:");
        printArray(arr2);
    }

    public static void sort012(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
