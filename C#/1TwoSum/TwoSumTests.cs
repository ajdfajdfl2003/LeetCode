using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace _1TwoSum
{
    [TestClass]
    public class TwoSumTests
    {
        [TestMethod]
        public void TestTwoSum_nums_is_3_2_4_target_is_6_return_1_2()
        {
            var sut = new Solution();
            var nums = new int[] {3, 2, 4};
            var target = 6;

            var actual = sut.TwoSum(nums, target);

            var expected = new int[] {1, 2};
            CollectionAssert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void TestTwoSum_nums_is_1_2_8_target_is_9_return_0_2()
        {
            var sut = new Solution();
            var nums = new int[] {1, 2, 8};
            var target = 9;

            var actual = sut.TwoSum(nums, target);

            var expected = new int[] {0, 2};
            CollectionAssert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void TestTwoSum_nums_is_1_8_target_is_9_return_0_1()
        {
            var sut = new Solution();
            var nums = new int[] {1, 8};
            var target = 9;

            int[] actual = sut.TwoSum(nums, target);

            var expected = new int[] {0, 1};
            CollectionAssert.AreEqual(actual, expected);
        }
    }
}