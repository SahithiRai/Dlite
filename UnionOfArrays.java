import java.util.HashSet;

public class UnionOfArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 3, 4, 5};

        System.out.println("Number of elements in the union: " + findUnionSize(a, b));
    }

    public static int findUnionSize(int[] a, int[] b) {
        HashSet<Integer> unionSet = new HashSet<>();

        // Add elements from array a to the union set
        for (int num : a) {
            unionSet.add(num);
        }

        // Add elements from array b to the union set
        for (int num : b) {
            unionSet.add(num);
        }

        return unionSet.size();
    }
}
