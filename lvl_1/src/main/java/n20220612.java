import java.util.*;

/**
 * 두 개 뽑아서 더하기
 * 1. HashSet의 활용. ("자바의 신:618~", Collection을 확장한 배열과 비슷한 역할을 하는 3개(List, Set, Queue)의 인터페이스 중 하나이며 Set은 순서에 상관없이 어떤 데이터가 존재하는지를 확인하기 위한 용도로 많이 사용됨.)
 * -참고1: List는 순서가 중요한 데이터를 담을 때
 * -참고2: Queue는 요청이 들어온 순서대로 처리할 때 사용하려고 하는 목적이 있다.
 * 2.
 */
public class n20220612 {
    public static void main(String[] args) {

        int tmp[] = {2, 1, 3, 4, 1};
        mySolution(tmp);
    }

    public static void mySolution(int[] value) {
        List<Integer> aol = new ArrayList<>();
        for (int tmp : value) {
            aol.add(tmp);
        }
        Collections.sort(aol);
        System.out.println(aol.toString());

        int result[] = new int[aol.size()];
        int index = 0;
        for (int tmp : aol) {
            result[index] = tmp;
            index++;
        }

        System.out.println(result.toString());
    }


    public static int[] importSolution1(int[] numbers) {
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

        return numbers;
    }
}
