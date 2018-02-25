using System.Collections;
using System.Collections.Generic;

namespace _2AddTwoNumbers
{
    public class ListNode
    {
        public int val;
        public ListNode next;

        public ListNode(int x)
        {
            val = x;
        }

        public IEnumerable<int> All()
        {
            var result = new List<int> {this.val};

            if (this.next != null) result.AddRange(next.All());

            return result;
        }
    }
}