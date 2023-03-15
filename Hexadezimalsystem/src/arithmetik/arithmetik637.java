package arithmetik;

public class arithmetik637 {
    public static void main(String[] args) {

        // 10 -> 16 (637)
// 637/16=39
// 637%16=13
// 39/16=2
// 39%16=7
// 2/16=0
// 2%16= 2
//= 2 7 13 (D) = 27D

        int number1 = 637;
        int rusalt = 0;

        int result = (637%16);
        int result2 = (39%16);
        int result3 = (2%16);

        System.out.println(result3);
        System.out.println(result2);
        System.out.println(result); System.out.println("13"+"=D");
    }
}
