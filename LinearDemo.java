public class LinearDemo
{
    public static void main(String[] args) {
        final int nums[] = {2,4,5,6,7,8};
        int target = 6;

        int result = linearSearch(nums, target);

        if(result != -1)
        {
            System.out.println(result);
        }else
        {
            System.out.println("not found");
        }
    }

    public static int linearSearch(int[] nums, int target)
    {
        int stepsTaken = 0;
        for(int i = 0; i < nums.length; i++)
        {
            stepsTaken++;
            if(nums[i] == target)
            {  
                System.out.println(stepsTaken);
                return i;
            }
        }
        System.out.println(stepsTaken);
        return -1;
    }
}