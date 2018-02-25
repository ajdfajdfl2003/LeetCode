namespace _485MaxConsecutiveOnes
{
    public class Solution
    {
        public int FindMaxConsecutiveOnes(int[] nums)
        {
            var max = 0;
            var count = 0;
            foreach (var num in nums)
            {
                count = (count + num) * num;
                if (max < count) max = count;
            }
            return max;
        }
    }
}