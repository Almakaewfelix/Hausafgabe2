package arithmetik;

public class arithmetik637to3 {
    public static void main(String[] args) {
        // 10 -> 3 (637)
// 637/3 = 221
// 637%3 = 1
// 221/3 = 73
// 224%3 = 2
// 73/3 = 24
// 73%3 = 1
// 24/3 = 8
// 24%3 = 0
// =121
        int result1 = (637%3);
        int result2 = (224%3);
        int result3 = (73%3);
        int result4 = (24%3);

        System.out.println(result4);
        System.out.println(result3);
        System.out.println(result2);
        System.out.println(result1);
    }
}
