package day3;

public class ContinueLabel
{
    public static void main(final String[] args) {
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5 && j != 2; ++j) {
                System.out.println(String.valueOf(i) + " " + j);
            }
        }
    }
}