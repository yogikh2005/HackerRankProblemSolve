/*
In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).

Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes. For example, deque can be declared as:

Deque deque = new LinkedList<>();
or
Deque deque = new ArrayDeque<>();
You can find more details about Deque here.

In this problem, you are given  integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size .

Note: Time limit is  second for this problem.

Input Format

The first line of input contains two integers  and : representing the total number of integers and the size of the subarray, respectively. The next line contains  space separated integers.
*/
import java.io.*;
import java.util.*;

public class DqueueProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the input values
        int n = scanner.nextInt(); // Total number of integers
        int k = scanner.nextInt(); // Size of the subarray
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Call the function to find the maximum unique elements in all subarrays of size k
        System.out.println(maxUniqueSubarray(arr, k));
        
        scanner.close();
    }
    
    // Function to calculate maximum unique integers in all subarrays of size k
    public static int maxUniqueSubarray(int[] arr, int k) {
        // A map to store the frequency of elements in the current window
        Map<Integer, Integer> map = new HashMap<>();
        int maxUnique = 0;
        
        // Sliding window
        for (int i = 0; i < arr.length; i++) {
            // Add the current element to the map (frequency map)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            
            // If the window size exceeds k, remove the leftmost element
            if (i >= k) {
                int leftElement = arr[i - k];
                map.put(leftElement, map.get(leftElement) - 1);
                if (map.get(leftElement) == 0) {
                    map.remove(leftElement);
                }
            }
            
            // Once we reach a valid window of size k, check the number of unique elements
            if (i >= k - 1) {
                maxUnique = Math.max(maxUnique, map.size());
            }
        }
        
        return maxUnique;
    }
}
