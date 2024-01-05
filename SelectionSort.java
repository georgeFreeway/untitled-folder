/**
 * Here we would use the selection sort algorithm to
 * sort an array in ascending order
 */

public class SelectionSort
{
    public static void main(String[] args) {
        int nums[] = {200, 15, 4, 32, 40, 67, 13, 1, 8, 100};
        // a temporary variable for swapping
        int temp = 0;
        // the value of minIndex would default to -1
        int minIndex = -1;

        /**
         * the outer loop here is responsible for swapping unlike in bubble sort
         * and we can reduce the number of iterations by - 1.
         */
        for(int i = 0; i < nums.length - 1; i++)
        {
            // basically, we are looking for the minimum value
            // so we assume that the index value of the minimum element
            // is whatever i is
            minIndex = i;
            //for the inner loop, always skip the first value in each iteration
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[minIndex] > nums[j])
                {
                    // at this point the index value of the minimum element has been gotten
                    minIndex = j;
                }
            } 

            //since the index value of the minimum element has been gotten, use it to swap the elements position
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;     
        }
        // print the sorted array in ascending order
        for(int n : nums)
        {
            System.out.print(n + " ");
        }
    }
}