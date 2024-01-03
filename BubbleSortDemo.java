public class BubbleSortDemo {
    public static void main(String[] args) 
    {
        int nums[] = {2,5,4,32,40,67,13};
        int tempValue = 0;

        //printing the array values before sorting
        System.out.println("before sorting");
        for(int n : nums)
        {
            System.out.print(n + " ");
        }

        //sorting proper
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length - i - 1; j++)
            {
                if(nums[j] > nums[j+1])
                {
                    tempValue = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tempValue;
                }
            }
        }

        //printing the array values after sorting
        System.out.println();
        System.out.println("after sorting");
        for(int n : nums)
        {
            System.out.print(n + " ");
        }
    }
}
