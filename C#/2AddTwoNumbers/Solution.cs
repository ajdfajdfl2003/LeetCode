namespace _2AddTwoNumbers
{
    public class Solution
    {
        public Solution()
        {
        }

        public ListNode AddTwoNumbers(ListNode l1, ListNode l2)
        {
            return CreateSumNode(l1, l2, 0);
        }

        private ListNode CreateSumNode(ListNode l1, ListNode l2, int carry)
        {
            if (l1 == null && l2 == null)
            {
                if (carry == 0)
                {
                    return null;
                }
                return new ListNode(carry);
            }

            var l1Val = l1?.val ?? 0;
            var l2Val = l2?.val ?? 0;

            var sum = carry + l1Val + l2Val;
            var result = new ListNode(sum % 10);

            var carryNext = sum >= 10 ? 1 : 0;
            result.next = CreateSumNode(l1?.next ?? null, l2?.next ?? null, carryNext);

            return result;
        }
    }
}