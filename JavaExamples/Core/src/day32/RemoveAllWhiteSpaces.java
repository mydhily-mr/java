package day32;

public class RemoveAllWhiteSpaces
{
    public static void main(final String[] args) {
        String str1 = "Remove white spaces";
        str1 = str1.replaceAll("\\s+", "");
        System.out.println("String after removing all the white spaces is : " + str1);
    }
}