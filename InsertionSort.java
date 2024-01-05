/**
* Here we would use the insertion sort algorithm to
* sort an array in ascending order
*/

public class InsertionSort 
{
    public static void main(String[] args) {
        //given array 
        int nums[] = {200, 15, 4, 32, 40, 67, 13, 1, 8, 100};

        /**
        * in the insertion sort algorithm, it starts from the second value
        * because the first value is assumed sorted
        */
        for(int i = 1; i < nums.length; i++)
        {
            // second value in the array
            int secondValue = nums[i];
            // index of previous value before second value in the array, if any.
            int prevIndex = i - 1;
            
            /*
            * Now this while loop will run as long as the 
            1. index of previous value is >= 0
            2. previous value is > the second value 
            */
            while(prevIndex >= 0 && nums[prevIndex] > secondValue)
            {
                /*
                * if the above condition is true, shift the element to the right 
                * position and decrease the value of prevIndex 
                */
                nums[prevIndex + 1] = nums[prevIndex];
                prevIndex--;
            }
 
            //here, replace the value of the second value
            nums[prevIndex + 1] = secondValue;
        }

        for(int n : nums)
        {
            System.out.print(n + " ");
        }
    }
}
