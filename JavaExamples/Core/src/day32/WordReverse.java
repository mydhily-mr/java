package day32;

public class WordReverse
{
    public void reverseWordInMyString(final String str) {
        final String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; ++i) {
            final String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; --j) {
                reverseWord = String.valueOf(reverseWord) + word.charAt(j);
            }
            reversedString = String.valueOf(reversedString) + reverseWord + " ";
        }
        System.out.println(str);
        System.out.println(reversedString);
    }
    
    public static void main(final String[] args) {
        final WordReverse obj = new WordReverse();
        obj.reverseWordInMyString("welcome to studyonline");
    }
}