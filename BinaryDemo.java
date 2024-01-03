public class BinaryDemo {
    public static void main(String[] args) {
        final int nums[] = {2,4,5,6,7,8,14};
        int target = 6;

        int result = binarySearch(nums, target);

        if(result != -1)
        {
            System.out.println(result);
        }else
        {
            System.out.println("not found");
        }
    }

    public static int binarySearch(int[] nums, int target)
    {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int stepsTaken = 0;

        while(leftIndex <= rightIndex)
        {
            stepsTaken++;
            int middleIndex = leftIndex + rightIndex / 2;

            if(middleIndex == target)
            {
                System.out.println(stepsTaken);
                return middleIndex;
            } 
            else if (nums[middleIndex] > target)
            {
                rightIndex = middleIndex - 1;
            }
            else
            {
                leftIndex = middleIndex + 1;
            }
        }

        System.out.println(stepsTaken);
        return -1;
    }
}
