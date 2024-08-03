import java.util.Arrays;

public class Numbers {
    public char[] symbols = {'a', 'b', 'c', 'd', 'e'};
    public void printChars() {
        System.out.println(Arrays.copyOfRange(symbols, 2, 10));
    }
    public int sumAll(int N) {
        int result = 0 ;
        for (int i = 0; i <= N; i++) {
            i = i+1;
            result = i;
        }
        return result;
    }
}
