package array;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * @author bfh3000@naver.com
 * 1. �⺻ �迭�� Arrays�� �����ϴ�.
 * 2. copyofRange��� �Լ��� �����ϴ±��� ���� �˾Ҵ�.
 */
public class Lvl1_ArrayKth {

	Logger log = LogManager.getLogger();
	//https://programmers.co.kr/learn/courses/30/lessons/42748
	//k��° ��
    public int[] solution(int[] array, int[][] commands) {
    	int[] answer = {commands.length}; //���⼭ �Ǽ��߳�
//    	int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
			int[] tmpArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(tmpArray);
			answer[i] = tmpArray[commands[i][2]-1];
			log.debug(answer[i]);
		}
        
        return answer;
    }

	public static void main(String[] args) {
		int[] inputArray = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] inputCommand = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		new Lvl1_ArrayKth().solution(inputArray, inputCommand);
	}
}
