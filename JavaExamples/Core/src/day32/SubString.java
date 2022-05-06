package day32;

public class SubString
{
    public static void main(final String[] args) {
        final String s1 = "join studyonline to studyonline";
        System.out.println(s1);
        final int a = s1.lastIndexOf("studyonline");
        if (a == -1) {
            System.out.println("sub  string is not found");
        }
        else {
            System.out.println("sub string found at the index : " + a);
        }
    }
}