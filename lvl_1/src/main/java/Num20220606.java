import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 3진법 뒤집기
 * <pre>
 * 1. Math.pow()로 radix를 10진수로 변경하는 함수가 있다는 사실.
 * 2. 10진수는 Integer로 radix로 변경이 가능하다는 사실. (하지만, 그 역은 성립되지 않음.)
 * 3. 음.. 1위 솔루션 보니깐 "2."의 역은 성립이 되네. Integer Int로 되네 (String to int로)
 * 4. reverse()는 Integer가 아닌, Stringbuilder에서 제공하네
 * </pre>
 */
public class Num20220606 {

    private static Log log = LogFactory.getLog(Num20220606.class);

    public static void main(String[] args) {
        System.out.println("result value : " + mySolution(125));
    }

    //가져온 솔루션1, 2을 참고해서 새롭게 짠 코드
    public static int mySolution(int intputValue) {
        String n3String = Integer.toString(intputValue, 3);
        StringBuffer p = new StringBuffer(n3String).reverse();

        int tmp = Integer.parseInt(p.toString(), 3);

        return tmp;
    }

    public static int importSolution1(int inputInt) {
        int answer = 0;
        String third = Integer.toString(inputInt, 3);
        System.out.println("시작" + third);

        StringBuffer sb = new StringBuffer(third);
        System.out.println("SB : " + sb);

        String reversed = sb.reverse().toString();
        System.out.println("reversed : " + reversed);

        int exp = 0;
        System.out.println("============================================================================s");
        for (int i = reversed.length() - 1; i >= 0; i--) {
            System.out.println("");
            System.out.println(i + "번째");

            int tmp = (int) (Integer.parseInt(String.valueOf(reversed.charAt(i))) * Math.pow(3, exp));
            System.out.println("tmp : " + tmp);
            answer += tmp;
            System.out.println("answer : " + answer);
            exp++;
        }

        return answer;
    }

    public static int importSolution2(int n) {
        String a = "";

        while (n > 0) {
            a = (n % 3) + a;
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();
        int result = Integer.parseInt(a, 3);
        return result;
    }
}


