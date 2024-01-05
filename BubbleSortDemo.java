/**
 * Here we would use the bubble sort algorithm to
 * sort an array in ascending order
 */

public class BubbleSortDemo {
    public static void main(String[] args) 
    {
        //the given array
        int nums[] = {200, 15, 4, 32, 40, 67, 13, 1, 8, 100};
        // a temporary variable for swapping
        int temp = 0;

        //this outer loop here is responsible for iteration
        for(int i = 0; i < nums.length; i++)
        {
            /**
             * this inner loop is responsible for comparing and 
             * swapping elements in a scenario where the first 
             * element is greater than the second element. When 
             * swapping, there is no need to reach the last value also
             * - i - 1 is used to enhance the speed so as not to iterate
             * over already sorted values
             */
            for(int j = 0; j < nums.length - i - 1; j++)
            {
               if(nums[j] > nums[j+1])
               {
                //swap the values
                temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
               }
            }
        }

        //the sorted array in ascending order
        for(int n : nums)
        {
            System.out.print(n + " ");
        }
    }
}