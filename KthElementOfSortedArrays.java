public class KthElementOfSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};
        int k = 5;

        int kthElement = findKthElement(arr1, arr2, k);
        System.out.println("The " + k + "th element of the final sorted array is: " + kthElement);
    }

    public static int findKthElement(int[] arr1, int[] arr2, int k) {
        int n = arr1.length;
        int m = arr2.length;

        int i = 0, j = 0;
        int count = 0;
        int kthElement = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                kthElement = arr1[i];
                i++;
            } else {
                kthElement = arr2[j];
                j++;
            }
            count++;
            if (count == k) {
                break;
            }
        }

        while (i < n && count < k) {
            kthElement = arr1[i];
            i++;
            count++;
        }

        while (j < m && count < k) {
            kthElement = arr2[j];
            j++;
            count++;
        }

        return kthElement;
    }
}

