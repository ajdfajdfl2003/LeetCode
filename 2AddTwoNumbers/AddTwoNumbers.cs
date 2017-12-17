using System.Collections.Generic;
using ExpectedObjects;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace _2AddTwoNumbers
{
    [TestClass]
    public class AddTwoNumbers
    {
        [TestMethod]
        public void L1_Is_5_2_1_L2_Is_2_5_Should_be_7_7_1()
        {
            var sut = new Solution();
            var l1 = CreateListNode(new int[] {5, 2, 1});
            var l2 = CreateListNode(new int[] {2, 5});

            var actual = sut.AddTwoNumbers(l1, l2);
            var expected = CreateListNode(new int[] {7, 7, 1});
            AssertResult(expected, actual);
        }

        [TestMethod]
        public void L1_Is_5_5_L2_Is_2_5_Should_be_7_0_1()
        {
            var sut = new Solution();
            var l1 = CreateListNode(new int[] {5, 5});
            var l2 = CreateListNode(new int[] {2, 5});

            var actual = sut.AddTwoNumbers(l1, l2);
            var expected = CreateListNode(new int[] {7, 0, 1});
            AssertResult(expected, actual);
        }

        [TestMethod]
        public void L1_Is_5_2_L2_Is_2_2_Should_be_7_4()
        {
            var sut = new Solution();
            var l1 = CreateListNode(new int[] {5, 2});
            var l2 = CreateListNode(new int[] {2, 2});

            var actual = sut.AddTwoNumbers(l1, l2);
            var expected = CreateListNode(new int[] {7, 4});
            AssertResult(expected, actual);
        }

        [TestMethod]
        public void L1_Is_5_L2_Is_2_2_Should_be_7_2()
        {
            var sut = new Solution();
            var l1 = CreateListNode(new int[] {5});
            var l2 = CreateListNode(new int[] {2, 2});

            var actual = sut.AddTwoNumbers(l1, l2);
            var expected = CreateListNode(new int[] {7, 2});
            AssertResult(expected, actual);
        }

        [TestMethod]
        public void L1_Is_5_2_L2_Is_2_Should_be_7_2()
        {
            var sut = new Solution();
            var l1 = CreateListNode(new int[] {5, 2});
            var l2 = CreateListNode(new int[] {2});

            var actual = sut.AddTwoNumbers(l1, l2);
            var expected = CreateListNode(new int[] {7, 2});
            AssertResult(expected, actual);
        }

        [TestMethod]
        public void L1_Is_5_L2_Is_5_Should_be_0_1()
        {
            var sut = new Solution();
            var l1 = new ListNode(5);
            var l2 = new ListNode(5);

            var actual = sut.AddTwoNumbers(l1, l2);
            var expected = CreateListNode(new int[] {0, 1});
            AssertResult(expected, actual);
        }

        [TestMethod]
        public void Test_All_ListNode_is_4_1()
        {
            var node = new ListNode(4) {next = new ListNode(1)};

            var expected = new List<int> {4, 1};
            expected.ToExpectedObject().ShouldEqual(node.All());
        }

        [TestMethod]
        public void L1_Is_2_L2_Is_5_Should_be_7()
        {
            var sut = new Solution();
            var l1 = new ListNode(2);
            var l2 = new ListNode(5);

            var actual = sut.AddTwoNumbers(l1, l2);

            var expected = new ListNode(7);
            AssertResult(expected, actual);
        }

        private void AssertResult(ListNode expected, ListNode actual)
        {
            expected.All().ToExpectedObject().ShouldEqual(actual.All());
        }

        private static ListNode CreateListNode(int[] nums)
        {
            if (nums.Length == 0) return null;

            var listNode = new ListNode(nums[0]);
            var currentNode = listNode;
            for (int i = 1; i < nums.Length; i++)
            {
                currentNode.next = new ListNode(nums[i]);
                currentNode = currentNode.next;
            }

            return listNode;
        }
    }
}