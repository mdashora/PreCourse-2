/*
Time Complexity:
 - O(log n)
Space Complexity:
 - O(1)
 */
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I had to revisit Binary search concepts while solving

class BinarySearch { 
    // Returns index of x if it is present in arr[l.. r], else return -1 
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        //Write your code here
        while (l <= r) {
            int mid = l + (r - l) / 2;

            // Is x is present at mid
            if (arr[mid] == x)
                return mid;

            // ignore left half
            if (arr[mid] < x)
                l = mid + 1;
            else // ignore right half
                r = mid - 1;
        }

        return -1;        
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 
