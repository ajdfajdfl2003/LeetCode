using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace _500KeyboardRow
{
    [TestClass]
    public class KeyboardRowTests
    {
        [TestMethod]
        public void FindWordsTest_Input_Hello_Dad_return_Dad()
        {
            var sut = new Solution();
            var words = new string[] {"Hello", "Dad"};

            var actual = sut.FindWords(words);

            var expected = new string[] {"Dad"};
            CollectionAssert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void FindWordsTest_Input_asdf_qaz_return_asd()
        {
            var sut = new Solution();
            var words = new string[] {"asdf", "qaz "};

            var actual = sut.FindWords(words);

            var expected = new string[] {"asdf"};
            CollectionAssert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void FindWordsTest_Input_asd_return_asd()
        {
            var sut = new Solution();
            var words = new string[] {"asd"};

            var actual = sut.FindWords(words);

            var expected = new string[] {"asd"};
            CollectionAssert.AreEqual(expected, actual);
        }
    }
}