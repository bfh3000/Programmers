import java.util.*;

/*
 * 두 개 뽑아서 더하기
 *
 * */
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

        System.out.println(result);
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
