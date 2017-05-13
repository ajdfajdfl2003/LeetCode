using System;
using System.Linq;

namespace _1TwoSum
{
    internal class Solution
    {
        public Solution()
        {
        }

        public int[] TwoSum(int[] nums, int target)
        {
            var sorted = nums.Select((x, index) => Tuple.Create(x, index)).OrderBy(x => x.Item1).ToArray();
            for (var i = 0; i < sorted.Length; i++)
            {
                for (var j = i + 1; j < sorted.Length; j++)
                {
                    var twoSums = sorted[i].Item1 + sorted[j].Item1;
                    if (twoSums == target)
                    {
                        return new int[]
                            {Math.Min(sorted[i].Item2, sorted[j].Item2), Math.Max(sorted[i].Item2, sorted[j].Item2)};
                    }
                    if (twoSums > target)
                    {
                        break;
                    }
                }
            }
            return null;
        }
    }
}