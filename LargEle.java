import java.io.*;

class LargEle {
    static int largest(int[] arr) {
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 324, 45, 90, 9808 };
        System.out.println(largest(arr));
    }
}