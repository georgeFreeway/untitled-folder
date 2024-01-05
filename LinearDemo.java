/**
 * Here we would use the linear search algorithm to
 * find a target in a given array and return the index
 * or -1 if the target is not found
 */

public class LinearDemo
{
    public static void main(String[] args) {
        // given array
        final int nums[] = {3, 45, 30, 1, 4, 33, 21};
        // lets say the target is the integer 45
        int target = 5;
        // result - the linearSearch func accepts two arguments
        // array of integers and target integer 
        int result = linearSearch(nums, target);
        // we print result or -1
        if(result != -1)
            System.out.println("index =" + " " +result);
        else
            System.out.println("target not found" + " " + -1);
    }

    public static int linearSearch(int[] nums, int target)
    {
        /**
         * using a for loop, we traverse the array
         * and retrieve the index value of the given
         * target or return -1 if the target does not exist
         */ 
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
                return i;
        }
        return -1;
    }
}