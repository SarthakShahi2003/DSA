public class LeftRotByDplaces {
    public static void RotateByD(int arr[], int n, int k) {
        if (n == 0) return;

        k = k % n;

        int[] temp = new int[k];

        // Step 1: Store first k elements
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Step 2: Shift rest of the array to the left
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // Step 3: Put temp[] elements at the end
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k = 3;
        RotateByD(arr, n, k);

        System.out.print("The Rotated Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
