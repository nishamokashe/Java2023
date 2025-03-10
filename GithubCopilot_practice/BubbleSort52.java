//Code Completion Challenge:*
public class BubbleSort52 {
    // Completed method: Implement Bubble Sort algorithm
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort52 sorter = new BubbleSort52();
        sorter.bubbleSort(arr);
        
        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

/*Added logic for Bubble Sort: Implemented the Bubble Sort algorithm inside 
the bubbleSort method. The outer loop iterates through the array, and the 
inner loop compares adjacent elements and swaps them if 
they are in the wrong order.

Added printing of sorted array: After sorting the array, we added code to print 
the sorted array in the main method. This loop iterates through the sorted 
array and prints each element separated by a space.

These changes make the code complete and functional, implementing the
 Bubble Sort algorithm and printing the sorted array.*/