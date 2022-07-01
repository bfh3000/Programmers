import java.util.*;

/**
 * 두 개 뽑아서 더하기
 * <pre>
 * 1. HashSet의 활용.
 * ("자바의 신:618~", Collection을 확장한 배열과 비슷한 역할을 하는 3개(List, Set, Queue)의 인터페이스 중 하나.
 * -참고0: Set은 순서에 상관없이 어떤 데이터가 존재하는지를 확인하기 위한 용도로 많이 사용됨.
 * -참고1: List는 순서가 중요한 데이터를 담을 때
 * -참고2: Queue는 요청이 들어온 순서대로 처리할 때 사용하려고 하는 목적이 있다. (LinkedList참조)
 * -참고3: 이와 별개로, Map은 Key값에 여러 값을 매핑하기 위해 사용하는 인터페이스이다.
 * 2.
 * </pre>
 */
public class n20220612 {
    public static void main(String[] args) {

        int tmp[] = {2, 1, 3, 4, 1};
        ReferencedSolution1(tmp);
    }

    public static void mySolution(int[] value) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < value.length; i++) {
            for (int j = i+1; j <value.length ; j++) {
                set.add(value[i] + value[j]);
            }
        }



    }

    public static int[] ReferencedSolution1(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            answer.add(iter.next());
        }

        Collections.sort(answer);
        for (Integer tmp: answer) {
            System.out.println(tmp);
        }
        return numbers;
    }
}
