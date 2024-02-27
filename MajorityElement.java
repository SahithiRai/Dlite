public class MajorityElement {
    public static void main(String[] args) {
        int[] arr1 = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int[] arr2 = {1, 2, 3, 4, 5, 5, 5, 5, 5};

        System.out.println("Majority element in arr1: " + findMajorityElement(arr1));
        System.out.println("Majority element in arr2: " + findMajorityElement(arr2));
    }

    public static int findMajorityElement(int[] arr) {
        int majorityElement = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == majorityElement) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    majorityElement = arr[i];
                    count = 1;
                }
            }
        }

        // Verify if the majority element is indeed the majority
        count = 0;
        for (int num : arr) {
            if (num == majorityElement) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            return majorityElement;
        } else {
            return -1; // No majority element found
        }
    }
}
