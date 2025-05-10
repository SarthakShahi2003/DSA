public class Linear_Search {
    

        // Function to search for a number in the array
        public static int search(int[] arr, int n, int num) {
            for (int i = 0; i < n; i++) {
                if (arr[i] == num) {
                    return i; // Return index if number is found
                }
            }
            return -1; // Return -1 if number is not found
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5}; // Initialize array
            int num = 4; // Number to search
            int n = arr.length; // Length of the array
    
            // Call search function
            int val = search(arr, n, num);
    
            // Print result
            System.out.println("The Value "+num+" is Present in Index:-"+val);
        }
    }
    

