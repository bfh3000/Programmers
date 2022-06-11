// 3진법 뒤집기

// 알게된 점
// 1. Math.pow()로 radix를 10진수로 변경하는 함수가 있다는 사실.
// 2. 10진수는 Integer로 radix로 변경이 가능하다는 사실. (하지만, 그 역은 성립되지 않음.)


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class n20220606 {

    private static Log log = LogFactory.getLog(n20220606.class);

    public static void main(String[] args) {
//        Solution t = new Solution();
//        System.out.println(t.solution(45));

        Solution t2 = new Solution();
        System.out.println("result value : "+ t2.solution2(45));
    }


    static class mySolution {

    }


    static class Solution {
        public int solution2(int inputInt) {
            int answer = 0;
            String third = Integer.toString(inputInt, 3);
            System.out.println("시작"+third);

            StringBuffer sb = new StringBuffer(third);
            System.out.println("SB : "+sb);

            String reversed = sb.reverse().toString();
            System.out.println("reversed : "+reversed);

            int exp = 0;
            System.out.println("============================================================================s");
            for (int i = reversed.length() - 1; i >= 0; i--) {
                System.out.println("");
                System.out.println(i+"번째");
                int tmp = (int) (Integer.parseInt(String.valueOf(reversed.charAt(i))) * Math.pow(3, exp));
                System.out.println("tmp : "+tmp);
                answer += tmp;
                System.out.println("answer : "+answer);
                exp++;
            }

            return answer;
        }

        public int solution(int n) {
            String a = "";

            while (n > 0) {
                a = (n % 3) + a;
                n /= 3;
            }
            a = new StringBuilder(a).reverse().toString();
            return Integer.parseInt(a, 3);
        }


    }
}


