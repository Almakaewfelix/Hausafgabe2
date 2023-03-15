package arithmetik;

public class arithmetik11100111 {
    public static void main(String[] args) {

            // 2 -> 10 (11100111)
// 11100111 = (1*2^7) + (1*2^6) + (1*2^5) + (0*2^4) + (0*2^3) + (1*2^2) + (1*2^1) + (1*2^0)
// =128 + 64 + 32 + 0 + 0 + 4 + 2 + 1 = 231

            int number1 = 11100111;
            int rusalt = 231;

            int result = (1 * 2 * 2 * 2 * 2 * 2 * 2 * 2) + (1 * 2 * 2 * 2 * 2 * 2 * 2) + (1 * 2 * 2 * 2 * 2 * 2) + (1 * 4) + (1 * 2) + 1;
            System.out.println(result);
            ;

        }
    }
