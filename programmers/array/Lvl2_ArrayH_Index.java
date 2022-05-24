/**
 * 
 */
package array;

import java.util.Arrays;

/**
 * @author df321
 *
 */
public class Lvl2_ArrayH_Index {

	/**
	 * https://programmers.co.kr/learn/courses/30/lessons/42747
	 * �ƴ� ������ ���� ������...? ���ذ� ���� �Ȱ���
	 * ���� �̻���.......... �� Ǫ�� ������
	 */
	
	public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);
        for(int i=0; i<citations.length; i++){
            int smaller = Math.min(citations[i], citations.length-i);
            answer = Math.max(answer, smaller);
        }
        
        System.out.println(answer);
        return answer;
    } 
	
	public static void main(String[] args) {
		new Lvl2_ArrayH_Index().solution(new int[] {3, 0, 6, 1, 5});
	}

}
