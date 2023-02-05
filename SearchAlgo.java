public class SearchAlgo {
    // Linear Search/Sequential Search is a searching algorithm that is used to find
    // the index
    // of the desired element in an array.
    // It is the simplest and most basic searching algorithm. In this algorithm,
    // we sequentially visit each element of an array until the target element is
    // found.

    // time O(n)
    static int linearSearch(int[] A, int Key) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == Key)
                return i;
        }
        return -1;
    }

    // Binary Search is a searching algorithm used in a sorted array by repeatedly
    // dividing the search interval in half.
    // The idea of binary search is to use the information that the array is sorted
    // and reduce the time complexity to O(Log n).
    static int binarySearch(int[] A, int key, int l, int r) {
        int mid = (l + r) / 2;
        if (key == A[mid])
            return mid;
        // If element is smaller than mid, then
        // it can only be present in left subarray
        else if (key < A[mid]) {
            return binarySearch(A, key, l, r - 1);
        } else if (key > A[mid]) {
            return binarySearch(A, key, l, r + 1);
        }
        // We reach here when element is not present
        // in array
        return -1;
    }

    public static void main(String[] args) {
        int[] myNum = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int index = linearSearch(myNum, 30);
        int indexBinarySearch = binarySearch(myNum, 20, 0, myNum.length);
        System.out.println(indexBinarySearch);

        System.out.println(index);
    }
}
