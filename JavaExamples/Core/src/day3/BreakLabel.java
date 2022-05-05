package day3;

public class BreakLabel
{
    public static void main(final String[] args) {
    Label_0065:
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 10; ++j) {
                if (j == 5) {
                    break Label_0065;
                }
                System.out.println(String.valueOf(i) + " " + j);
            }
        }
    }
}