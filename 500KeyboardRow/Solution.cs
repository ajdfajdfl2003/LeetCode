using System.Collections.Generic;
using System.Linq;

namespace _500KeyboardRow
{
    public class Solution
    {
        public Solution()
        {
        }

        public string[] FindWords(string[] words)
        {
            var firstRow = new Dictionary<string, string>
            {
                {"q", "q"},
                {"w", "w"},
                {"e", "e"},
                {"r", "r"},
                {"t", "t"},
                {"y", "y"},
                {"u", "u"},
                {"i", "i"},
                {"o", "o"},
                {"p", "p"}
            };
            var secondRow = new Dictionary<string, string>
            {
                {"a", "a"},
                {"s", "s"},
                {"d", "d"},
                {"f", "f"},
                {"g", "g"},
                {"h", "h"},
                {"j", "j"},
                {"k", "k"},
                {"l", "l"}
            };
            var thirdRow = new Dictionary<string, string>
            {
                {"z", "z"},
                {"x", "x"},
                {"c", "c"},
                {"v", "v"},
                {"b", "b"},
                {"n", "n"},
                {"m", "m"}
            };
            var result = new List<string>();

            foreach (var word in words)
            {
                if (CheckWord(word.ToLower(), firstRow)
                    || CheckWord(word.ToLower(), secondRow)
                    || CheckWord(word.ToLower(), thirdRow))
                {
                    result.Add(word);
                }
            }
            return result.ToArray();
        }

        private bool CheckWord(string word, Dictionary<string, string> keyBoard)
        {
            return word.All(a => keyBoard.ContainsKey(a.ToString()));
        }
    }
}