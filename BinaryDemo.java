/**
 * Here we would use the binary search algorithm to
 * find a target in a given sorted array and return the index
 * or -1 if the target is not found
 */

public class BinaryDemo {
    public static void main(String[] args) {
        // given array
        final int nums[] = {2,4,5,6,7,8,14};
        // lets say the target is the integer 8
        int target = 8;
        // result - the binarySearch func accepts two arguments
        // array of integers and target integer 
        int result = binarySearch(nums, target);
        // we print the result or -1
        if(result != -1)
            System.out.println("index =" + " " +result);
        else
            System.out.println("target not found" + " " + -1);
    }

    public static int binarySearch(int[] nums, int target)
    {
        /**
         * since we have to get the index of the
         * middle element, we have to sum up the 
         * left and right index of the array and divide by 2
         * this will give us two subArrays
         */
        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        // the while loop runs as long as this condition is true
        while(leftIndex <= rightIndex)
        {
            int middleIndex = (leftIndex + rightIndex) / 2;

            if(nums[middleIndex] == target)
                // return index if the value is equal to target
                return middleIndex;
            else if (nums[middleIndex] > target)
                // if the value of middleIndex is greater, search is focused on left subArray 
                rightIndex = middleIndex - 1;
            else
                // if lesser, search is focused on the right subArray
                leftIndex = middleIndex + 1;
        }
        return -1;
    }
}
