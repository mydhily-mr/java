package day3;

public class ContinueStatement
{
    public static void main(final String[] args) {
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                if (j != 2) {
                    System.out.println(String.valueOf(i) + " " + j);
                }
            }
        }
    }
}