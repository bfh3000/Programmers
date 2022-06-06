// 3진법 뒤집기

public class n20220606 {
    public static void main(String[] args) {
        Solution t = new Solution();
        System.out.println(t.solution(45));
    }




    static class Solution {
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


