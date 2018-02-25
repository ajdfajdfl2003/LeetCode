using System.Collections.Generic;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace _485MaxConsecutiveOnes
{
    [TestClass]
    public class MaxConsecutiveOnesTests
    {
        [TestMethod]
        public void MaxConsecutiveIsOneInputHasThreeZeroOutputIsZero()
        {
            var sut = new Solution();
            var nums = new List<int>() {0, 0, 0};

            var actual = sut.FindMaxConsecutiveOnes(nums.ToArray());
            var expected = 0;

            Assert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void MaxConsecutiveIsOneInputIsZeroOutputIsZero()
        {
            var sut = new Solution();
            var nums = new List<int>() {0};

            var actual = sut.FindMaxConsecutiveOnes(nums.ToArray());
            var expected = 0;

            Assert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void MaxConsecutiveIsOneNotZeroOutputIsThree()
        {
            var sut = new Solution();
            var nums = new List<int>() {0, 0, 0, 0, 1, 1, 1};

            var actual = sut.FindMaxConsecutiveOnes(nums.ToArray());
            var expected = 3;

            Assert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void MaxInTheMiddleOutputIsThree()
        {
            var sut = new Solution();
            var nums = new List<int>() {0, 0, 1, 1, 1, 0, 1};

            var actual = sut.FindMaxConsecutiveOnes(nums.ToArray());
            var expected = 3;

            Assert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void MaxInTheFrontOutputIsThree()
        {
            var sut = new Solution();
            var nums = new List<int>() {1, 1, 1, 0, 1, 0, 1};

            var actual = sut.FindMaxConsecutiveOnes(nums.ToArray());
            var expected = 3;

            Assert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void OutputIsOne()
        {
            var sut = new Solution();
            var nums = new List<int>() {1, 0, 1, 0, 1, 0, 1};

            var actual = sut.FindMaxConsecutiveOnes(nums.ToArray());
            var expected = 1;

            Assert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void OutputIsThree()
        {
            var sut = new Solution();
            var nums = new List<int>() {1, 1, 0, 1, 1, 1};

            var actual = sut.FindMaxConsecutiveOnes(nums.ToArray());
            var expected = 3;

            Assert.AreEqual(expected, actual);
        }
    }
}